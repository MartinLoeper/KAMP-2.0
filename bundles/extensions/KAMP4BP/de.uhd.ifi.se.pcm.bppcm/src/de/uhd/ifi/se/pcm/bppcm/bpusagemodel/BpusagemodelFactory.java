/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage
 * @generated
 */
public interface BpusagemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpusagemodelFactory eINSTANCE = de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actor Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Step</em>'.
	 * @generated
	 */
	ActorStep createActorStep();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Process Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Workload</em>'.
	 * @generated
	 */
	ProcessWorkload createProcessWorkload();

	/**
	 * Returns a new object of class '<em>Process Trigger Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Trigger Period</em>'.
	 * @generated
	 */
	ProcessTriggerPeriod createProcessTriggerPeriod();

	/**
	 * Returns a new object of class '<em>Acquire Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acquire Device Resource Action</em>'.
	 * @generated
	 */
	AcquireDeviceResourceAction createAcquireDeviceResourceAction();

	/**
	 * Returns a new object of class '<em>Release Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Device Resource Action</em>'.
	 * @generated
	 */
	ReleaseDeviceResourceAction createReleaseDeviceResourceAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BpusagemodelPackage getBpusagemodelPackage();

} //BpusagemodelFactory
