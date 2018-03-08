/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Test Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getUnitTestCases <em>Unit Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getAcceptanceTestCases <em>Acceptance Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getIntegrationTestCases <em>Integration Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getAcceptanceTestCaseAggregations <em>Acceptance Test Case Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getIntegrationTestCaseAggregations <em>Integration Test Case Aggregations</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification()
 * @model
 * @generated
 */
public interface ISTestSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ISFieldOfActivityAnnotationsRepository)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification_Parent()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTestSpecification
	 * @model opposite="testSpecification" required="true" transient="false"
	 * @generated
	 */
	ISFieldOfActivityAnnotationsRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ISFieldOfActivityAnnotationsRepository value);

	/**
	 * Returns the value of the '<em><b>Unit Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Test Cases</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification_UnitTestCases()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISUnitTestCase> getUnitTestCases();

	/**
	 * Returns the value of the '<em><b>Acceptance Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Test Cases</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification_AcceptanceTestCases()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISAcceptanceTestCase> getAcceptanceTestCases();

	/**
	 * Returns the value of the '<em><b>Integration Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Test Cases</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification_IntegrationTestCases()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISIntegrationTestCase> getIntegrationTestCases();

	/**
	 * Returns the value of the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Test Case Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Test Case Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification_UnitTestCaseAggregations()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISUnitTestCaseAggregation> getUnitTestCaseAggregations();

	/**
	 * Returns the value of the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Test Case Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Test Case Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification_AcceptanceTestCaseAggregations()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISAcceptanceTestCaseAggregation> getAcceptanceTestCaseAggregations();

	/**
	 * Returns the value of the '<em><b>Integration Test Case Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Test Case Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Test Case Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestSpecification_IntegrationTestCaseAggregations()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISIntegrationTestCaseAggregation> getIntegrationTestCaseAggregations();

} // ISTestSpecification
