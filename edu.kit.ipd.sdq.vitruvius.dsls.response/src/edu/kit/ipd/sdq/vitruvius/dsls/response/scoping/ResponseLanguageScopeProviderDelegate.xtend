package edu.kit.ipd.sdq.vitruvius.dsls.response.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope

import static edu.kit.ipd.sdq.vitruvius.dsls.mirbase.mirBase.MirBasePackage.Literals.*;

import org.eclipse.emf.ecore.EStructuralFeature
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.AtomicMultiValuedFeatureChange
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.AtomicSingleValuedFeatureChange
import edu.kit.ipd.sdq.vitruvius.dsls.mirbase.scoping.MirBaseScopeProviderDelegate
import edu.kit.ipd.sdq.vitruvius.dsls.mirbase.mirBase.FeatureOfElement
import org.eclipse.emf.ecore.EcorePackage
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.inputTypes.InputTypesPackage
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.NewElementReference
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.RoutineInput

class ResponseLanguageScopeProviderDelegate extends MirBaseScopeProviderDelegate {
	override getScope(EObject context, EReference reference) {
		// context differs during content assist and validation: once we need to take the context, once the container
		if (reference.equals(FEATURE_OF_ELEMENT__FEATURE))
			return createEStructuralFeatureScope(context as FeatureOfElement)
		else if (reference.equals(FEATURE_OF_ELEMENT__ELEMENT)
			|| reference.equals(MODEL_ELEMENT__ELEMENT)) {
			if (context instanceof NewElementReference
				|| context.eContainer() instanceof NewElementReference
			) {
				return createQualifiedEClassScopeWithoutAbstract(context.eResource);
			} else if (reference.equals(MODEL_ELEMENT__ELEMENT) && 
				(context.eContainer() instanceof RoutineInput || context instanceof RoutineInput)
			) {
				return createQualifiedEClassScopeWithSpecialInputTypes(context.eResource);
			} else {
				return createQualifiedEClassScopeWithEObject(context.eResource)
			}
		}
		super.getScope(context, reference)
	}
	
	def createEStructuralFeatureScope(FeatureOfElement variable) {
		if (variable?.element != null) {
			val changeType = variable.eContainer;
			val filterFunction = if (changeType instanceof AtomicMultiValuedFeatureChange) {
				[EStructuralFeature feat | feat.upperBound != 1];
			} else if (changeType instanceof AtomicSingleValuedFeatureChange) {
				[EStructuralFeature feat | feat.upperBound == 1];
			} else {
				[EStructuralFeature feat | true];
			}
			createScope(IScope.NULLSCOPE, variable.element.EAllStructuralFeatures.filter(filterFunction).iterator, [
				EObjectDescription.create(it.name, it)
			])
		} else {
			return IScope.NULLSCOPE
		}
	}

	def createQualifiedEClassScopeWithSpecialInputTypes(Resource res) {
		val classifierDescriptions = res.metamodelImports.map[
			import | collectObjectDescriptions(import.package, true, true, import.useSimpleNames, import.name)
		].flatten + #[createEObjectDescription(EcorePackage.Literals.EOBJECT, true, null),
			createEObjectDescription(InputTypesPackage.Literals.STRING, true, null),
			createEObjectDescription(InputTypesPackage.Literals.INT, true, null)
		];

		var resultScope = new SimpleScope(IScope.NULLSCOPE, classifierDescriptions)
		return resultScope
	}
}
