/**
 * generated by Xtext 2.10.0
 */
package tools.vitruv.dsls.response.responseLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.vitruv.dsls.mirbase.mirBase.MetaclassFeatureReference;

import tools.vitruv.dsls.response.responseLanguage.AtomicFeatureChange;
import tools.vitruv.dsls.response.responseLanguage.ResponseLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Feature Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.response.responseLanguage.impl.AtomicFeatureChangeImpl#getChangedFeature <em>Changed Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicFeatureChangeImpl extends AtomicConcreteModelElementChangeImpl implements AtomicFeatureChange
{
  /**
   * The cached value of the '{@link #getChangedFeature() <em>Changed Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangedFeature()
   * @generated
   * @ordered
   */
  protected MetaclassFeatureReference changedFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicFeatureChangeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ResponseLanguagePackage.Literals.ATOMIC_FEATURE_CHANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaclassFeatureReference getChangedFeature()
  {
    return changedFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChangedFeature(MetaclassFeatureReference newChangedFeature, NotificationChain msgs)
  {
    MetaclassFeatureReference oldChangedFeature = changedFeature;
    changedFeature = newChangedFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE, oldChangedFeature, newChangedFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangedFeature(MetaclassFeatureReference newChangedFeature)
  {
    if (newChangedFeature != changedFeature)
    {
      NotificationChain msgs = null;
      if (changedFeature != null)
        msgs = ((InternalEObject)changedFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE, null, msgs);
      if (newChangedFeature != null)
        msgs = ((InternalEObject)newChangedFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE, null, msgs);
      msgs = basicSetChangedFeature(newChangedFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE, newChangedFeature, newChangedFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE:
        return basicSetChangedFeature(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE:
        return getChangedFeature();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE:
        setChangedFeature((MetaclassFeatureReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE:
        setChangedFeature((MetaclassFeatureReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.ATOMIC_FEATURE_CHANGE__CHANGED_FEATURE:
        return changedFeature != null;
    }
    return super.eIsSet(featureID);
  }

} //AtomicFeatureChangeImpl
