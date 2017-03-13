package tools.vitruv.framework.tests.echange.feature.reference

import allElementTypes.AllElementTypesFactory
import allElementTypes.NonRoot
import allElementTypes.Root
import org.eclipse.emf.ecore.EObject
import org.junit.Before
import tools.vitruv.framework.tests.echange.EChangeTest

/**
 * Abstract class which is used by all test classes for references.
 */
public abstract class ReferenceEChangeTest extends EChangeTest {
	protected var Root defaultAffectedEObject = null
	protected var NonRoot defaultNewValue = null
	protected var NonRoot defaultNewValue2 = null
	
	protected static val DEFAULT_NEW_NON_ROOT_NAME = "New Non Root Element"
	protected static val DEFAULT_NEW_NON_ROOT_NAME_2 = "New Non Root Element 2"
	
	/**
	 * Sets the default object and new value for tests.
	 */
	@Before
	override public void beforeTest() {
		super.beforeTest()
		defaultAffectedEObject = rootObject1
		defaultNewValue = AllElementTypesFactory.eINSTANCE.createNonRoot()
		defaultNewValue.id = DEFAULT_NEW_NON_ROOT_NAME
		defaultNewValue2 = AllElementTypesFactory.eINSTANCE.createNonRoot()
		defaultNewValue2.id = DEFAULT_NEW_NON_ROOT_NAME_2
	}
	
	/**
	 * Prepares the resource and adds the new values.
	 */
	def protected void prepareResource() {
		resource1.contents.add(defaultNewValue)
		resource1.contents.add(defaultNewValue2)
	}
	
	/**
	 * Prepares the staging area for the tests and places
	 * a new object in it. Clears the old value.
	 * @param 	object The new object.
	 */
	def protected void prepareStagingArea(EObject object) {
		stagingArea1.contents.clear
		stagingArea1.contents.add(object)
	}
}