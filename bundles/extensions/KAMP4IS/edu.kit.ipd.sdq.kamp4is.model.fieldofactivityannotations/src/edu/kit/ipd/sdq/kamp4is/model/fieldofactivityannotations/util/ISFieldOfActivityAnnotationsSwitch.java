/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage
 * @generated
 */
public class ISFieldOfActivityAnnotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ISFieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = ISFieldOfActivityAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: {
				ISFieldOfActivityAnnotationsRepository isFieldOfActivityAnnotationsRepository = (ISFieldOfActivityAnnotationsRepository)theEObject;
				T result = caseISFieldOfActivityAnnotationsRepository(isFieldOfActivityAnnotationsRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION: {
				ISDevelopmentArtefactSpecification isDevelopmentArtefactSpecification = (ISDevelopmentArtefactSpecification)theEObject;
				T result = caseISDevelopmentArtefactSpecification(isDevelopmentArtefactSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_SOURCE_FILE: {
				ISSourceFile isSourceFile = (ISSourceFile)theEObject;
				T result = caseISSourceFile(isSourceFile);
				if (result == null) result = caseISFile(isSourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_SOURCE_FILE_AGGREGATION: {
				ISSourceFileAggregation isSourceFileAggregation = (ISSourceFileAggregation)theEObject;
				T result = caseISSourceFileAggregation(isSourceFileAggregation);
				if (result == null) result = caseISFileAggregation(isSourceFileAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_METADATA_FILE: {
				ISMetadataFile isMetadataFile = (ISMetadataFile)theEObject;
				T result = caseISMetadataFile(isMetadataFile);
				if (result == null) result = caseISFile(isMetadataFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_METADATA_FILE_AGGREGATION: {
				ISMetadataFileAggregation isMetadataFileAggregation = (ISMetadataFileAggregation)theEObject;
				T result = caseISMetadataFileAggregation(isMetadataFileAggregation);
				if (result == null) result = caseISFileAggregation(isMetadataFileAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION: {
				ISBuildSpecification isBuildSpecification = (ISBuildSpecification)theEObject;
				T result = caseISBuildSpecification(isBuildSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION: {
				ISBuildConfiguration isBuildConfiguration = (ISBuildConfiguration)theEObject;
				T result = caseISBuildConfiguration(isBuildConfiguration);
				if (result == null) result = caseISFile(isBuildConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_THIRD_PARTY_COMPONENT_OR_LIBRARY: {
				ISThirdPartyComponentOrLibrary isThirdPartyComponentOrLibrary = (ISThirdPartyComponentOrLibrary)theEObject;
				T result = caseISThirdPartyComponentOrLibrary(isThirdPartyComponentOrLibrary);
				if (result == null) result = caseISFile(isThirdPartyComponentOrLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION: {
				ISTestSpecification isTestSpecification = (ISTestSpecification)theEObject;
				T result = caseISTestSpecification(isTestSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION: {
				ISReleaseSpecification isReleaseSpecification = (ISReleaseSpecification)theEObject;
				T result = caseISReleaseSpecification(isReleaseSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_CONFIGURATION: {
				ISReleaseConfiguration isReleaseConfiguration = (ISReleaseConfiguration)theEObject;
				T result = caseISReleaseConfiguration(isReleaseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION: {
				ISDeploymentSpecification isDeploymentSpecification = (ISDeploymentSpecification)theEObject;
				T result = caseISDeploymentSpecification(isDeploymentSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_RUNTIME_INSTANCE: {
				ISRuntimeInstance isRuntimeInstance = (ISRuntimeInstance)theEObject;
				T result = caseISRuntimeInstance(isRuntimeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_RUNTIME_INSTANCE_AGGREGATION: {
				ISRuntimeInstanceAggregation isRuntimeInstanceAggregation = (ISRuntimeInstanceAggregation)theEObject;
				T result = caseISRuntimeInstanceAggregation(isRuntimeInstanceAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_UNIT_TEST_CASE: {
				ISUnitTestCase isUnitTestCase = (ISUnitTestCase)theEObject;
				T result = caseISUnitTestCase(isUnitTestCase);
				if (result == null) result = caseISTestCase(isUnitTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_ACCEPTANCE_TEST_CASE: {
				ISAcceptanceTestCase isAcceptanceTestCase = (ISAcceptanceTestCase)theEObject;
				T result = caseISAcceptanceTestCase(isAcceptanceTestCase);
				if (result == null) result = caseISTestCase(isAcceptanceTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_INTEGRATION_TEST_CASE: {
				ISIntegrationTestCase isIntegrationTestCase = (ISIntegrationTestCase)theEObject;
				T result = caseISIntegrationTestCase(isIntegrationTestCase);
				if (result == null) result = caseISTestCase(isIntegrationTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_UNIT_TEST_CASE_AGGREGATION: {
				ISUnitTestCaseAggregation isUnitTestCaseAggregation = (ISUnitTestCaseAggregation)theEObject;
				T result = caseISUnitTestCaseAggregation(isUnitTestCaseAggregation);
				if (result == null) result = caseISTestCaseAggregation(isUnitTestCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_ACCEPTANCE_TEST_CASE_AGGREGATION: {
				ISAcceptanceTestCaseAggregation isAcceptanceTestCaseAggregation = (ISAcceptanceTestCaseAggregation)theEObject;
				T result = caseISAcceptanceTestCaseAggregation(isAcceptanceTestCaseAggregation);
				if (result == null) result = caseISTestCaseAggregation(isAcceptanceTestCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_INTEGRATION_TEST_CASE_AGGREGATION: {
				ISIntegrationTestCaseAggregation isIntegrationTestCaseAggregation = (ISIntegrationTestCaseAggregation)theEObject;
				T result = caseISIntegrationTestCaseAggregation(isIntegrationTestCaseAggregation);
				if (result == null) result = caseISTestCaseAggregation(isIntegrationTestCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION: {
				ISStaffSpecification isStaffSpecification = (ISStaffSpecification)theEObject;
				T result = caseISStaffSpecification(isStaffSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST: {
				ISPersonList isPersonList = (ISPersonList)theEObject;
				T result = caseISPersonList(isPersonList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON: {
				ISPerson isPerson = (ISPerson)theEObject;
				T result = caseISPerson(isPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_ROLE: {
				ISRole isRole = (ISRole)theEObject;
				T result = caseISRole(isRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_ROLE_LIST: {
				ISRoleList isRoleList = (ISRoleList)theEObject;
				T result = caseISRoleList(isRoleList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPER: {
				ISDeveloper isDeveloper = (ISDeveloper)theEObject;
				T result = caseISDeveloper(isDeveloper);
				if (result == null) result = caseISRole(isDeveloper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATOR: {
				ISBuildConfigurator isBuildConfigurator = (ISBuildConfigurator)theEObject;
				T result = caseISBuildConfigurator(isBuildConfigurator);
				if (result == null) result = caseISRole(isBuildConfigurator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_DEVELOPER: {
				ISTestDeveloper isTestDeveloper = (ISTestDeveloper)theEObject;
				T result = caseISTestDeveloper(isTestDeveloper);
				if (result == null) result = caseISRole(isTestDeveloper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_TESTER: {
				ISTester isTester = (ISTester)theEObject;
				T result = caseISTester(isTester);
				if (result == null) result = caseISRole(isTester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_CONFIGURATOR: {
				ISReleaseConfigurator isReleaseConfigurator = (ISReleaseConfigurator)theEObject;
				T result = caseISReleaseConfigurator(isReleaseConfigurator);
				if (result == null) result = caseISRole(isReleaseConfigurator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYER: {
				ISDeployer isDeployer = (ISDeployer)theEObject;
				T result = caseISDeployer(isDeployer);
				if (result == null) result = caseISRole(isDeployer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_FILE: {
				ISFile isFile = (ISFile)theEObject;
				T result = caseISFile(isFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_FILE_AGGREGATION: {
				ISFileAggregation isFileAggregation = (ISFileAggregation)theEObject;
				T result = caseISFileAggregation(isFileAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_CASE: {
				ISTestCase isTestCase = (ISTestCase)theEObject;
				T result = caseISTestCase(isTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_CASE_AGGREGATION: {
				ISTestCaseAggregation isTestCaseAggregation = (ISTestCaseAggregation)theEObject;
				T result = caseISTestCaseAggregation(isTestCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_SPECIFICATION: {
				ISDesignPatternSpecification isDesignPatternSpecification = (ISDesignPatternSpecification)theEObject;
				T result = caseISDesignPatternSpecification(isDesignPatternSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE: {
				ISDesignPatternRole isDesignPatternRole = (ISDesignPatternRole)theEObject;
				T result = caseISDesignPatternRole(isDesignPatternRole);
				if (result == null) result = caseIdentifier(isDesignPatternRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION: {
				ISTechnologySpecification isTechnologySpecification = (ISTechnologySpecification)theEObject;
				T result = caseISTechnologySpecification(isTechnologySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE: {
				ISTechnologicalCorrespondence isTechnologicalCorrespondence = (ISTechnologicalCorrespondence)theEObject;
				T result = caseISTechnologicalCorrespondence(isTechnologicalCorrespondence);
				if (result == null) result = caseIdentifier(isTechnologicalCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISFieldOfActivityAnnotationsRepository(ISFieldOfActivityAnnotationsRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Development Artefact Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Development Artefact Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISDevelopmentArtefactSpecification(ISDevelopmentArtefactSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISSourceFile(ISSourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Source File Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Source File Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISSourceFileAggregation(ISSourceFileAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Metadata File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Metadata File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISMetadataFile(ISMetadataFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Metadata File Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Metadata File Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISMetadataFileAggregation(ISMetadataFileAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Build Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Build Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISBuildSpecification(ISBuildSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Build Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Build Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISBuildConfiguration(ISBuildConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Third Party Component Or Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Third Party Component Or Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISThirdPartyComponentOrLibrary(ISThirdPartyComponentOrLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Test Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Test Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISTestSpecification(ISTestSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Release Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Release Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISReleaseSpecification(ISReleaseSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Release Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Release Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISReleaseConfiguration(ISReleaseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Deployment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISDeploymentSpecification(ISDeploymentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Runtime Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Runtime Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISRuntimeInstance(ISRuntimeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Runtime Instance Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Runtime Instance Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISRuntimeInstanceAggregation(ISRuntimeInstanceAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Unit Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Unit Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISUnitTestCase(ISUnitTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Acceptance Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Acceptance Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISAcceptanceTestCase(ISAcceptanceTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Integration Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Integration Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISIntegrationTestCase(ISIntegrationTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Unit Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Unit Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISUnitTestCaseAggregation(ISUnitTestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Acceptance Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Acceptance Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISAcceptanceTestCaseAggregation(ISAcceptanceTestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Integration Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Integration Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISIntegrationTestCaseAggregation(ISIntegrationTestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Staff Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Staff Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISStaffSpecification(ISStaffSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Person List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Person List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISPersonList(ISPersonList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISPerson(ISPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISRole(ISRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Role List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Role List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISRoleList(ISRoleList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Developer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Developer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISDeveloper(ISDeveloper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Build Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Build Configurator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISBuildConfigurator(ISBuildConfigurator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Test Developer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Test Developer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISTestDeveloper(ISTestDeveloper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Tester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Tester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISTester(ISTester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Release Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Release Configurator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISReleaseConfigurator(ISReleaseConfigurator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Deployer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Deployer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISDeployer(ISDeployer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISFile(ISFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS File Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS File Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISFileAggregation(ISFileAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISTestCase(ISTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISTestCaseAggregation(ISTestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Design Pattern Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Design Pattern Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISDesignPatternSpecification(ISDesignPatternSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Design Pattern Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Design Pattern Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISDesignPatternRole(ISDesignPatternRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Technology Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Technology Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISTechnologySpecification(ISTechnologySpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Technological Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Technological Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISTechnologicalCorrespondence(ISTechnologicalCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ISFieldOfActivityAnnotationsSwitch
