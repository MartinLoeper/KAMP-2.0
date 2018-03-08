/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquire Device Resource Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#isTimeout <em>Timeout</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getTimeoutValue <em>Timeout Value</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getAcquireDeviceResourceAction()
 * @model
 * @generated
 */
public interface AcquireDeviceResourceAction extends EObject, AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Passiveresource Acquire Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passiveresource Acquire Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passiveresource Acquire Action</em>' reference.
	 * @see #setPassiveresource_AcquireAction(DeviceResource)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getAcquireDeviceResourceAction_Passiveresource_AcquireAction()
	 * @model required="true"
	 * @generated
	 */
	DeviceResource getPassiveresource_AcquireAction();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passiveresource Acquire Action</em>' reference.
	 * @see #getPassiveresource_AcquireAction()
	 * @generated
	 */
	void setPassiveresource_AcquireAction(DeviceResource value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(boolean)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getAcquireDeviceResourceAction_Timeout()
	 * @model required="true"
	 * @generated
	 */
	boolean isTimeout();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#isTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #isTimeout()
	 * @generated
	 */
	void setTimeout(boolean value);

	/**
	 * Returns the value of the '<em><b>Timeout Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Value</em>' attribute.
	 * @see #setTimeoutValue(double)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getAcquireDeviceResourceAction_TimeoutValue()
	 * @model required="true"
	 * @generated
	 */
	double getTimeoutValue();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getTimeoutValue <em>Timeout Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Value</em>' attribute.
	 * @see #getTimeoutValue()
	 * @generated
	 */
	void setTimeoutValue(double value);

} // AcquireDeviceResourceAction
