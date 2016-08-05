/**
 */
package edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.util;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.AtomicEChange;
import edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.EChange;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.FeatureEChange;
import edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.UpdateMultiValuedFeatureEChange;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.ListPackage
 * @generated
 */
public class ListAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ListPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ListPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ListSwitch<Adapter> modelSwitch =
        new ListSwitch<Adapter>() {
            @Override
            public <A extends EObject, F extends EStructuralFeature> Adapter caseUpdateSingleListEntryEChange(UpdateSingleListEntryEChange<A, F> object) {
                return createUpdateSingleListEntryEChangeAdapter();
            }
            @Override
            public <A extends EObject, F extends EStructuralFeature> Adapter caseInsertInListEChange(InsertInListEChange<A, F> object) {
                return createInsertInListEChangeAdapter();
            }
            @Override
            public <A extends EObject, F extends EStructuralFeature> Adapter caseRemoveFromListEChange(RemoveFromListEChange<A, F> object) {
                return createRemoveFromListEChangeAdapter();
            }
            @Override
            public <A extends EObject, F extends EStructuralFeature> Adapter casePermuteListEChange(PermuteListEChange<A, F> object) {
                return createPermuteListEChangeAdapter();
            }
            @Override
            public Adapter caseEChange(EChange object) {
                return createEChangeAdapter();
            }
            @Override
            public Adapter caseAtomicEChange(AtomicEChange object) {
                return createAtomicEChangeAdapter();
            }
            @Override
            public <A extends EObject, F extends EStructuralFeature> Adapter caseFeatureEChange(FeatureEChange<A, F> object) {
                return createFeatureEChangeAdapter();
            }
            @Override
            public <A extends EObject, F extends EStructuralFeature> Adapter caseUpdateMultiValuedFeatureEChange(UpdateMultiValuedFeatureEChange<A, F> object) {
                return createUpdateMultiValuedFeatureEChangeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.UpdateSingleListEntryEChange <em>Update Single List Entry EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.UpdateSingleListEntryEChange
     * @generated
     */
    public Adapter createUpdateSingleListEntryEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.InsertInListEChange <em>Insert In List EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.InsertInListEChange
     * @generated
     */
    public Adapter createInsertInListEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.RemoveFromListEChange <em>Remove From List EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.RemoveFromListEChange
     * @generated
     */
    public Adapter createRemoveFromListEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.PermuteListEChange <em>Permute List EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.list.PermuteListEChange
     * @generated
     */
    public Adapter createPermuteListEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.EChange <em>EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.EChange
     * @generated
     */
    public Adapter createEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.AtomicEChange <em>Atomic EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.AtomicEChange
     * @generated
     */
    public Adapter createAtomicEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.FeatureEChange <em>EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.FeatureEChange
     * @generated
     */
    public Adapter createFeatureEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.UpdateMultiValuedFeatureEChange <em>Update Multi Valued Feature EChange</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.change.feature.UpdateMultiValuedFeatureEChange
     * @generated
     */
    public Adapter createUpdateMultiValuedFeatureEChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ListAdapterFactory