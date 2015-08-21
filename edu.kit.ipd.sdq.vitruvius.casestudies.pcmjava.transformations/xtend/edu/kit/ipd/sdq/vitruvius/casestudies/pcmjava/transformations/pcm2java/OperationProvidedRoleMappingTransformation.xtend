package edu.kit.ipd.sdq.vitruvius.casestudies.pcmjava.transformations.pcm2java

import edu.kit.ipd.sdq.vitruvius.casestudies.pcmjava.transformations.PCMJaMoPPUtils
import edu.kit.ipd.sdq.vitruvius.framework.run.transformationexecuter.EmptyEObjectMappingTransformation
import edu.kit.ipd.sdq.vitruvius.framework.run.transformationexecuter.TransformationUtils
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.emftext.language.java.classifiers.Class
import org.emftext.language.java.classifiers.Interface
import org.palladiosimulator.pcm.repository.OperationProvidedRole

class OperationProvidedRoleMappingTransformation extends EmptyEObjectMappingTransformation {

	val private static final Logger logger = Logger.getLogger(OperationProvidedRoleMappingTransformation.simpleName)

	override getClassOfMappedEObject() {
		return OperationProvidedRole;
	}

	override setCorrespondenceForFeatures() {
	}

	/**
	 * called when a Operation provided role has been created.
	 * Look for the main class implementing the component of the operation provided role and add an 
	 * implements relation to the Interface that corresponds to the OperationInterface of the OperationProvidedRole.
	 */
	override createEObject(EObject eObject) {
		val OperationProvidedRole opr = eObject as OperationProvidedRole
		val opInterface = opr.providedInterface__OperationProvidedRole
		val providingEntity = opr.providingEntity_ProvidedRole
		if (null == opInterface) {
			logger.warn("operation interface is null. Can not synchronize creation of opeation provided role: " + opr)
			return null
		}
		if (null == providingEntity) {
			logger.warn("Basic component is null. Can not synchronize creation of opeation provided role: " + opr)
			return null
		}
		val jaMoPPClass = blackboard.correspondenceInstance.claimUniqueCorrespondingEObjectByType(providingEntity, Class)
		val jaMoPPInterface = blackboard.correspondenceInstance.claimUniqueCorrespondingEObjectByType(opInterface, Interface)
		val namespaceClassifierRef = PCM2JaMoPPUtils.createNamespaceClassifierReference(jaMoPPInterface)
		jaMoPPClass.implements.add(namespaceClassifierRef)
		val classifierImport = PCM2JaMoPPUtils.addImportToCompilationUnitOfClassifier(jaMoPPClass, jaMoPPInterface)
		return #[namespaceClassifierRef, classifierImport]
	}

	override removeEObject(EObject eObject) {
		TransformationUtils.removeCorrespondenceAndAllObjects(eObject, blackboard)
		return null
	}

	/**
	 * called when a operation provided role has been changed.
	 * Either the implementing component or the providing interface has ben changed.
	 * In both cases: Delete the old one and create a new one
	 */
	override updateSingleValuedNonContainmentEReference(EObject affectedEObject, EReference affectedReference,
		EObject oldValue, EObject newValue) {
		val EObject[] oldEObjects = removeEObject(affectedEObject)
		val EObject[] newEObjects = createEObject(affectedEObject)
		for (oldEObject : oldEObjects) {
			blackboard.correspondenceInstance.removeDirectAndChildrenCorrespondencesOnBothSides(oldEObject)
			if (null != oldEObject.eContainer) {
				PCMJaMoPPUtils.saveNonRootEObject(oldEObject)
			}
			EcoreUtil.remove(oldEObject)
		}
		if (null != newEObjects) {
			for (newEObject : newEObjects) {
				blackboard.correspondenceInstance.createAndAddEObjectCorrespondence(newEObject, affectedEObject)
				PCMJaMoPPUtils.saveNonRootEObject(newEObject)
			}
		}
	}

	/**
	 * called when the name or ID of a OperationProvidedRole has been changed - has no effect to the code
	 * but must be overwritten here in order to not get an exception from the super class
	 */
	override updateSingleValuedEAttribute(EObject affectedEObject, EAttribute affectedAttribute, Object oldValue,
		Object newValue) {
	}

}
