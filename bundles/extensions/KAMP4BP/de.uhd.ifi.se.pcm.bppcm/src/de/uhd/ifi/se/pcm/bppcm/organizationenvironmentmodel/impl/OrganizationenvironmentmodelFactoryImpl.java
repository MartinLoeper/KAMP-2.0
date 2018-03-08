/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationenvironmentmodelFactoryImpl extends EFactoryImpl implements OrganizationenvironmentmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrganizationenvironmentmodelFactory init() {
		try {
			OrganizationenvironmentmodelFactory theOrganizationenvironmentmodelFactory = (OrganizationenvironmentmodelFactory)EPackage.Registry.INSTANCE.getEFactory(OrganizationenvironmentmodelPackage.eNS_URI);
			if (theOrganizationenvironmentmodelFactory != null) {
				return theOrganizationenvironmentmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrganizationenvironmentmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationenvironmentmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL: return createOrganizationEnvironmentModel();
			case OrganizationenvironmentmodelPackage.ROLE: return createRole();
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE: return createActorResource();
			case OrganizationenvironmentmodelPackage.DEVICE_RESOURCE: return createDeviceResource();
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD: return createWorkingPeriod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationEnvironmentModel createOrganizationEnvironmentModel() {
		OrganizationEnvironmentModelImpl organizationEnvironmentModel = new OrganizationEnvironmentModelImpl();
		return organizationEnvironmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorResource createActorResource() {
		ActorResourceImpl actorResource = new ActorResourceImpl();
		return actorResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResource createDeviceResource() {
		DeviceResourceImpl deviceResource = new DeviceResourceImpl();
		return deviceResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingPeriod createWorkingPeriod() {
		WorkingPeriodImpl workingPeriod = new WorkingPeriodImpl();
		return workingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationenvironmentmodelPackage getOrganizationenvironmentmodelPackage() {
		return (OrganizationenvironmentmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrganizationenvironmentmodelPackage getPackage() {
		return OrganizationenvironmentmodelPackage.eINSTANCE;
	}

} //OrganizationenvironmentmodelFactoryImpl
