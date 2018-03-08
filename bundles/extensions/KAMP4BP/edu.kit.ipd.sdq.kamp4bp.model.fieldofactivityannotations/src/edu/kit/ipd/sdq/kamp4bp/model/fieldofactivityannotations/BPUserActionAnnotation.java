/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP User Action Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getAnnotatedUserActions <em>Annotated User Actions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPUserActionAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface BPUserActionAnnotation<T extends AbstractUserAction> extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getUserActionAnnotations <em>User Action Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(BPBusinessProcessSpecification)
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPUserActionAnnotation_Parent()
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getUserActionAnnotations
	 * @model opposite="userActionAnnotations" required="true" transient="false"
	 * @generated
	 */
	BPBusinessProcessSpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BPBusinessProcessSpecification value);

	/**
	 * Returns the value of the '<em><b>Annotated User Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated User Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated User Actions</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPUserActionAnnotation_AnnotatedUserActions()
	 * @model
	 * @generated
	 */
	EList<T> getAnnotatedUserActions();

} // BPUserActionAnnotation
