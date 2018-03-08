/**
 */
package decisions;

import de.uka.ipd.sdq.identifier.Identifier;

import glossary.GlossaryTerm;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import relations.TraceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisions.Decision#getRationales <em>Rationales</em>}</li>
 *   <li>{@link decisions.Decision#getDescription <em>Description</em>}</li>
 *   <li>{@link decisions.Decision#getStatus <em>Status</em>}</li>
 *   <li>{@link decisions.Decision#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link decisions.Decision#getRepository <em>Repository</em>}</li>
 *   <li>{@link decisions.Decision#getUsedTerms <em>Used Terms</em>}</li>
 * </ul>
 *
 * @see decisions.DecisionsPackage#getDecision()
 * @model abstract="true"
 * @generated
 */
public interface Decision extends Identifier, TraceableObject {
	/**
	 * Returns the value of the '<em><b>Rationales</b></em>' containment reference list.
	 * The list contents are of type {@link decisions.Rationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationales</em>' containment reference list.
	 * @see decisions.DecisionsPackage#getDecision_Rationales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rationale> getRationales();

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
	 * @see decisions.DecisionsPackage#getDecision_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link decisions.Decision#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link decisions.DecisionStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see decisions.DecisionStatusEnum
	 * @see #setStatus(DecisionStatusEnum)
	 * @see decisions.DecisionsPackage#getDecision_Status()
	 * @model required="true"
	 * @generated
	 */
	DecisionStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link decisions.Decision#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see decisions.DecisionStatusEnum
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DecisionStatusEnum value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see decisions.DecisionsPackage#getDecision_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link decisions.Decision#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link decisions.DecisionRepository#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(DecisionRepository)
	 * @see decisions.DecisionsPackage#getDecision_Repository()
	 * @see decisions.DecisionRepository#getDecisions
	 * @model opposite="decisions" required="true" transient="false"
	 * @generated
	 */
	DecisionRepository getRepository();

	/**
	 * Sets the value of the '{@link decisions.Decision#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(DecisionRepository value);

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
	 * @see decisions.DecisionsPackage#getDecision_UsedTerms()
	 * @model
	 * @generated
	 */
	EList<GlossaryTerm> getUsedTerms();

} // Decision
