/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface OrganizationenvironmentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "organizationenvironmentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/5.1/bp/OrganizationEnvironmentModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "organizationenvironmentmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganizationenvironmentmodelPackage eINSTANCE = de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationEnvironmentModelImpl <em>Organization Environment Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationEnvironmentModelImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getOrganizationEnvironmentModel()
	 * @generated
	 */
	int ORGANIZATION_ENVIRONMENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENVIRONMENT_MODEL__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENVIRONMENT_MODEL__ROLES = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Organization Environment Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_ENVIRONMENT_MODEL_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.RoleImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACTORS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.ActorResourceImpl <em>Actor Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.ActorResourceImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getActorResource()
	 * @generated
	 */
	int ACTOR_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESOURCE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESOURCE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Working Periods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESOURCE__WORKING_PERIODS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESOURCE__ROLES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.DeviceResourceImpl <em>Device Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.DeviceResourceImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getDeviceResource()
	 * @generated
	 */
	int DEVICE_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE__CAPACITY = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.WorkingPeriodImpl <em>Working Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.WorkingPeriodImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getWorkingPeriod()
	 * @generated
	 */
	int WORKING_PERIOD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_PERIOD__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Period Start Time Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_PERIOD__PERIOD_START_TIME_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period End Time Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_PERIOD__PERIOD_END_TIME_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Working Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_PERIOD_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel <em>Organization Environment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Environment Model</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel
	 * @generated
	 */
	EClass getOrganizationEnvironmentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getRoles()
	 * @see #getOrganizationEnvironmentModel()
	 * @generated
	 */
	EReference getOrganizationEnvironmentModel_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getActorResources <em>Actor Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Resources</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getActorResources()
	 * @see #getOrganizationEnvironmentModel()
	 * @generated
	 */
	EReference getOrganizationEnvironmentModel_ActorResources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getDeviceResources <em>Device Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Resources</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getDeviceResources()
	 * @see #getOrganizationEnvironmentModel()
	 * @generated
	 */
	EReference getOrganizationEnvironmentModel_DeviceResources();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role#getActors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Actors();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource <em>Actor Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Resource</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource
	 * @generated
	 */
	EClass getActorResource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource#getWorkingPeriods <em>Working Periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Working Periods</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource#getWorkingPeriods()
	 * @see #getActorResource()
	 * @generated
	 */
	EReference getActorResource_WorkingPeriods();

	/**
	 * Returns the meta object for the reference list '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource#getRoles()
	 * @see #getActorResource()
	 * @generated
	 */
	EReference getActorResource_Roles();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource <em>Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Resource</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource
	 * @generated
	 */
	EClass getDeviceResource();

	/**
	 * Returns the meta object for the containment reference '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource#getCapacity()
	 * @see #getDeviceResource()
	 * @generated
	 */
	EReference getDeviceResource_Capacity();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod <em>Working Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Period</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod
	 * @generated
	 */
	EClass getWorkingPeriod();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodStartTimePoint <em>Period Start Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Start Time Point</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodStartTimePoint()
	 * @see #getWorkingPeriod()
	 * @generated
	 */
	EAttribute getWorkingPeriod_PeriodStartTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodEndTimePoint <em>Period End Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period End Time Point</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodEndTimePoint()
	 * @see #getWorkingPeriod()
	 * @generated
	 */
	EAttribute getWorkingPeriod_PeriodEndTimePoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrganizationenvironmentmodelFactory getOrganizationenvironmentmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationEnvironmentModelImpl <em>Organization Environment Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationEnvironmentModelImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getOrganizationEnvironmentModel()
		 * @generated
		 */
		EClass ORGANIZATION_ENVIRONMENT_MODEL = eINSTANCE.getOrganizationEnvironmentModel();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_ENVIRONMENT_MODEL__ROLES = eINSTANCE.getOrganizationEnvironmentModel_Roles();

		/**
		 * The meta object literal for the '<em><b>Actor Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES = eINSTANCE.getOrganizationEnvironmentModel_ActorResources();

		/**
		 * The meta object literal for the '<em><b>Device Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES = eINSTANCE.getOrganizationEnvironmentModel_DeviceResources();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.RoleImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ACTORS = eINSTANCE.getRole_Actors();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.ActorResourceImpl <em>Actor Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.ActorResourceImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getActorResource()
		 * @generated
		 */
		EClass ACTOR_RESOURCE = eINSTANCE.getActorResource();

		/**
		 * The meta object literal for the '<em><b>Working Periods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_RESOURCE__WORKING_PERIODS = eINSTANCE.getActorResource_WorkingPeriods();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_RESOURCE__ROLES = eINSTANCE.getActorResource_Roles();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.DeviceResourceImpl <em>Device Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.DeviceResourceImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getDeviceResource()
		 * @generated
		 */
		EClass DEVICE_RESOURCE = eINSTANCE.getDeviceResource();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_RESOURCE__CAPACITY = eINSTANCE.getDeviceResource_Capacity();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.WorkingPeriodImpl <em>Working Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.WorkingPeriodImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl#getWorkingPeriod()
		 * @generated
		 */
		EClass WORKING_PERIOD = eINSTANCE.getWorkingPeriod();

		/**
		 * The meta object literal for the '<em><b>Period Start Time Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_PERIOD__PERIOD_START_TIME_POINT = eINSTANCE.getWorkingPeriod_PeriodStartTimePoint();

		/**
		 * The meta object literal for the '<em><b>Period End Time Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_PERIOD__PERIOD_END_TIME_POINT = eINSTANCE.getWorkingPeriod_PeriodEndTimePoint();

	}

} //OrganizationenvironmentmodelPackage
