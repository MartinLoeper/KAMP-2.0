/**
 */
package effects;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link effects.Effect#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link effects.Effect#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see effects.EffectsPackage#getEffect()
 * @model abstract="true"
 * @generated
 */
public interface Effect extends Identifier {
	/**
	 * Returns the value of the '<em><b>Effect Type</b></em>' attribute.
	 * The default value is <code>"neutral"</code>.
	 * The literals are from the enumeration {@link effects.EffectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Type</em>' attribute.
	 * @see effects.EffectType
	 * @see #setEffectType(EffectType)
	 * @see effects.EffectsPackage#getEffect_EffectType()
	 * @model default="neutral"
	 * @generated
	 */
	EffectType getEffectType();

	/**
	 * Sets the value of the '{@link effects.Effect#getEffectType <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Type</em>' attribute.
	 * @see effects.EffectType
	 * @see #getEffectType()
	 * @generated
	 */
	void setEffectType(EffectType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see effects.EffectsPackage#getEffect_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link effects.Effect#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Effect
