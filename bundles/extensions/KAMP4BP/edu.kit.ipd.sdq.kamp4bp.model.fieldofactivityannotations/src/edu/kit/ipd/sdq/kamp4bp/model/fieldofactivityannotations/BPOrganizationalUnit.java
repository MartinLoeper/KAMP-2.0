/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Organizational Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit#getAbstractUserAction <em>Abstract User Action</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPOrganizationalUnit()
 * @model
 * @generated
 */
public interface BPOrganizationalUnit extends BPUserActionAnnotation<Activity> {

	/**
	 * Returns the value of the '<em><b>Abstract User Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract User Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract User Action</em>' reference.
	 * @see #setAbstractUserAction(AbstractUserAction)
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPOrganizationalUnit_AbstractUserAction()
	 * @model
	 * @generated
	 */
	AbstractUserAction getAbstractUserAction();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit#getAbstractUserAction <em>Abstract User Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract User Action</em>' reference.
	 * @see #getAbstractUserAction()
	 * @generated
	 */
	void setAbstractUserAction(AbstractUserAction value);
} // BPOrganizationalUnit
