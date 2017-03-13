package tools.vitruv.framework.tests.echange.eobject

import allElementTypes.Root
import org.junit.Assert
import org.junit.Test
import tools.vitruv.framework.change.echange.TypeInferringAtomicEChangeFactory
import tools.vitruv.framework.change.echange.eobject.CreateEObject
import tools.vitruv.framework.change.echange.eobject.EObjectExistenceEChange
import tools.vitruv.framework.change.echange.util.EChangeUtil

/**
 * Test class for the abstract class {@link EObjectExistenceEChange} EChange,
 * which creates or deletes a new EObject.
 */
class EObjectExistenceEChangeTest extends EObjectTest {
	/**
	 * Test resolves a {@link EObjectExistenceEChangeTest} EChange with 
	 * a new object which was not created yet. So the staging area will be filled.
	 */
	@Test
	def public void resovlveEObjectExistenceEChangeTest() {		
		// The concrete change type CreateEObject will be used for the tests.
		val unresolvedChange = TypeInferringAtomicEChangeFactory.
			<Root>createCreateEObjectChange(defaultCreatedObject, true)
			
		Assert.assertFalse(unresolvedChange.isResolved)
		Assert.assertTrue(defaultCreatedObject != unresolvedChange.affectedEObject)
		Assert.assertTrue(stagingArea1.contents.empty) // Staging area is unaffected while resolving the change
		
		val resolvedChange = unresolvedChange.copyAndResolveBefore(resourceSet1) as CreateEObject<Root>
		
		Assert.assertTrue(resolvedChange.isResolved)
		Assert.assertTrue(unresolvedChange != resolvedChange)
		Assert.assertTrue(resolvedChange.stagingArea == stagingArea1)
		Assert.assertTrue(defaultCreatedObject != resolvedChange.affectedEObject)
		Assert.assertTrue(stagingArea1.contents.empty)
	}
	
	/**
	 * Test resolves a {@link EObjectExistenceEChangeTest} EChange with a
	 * new object which was already created and was put in the staging area.
	 */
	@Test
	def public void resolveEObjectExistenceEChangeTest2() {
		// Put object in the staging area.
		prepareStagingArea(defaultCreatedObject)

		// The concrete change type CreateEObject will be used for the tests.		
		val unresolvedChange = TypeInferringAtomicEChangeFactory.
			<Root>createCreateEObjectChange(defaultCreatedObject, true)
			
		Assert.assertFalse(unresolvedChange.isResolved)
		Assert.assertTrue(defaultCreatedObject != unresolvedChange.affectedEObject)
		// Staging area is unaffected while resolving the change
		Assert.assertFalse(stagingArea1.contents.empty)
		Assert.assertTrue(stagingArea1.contents.get(0) == defaultCreatedObject)
				
		val resolvedChange = unresolvedChange.copyAndResolveAfter(resourceSet1) as CreateEObject<Root>
		
		Assert.assertTrue(resolvedChange.isResolved)
		Assert.assertTrue(unresolvedChange != resolvedChange)
		Assert.assertTrue(resolvedChange.stagingArea == stagingArea1)
		Assert.assertTrue(defaultCreatedObject == resolvedChange.affectedEObject)
		Assert.assertFalse(stagingArea1.contents.empty)
		Assert.assertTrue(stagingArea1.contents.get(0) == defaultCreatedObject)
	}
	
	/**
	 * Test resolves a {@link EObjectExistenceEChangeTest} EChange with a null
	 * affected EObject.
	 */
	@Test
	def public void resolveEObjectExistenceEChangeInvalidObjectTest() {
		// The concrete change type CreateEObject will be used for the tests.
		val unresolvedChange = TypeInferringAtomicEChangeFactory.
			<Root>createCreateEObjectChange(null, true)
			
		Assert.assertFalse(unresolvedChange.isResolved)
		
		val resolvedChange = unresolvedChange.copyAndResolveAfter(resourceSet1) as CreateEObject<Root>
		
		Assert.assertFalse(resolvedChange.isResolved)
		Assert.assertTrue(unresolvedChange == resolvedChange)
	}
}