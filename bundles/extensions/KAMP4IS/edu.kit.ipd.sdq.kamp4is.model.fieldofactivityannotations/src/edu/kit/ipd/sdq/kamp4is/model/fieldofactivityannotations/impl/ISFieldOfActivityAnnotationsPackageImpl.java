/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfigurator;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfigurator;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestDeveloper;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTester;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISFieldOfActivityAnnotationsPackageImpl extends EPackageImpl implements ISFieldOfActivityAnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isFieldOfActivityAnnotationsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDevelopmentArtefactSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSourceFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isMetadataFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isMetadataFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isBuildSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isBuildConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isThirdPartyComponentOrLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTestSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isReleaseSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isReleaseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDeploymentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isRuntimeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isRuntimeInstanceAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isUnitTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAcceptanceTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isIntegrationTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isUnitTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAcceptanceTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isIntegrationTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isStaffSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPersonListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isRoleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDeveloperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isBuildConfiguratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTestDeveloperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isReleaseConfiguratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDeployerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDesignPatternSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDesignPatternRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTechnologySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTechnologicalCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isTechnologicalCorrespondenceTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ISFieldOfActivityAnnotationsPackageImpl() {
		super(eNS_URI, ISFieldOfActivityAnnotationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ISFieldOfActivityAnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ISFieldOfActivityAnnotationsPackage init() {
		if (isInited) return (ISFieldOfActivityAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(ISFieldOfActivityAnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		ISFieldOfActivityAnnotationsPackageImpl theISFieldOfActivityAnnotationsPackage = (ISFieldOfActivityAnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ISFieldOfActivityAnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ISFieldOfActivityAnnotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theISFieldOfActivityAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theISFieldOfActivityAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theISFieldOfActivityAnnotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ISFieldOfActivityAnnotationsPackage.eNS_URI, theISFieldOfActivityAnnotationsPackage);
		return theISFieldOfActivityAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISFieldOfActivityAnnotationsRepository() {
		return isFieldOfActivityAnnotationsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_BuildSpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_TestSpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_ReleaseSpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_DeploymentSpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_StaffSpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_TechnologySpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISFieldOfActivityAnnotationsRepository_DesignPatternSpecification() {
		return (EReference)isFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISDevelopmentArtefactSpecification() {
		return isDevelopmentArtefactSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDevelopmentArtefactSpecification_Parent() {
		return (EReference)isDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDevelopmentArtefactSpecification_SourceFiles() {
		return (EReference)isDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDevelopmentArtefactSpecification_SourceFileAggregations() {
		return (EReference)isDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDevelopmentArtefactSpecification_MetadataFiles() {
		return (EReference)isDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDevelopmentArtefactSpecification_MetadataFileAggregations() {
		return (EReference)isDevelopmentArtefactSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISSourceFile() {
		return isSourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSourceFile_Parent() {
		return (EReference)isSourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSourceFile_Component() {
		return (EReference)isSourceFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISSourceFileAggregation() {
		return isSourceFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSourceFileAggregation_Parent() {
		return (EReference)isSourceFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSourceFileAggregation_Component() {
		return (EReference)isSourceFileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISMetadataFile() {
		return isMetadataFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISMetadataFile_Parent() {
		return (EReference)isMetadataFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISMetadataFile_Component() {
		return (EReference)isMetadataFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISMetadataFileAggregation() {
		return isMetadataFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISMetadataFileAggregation_Parent() {
		return (EReference)isMetadataFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISMetadataFileAggregation_Component() {
		return (EReference)isMetadataFileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISBuildSpecification() {
		return isBuildSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISBuildSpecification_Parent() {
		return (EReference)isBuildSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISBuildSpecification_BuildConfigurations() {
		return (EReference)isBuildSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISBuildSpecification_ThirdPartyComponentOrLibraries() {
		return (EReference)isBuildSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISBuildConfiguration() {
		return isBuildConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISBuildConfiguration_Parent() {
		return (EReference)isBuildConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISBuildConfiguration_Component() {
		return (EReference)isBuildConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISThirdPartyComponentOrLibrary() {
		return isThirdPartyComponentOrLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISThirdPartyComponentOrLibrary_Parent() {
		return (EReference)isThirdPartyComponentOrLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISThirdPartyComponentOrLibrary_Component() {
		return (EReference)isThirdPartyComponentOrLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISTestSpecification() {
		return isTestSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTestSpecification_Parent() {
		return (EReference)isTestSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTestSpecification_UnitTestCases() {
		return (EReference)isTestSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTestSpecification_AcceptanceTestCases() {
		return (EReference)isTestSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTestSpecification_IntegrationTestCases() {
		return (EReference)isTestSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTestSpecification_UnitTestCaseAggregations() {
		return (EReference)isTestSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTestSpecification_AcceptanceTestCaseAggregations() {
		return (EReference)isTestSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTestSpecification_IntegrationTestCaseAggregations() {
		return (EReference)isTestSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISReleaseSpecification() {
		return isReleaseSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISReleaseSpecification_ReleaseConfigurations() {
		return (EReference)isReleaseSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISReleaseSpecification_Parent() {
		return (EReference)isReleaseSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISReleaseConfiguration() {
		return isReleaseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISReleaseConfiguration_Parent() {
		return (EReference)isReleaseConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISReleaseConfiguration_Components() {
		return (EReference)isReleaseConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISReleaseConfiguration_Pathname() {
		return (EAttribute)isReleaseConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISReleaseConfiguration_Description() {
		return (EAttribute)isReleaseConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISDeploymentSpecification() {
		return isDeploymentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDeploymentSpecification_RuntimeInstances() {
		return (EReference)isDeploymentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDeploymentSpecification_RuntimeInstanceAggregations() {
		return (EReference)isDeploymentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDeploymentSpecification_Parent() {
		return (EReference)isDeploymentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISRuntimeInstance() {
		return isRuntimeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRuntimeInstance_Parent() {
		return (EReference)isRuntimeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISRuntimeInstance_Name() {
		return (EAttribute)isRuntimeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISRuntimeInstance_Description() {
		return (EAttribute)isRuntimeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRuntimeInstance_Components() {
		return (EReference)isRuntimeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISRuntimeInstanceAggregation() {
		return isRuntimeInstanceAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRuntimeInstanceAggregation_Parent() {
		return (EReference)isRuntimeInstanceAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISRuntimeInstanceAggregation_NumberOfInstances() {
		return (EAttribute)isRuntimeInstanceAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISRuntimeInstanceAggregation_Description() {
		return (EAttribute)isRuntimeInstanceAggregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRuntimeInstanceAggregation_Components() {
		return (EReference)isRuntimeInstanceAggregationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISUnitTestCase() {
		return isUnitTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISUnitTestCase_Parent() {
		return (EReference)isUnitTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISUnitTestCase_Providedrole() {
		return (EReference)isUnitTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISAcceptanceTestCase() {
		return isAcceptanceTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISAcceptanceTestCase_Parent() {
		return (EReference)isAcceptanceTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISAcceptanceTestCase_Providedrole() {
		return (EReference)isAcceptanceTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISIntegrationTestCase() {
		return isIntegrationTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntegrationTestCase_Parent() {
		return (EReference)isIntegrationTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntegrationTestCase_Providedrole() {
		return (EReference)isIntegrationTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntegrationTestCase_AssemblyConnector() {
		return (EReference)isIntegrationTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISUnitTestCaseAggregation() {
		return isUnitTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISUnitTestCaseAggregation_Parent() {
		return (EReference)isUnitTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISUnitTestCaseAggregation_Providedrole() {
		return (EReference)isUnitTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISAcceptanceTestCaseAggregation() {
		return isAcceptanceTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISAcceptanceTestCaseAggregation_Parent() {
		return (EReference)isAcceptanceTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISAcceptanceTestCaseAggregation_Providedrole() {
		return (EReference)isAcceptanceTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISIntegrationTestCaseAggregation() {
		return isIntegrationTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntegrationTestCaseAggregation_Parent() {
		return (EReference)isIntegrationTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntegrationTestCaseAggregation_Providedrole() {
		return (EReference)isIntegrationTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntegrationTestCaseAggregation_AssemblyConnector() {
		return (EReference)isIntegrationTestCaseAggregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISStaffSpecification() {
		return isStaffSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISStaffSpecification_Parent() {
		return (EReference)isStaffSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISStaffSpecification_PersonList() {
		return (EReference)isStaffSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISStaffSpecification_RoleList() {
		return (EReference)isStaffSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISPersonList() {
		return isPersonListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISPersonList_Parent() {
		return (EReference)isPersonListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISPersonList_Persons() {
		return (EReference)isPersonListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISPerson() {
		return isPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISPerson_Parent() {
		return (EReference)isPersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISPerson_Roles() {
		return (EReference)isPersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISPerson_Name() {
		return (EAttribute)isPersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISRole() {
		return isRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRole_Parent() {
		return (EReference)isRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRole_Person() {
		return (EReference)isRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISRole_Description() {
		return (EAttribute)isRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRole_Components() {
		return (EReference)isRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISRoleList() {
		return isRoleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRoleList_Parent() {
		return (EReference)isRoleListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRoleList_Roles() {
		return (EReference)isRoleListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISDeveloper() {
		return isDeveloperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISBuildConfigurator() {
		return isBuildConfiguratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISTestDeveloper() {
		return isTestDeveloperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISTester() {
		return isTesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISReleaseConfigurator() {
		return isReleaseConfiguratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISDeployer() {
		return isDeployerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISFile() {
		return isFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISFile_Filename() {
		return (EAttribute)isFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISFile_Technology() {
		return (EAttribute)isFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISFileAggregation() {
		return isFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISFileAggregation_NumberOfFiles() {
		return (EAttribute)isFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISFileAggregation_Technology() {
		return (EAttribute)isFileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISTestCase() {
		return isTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISTestCase_NameOfTest() {
		return (EAttribute)isTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISTestCaseAggregation() {
		return isTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISTestCaseAggregation_NumberOfTestcases() {
		return (EAttribute)isTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISTestCaseAggregation_NameOfTestSuite() {
		return (EAttribute)isTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISDesignPatternSpecification() {
		return isDesignPatternSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDesignPatternSpecification_Parent() {
		return (EReference)isDesignPatternSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDesignPatternSpecification_DesignPatternRoles() {
		return (EReference)isDesignPatternSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISDesignPatternRole() {
		return isDesignPatternRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDesignPatternRole_ProvidedRole() {
		return (EReference)isDesignPatternRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISDesignPatternRole_Component() {
		return (EReference)isDesignPatternRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISTechnologySpecification() {
		return isTechnologySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTechnologySpecification_Parent() {
		return (EReference)isTechnologySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTechnologySpecification_TechnologicalCorrespondences() {
		return (EReference)isTechnologySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISTechnologicalCorrespondence() {
		return isTechnologicalCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISTechnologicalCorrespondence_TechnologicalCorrespondenceType() {
		return (EAttribute)isTechnologicalCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISTechnologicalCorrespondence_Component() {
		return (EReference)isTechnologicalCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getISTechnologicalCorrespondenceTypes() {
		return isTechnologicalCorrespondenceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsFactory getISFieldOfActivityAnnotationsFactory() {
		return (ISFieldOfActivityAnnotationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		isFieldOfActivityAnnotationsRepositoryEClass = createEClass(IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION);
		createEReference(isFieldOfActivityAnnotationsRepositoryEClass, IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION);

		isDevelopmentArtefactSpecificationEClass = createEClass(IS_DEVELOPMENT_ARTEFACT_SPECIFICATION);
		createEReference(isDevelopmentArtefactSpecificationEClass, IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT);
		createEReference(isDevelopmentArtefactSpecificationEClass, IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES);
		createEReference(isDevelopmentArtefactSpecificationEClass, IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS);
		createEReference(isDevelopmentArtefactSpecificationEClass, IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES);
		createEReference(isDevelopmentArtefactSpecificationEClass, IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS);

		isSourceFileEClass = createEClass(IS_SOURCE_FILE);
		createEReference(isSourceFileEClass, IS_SOURCE_FILE__PARENT);
		createEReference(isSourceFileEClass, IS_SOURCE_FILE__COMPONENT);

		isSourceFileAggregationEClass = createEClass(IS_SOURCE_FILE_AGGREGATION);
		createEReference(isSourceFileAggregationEClass, IS_SOURCE_FILE_AGGREGATION__PARENT);
		createEReference(isSourceFileAggregationEClass, IS_SOURCE_FILE_AGGREGATION__COMPONENT);

		isMetadataFileEClass = createEClass(IS_METADATA_FILE);
		createEReference(isMetadataFileEClass, IS_METADATA_FILE__PARENT);
		createEReference(isMetadataFileEClass, IS_METADATA_FILE__COMPONENT);

		isMetadataFileAggregationEClass = createEClass(IS_METADATA_FILE_AGGREGATION);
		createEReference(isMetadataFileAggregationEClass, IS_METADATA_FILE_AGGREGATION__PARENT);
		createEReference(isMetadataFileAggregationEClass, IS_METADATA_FILE_AGGREGATION__COMPONENT);

		isBuildSpecificationEClass = createEClass(IS_BUILD_SPECIFICATION);
		createEReference(isBuildSpecificationEClass, IS_BUILD_SPECIFICATION__PARENT);
		createEReference(isBuildSpecificationEClass, IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS);
		createEReference(isBuildSpecificationEClass, IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES);

		isBuildConfigurationEClass = createEClass(IS_BUILD_CONFIGURATION);
		createEReference(isBuildConfigurationEClass, IS_BUILD_CONFIGURATION__PARENT);
		createEReference(isBuildConfigurationEClass, IS_BUILD_CONFIGURATION__COMPONENT);

		isThirdPartyComponentOrLibraryEClass = createEClass(IS_THIRD_PARTY_COMPONENT_OR_LIBRARY);
		createEReference(isThirdPartyComponentOrLibraryEClass, IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT);
		createEReference(isThirdPartyComponentOrLibraryEClass, IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__COMPONENT);

		isTestSpecificationEClass = createEClass(IS_TEST_SPECIFICATION);
		createEReference(isTestSpecificationEClass, IS_TEST_SPECIFICATION__PARENT);
		createEReference(isTestSpecificationEClass, IS_TEST_SPECIFICATION__UNIT_TEST_CASES);
		createEReference(isTestSpecificationEClass, IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES);
		createEReference(isTestSpecificationEClass, IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES);
		createEReference(isTestSpecificationEClass, IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS);
		createEReference(isTestSpecificationEClass, IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS);
		createEReference(isTestSpecificationEClass, IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS);

		isReleaseSpecificationEClass = createEClass(IS_RELEASE_SPECIFICATION);
		createEReference(isReleaseSpecificationEClass, IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS);
		createEReference(isReleaseSpecificationEClass, IS_RELEASE_SPECIFICATION__PARENT);

		isReleaseConfigurationEClass = createEClass(IS_RELEASE_CONFIGURATION);
		createEReference(isReleaseConfigurationEClass, IS_RELEASE_CONFIGURATION__PARENT);
		createEReference(isReleaseConfigurationEClass, IS_RELEASE_CONFIGURATION__COMPONENTS);
		createEAttribute(isReleaseConfigurationEClass, IS_RELEASE_CONFIGURATION__PATHNAME);
		createEAttribute(isReleaseConfigurationEClass, IS_RELEASE_CONFIGURATION__DESCRIPTION);

		isDeploymentSpecificationEClass = createEClass(IS_DEPLOYMENT_SPECIFICATION);
		createEReference(isDeploymentSpecificationEClass, IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES);
		createEReference(isDeploymentSpecificationEClass, IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS);
		createEReference(isDeploymentSpecificationEClass, IS_DEPLOYMENT_SPECIFICATION__PARENT);

		isRuntimeInstanceEClass = createEClass(IS_RUNTIME_INSTANCE);
		createEReference(isRuntimeInstanceEClass, IS_RUNTIME_INSTANCE__PARENT);
		createEAttribute(isRuntimeInstanceEClass, IS_RUNTIME_INSTANCE__NAME);
		createEAttribute(isRuntimeInstanceEClass, IS_RUNTIME_INSTANCE__DESCRIPTION);
		createEReference(isRuntimeInstanceEClass, IS_RUNTIME_INSTANCE__COMPONENTS);

		isRuntimeInstanceAggregationEClass = createEClass(IS_RUNTIME_INSTANCE_AGGREGATION);
		createEReference(isRuntimeInstanceAggregationEClass, IS_RUNTIME_INSTANCE_AGGREGATION__PARENT);
		createEAttribute(isRuntimeInstanceAggregationEClass, IS_RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES);
		createEAttribute(isRuntimeInstanceAggregationEClass, IS_RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION);
		createEReference(isRuntimeInstanceAggregationEClass, IS_RUNTIME_INSTANCE_AGGREGATION__COMPONENTS);

		isUnitTestCaseEClass = createEClass(IS_UNIT_TEST_CASE);
		createEReference(isUnitTestCaseEClass, IS_UNIT_TEST_CASE__PARENT);
		createEReference(isUnitTestCaseEClass, IS_UNIT_TEST_CASE__PROVIDEDROLE);

		isAcceptanceTestCaseEClass = createEClass(IS_ACCEPTANCE_TEST_CASE);
		createEReference(isAcceptanceTestCaseEClass, IS_ACCEPTANCE_TEST_CASE__PARENT);
		createEReference(isAcceptanceTestCaseEClass, IS_ACCEPTANCE_TEST_CASE__PROVIDEDROLE);

		isIntegrationTestCaseEClass = createEClass(IS_INTEGRATION_TEST_CASE);
		createEReference(isIntegrationTestCaseEClass, IS_INTEGRATION_TEST_CASE__PARENT);
		createEReference(isIntegrationTestCaseEClass, IS_INTEGRATION_TEST_CASE__PROVIDEDROLE);
		createEReference(isIntegrationTestCaseEClass, IS_INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR);

		isUnitTestCaseAggregationEClass = createEClass(IS_UNIT_TEST_CASE_AGGREGATION);
		createEReference(isUnitTestCaseAggregationEClass, IS_UNIT_TEST_CASE_AGGREGATION__PARENT);
		createEReference(isUnitTestCaseAggregationEClass, IS_UNIT_TEST_CASE_AGGREGATION__PROVIDEDROLE);

		isAcceptanceTestCaseAggregationEClass = createEClass(IS_ACCEPTANCE_TEST_CASE_AGGREGATION);
		createEReference(isAcceptanceTestCaseAggregationEClass, IS_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT);
		createEReference(isAcceptanceTestCaseAggregationEClass, IS_ACCEPTANCE_TEST_CASE_AGGREGATION__PROVIDEDROLE);

		isIntegrationTestCaseAggregationEClass = createEClass(IS_INTEGRATION_TEST_CASE_AGGREGATION);
		createEReference(isIntegrationTestCaseAggregationEClass, IS_INTEGRATION_TEST_CASE_AGGREGATION__PARENT);
		createEReference(isIntegrationTestCaseAggregationEClass, IS_INTEGRATION_TEST_CASE_AGGREGATION__PROVIDEDROLE);
		createEReference(isIntegrationTestCaseAggregationEClass, IS_INTEGRATION_TEST_CASE_AGGREGATION__ASSEMBLY_CONNECTOR);

		isStaffSpecificationEClass = createEClass(IS_STAFF_SPECIFICATION);
		createEReference(isStaffSpecificationEClass, IS_STAFF_SPECIFICATION__PARENT);
		createEReference(isStaffSpecificationEClass, IS_STAFF_SPECIFICATION__PERSON_LIST);
		createEReference(isStaffSpecificationEClass, IS_STAFF_SPECIFICATION__ROLE_LIST);

		isPersonListEClass = createEClass(IS_PERSON_LIST);
		createEReference(isPersonListEClass, IS_PERSON_LIST__PARENT);
		createEReference(isPersonListEClass, IS_PERSON_LIST__PERSONS);

		isPersonEClass = createEClass(IS_PERSON);
		createEReference(isPersonEClass, IS_PERSON__PARENT);
		createEReference(isPersonEClass, IS_PERSON__ROLES);
		createEAttribute(isPersonEClass, IS_PERSON__NAME);

		isRoleEClass = createEClass(IS_ROLE);
		createEReference(isRoleEClass, IS_ROLE__PARENT);
		createEReference(isRoleEClass, IS_ROLE__PERSON);
		createEAttribute(isRoleEClass, IS_ROLE__DESCRIPTION);
		createEReference(isRoleEClass, IS_ROLE__COMPONENTS);

		isRoleListEClass = createEClass(IS_ROLE_LIST);
		createEReference(isRoleListEClass, IS_ROLE_LIST__PARENT);
		createEReference(isRoleListEClass, IS_ROLE_LIST__ROLES);

		isDeveloperEClass = createEClass(IS_DEVELOPER);

		isBuildConfiguratorEClass = createEClass(IS_BUILD_CONFIGURATOR);

		isTestDeveloperEClass = createEClass(IS_TEST_DEVELOPER);

		isTesterEClass = createEClass(IS_TESTER);

		isReleaseConfiguratorEClass = createEClass(IS_RELEASE_CONFIGURATOR);

		isDeployerEClass = createEClass(IS_DEPLOYER);

		isFileEClass = createEClass(IS_FILE);
		createEAttribute(isFileEClass, IS_FILE__FILENAME);
		createEAttribute(isFileEClass, IS_FILE__TECHNOLOGY);

		isFileAggregationEClass = createEClass(IS_FILE_AGGREGATION);
		createEAttribute(isFileAggregationEClass, IS_FILE_AGGREGATION__NUMBER_OF_FILES);
		createEAttribute(isFileAggregationEClass, IS_FILE_AGGREGATION__TECHNOLOGY);

		isTestCaseEClass = createEClass(IS_TEST_CASE);
		createEAttribute(isTestCaseEClass, IS_TEST_CASE__NAME_OF_TEST);

		isTestCaseAggregationEClass = createEClass(IS_TEST_CASE_AGGREGATION);
		createEAttribute(isTestCaseAggregationEClass, IS_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES);
		createEAttribute(isTestCaseAggregationEClass, IS_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE);

		isDesignPatternSpecificationEClass = createEClass(IS_DESIGN_PATTERN_SPECIFICATION);
		createEReference(isDesignPatternSpecificationEClass, IS_DESIGN_PATTERN_SPECIFICATION__PARENT);
		createEReference(isDesignPatternSpecificationEClass, IS_DESIGN_PATTERN_SPECIFICATION__DESIGN_PATTERN_ROLES);

		isDesignPatternRoleEClass = createEClass(IS_DESIGN_PATTERN_ROLE);
		createEReference(isDesignPatternRoleEClass, IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE);
		createEReference(isDesignPatternRoleEClass, IS_DESIGN_PATTERN_ROLE__COMPONENT);

		isTechnologySpecificationEClass = createEClass(IS_TECHNOLOGY_SPECIFICATION);
		createEReference(isTechnologySpecificationEClass, IS_TECHNOLOGY_SPECIFICATION__PARENT);
		createEReference(isTechnologySpecificationEClass, IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES);

		isTechnologicalCorrespondenceEClass = createEClass(IS_TECHNOLOGICAL_CORRESPONDENCE);
		createEAttribute(isTechnologicalCorrespondenceEClass, IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE);
		createEReference(isTechnologicalCorrespondenceEClass, IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT);

		// Create enums
		isTechnologicalCorrespondenceTypesEEnum = createEEnum(IS_TECHNOLOGICAL_CORRESPONDENCE_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		isSourceFileEClass.getESuperTypes().add(this.getISFile());
		isSourceFileAggregationEClass.getESuperTypes().add(this.getISFileAggregation());
		isMetadataFileEClass.getESuperTypes().add(this.getISFile());
		isMetadataFileAggregationEClass.getESuperTypes().add(this.getISFileAggregation());
		isBuildConfigurationEClass.getESuperTypes().add(this.getISFile());
		isThirdPartyComponentOrLibraryEClass.getESuperTypes().add(this.getISFile());
		isUnitTestCaseEClass.getESuperTypes().add(this.getISTestCase());
		isAcceptanceTestCaseEClass.getESuperTypes().add(this.getISTestCase());
		isIntegrationTestCaseEClass.getESuperTypes().add(this.getISTestCase());
		isUnitTestCaseAggregationEClass.getESuperTypes().add(this.getISTestCaseAggregation());
		isAcceptanceTestCaseAggregationEClass.getESuperTypes().add(this.getISTestCaseAggregation());
		isIntegrationTestCaseAggregationEClass.getESuperTypes().add(this.getISTestCaseAggregation());
		isDeveloperEClass.getESuperTypes().add(this.getISRole());
		isBuildConfiguratorEClass.getESuperTypes().add(this.getISRole());
		isTestDeveloperEClass.getESuperTypes().add(this.getISRole());
		isTesterEClass.getESuperTypes().add(this.getISRole());
		isReleaseConfiguratorEClass.getESuperTypes().add(this.getISRole());
		isDeployerEClass.getESuperTypes().add(this.getISRole());
		isDesignPatternRoleEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		isTechnologicalCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(isFieldOfActivityAnnotationsRepositoryEClass, ISFieldOfActivityAnnotationsRepository.class, "ISFieldOfActivityAnnotationsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification(), this.getISDevelopmentArtefactSpecification(), this.getISDevelopmentArtefactSpecification_Parent(), "developmentArtefactSpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISFieldOfActivityAnnotationsRepository_BuildSpecification(), this.getISBuildSpecification(), this.getISBuildSpecification_Parent(), "buildSpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISFieldOfActivityAnnotationsRepository_TestSpecification(), this.getISTestSpecification(), this.getISTestSpecification_Parent(), "testSpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISFieldOfActivityAnnotationsRepository_ReleaseSpecification(), this.getISReleaseSpecification(), this.getISReleaseSpecification_Parent(), "releaseSpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISFieldOfActivityAnnotationsRepository_DeploymentSpecification(), this.getISDeploymentSpecification(), this.getISDeploymentSpecification_Parent(), "deploymentSpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISFieldOfActivityAnnotationsRepository_StaffSpecification(), this.getISStaffSpecification(), this.getISStaffSpecification_Parent(), "staffSpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISFieldOfActivityAnnotationsRepository_TechnologySpecification(), this.getISTechnologySpecification(), this.getISTechnologySpecification_Parent(), "technologySpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISFieldOfActivityAnnotationsRepository_DesignPatternSpecification(), this.getISDesignPatternSpecification(), this.getISDesignPatternSpecification_Parent(), "designPatternSpecification", null, 0, 1, ISFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isDevelopmentArtefactSpecificationEClass, ISDevelopmentArtefactSpecification.class, "ISDevelopmentArtefactSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISDevelopmentArtefactSpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification(), "parent", null, 1, 1, ISDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISDevelopmentArtefactSpecification_SourceFiles(), this.getISSourceFile(), this.getISSourceFile_Parent(), "sourceFiles", null, 0, -1, ISDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISDevelopmentArtefactSpecification_SourceFileAggregations(), this.getISSourceFileAggregation(), this.getISSourceFileAggregation_Parent(), "sourceFileAggregations", null, 0, -1, ISDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISDevelopmentArtefactSpecification_MetadataFiles(), this.getISMetadataFile(), this.getISMetadataFile_Parent(), "metadataFiles", null, 0, -1, ISDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISDevelopmentArtefactSpecification_MetadataFileAggregations(), this.getISMetadataFileAggregation(), this.getISMetadataFileAggregation_Parent(), "metadataFileAggregations", null, 0, -1, ISDevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isSourceFileEClass, ISSourceFile.class, "ISSourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISSourceFile_Parent(), this.getISDevelopmentArtefactSpecification(), this.getISDevelopmentArtefactSpecification_SourceFiles(), "parent", null, 1, 1, ISSourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISSourceFile_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ISSourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isSourceFileAggregationEClass, ISSourceFileAggregation.class, "ISSourceFileAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISSourceFileAggregation_Parent(), this.getISDevelopmentArtefactSpecification(), this.getISDevelopmentArtefactSpecification_SourceFileAggregations(), "parent", null, 1, 1, ISSourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISSourceFileAggregation_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ISSourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isMetadataFileEClass, ISMetadataFile.class, "ISMetadataFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISMetadataFile_Parent(), this.getISDevelopmentArtefactSpecification(), this.getISDevelopmentArtefactSpecification_MetadataFiles(), "parent", null, 1, 1, ISMetadataFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISMetadataFile_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ISMetadataFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isMetadataFileAggregationEClass, ISMetadataFileAggregation.class, "ISMetadataFileAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISMetadataFileAggregation_Parent(), this.getISDevelopmentArtefactSpecification(), this.getISDevelopmentArtefactSpecification_MetadataFileAggregations(), "parent", null, 1, 1, ISMetadataFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISMetadataFileAggregation_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ISMetadataFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isBuildSpecificationEClass, ISBuildSpecification.class, "ISBuildSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISBuildSpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_BuildSpecification(), "parent", null, 1, 1, ISBuildSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISBuildSpecification_BuildConfigurations(), this.getISBuildConfiguration(), this.getISBuildConfiguration_Parent(), "buildConfigurations", null, 0, -1, ISBuildSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISBuildSpecification_ThirdPartyComponentOrLibraries(), this.getISThirdPartyComponentOrLibrary(), this.getISThirdPartyComponentOrLibrary_Parent(), "thirdPartyComponentOrLibraries", null, 0, -1, ISBuildSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isBuildConfigurationEClass, ISBuildConfiguration.class, "ISBuildConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISBuildConfiguration_Parent(), this.getISBuildSpecification(), this.getISBuildSpecification_BuildConfigurations(), "parent", null, 1, 1, ISBuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISBuildConfiguration_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, -1, ISBuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isThirdPartyComponentOrLibraryEClass, ISThirdPartyComponentOrLibrary.class, "ISThirdPartyComponentOrLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISThirdPartyComponentOrLibrary_Parent(), this.getISBuildSpecification(), this.getISBuildSpecification_ThirdPartyComponentOrLibraries(), "parent", null, 1, 1, ISThirdPartyComponentOrLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISThirdPartyComponentOrLibrary_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ISThirdPartyComponentOrLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isTestSpecificationEClass, ISTestSpecification.class, "ISTestSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISTestSpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_TestSpecification(), "parent", null, 1, 1, ISTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTestSpecification_UnitTestCases(), this.getISUnitTestCase(), this.getISUnitTestCase_Parent(), "unitTestCases", null, 0, -1, ISTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTestSpecification_AcceptanceTestCases(), this.getISAcceptanceTestCase(), this.getISAcceptanceTestCase_Parent(), "acceptanceTestCases", null, 0, -1, ISTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTestSpecification_IntegrationTestCases(), this.getISIntegrationTestCase(), this.getISIntegrationTestCase_Parent(), "integrationTestCases", null, 0, -1, ISTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTestSpecification_UnitTestCaseAggregations(), this.getISUnitTestCaseAggregation(), this.getISUnitTestCaseAggregation_Parent(), "unitTestCaseAggregations", null, 0, -1, ISTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTestSpecification_AcceptanceTestCaseAggregations(), this.getISAcceptanceTestCaseAggregation(), this.getISAcceptanceTestCaseAggregation_Parent(), "acceptanceTestCaseAggregations", null, 0, -1, ISTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTestSpecification_IntegrationTestCaseAggregations(), this.getISIntegrationTestCaseAggregation(), this.getISIntegrationTestCaseAggregation_Parent(), "integrationTestCaseAggregations", null, 0, -1, ISTestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isReleaseSpecificationEClass, ISReleaseSpecification.class, "ISReleaseSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISReleaseSpecification_ReleaseConfigurations(), this.getISReleaseConfiguration(), this.getISReleaseConfiguration_Parent(), "releaseConfigurations", null, 0, -1, ISReleaseSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISReleaseSpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_ReleaseSpecification(), "parent", null, 1, 1, ISReleaseSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isReleaseConfigurationEClass, ISReleaseConfiguration.class, "ISReleaseConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISReleaseConfiguration_Parent(), this.getISReleaseSpecification(), this.getISReleaseSpecification_ReleaseConfigurations(), "parent", null, 1, 1, ISReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISReleaseConfiguration_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, ISReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISReleaseConfiguration_Pathname(), ecorePackage.getEString(), "pathname", null, 0, 1, ISReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISReleaseConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, ISReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isDeploymentSpecificationEClass, ISDeploymentSpecification.class, "ISDeploymentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISDeploymentSpecification_RuntimeInstances(), this.getISRuntimeInstance(), this.getISRuntimeInstance_Parent(), "runtimeInstances", null, 0, -1, ISDeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISDeploymentSpecification_RuntimeInstanceAggregations(), this.getISRuntimeInstanceAggregation(), this.getISRuntimeInstanceAggregation_Parent(), "runtimeInstanceAggregations", null, 0, -1, ISDeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISDeploymentSpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_DeploymentSpecification(), "parent", null, 1, 1, ISDeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isRuntimeInstanceEClass, ISRuntimeInstance.class, "ISRuntimeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISRuntimeInstance_Parent(), this.getISDeploymentSpecification(), this.getISDeploymentSpecification_RuntimeInstances(), "parent", null, 1, 1, ISRuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISRuntimeInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, ISRuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISRuntimeInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, ISRuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISRuntimeInstance_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, ISRuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isRuntimeInstanceAggregationEClass, ISRuntimeInstanceAggregation.class, "ISRuntimeInstanceAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISRuntimeInstanceAggregation_Parent(), this.getISDeploymentSpecification(), this.getISDeploymentSpecification_RuntimeInstanceAggregations(), "parent", null, 1, 1, ISRuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISRuntimeInstanceAggregation_NumberOfInstances(), ecorePackage.getEInt(), "numberOfInstances", null, 0, 1, ISRuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISRuntimeInstanceAggregation_Description(), ecorePackage.getEString(), "description", null, 0, 1, ISRuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISRuntimeInstanceAggregation_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, ISRuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isUnitTestCaseEClass, ISUnitTestCase.class, "ISUnitTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISUnitTestCase_Parent(), this.getISTestSpecification(), this.getISTestSpecification_UnitTestCases(), "parent", null, 1, 1, ISUnitTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISUnitTestCase_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, ISUnitTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isAcceptanceTestCaseEClass, ISAcceptanceTestCase.class, "ISAcceptanceTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISAcceptanceTestCase_Parent(), this.getISTestSpecification(), this.getISTestSpecification_AcceptanceTestCases(), "parent", null, 1, 1, ISAcceptanceTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISAcceptanceTestCase_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, ISAcceptanceTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isIntegrationTestCaseEClass, ISIntegrationTestCase.class, "ISIntegrationTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISIntegrationTestCase_Parent(), this.getISTestSpecification(), this.getISTestSpecification_IntegrationTestCases(), "parent", null, 1, 1, ISIntegrationTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISIntegrationTestCase_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, ISIntegrationTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISIntegrationTestCase_AssemblyConnector(), theCompositionPackage.getAssemblyConnector(), null, "assemblyConnector", null, 0, 1, ISIntegrationTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isUnitTestCaseAggregationEClass, ISUnitTestCaseAggregation.class, "ISUnitTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISUnitTestCaseAggregation_Parent(), this.getISTestSpecification(), this.getISTestSpecification_UnitTestCaseAggregations(), "parent", null, 1, 1, ISUnitTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISUnitTestCaseAggregation_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, ISUnitTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isAcceptanceTestCaseAggregationEClass, ISAcceptanceTestCaseAggregation.class, "ISAcceptanceTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISAcceptanceTestCaseAggregation_Parent(), this.getISTestSpecification(), this.getISTestSpecification_AcceptanceTestCaseAggregations(), "parent", null, 1, 1, ISAcceptanceTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISAcceptanceTestCaseAggregation_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, ISAcceptanceTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isIntegrationTestCaseAggregationEClass, ISIntegrationTestCaseAggregation.class, "ISIntegrationTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISIntegrationTestCaseAggregation_Parent(), this.getISTestSpecification(), this.getISTestSpecification_IntegrationTestCaseAggregations(), "parent", null, 1, 1, ISIntegrationTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISIntegrationTestCaseAggregation_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, ISIntegrationTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISIntegrationTestCaseAggregation_AssemblyConnector(), theCompositionPackage.getAssemblyConnector(), null, "assemblyConnector", null, 0, 1, ISIntegrationTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isStaffSpecificationEClass, ISStaffSpecification.class, "ISStaffSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISStaffSpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_StaffSpecification(), "parent", null, 1, 1, ISStaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISStaffSpecification_PersonList(), this.getISPersonList(), this.getISPersonList_Parent(), "personList", null, 1, 1, ISStaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISStaffSpecification_RoleList(), this.getISRoleList(), this.getISRoleList_Parent(), "roleList", null, 1, 1, ISStaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isPersonListEClass, ISPersonList.class, "ISPersonList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISPersonList_Parent(), this.getISStaffSpecification(), this.getISStaffSpecification_PersonList(), "parent", null, 1, 1, ISPersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISPersonList_Persons(), this.getISPerson(), this.getISPerson_Parent(), "persons", null, 0, -1, ISPersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isPersonEClass, ISPerson.class, "ISPerson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISPerson_Parent(), this.getISPersonList(), this.getISPersonList_Persons(), "parent", null, 1, 1, ISPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISPerson_Roles(), this.getISRole(), this.getISRole_Person(), "roles", null, 0, -1, ISPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, ISPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isRoleEClass, ISRole.class, "ISRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISRole_Parent(), this.getISRoleList(), this.getISRoleList_Roles(), "parent", null, 1, 1, ISRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISRole_Person(), this.getISPerson(), this.getISPerson_Roles(), "person", null, 0, -1, ISRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, ISRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISRole_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, ISRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isRoleListEClass, ISRoleList.class, "ISRoleList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISRoleList_Parent(), this.getISStaffSpecification(), this.getISStaffSpecification_RoleList(), "parent", null, 1, 1, ISRoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISRoleList_Roles(), this.getISRole(), this.getISRole_Parent(), "roles", null, 0, -1, ISRoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isDeveloperEClass, ISDeveloper.class, "ISDeveloper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isBuildConfiguratorEClass, ISBuildConfigurator.class, "ISBuildConfigurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isTestDeveloperEClass, ISTestDeveloper.class, "ISTestDeveloper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isTesterEClass, ISTester.class, "ISTester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isReleaseConfiguratorEClass, ISReleaseConfigurator.class, "ISReleaseConfigurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isDeployerEClass, ISDeployer.class, "ISDeployer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isFileEClass, ISFile.class, "ISFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, ISFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISFile_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, ISFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isFileAggregationEClass, ISFileAggregation.class, "ISFileAggregation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISFileAggregation_NumberOfFiles(), ecorePackage.getEInt(), "numberOfFiles", null, 0, 1, ISFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISFileAggregation_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, ISFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isTestCaseEClass, ISTestCase.class, "ISTestCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISTestCase_NameOfTest(), ecorePackage.getEString(), "nameOfTest", null, 0, 1, ISTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isTestCaseAggregationEClass, ISTestCaseAggregation.class, "ISTestCaseAggregation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISTestCaseAggregation_NumberOfTestcases(), ecorePackage.getEInt(), "numberOfTestcases", null, 0, 1, ISTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISTestCaseAggregation_NameOfTestSuite(), ecorePackage.getEString(), "nameOfTestSuite", null, 0, 1, ISTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isDesignPatternSpecificationEClass, ISDesignPatternSpecification.class, "ISDesignPatternSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISDesignPatternSpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_DesignPatternSpecification(), "parent", null, 1, 1, ISDesignPatternSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISDesignPatternSpecification_DesignPatternRoles(), this.getISDesignPatternRole(), null, "designPatternRoles", null, 0, -1, ISDesignPatternSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(isDesignPatternRoleEClass, ISDesignPatternRole.class, "ISDesignPatternRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISDesignPatternRole_ProvidedRole(), theRepositoryPackage.getProvidedRole(), null, "providedRole", null, 0, 1, ISDesignPatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getISDesignPatternRole_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ISDesignPatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(isTechnologySpecificationEClass, ISTechnologySpecification.class, "ISTechnologySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISTechnologySpecification_Parent(), this.getISFieldOfActivityAnnotationsRepository(), this.getISFieldOfActivityAnnotationsRepository_TechnologySpecification(), "parent", null, 1, 1, ISTechnologySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTechnologySpecification_TechnologicalCorrespondences(), this.getISTechnologicalCorrespondence(), null, "technologicalCorrespondences", null, 0, -1, ISTechnologySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(isTechnologicalCorrespondenceEClass, ISTechnologicalCorrespondence.class, "ISTechnologicalCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISTechnologicalCorrespondence_TechnologicalCorrespondenceType(), this.getISTechnologicalCorrespondenceTypes(), "technologicalCorrespondenceType", null, 0, 1, ISTechnologicalCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getISTechnologicalCorrespondence_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ISTechnologicalCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.class, "ISTechnologicalCorrespondenceTypes");
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.SET_OF_CLASSES);
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.JAVA_PACKAGES);
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.PLUGINS);
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.ECLIPSE_PLUGINS);
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.EJB);
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.PACKAGES);
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.NAMESPACES);
		addEEnumLiteral(isTechnologicalCorrespondenceTypesEEnum, ISTechnologicalCorrespondenceTypes.DIRECTORIES);

		// Create resource
		createResource(eNS_URI);
	}

} //ISFieldOfActivityAnnotationsPackageImpl
