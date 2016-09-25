/**
 * generated by Xtext 2.10.0
 */
package tools.vitruv.dsls.response.responseLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.response.responseLanguage.Effect#getEffectStatement <em>Effect Statement</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.response.responseLanguage.ResponseLanguagePackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject
{
  /**
   * Returns the value of the '<em><b>Effect Statement</b></em>' containment reference list.
   * The list contents are of type {@link tools.vitruv.dsls.response.responseLanguage.EffectStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effect Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect Statement</em>' containment reference list.
   * @see tools.vitruv.dsls.response.responseLanguage.ResponseLanguagePackage#getEffect_EffectStatement()
   * @model containment="true"
   * @generated
   */
  EList<EffectStatement> getEffectStatement();

} // Effect
