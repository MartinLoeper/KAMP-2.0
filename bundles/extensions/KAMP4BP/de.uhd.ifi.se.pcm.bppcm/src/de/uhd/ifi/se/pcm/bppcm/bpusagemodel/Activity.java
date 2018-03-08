/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject, AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(ScenarioBehaviour)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getActivity_Scenario()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScenarioBehaviour getScenario();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(ScenarioBehaviour value);

} // Activity
