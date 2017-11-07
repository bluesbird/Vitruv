/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping;
import tools.vitruv.dsls.mappings.mappingsLanguage.Mapping;
import tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage;
import tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment;

import tools.vitruv.dsls.mirbase.mirBase.DomainReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mappings Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.impl.MappingsSegmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.impl.MappingsSegmentImpl#getLeftDomain <em>Left Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.impl.MappingsSegmentImpl#getRightDomain <em>Right Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.impl.MappingsSegmentImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.impl.MappingsSegmentImpl#getBootstrappings <em>Bootstrappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingsSegmentImpl extends DocumentableImpl implements MappingsSegment
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeftDomain() <em>Left Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftDomain()
   * @generated
   * @ordered
   */
  protected DomainReference leftDomain;

  /**
   * The cached value of the '{@link #getRightDomain() <em>Right Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightDomain()
   * @generated
   * @ordered
   */
  protected DomainReference rightDomain;

  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> mappings;

  /**
   * The cached value of the '{@link #getBootstrappings() <em>Bootstrappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrappings()
   * @generated
   * @ordered
   */
  protected EList<Bootstrapping> bootstrappings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingsSegmentImpl()
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
    return MappingsLanguagePackage.Literals.MAPPINGS_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingsLanguagePackage.MAPPINGS_SEGMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainReference getLeftDomain()
  {
    return leftDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftDomain(DomainReference newLeftDomain, NotificationChain msgs)
  {
    DomainReference oldLeftDomain = leftDomain;
    leftDomain = newLeftDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN, oldLeftDomain, newLeftDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftDomain(DomainReference newLeftDomain)
  {
    if (newLeftDomain != leftDomain)
    {
      NotificationChain msgs = null;
      if (leftDomain != null)
        msgs = ((InternalEObject)leftDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN, null, msgs);
      if (newLeftDomain != null)
        msgs = ((InternalEObject)newLeftDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN, null, msgs);
      msgs = basicSetLeftDomain(newLeftDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN, newLeftDomain, newLeftDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainReference getRightDomain()
  {
    return rightDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightDomain(DomainReference newRightDomain, NotificationChain msgs)
  {
    DomainReference oldRightDomain = rightDomain;
    rightDomain = newRightDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN, oldRightDomain, newRightDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightDomain(DomainReference newRightDomain)
  {
    if (newRightDomain != rightDomain)
    {
      NotificationChain msgs = null;
      if (rightDomain != null)
        msgs = ((InternalEObject)rightDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN, null, msgs);
      if (newRightDomain != null)
        msgs = ((InternalEObject)newRightDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN, null, msgs);
      msgs = basicSetRightDomain(newRightDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN, newRightDomain, newRightDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, MappingsLanguagePackage.MAPPINGS_SEGMENT__MAPPINGS);
    }
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Bootstrapping> getBootstrappings()
  {
    if (bootstrappings == null)
    {
      bootstrappings = new EObjectContainmentEList<Bootstrapping>(Bootstrapping.class, this, MappingsLanguagePackage.MAPPINGS_SEGMENT__BOOTSTRAPPINGS);
    }
    return bootstrappings;
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
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN:
        return basicSetLeftDomain(null, msgs);
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN:
        return basicSetRightDomain(null, msgs);
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__BOOTSTRAPPINGS:
        return ((InternalEList<?>)getBootstrappings()).basicRemove(otherEnd, msgs);
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
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__NAME:
        return getName();
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN:
        return getLeftDomain();
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN:
        return getRightDomain();
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__MAPPINGS:
        return getMappings();
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__BOOTSTRAPPINGS:
        return getBootstrappings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__NAME:
        setName((String)newValue);
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN:
        setLeftDomain((DomainReference)newValue);
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN:
        setRightDomain((DomainReference)newValue);
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__BOOTSTRAPPINGS:
        getBootstrappings().clear();
        getBootstrappings().addAll((Collection<? extends Bootstrapping>)newValue);
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
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN:
        setLeftDomain((DomainReference)null);
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN:
        setRightDomain((DomainReference)null);
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__MAPPINGS:
        getMappings().clear();
        return;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__BOOTSTRAPPINGS:
        getBootstrappings().clear();
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
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__LEFT_DOMAIN:
        return leftDomain != null;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__RIGHT_DOMAIN:
        return rightDomain != null;
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
      case MappingsLanguagePackage.MAPPINGS_SEGMENT__BOOTSTRAPPINGS:
        return bootstrappings != null && !bootstrappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MappingsSegmentImpl
