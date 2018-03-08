/**
 */
package glossary;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glossary.GlossaryTerm#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link glossary.GlossaryTerm#getTerm <em>Term</em>}</li>
 *   <li>{@link glossary.GlossaryTerm#getDefinition <em>Definition</em>}</li>
 *   <li>{@link glossary.GlossaryTerm#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link glossary.GlossaryTerm#getOtherforms <em>Otherforms</em>}</li>
 *   <li>{@link glossary.GlossaryTerm#getTermcategory <em>Termcategory</em>}</li>
 *   <li>{@link glossary.GlossaryTerm#getTermproperty <em>Termproperty</em>}</li>
 *   <li>{@link glossary.GlossaryTerm#getAntonym <em>Antonym</em>}</li>
 * </ul>
 *
 * @see glossary.GlossaryPackage#getGlossaryTerm()
 * @model
 * @generated
 */
public interface GlossaryTerm extends Identifier {
	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link glossary.Glossary#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glossary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' container reference.
	 * @see #setGlossary(Glossary)
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Glossary()
	 * @see glossary.Glossary#getTerms
	 * @model opposite="terms" required="true" transient="false"
	 * @generated
	 */
	Glossary getGlossary();

	/**
	 * Sets the value of the '{@link glossary.GlossaryTerm#getGlossary <em>Glossary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossary</em>' container reference.
	 * @see #getGlossary()
	 * @generated
	 */
	void setGlossary(Glossary value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Term()
	 * @model default="" required="true"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link glossary.GlossaryTerm#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Definition()
	 * @model
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link glossary.GlossaryTerm#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' reference list.
	 * The list contents are of type {@link glossary.GlossaryTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonym</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonym</em>' reference list.
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Synonym()
	 * @model
	 * @generated
	 */
	EList<GlossaryTerm> getSynonym();

	/**
	 * Returns the value of the '<em><b>Otherforms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherforms</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherforms</em>' attribute list.
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Otherforms()
	 * @model
	 * @generated
	 */
	EList<String> getOtherforms();

	/**
	 * Returns the value of the '<em><b>Termcategory</b></em>' attribute list.
	 * The list contents are of type {@link glossary.TermCategory}.
	 * The literals are from the enumeration {@link glossary.TermCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termcategory</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termcategory</em>' attribute list.
	 * @see glossary.TermCategory
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Termcategory()
	 * @model required="true"
	 * @generated
	 */
	EList<TermCategory> getTermcategory();

	/**
	 * Returns the value of the '<em><b>Termproperty</b></em>' attribute.
	 * The default value is <code>"neutral"</code>.
	 * The literals are from the enumeration {@link glossary.TermInfluenceProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termproperty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termproperty</em>' attribute.
	 * @see glossary.TermInfluenceProperty
	 * @see #setTermproperty(TermInfluenceProperty)
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Termproperty()
	 * @model default="neutral"
	 * @generated
	 */
	TermInfluenceProperty getTermproperty();

	/**
	 * Sets the value of the '{@link glossary.GlossaryTerm#getTermproperty <em>Termproperty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termproperty</em>' attribute.
	 * @see glossary.TermInfluenceProperty
	 * @see #getTermproperty()
	 * @generated
	 */
	void setTermproperty(TermInfluenceProperty value);

	/**
	 * Returns the value of the '<em><b>Antonym</b></em>' reference list.
	 * The list contents are of type {@link glossary.GlossaryTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antonym</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antonym</em>' reference list.
	 * @see glossary.GlossaryPackage#getGlossaryTerm_Antonym()
	 * @model
	 * @generated
	 */
	EList<GlossaryTerm> getAntonym();

} // GlossaryTerm
