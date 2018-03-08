/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage
 * @generated
 */
public class ISFieldOfActivityAnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ISFieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ISFieldOfActivityAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISFieldOfActivityAnnotationsSwitch<Adapter> modelSwitch =
		new ISFieldOfActivityAnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseISFieldOfActivityAnnotationsRepository(ISFieldOfActivityAnnotationsRepository object) {
				return createISFieldOfActivityAnnotationsRepositoryAdapter();
			}
			@Override
			public Adapter caseISDevelopmentArtefactSpecification(ISDevelopmentArtefactSpecification object) {
				return createISDevelopmentArtefactSpecificationAdapter();
			}
			@Override
			public Adapter caseISSourceFile(ISSourceFile object) {
				return createISSourceFileAdapter();
			}
			@Override
			public Adapter caseISSourceFileAggregation(ISSourceFileAggregation object) {
				return createISSourceFileAggregationAdapter();
			}
			@Override
			public Adapter caseISMetadataFile(ISMetadataFile object) {
				return createISMetadataFileAdapter();
			}
			@Override
			public Adapter caseISMetadataFileAggregation(ISMetadataFileAggregation object) {
				return createISMetadataFileAggregationAdapter();
			}
			@Override
			public Adapter caseISBuildSpecification(ISBuildSpecification object) {
				return createISBuildSpecificationAdapter();
			}
			@Override
			public Adapter caseISBuildConfiguration(ISBuildConfiguration object) {
				return createISBuildConfigurationAdapter();
			}
			@Override
			public Adapter caseISThirdPartyComponentOrLibrary(ISThirdPartyComponentOrLibrary object) {
				return createISThirdPartyComponentOrLibraryAdapter();
			}
			@Override
			public Adapter caseISTestSpecification(ISTestSpecification object) {
				return createISTestSpecificationAdapter();
			}
			@Override
			public Adapter caseISReleaseSpecification(ISReleaseSpecification object) {
				return createISReleaseSpecificationAdapter();
			}
			@Override
			public Adapter caseISReleaseConfiguration(ISReleaseConfiguration object) {
				return createISReleaseConfigurationAdapter();
			}
			@Override
			public Adapter caseISDeploymentSpecification(ISDeploymentSpecification object) {
				return createISDeploymentSpecificationAdapter();
			}
			@Override
			public Adapter caseISRuntimeInstance(ISRuntimeInstance object) {
				return createISRuntimeInstanceAdapter();
			}
			@Override
			public Adapter caseISRuntimeInstanceAggregation(ISRuntimeInstanceAggregation object) {
				return createISRuntimeInstanceAggregationAdapter();
			}
			@Override
			public Adapter caseISUnitTestCase(ISUnitTestCase object) {
				return createISUnitTestCaseAdapter();
			}
			@Override
			public Adapter caseISAcceptanceTestCase(ISAcceptanceTestCase object) {
				return createISAcceptanceTestCaseAdapter();
			}
			@Override
			public Adapter caseISIntegrationTestCase(ISIntegrationTestCase object) {
				return createISIntegrationTestCaseAdapter();
			}
			@Override
			public Adapter caseISUnitTestCaseAggregation(ISUnitTestCaseAggregation object) {
				return createISUnitTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseISAcceptanceTestCaseAggregation(ISAcceptanceTestCaseAggregation object) {
				return createISAcceptanceTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseISIntegrationTestCaseAggregation(ISIntegrationTestCaseAggregation object) {
				return createISIntegrationTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseISStaffSpecification(ISStaffSpecification object) {
				return createISStaffSpecificationAdapter();
			}
			@Override
			public Adapter caseISPersonList(ISPersonList object) {
				return createISPersonListAdapter();
			}
			@Override
			public Adapter caseISPerson(ISPerson object) {
				return createISPersonAdapter();
			}
			@Override
			public Adapter caseISRole(ISRole object) {
				return createISRoleAdapter();
			}
			@Override
			public Adapter caseISRoleList(ISRoleList object) {
				return createISRoleListAdapter();
			}
			@Override
			public Adapter caseISDeveloper(ISDeveloper object) {
				return createISDeveloperAdapter();
			}
			@Override
			public Adapter caseISBuildConfigurator(ISBuildConfigurator object) {
				return createISBuildConfiguratorAdapter();
			}
			@Override
			public Adapter caseISTestDeveloper(ISTestDeveloper object) {
				return createISTestDeveloperAdapter();
			}
			@Override
			public Adapter caseISTester(ISTester object) {
				return createISTesterAdapter();
			}
			@Override
			public Adapter caseISReleaseConfigurator(ISReleaseConfigurator object) {
				return createISReleaseConfiguratorAdapter();
			}
			@Override
			public Adapter caseISDeployer(ISDeployer object) {
				return createISDeployerAdapter();
			}
			@Override
			public Adapter caseISFile(ISFile object) {
				return createISFileAdapter();
			}
			@Override
			public Adapter caseISFileAggregation(ISFileAggregation object) {
				return createISFileAggregationAdapter();
			}
			@Override
			public Adapter caseISTestCase(ISTestCase object) {
				return createISTestCaseAdapter();
			}
			@Override
			public Adapter caseISTestCaseAggregation(ISTestCaseAggregation object) {
				return createISTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseISDesignPatternSpecification(ISDesignPatternSpecification object) {
				return createISDesignPatternSpecificationAdapter();
			}
			@Override
			public Adapter caseISDesignPatternRole(ISDesignPatternRole object) {
				return createISDesignPatternRoleAdapter();
			}
			@Override
			public Adapter caseISTechnologySpecification(ISTechnologySpecification object) {
				return createISTechnologySpecificationAdapter();
			}
			@Override
			public Adapter caseISTechnologicalCorrespondence(ISTechnologicalCorrespondence object) {
				return createISTechnologicalCorrespondenceAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository
	 * @generated
	 */
	public Adapter createISFieldOfActivityAnnotationsRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification <em>IS Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification
	 * @generated
	 */
	public Adapter createISDevelopmentArtefactSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile <em>IS Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile
	 * @generated
	 */
	public Adapter createISSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation <em>IS Source File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation
	 * @generated
	 */
	public Adapter createISSourceFileAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile <em>IS Metadata File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile
	 * @generated
	 */
	public Adapter createISMetadataFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation <em>IS Metadata File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation
	 * @generated
	 */
	public Adapter createISMetadataFileAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification <em>IS Build Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification
	 * @generated
	 */
	public Adapter createISBuildSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration <em>IS Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration
	 * @generated
	 */
	public Adapter createISBuildConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary <em>IS Third Party Component Or Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary
	 * @generated
	 */
	public Adapter createISThirdPartyComponentOrLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification <em>IS Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification
	 * @generated
	 */
	public Adapter createISTestSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification <em>IS Release Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification
	 * @generated
	 */
	public Adapter createISReleaseSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration <em>IS Release Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration
	 * @generated
	 */
	public Adapter createISReleaseConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification <em>IS Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification
	 * @generated
	 */
	public Adapter createISDeploymentSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance <em>IS Runtime Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance
	 * @generated
	 */
	public Adapter createISRuntimeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation <em>IS Runtime Instance Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation
	 * @generated
	 */
	public Adapter createISRuntimeInstanceAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase <em>IS Unit Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase
	 * @generated
	 */
	public Adapter createISUnitTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase <em>IS Acceptance Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase
	 * @generated
	 */
	public Adapter createISAcceptanceTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase <em>IS Integration Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase
	 * @generated
	 */
	public Adapter createISIntegrationTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation <em>IS Unit Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation
	 * @generated
	 */
	public Adapter createISUnitTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation <em>IS Acceptance Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation
	 * @generated
	 */
	public Adapter createISAcceptanceTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation <em>IS Integration Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation
	 * @generated
	 */
	public Adapter createISIntegrationTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification <em>IS Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification
	 * @generated
	 */
	public Adapter createISStaffSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList <em>IS Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList
	 * @generated
	 */
	public Adapter createISPersonListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson <em>IS Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson
	 * @generated
	 */
	public Adapter createISPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole <em>IS Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole
	 * @generated
	 */
	public Adapter createISRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList <em>IS Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList
	 * @generated
	 */
	public Adapter createISRoleListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper <em>IS Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper
	 * @generated
	 */
	public Adapter createISDeveloperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfigurator <em>IS Build Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfigurator
	 * @generated
	 */
	public Adapter createISBuildConfiguratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestDeveloper <em>IS Test Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestDeveloper
	 * @generated
	 */
	public Adapter createISTestDeveloperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTester <em>IS Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTester
	 * @generated
	 */
	public Adapter createISTesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfigurator <em>IS Release Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfigurator
	 * @generated
	 */
	public Adapter createISReleaseConfiguratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer <em>IS Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer
	 * @generated
	 */
	public Adapter createISDeployerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile <em>IS File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile
	 * @generated
	 */
	public Adapter createISFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation <em>IS File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation
	 * @generated
	 */
	public Adapter createISFileAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase <em>IS Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase
	 * @generated
	 */
	public Adapter createISTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation <em>IS Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation
	 * @generated
	 */
	public Adapter createISTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification <em>IS Design Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification
	 * @generated
	 */
	public Adapter createISDesignPatternSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole <em>IS Design Pattern Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole
	 * @generated
	 */
	public Adapter createISDesignPatternRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification <em>IS Technology Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification
	 * @generated
	 */
	public Adapter createISTechnologySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence <em>IS Technological Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence
	 * @generated
	 */
	public Adapter createISTechnologicalCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ISFieldOfActivityAnnotationsAdapterFactory
