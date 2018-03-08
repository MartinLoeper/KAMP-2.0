/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase#getNameOfTest <em>Name Of Test</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestCase()
 * @model abstract="true"
 * @generated
 */
public interface ISTestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Of Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Of Test</em>' attribute.
	 * @see #setNameOfTest(String)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTestCase_NameOfTest()
	 * @model
	 * @generated
	 */
	String getNameOfTest();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase#getNameOfTest <em>Name Of Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Of Test</em>' attribute.
	 * @see #getNameOfTest()
	 * @generated
	 */
	void setNameOfTest(String value);

} // ISTestCase
