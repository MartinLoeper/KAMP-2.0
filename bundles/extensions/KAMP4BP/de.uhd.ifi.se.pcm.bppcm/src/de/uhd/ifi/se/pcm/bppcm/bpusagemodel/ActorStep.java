/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.PCMRandomVariable;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getRestingTime <em>Resting Time</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isContinuouslyPerformed <em>Continuously Performed</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isInterruptable <em>Interruptable</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getOutputDataObjects <em>Output Data Objects</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getInputDataObjects <em>Input Data Objects</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep()
 * @model
 * @generated
 */
public interface ActorStep extends EObject, AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' containment reference.
	 * @see #setProcessingTime(PCMRandomVariable)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep_ProcessingTime()
	 * @model containment="true"
	 * @generated
	 */
	PCMRandomVariable getProcessingTime();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getProcessingTime <em>Processing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' containment reference.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Resting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resting Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resting Time</em>' attribute.
	 * @see #setRestingTime(double)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep_RestingTime()
	 * @model
	 * @generated
	 */
	double getRestingTime();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getRestingTime <em>Resting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resting Time</em>' attribute.
	 * @see #getRestingTime()
	 * @generated
	 */
	void setRestingTime(double value);

	/**
	 * Returns the value of the '<em><b>Responsible Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Role</em>' reference.
	 * @see #setResponsibleRole(Role)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep_ResponsibleRole()
	 * @model
	 * @generated
	 */
	Role getResponsibleRole();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getResponsibleRole <em>Responsible Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Role</em>' reference.
	 * @see #getResponsibleRole()
	 * @generated
	 */
	void setResponsibleRole(Role value);

	/**
	 * Returns the value of the '<em><b>Continuously Performed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuously Performed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuously Performed</em>' attribute.
	 * @see #setContinuouslyPerformed(boolean)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep_ContinuouslyPerformed()
	 * @model
	 * @generated
	 */
	boolean isContinuouslyPerformed();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isContinuouslyPerformed <em>Continuously Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuously Performed</em>' attribute.
	 * @see #isContinuouslyPerformed()
	 * @generated
	 */
	void setContinuouslyPerformed(boolean value);

	/**
	 * Returns the value of the '<em><b>Interruptable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interruptable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interruptable</em>' attribute.
	 * @see #setInterruptable(boolean)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep_Interruptable()
	 * @model default="false"
	 * @generated
	 */
	boolean isInterruptable();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isInterruptable <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interruptable</em>' attribute.
	 * @see #isInterruptable()
	 * @generated
	 */
	void setInterruptable(boolean value);

	/**
	 * Returns the value of the '<em><b>Output Data Objects</b></em>' reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Objects</em>' reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep_OutputDataObjects()
	 * @model
	 * @generated
	 */
	EList<DataObject<?>> getOutputDataObjects();

	/**
	 * Returns the value of the '<em><b>Input Data Objects</b></em>' reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Objects</em>' reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActorStep_InputDataObjects()
	 * @model
	 * @generated
	 */
	EList<DataObject<?>> getInputDataObjects();

} // ActorStep
