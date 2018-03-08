/**
 */
package options;

import de.uka.ipd.sdq.identifier.Identifier;

import effects.Effect;

import glossary.GlossaryTerm;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import relations.TraceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link options.Option#getDescription <em>Description</em>}</li>
 *   <li>{@link options.Option#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link options.Option#getRepository <em>Repository</em>}</li>
 *   <li>{@link options.Option#getRationale <em>Rationale</em>}</li>
 *   <li>{@link options.Option#isIsModelled <em>Is Modelled</em>}</li>
 *   <li>{@link options.Option#isIsImplemented <em>Is Implemented</em>}</li>
 *   <li>{@link options.Option#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link options.Option#getEffects <em>Effects</em>}</li>
 *   <li>{@link options.Option#getUsedTerms <em>Used Terms</em>}</li>
 * </ul>
 *
 * @see options.OptionsPackage#getOption()
 * @model abstract="true"
 * @generated
 */
public interface Option extends Identifier, TraceableObject {
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
	 * @see options.OptionsPackage#getOption_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link options.Option#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see options.OptionsPackage#getOption_Keywords()
	 * @model
	 * @generated
	 */
	EList<String> getKeywords();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link options.OptionRepository#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(OptionRepository)
	 * @see options.OptionsPackage#getOption_Repository()
	 * @see options.OptionRepository#getOptions
	 * @model opposite="options" required="true" transient="false"
	 * @generated
	 */
	OptionRepository getRepository();

	/**
	 * Sets the value of the '{@link options.Option#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(OptionRepository value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference list.
	 * The list contents are of type {@link options.TextRationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference list.
	 * @see options.OptionsPackage#getOption_Rationale()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextRationale> getRationale();

	/**
	 * Returns the value of the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modelled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modelled</em>' attribute.
	 * @see #setIsModelled(boolean)
	 * @see options.OptionsPackage#getOption_IsModelled()
	 * @model
	 * @generated
	 */
	boolean isIsModelled();

	/**
	 * Sets the value of the '{@link options.Option#isIsModelled <em>Is Modelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modelled</em>' attribute.
	 * @see #isIsModelled()
	 * @generated
	 */
	void setIsModelled(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Implemented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Implemented</em>' attribute.
	 * @see #setIsImplemented(boolean)
	 * @see options.OptionsPackage#getOption_IsImplemented()
	 * @model
	 * @generated
	 */
	boolean isIsImplemented();

	/**
	 * Sets the value of the '{@link options.Option#isIsImplemented <em>Is Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implemented</em>' attribute.
	 * @see #isIsImplemented()
	 * @generated
	 */
	void setIsImplemented(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see options.OptionsPackage#getOption_TimeStamp()
	 * @model
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link options.Option#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' reference list.
	 * The list contents are of type {@link effects.Effect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' reference list.
	 * @see options.OptionsPackage#getOption_Effects()
	 * @model
	 * @generated
	 */
	EList<Effect> getEffects();

	/**
	 * Returns the value of the '<em><b>Used Terms</b></em>' reference list.
	 * The list contents are of type {@link glossary.GlossaryTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Terms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Terms</em>' reference list.
	 * @see options.OptionsPackage#getOption_UsedTerms()
	 * @model
	 * @generated
	 */
	EList<GlossaryTerm> getUsedTerms();

} // Option
