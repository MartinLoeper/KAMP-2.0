/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Training Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse#getActorStep <em>Actor Step</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPTrainingCourse()
 * @model
 * @generated
 */
public interface BPTrainingCourse extends BPUserActionAnnotation<ActorStep> {

	/**
	 * Returns the value of the '<em><b>Actor Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Step</em>' reference.
	 * @see #setActorStep(ActorStep)
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPTrainingCourse_ActorStep()
	 * @model
	 * @generated
	 */
	ActorStep getActorStep();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse#getActorStep <em>Actor Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Step</em>' reference.
	 * @see #getActorStep()
	 * @generated
	 */
	void setActorStep(ActorStep value);
} // BPTrainingCourse
