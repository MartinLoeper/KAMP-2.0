/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ISFieldOfActivityAnnotationsFactoryImpl extends EFactoryImpl implements ISFieldOfActivityAnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ISFieldOfActivityAnnotationsFactory init() {
		try {
			ISFieldOfActivityAnnotationsFactory theISFieldOfActivityAnnotationsFactory = (ISFieldOfActivityAnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(ISFieldOfActivityAnnotationsPackage.eNS_URI);
			if (theISFieldOfActivityAnnotationsFactory != null) {
				return theISFieldOfActivityAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ISFieldOfActivityAnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsFactoryImpl() {
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
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: return createISFieldOfActivityAnnotationsRepository();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION: return createISDevelopmentArtefactSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_SOURCE_FILE: return createISSourceFile();
			case ISFieldOfActivityAnnotationsPackage.IS_SOURCE_FILE_AGGREGATION: return createISSourceFileAggregation();
			case ISFieldOfActivityAnnotationsPackage.IS_METADATA_FILE: return createISMetadataFile();
			case ISFieldOfActivityAnnotationsPackage.IS_METADATA_FILE_AGGREGATION: return createISMetadataFileAggregation();
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION: return createISBuildSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION: return createISBuildConfiguration();
			case ISFieldOfActivityAnnotationsPackage.IS_THIRD_PARTY_COMPONENT_OR_LIBRARY: return createISThirdPartyComponentOrLibrary();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION: return createISTestSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION: return createISReleaseSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_CONFIGURATION: return createISReleaseConfiguration();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION: return createISDeploymentSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_RUNTIME_INSTANCE: return createISRuntimeInstance();
			case ISFieldOfActivityAnnotationsPackage.IS_RUNTIME_INSTANCE_AGGREGATION: return createISRuntimeInstanceAggregation();
			case ISFieldOfActivityAnnotationsPackage.IS_UNIT_TEST_CASE: return createISUnitTestCase();
			case ISFieldOfActivityAnnotationsPackage.IS_ACCEPTANCE_TEST_CASE: return createISAcceptanceTestCase();
			case ISFieldOfActivityAnnotationsPackage.IS_INTEGRATION_TEST_CASE: return createISIntegrationTestCase();
			case ISFieldOfActivityAnnotationsPackage.IS_UNIT_TEST_CASE_AGGREGATION: return createISUnitTestCaseAggregation();
			case ISFieldOfActivityAnnotationsPackage.IS_ACCEPTANCE_TEST_CASE_AGGREGATION: return createISAcceptanceTestCaseAggregation();
			case ISFieldOfActivityAnnotationsPackage.IS_INTEGRATION_TEST_CASE_AGGREGATION: return createISIntegrationTestCaseAggregation();
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION: return createISStaffSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST: return createISPersonList();
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON: return createISPerson();
			case ISFieldOfActivityAnnotationsPackage.IS_ROLE_LIST: return createISRoleList();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPER: return createISDeveloper();
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATOR: return createISBuildConfigurator();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_DEVELOPER: return createISTestDeveloper();
			case ISFieldOfActivityAnnotationsPackage.IS_TESTER: return createISTester();
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_CONFIGURATOR: return createISReleaseConfigurator();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYER: return createISDeployer();
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_SPECIFICATION: return createISDesignPatternSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE: return createISDesignPatternRole();
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION: return createISTechnologySpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE: return createISTechnologicalCorrespondence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE_TYPES:
				return createISTechnologicalCorrespondenceTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE_TYPES:
				return convertISTechnologicalCorrespondenceTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsRepository createISFieldOfActivityAnnotationsRepository() {
		ISFieldOfActivityAnnotationsRepositoryImpl isFieldOfActivityAnnotationsRepository = new ISFieldOfActivityAnnotationsRepositoryImpl();
		return isFieldOfActivityAnnotationsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDevelopmentArtefactSpecification createISDevelopmentArtefactSpecification() {
		ISDevelopmentArtefactSpecificationImpl isDevelopmentArtefactSpecification = new ISDevelopmentArtefactSpecificationImpl();
		return isDevelopmentArtefactSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISSourceFile createISSourceFile() {
		ISSourceFileImpl isSourceFile = new ISSourceFileImpl();
		return isSourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISSourceFileAggregation createISSourceFileAggregation() {
		ISSourceFileAggregationImpl isSourceFileAggregation = new ISSourceFileAggregationImpl();
		return isSourceFileAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISMetadataFile createISMetadataFile() {
		ISMetadataFileImpl isMetadataFile = new ISMetadataFileImpl();
		return isMetadataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISMetadataFileAggregation createISMetadataFileAggregation() {
		ISMetadataFileAggregationImpl isMetadataFileAggregation = new ISMetadataFileAggregationImpl();
		return isMetadataFileAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISBuildSpecification createISBuildSpecification() {
		ISBuildSpecificationImpl isBuildSpecification = new ISBuildSpecificationImpl();
		return isBuildSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISBuildConfiguration createISBuildConfiguration() {
		ISBuildConfigurationImpl isBuildConfiguration = new ISBuildConfigurationImpl();
		return isBuildConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISThirdPartyComponentOrLibrary createISThirdPartyComponentOrLibrary() {
		ISThirdPartyComponentOrLibraryImpl isThirdPartyComponentOrLibrary = new ISThirdPartyComponentOrLibraryImpl();
		return isThirdPartyComponentOrLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTestSpecification createISTestSpecification() {
		ISTestSpecificationImpl isTestSpecification = new ISTestSpecificationImpl();
		return isTestSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISReleaseSpecification createISReleaseSpecification() {
		ISReleaseSpecificationImpl isReleaseSpecification = new ISReleaseSpecificationImpl();
		return isReleaseSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISReleaseConfiguration createISReleaseConfiguration() {
		ISReleaseConfigurationImpl isReleaseConfiguration = new ISReleaseConfigurationImpl();
		return isReleaseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDeploymentSpecification createISDeploymentSpecification() {
		ISDeploymentSpecificationImpl isDeploymentSpecification = new ISDeploymentSpecificationImpl();
		return isDeploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISRuntimeInstance createISRuntimeInstance() {
		ISRuntimeInstanceImpl isRuntimeInstance = new ISRuntimeInstanceImpl();
		return isRuntimeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISRuntimeInstanceAggregation createISRuntimeInstanceAggregation() {
		ISRuntimeInstanceAggregationImpl isRuntimeInstanceAggregation = new ISRuntimeInstanceAggregationImpl();
		return isRuntimeInstanceAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISUnitTestCase createISUnitTestCase() {
		ISUnitTestCaseImpl isUnitTestCase = new ISUnitTestCaseImpl();
		return isUnitTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISAcceptanceTestCase createISAcceptanceTestCase() {
		ISAcceptanceTestCaseImpl isAcceptanceTestCase = new ISAcceptanceTestCaseImpl();
		return isAcceptanceTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISIntegrationTestCase createISIntegrationTestCase() {
		ISIntegrationTestCaseImpl isIntegrationTestCase = new ISIntegrationTestCaseImpl();
		return isIntegrationTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISUnitTestCaseAggregation createISUnitTestCaseAggregation() {
		ISUnitTestCaseAggregationImpl isUnitTestCaseAggregation = new ISUnitTestCaseAggregationImpl();
		return isUnitTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISAcceptanceTestCaseAggregation createISAcceptanceTestCaseAggregation() {
		ISAcceptanceTestCaseAggregationImpl isAcceptanceTestCaseAggregation = new ISAcceptanceTestCaseAggregationImpl();
		return isAcceptanceTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISIntegrationTestCaseAggregation createISIntegrationTestCaseAggregation() {
		ISIntegrationTestCaseAggregationImpl isIntegrationTestCaseAggregation = new ISIntegrationTestCaseAggregationImpl();
		return isIntegrationTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISStaffSpecification createISStaffSpecification() {
		ISStaffSpecificationImpl isStaffSpecification = new ISStaffSpecificationImpl();
		return isStaffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISPersonList createISPersonList() {
		ISPersonListImpl isPersonList = new ISPersonListImpl();
		return isPersonList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISPerson createISPerson() {
		ISPersonImpl isPerson = new ISPersonImpl();
		return isPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISRoleList createISRoleList() {
		ISRoleListImpl isRoleList = new ISRoleListImpl();
		return isRoleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDeveloper createISDeveloper() {
		ISDeveloperImpl isDeveloper = new ISDeveloperImpl();
		return isDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISBuildConfigurator createISBuildConfigurator() {
		ISBuildConfiguratorImpl isBuildConfigurator = new ISBuildConfiguratorImpl();
		return isBuildConfigurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTestDeveloper createISTestDeveloper() {
		ISTestDeveloperImpl isTestDeveloper = new ISTestDeveloperImpl();
		return isTestDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTester createISTester() {
		ISTesterImpl isTester = new ISTesterImpl();
		return isTester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISReleaseConfigurator createISReleaseConfigurator() {
		ISReleaseConfiguratorImpl isReleaseConfigurator = new ISReleaseConfiguratorImpl();
		return isReleaseConfigurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDeployer createISDeployer() {
		ISDeployerImpl isDeployer = new ISDeployerImpl();
		return isDeployer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDesignPatternSpecification createISDesignPatternSpecification() {
		ISDesignPatternSpecificationImpl isDesignPatternSpecification = new ISDesignPatternSpecificationImpl();
		return isDesignPatternSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDesignPatternRole createISDesignPatternRole() {
		ISDesignPatternRoleImpl isDesignPatternRole = new ISDesignPatternRoleImpl();
		return isDesignPatternRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTechnologySpecification createISTechnologySpecification() {
		ISTechnologySpecificationImpl isTechnologySpecification = new ISTechnologySpecificationImpl();
		return isTechnologySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTechnologicalCorrespondence createISTechnologicalCorrespondence() {
		ISTechnologicalCorrespondenceImpl isTechnologicalCorrespondence = new ISTechnologicalCorrespondenceImpl();
		return isTechnologicalCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTechnologicalCorrespondenceTypes createISTechnologicalCorrespondenceTypesFromString(EDataType eDataType, String initialValue) {
		ISTechnologicalCorrespondenceTypes result = ISTechnologicalCorrespondenceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISTechnologicalCorrespondenceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsPackage getISFieldOfActivityAnnotationsPackage() {
		return (ISFieldOfActivityAnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ISFieldOfActivityAnnotationsPackage getPackage() {
		return ISFieldOfActivityAnnotationsPackage.eINSTANCE;
	}

} //ISFieldOfActivityAnnotationsFactoryImpl
