/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Device Resource Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction#getPassiveresource_ReleaseAction <em>Passiveresource Release Action</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getReleaseDeviceResourceAction()
 * @model
 * @generated
 */
public interface ReleaseDeviceResourceAction extends EObject, AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Passiveresource Release Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passiveresource Release Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passiveresource Release Action</em>' reference.
	 * @see #setPassiveresource_ReleaseAction(DeviceResource)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getReleaseDeviceResourceAction_Passiveresource_ReleaseAction()
	 * @model required="true"
	 * @generated
	 */
	DeviceResource getPassiveresource_ReleaseAction();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction#getPassiveresource_ReleaseAction <em>Passiveresource Release Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passiveresource Release Action</em>' reference.
	 * @see #getPassiveresource_ReleaseAction()
	 * @generated
	 */
	void setPassiveresource_ReleaseAction(DeviceResource value);

} // ReleaseDeviceResourceAction
