/**
 */
package options;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link options.Rationale#getRationaleText <em>Rationale Text</em>}</li>
 * </ul>
 *
 * @see options.OptionsPackage#getRationale()
 * @model abstract="true"
 * @generated
 */
public interface Rationale extends Identifier {
	/**
	 * Returns the value of the '<em><b>Rationale Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Text</em>' attribute.
	 * @see #setRationaleText(String)
	 * @see options.OptionsPackage#getRationale_RationaleText()
	 * @model required="true"
	 * @generated
	 */
	String getRationaleText();

	/**
	 * Sets the value of the '{@link options.Rationale#getRationaleText <em>Rationale Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Text</em>' attribute.
	 * @see #getRationaleText()
	 * @generated
	 */
	void setRationaleText(String value);

} // Rationale
