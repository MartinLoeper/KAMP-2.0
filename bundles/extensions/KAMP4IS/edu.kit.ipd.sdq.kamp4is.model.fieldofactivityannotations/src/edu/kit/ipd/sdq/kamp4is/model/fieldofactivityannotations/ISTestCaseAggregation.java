/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Test Case Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNumberOfTestcases <em>Number Of Testcases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNameOfTestSuite <em>Name Of Test Suite</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestCaseAggregation()
 * @model abstract="true"
 * @generated
 */
public interface ISTestCaseAggregation extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Testcases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Testcases</em>' attribute.
	 * @see #setNumberOfTestcases(int)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestCaseAggregation_NumberOfTestcases()
	 * @model
	 * @generated
	 */
	int getNumberOfTestcases();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNumberOfTestcases <em>Number Of Testcases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Testcases</em>' attribute.
	 * @see #getNumberOfTestcases()
	 * @generated
	 */
	void setNumberOfTestcases(int value);

	/**
	 * Returns the value of the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Of Test Suite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Of Test Suite</em>' attribute.
	 * @see #setNameOfTestSuite(String)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestCaseAggregation_NameOfTestSuite()
	 * @model
	 * @generated
	 */
	String getNameOfTestSuite();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNameOfTestSuite <em>Name Of Test Suite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Of Test Suite</em>' attribute.
	 * @see #getNameOfTestSuite()
	 * @generated
	 */
	void setNameOfTestSuite(String value);

} // ISTestCaseAggregation
