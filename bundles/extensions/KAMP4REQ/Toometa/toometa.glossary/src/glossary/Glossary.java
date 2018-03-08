/**
 */
package glossary;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glossary.Glossary#getTerms <em>Terms</em>}</li>
 *   <li>{@link glossary.Glossary#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see glossary.GlossaryPackage#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends Identifier {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link glossary.GlossaryTerm}.
	 * It is bidirectional and its opposite is '{@link glossary.GlossaryTerm#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see glossary.GlossaryPackage#getGlossary_Terms()
	 * @see glossary.GlossaryTerm#getGlossary
	 * @model opposite="glossary" containment="true"
	 * @generated
	 */
	EList<GlossaryTerm> getTerms();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see glossary.GlossaryPackage#getGlossary_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link glossary.Glossary#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Glossary
