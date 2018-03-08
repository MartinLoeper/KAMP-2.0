/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository#getBusinessProcessSpecification <em>Business Process Specification</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPFieldOfActivityAnnotationsRepository()
 * @model
 * @generated
 */
public interface BPFieldOfActivityAnnotationsRepository extends ISFieldOfActivityAnnotationsRepository {
	/**
	 * Returns the value of the '<em><b>Business Process Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Specification</em>' containment reference.
	 * @see #setBusinessProcessSpecification(BPBusinessProcessSpecification)
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPFieldOfActivityAnnotationsRepository_BusinessProcessSpecification()
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	BPBusinessProcessSpecification getBusinessProcessSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository#getBusinessProcessSpecification <em>Business Process Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process Specification</em>' containment reference.
	 * @see #getBusinessProcessSpecification()
	 * @generated
	 */
	void setBusinessProcessSpecification(BPBusinessProcessSpecification value);

} // BPFieldOfActivityAnnotationsRepository
