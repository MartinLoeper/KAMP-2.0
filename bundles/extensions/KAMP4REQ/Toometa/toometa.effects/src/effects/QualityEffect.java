/**
 */
package effects;

import qualities.QualityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link effects.QualityEffect#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @see effects.EffectsPackage#getQualityEffect()
 * @model
 * @generated
 */
public interface QualityEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>Quality Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Type</em>' reference.
	 * @see #setQualityType(QualityType)
	 * @see effects.EffectsPackage#getQualityEffect_QualityType()
	 * @model required="true"
	 * @generated
	 */
	QualityType getQualityType();

	/**
	 * Sets the value of the '{@link effects.QualityEffect#getQualityType <em>Quality Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Type</em>' reference.
	 * @see #getQualityType()
	 * @generated
	 */
	void setQualityType(QualityType value);

} // QualityEffect
