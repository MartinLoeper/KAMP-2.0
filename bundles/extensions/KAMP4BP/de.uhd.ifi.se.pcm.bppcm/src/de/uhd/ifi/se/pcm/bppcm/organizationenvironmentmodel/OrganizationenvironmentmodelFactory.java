/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage
 * @generated
 */
public interface OrganizationenvironmentmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganizationenvironmentmodelFactory eINSTANCE = de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Organization Environment Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Environment Model</em>'.
	 * @generated
	 */
	OrganizationEnvironmentModel createOrganizationEnvironmentModel();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Actor Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Resource</em>'.
	 * @generated
	 */
	ActorResource createActorResource();

	/**
	 * Returns a new object of class '<em>Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Resource</em>'.
	 * @generated
	 */
	DeviceResource createDeviceResource();

	/**
	 * Returns a new object of class '<em>Working Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Working Period</em>'.
	 * @generated
	 */
	WorkingPeriod createWorkingPeriod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrganizationenvironmentmodelPackage getOrganizationenvironmentmodelPackage();

} //OrganizationenvironmentmodelFactory
