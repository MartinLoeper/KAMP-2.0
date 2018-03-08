/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Business Process Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getUserActionAnnotations <em>User Action Annotations</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPBusinessProcessSpecification()
 * @model
 * @generated
 */
public interface BPBusinessProcessSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository#getBusinessProcessSpecification <em>Business Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(BPFieldOfActivityAnnotationsRepository)
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPBusinessProcessSpecification_Parent()
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository#getBusinessProcessSpecification
	 * @model opposite="businessProcessSpecification" required="true" transient="false"
	 * @generated
	 */
	BPFieldOfActivityAnnotationsRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BPFieldOfActivityAnnotationsRepository value);

	/**
	 * Returns the value of the '<em><b>User Action Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation}&lt;?>.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Action Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Action Annotations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPBusinessProcessSpecification_UserActionAnnotations()
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BPUserActionAnnotation<?>> getUserActionAnnotations();

} // BPBusinessProcessSpecification
