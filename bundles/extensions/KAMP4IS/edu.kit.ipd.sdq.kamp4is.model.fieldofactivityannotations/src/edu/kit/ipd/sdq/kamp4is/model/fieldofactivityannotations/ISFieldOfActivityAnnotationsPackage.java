/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface ISFieldOfActivityAnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fieldofactivityannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAMP4ISFieldofactivityannotations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fieldofactivityannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ISFieldOfActivityAnnotationsPackage eINSTANCE = edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Development Artefact Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Build Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Test Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Release Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Deployment Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Staff Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Technology Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Design Pattern Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION = 7;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl <em>IS Development Artefact Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDevelopmentArtefactSpecification()
	 * @generated
	 */
	int IS_DEVELOPMENT_ARTEFACT_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Source Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES = 1;

	/**
	 * The feature id for the '<em><b>Source File Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS = 2;

	/**
	 * The feature id for the '<em><b>Metadata Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES = 3;

	/**
	 * The feature id for the '<em><b>Metadata File Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS = 4;

	/**
	 * The number of structural features of the '<em>IS Development Artefact Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPMENT_ARTEFACT_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileImpl <em>IS File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISFile()
	 * @generated
	 */
	int IS_FILE = 32;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FILE__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FILE__TECHNOLOGY = 1;

	/**
	 * The number of structural features of the '<em>IS File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileImpl <em>IS Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISSourceFile()
	 * @generated
	 */
	int IS_SOURCE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE__FILENAME = IS_FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE__TECHNOLOGY = IS_FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE__PARENT = IS_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE__COMPONENT = IS_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE_FEATURE_COUNT = IS_FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileAggregationImpl <em>IS File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISFileAggregation()
	 * @generated
	 */
	int IS_FILE_AGGREGATION = 33;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FILE_AGGREGATION__NUMBER_OF_FILES = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FILE_AGGREGATION__TECHNOLOGY = 1;

	/**
	 * The number of structural features of the '<em>IS File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FILE_AGGREGATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileAggregationImpl <em>IS Source File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISSourceFileAggregation()
	 * @generated
	 */
	int IS_SOURCE_FILE_AGGREGATION = 3;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE_AGGREGATION__NUMBER_OF_FILES = IS_FILE_AGGREGATION__NUMBER_OF_FILES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE_AGGREGATION__TECHNOLOGY = IS_FILE_AGGREGATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE_AGGREGATION__PARENT = IS_FILE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE_AGGREGATION__COMPONENT = IS_FILE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Source File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOURCE_FILE_AGGREGATION_FEATURE_COUNT = IS_FILE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileImpl <em>IS Metadata File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISMetadataFile()
	 * @generated
	 */
	int IS_METADATA_FILE = 4;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE__FILENAME = IS_FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE__TECHNOLOGY = IS_FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE__PARENT = IS_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE__COMPONENT = IS_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Metadata File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE_FEATURE_COUNT = IS_FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileAggregationImpl <em>IS Metadata File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISMetadataFileAggregation()
	 * @generated
	 */
	int IS_METADATA_FILE_AGGREGATION = 5;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE_AGGREGATION__NUMBER_OF_FILES = IS_FILE_AGGREGATION__NUMBER_OF_FILES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE_AGGREGATION__TECHNOLOGY = IS_FILE_AGGREGATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE_AGGREGATION__PARENT = IS_FILE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE_AGGREGATION__COMPONENT = IS_FILE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Metadata File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METADATA_FILE_AGGREGATION_FEATURE_COUNT = IS_FILE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildSpecificationImpl <em>IS Build Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISBuildSpecification()
	 * @generated
	 */
	int IS_BUILD_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Build Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Third Party Component Or Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES = 2;

	/**
	 * The number of structural features of the '<em>IS Build Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfigurationImpl <em>IS Build Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISBuildConfiguration()
	 * @generated
	 */
	int IS_BUILD_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATION__FILENAME = IS_FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATION__TECHNOLOGY = IS_FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATION__PARENT = IS_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATION__COMPONENT = IS_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Build Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATION_FEATURE_COUNT = IS_FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISThirdPartyComponentOrLibraryImpl <em>IS Third Party Component Or Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISThirdPartyComponentOrLibraryImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISThirdPartyComponentOrLibrary()
	 * @generated
	 */
	int IS_THIRD_PARTY_COMPONENT_OR_LIBRARY = 8;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__FILENAME = IS_FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__TECHNOLOGY = IS_FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT = IS_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__COMPONENT = IS_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Third Party Component Or Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_THIRD_PARTY_COMPONENT_OR_LIBRARY_FEATURE_COUNT = IS_FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl <em>IS Test Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestSpecification()
	 * @generated
	 */
	int IS_TEST_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Unit Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION__UNIT_TEST_CASES = 1;

	/**
	 * The feature id for the '<em><b>Acceptance Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES = 2;

	/**
	 * The feature id for the '<em><b>Integration Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES = 3;

	/**
	 * The feature id for the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS = 4;

	/**
	 * The feature id for the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS = 5;

	/**
	 * The feature id for the '<em><b>Integration Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS = 6;

	/**
	 * The number of structural features of the '<em>IS Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseSpecificationImpl <em>IS Release Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISReleaseSpecification()
	 * @generated
	 */
	int IS_RELEASE_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Release Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_SPECIFICATION__PARENT = 1;

	/**
	 * The number of structural features of the '<em>IS Release Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfigurationImpl <em>IS Release Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISReleaseConfiguration()
	 * @generated
	 */
	int IS_RELEASE_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATION__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATION__PATHNAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>IS Release Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl <em>IS Deployment Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDeploymentSpecification()
	 * @generated
	 */
	int IS_DEPLOYMENT_SPECIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Runtime Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYMENT_SPECIFICATION__PARENT = 2;

	/**
	 * The number of structural features of the '<em>IS Deployment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYMENT_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceImpl <em>IS Runtime Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRuntimeInstance()
	 * @generated
	 */
	int IS_RUNTIME_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE__COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>IS Runtime Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceAggregationImpl <em>IS Runtime Instance Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRuntimeInstanceAggregation()
	 * @generated
	 */
	int IS_RUNTIME_INSTANCE_AGGREGATION = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE_AGGREGATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE_AGGREGATION__COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>IS Runtime Instance Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RUNTIME_INSTANCE_AGGREGATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseImpl <em>IS Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestCase()
	 * @generated
	 */
	int IS_TEST_CASE = 34;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_CASE__NAME_OF_TEST = 0;

	/**
	 * The number of structural features of the '<em>IS Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_CASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseImpl <em>IS Unit Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISUnitTestCase()
	 * @generated
	 */
	int IS_UNIT_TEST_CASE = 15;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE__NAME_OF_TEST = IS_TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE__PARENT = IS_TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE__PROVIDEDROLE = IS_TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Unit Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE_FEATURE_COUNT = IS_TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseImpl <em>IS Acceptance Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISAcceptanceTestCase()
	 * @generated
	 */
	int IS_ACCEPTANCE_TEST_CASE = 16;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE__NAME_OF_TEST = IS_TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE__PARENT = IS_TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE__PROVIDEDROLE = IS_TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Acceptance Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE_FEATURE_COUNT = IS_TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseImpl <em>IS Integration Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISIntegrationTestCase()
	 * @generated
	 */
	int IS_INTEGRATION_TEST_CASE = 17;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE__NAME_OF_TEST = IS_TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE__PARENT = IS_TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE__PROVIDEDROLE = IS_TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR = IS_TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IS Integration Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE_FEATURE_COUNT = IS_TEST_CASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseAggregationImpl <em>IS Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestCaseAggregation()
	 * @generated
	 */
	int IS_TEST_CASE_AGGREGATION = 35;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = 0;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = 1;

	/**
	 * The number of structural features of the '<em>IS Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_CASE_AGGREGATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseAggregationImpl <em>IS Unit Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISUnitTestCaseAggregation()
	 * @generated
	 */
	int IS_UNIT_TEST_CASE_AGGREGATION = 18;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = IS_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = IS_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE_AGGREGATION__PARENT = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE_AGGREGATION__PROVIDEDROLE = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Unit Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_UNIT_TEST_CASE_AGGREGATION_FEATURE_COUNT = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseAggregationImpl <em>IS Acceptance Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISAcceptanceTestCaseAggregation()
	 * @generated
	 */
	int IS_ACCEPTANCE_TEST_CASE_AGGREGATION = 19;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = IS_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = IS_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE_AGGREGATION__PROVIDEDROLE = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Acceptance Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACCEPTANCE_TEST_CASE_AGGREGATION_FEATURE_COUNT = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseAggregationImpl <em>IS Integration Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISIntegrationTestCaseAggregation()
	 * @generated
	 */
	int IS_INTEGRATION_TEST_CASE_AGGREGATION = 20;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = IS_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = IS_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE_AGGREGATION__PARENT = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE_AGGREGATION__PROVIDEDROLE = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE_AGGREGATION__ASSEMBLY_CONNECTOR = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IS Integration Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTEGRATION_TEST_CASE_AGGREGATION_FEATURE_COUNT = IS_TEST_CASE_AGGREGATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISStaffSpecificationImpl <em>IS Staff Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISStaffSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISStaffSpecification()
	 * @generated
	 */
	int IS_STAFF_SPECIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_STAFF_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_STAFF_SPECIFICATION__PERSON_LIST = 1;

	/**
	 * The feature id for the '<em><b>Role List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_STAFF_SPECIFICATION__ROLE_LIST = 2;

	/**
	 * The number of structural features of the '<em>IS Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_STAFF_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonListImpl <em>IS Person List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonListImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISPersonList()
	 * @generated
	 */
	int IS_PERSON_LIST = 22;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PERSON_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PERSON_LIST__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>IS Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PERSON_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonImpl <em>IS Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISPerson()
	 * @generated
	 */
	int IS_PERSON = 23;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PERSON__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PERSON__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PERSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>IS Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PERSON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleImpl <em>IS Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRole()
	 * @generated
	 */
	int IS_ROLE = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE__COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>IS Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleListImpl <em>IS Role List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleListImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRoleList()
	 * @generated
	 */
	int IS_ROLE_LIST = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_LIST__ROLES = 1;

	/**
	 * The number of structural features of the '<em>IS Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeveloperImpl <em>IS Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeveloperImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDeveloper()
	 * @generated
	 */
	int IS_DEVELOPER = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPER__PARENT = IS_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPER__PERSON = IS_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPER__DESCRIPTION = IS_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPER__COMPONENTS = IS_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IS Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEVELOPER_FEATURE_COUNT = IS_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfiguratorImpl <em>IS Build Configurator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfiguratorImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISBuildConfigurator()
	 * @generated
	 */
	int IS_BUILD_CONFIGURATOR = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATOR__PARENT = IS_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATOR__PERSON = IS_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATOR__DESCRIPTION = IS_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATOR__COMPONENTS = IS_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IS Build Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BUILD_CONFIGURATOR_FEATURE_COUNT = IS_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestDeveloperImpl <em>IS Test Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestDeveloperImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestDeveloper()
	 * @generated
	 */
	int IS_TEST_DEVELOPER = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_DEVELOPER__PARENT = IS_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_DEVELOPER__PERSON = IS_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_DEVELOPER__DESCRIPTION = IS_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_DEVELOPER__COMPONENTS = IS_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IS Test Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TEST_DEVELOPER_FEATURE_COUNT = IS_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTesterImpl <em>IS Tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTesterImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTester()
	 * @generated
	 */
	int IS_TESTER = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TESTER__PARENT = IS_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TESTER__PERSON = IS_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TESTER__DESCRIPTION = IS_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TESTER__COMPONENTS = IS_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IS Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TESTER_FEATURE_COUNT = IS_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfiguratorImpl <em>IS Release Configurator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfiguratorImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISReleaseConfigurator()
	 * @generated
	 */
	int IS_RELEASE_CONFIGURATOR = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATOR__PARENT = IS_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATOR__PERSON = IS_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATOR__DESCRIPTION = IS_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATOR__COMPONENTS = IS_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IS Release Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASE_CONFIGURATOR_FEATURE_COUNT = IS_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeployerImpl <em>IS Deployer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeployerImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDeployer()
	 * @generated
	 */
	int IS_DEPLOYER = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYER__PARENT = IS_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYER__PERSON = IS_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYER__DESCRIPTION = IS_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYER__COMPONENTS = IS_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IS Deployer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEPLOYER_FEATURE_COUNT = IS_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternSpecificationImpl <em>IS Design Pattern Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDesignPatternSpecification()
	 * @generated
	 */
	int IS_DESIGN_PATTERN_SPECIFICATION = 36;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DESIGN_PATTERN_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Design Pattern Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DESIGN_PATTERN_SPECIFICATION__DESIGN_PATTERN_ROLES = 1;

	/**
	 * The number of structural features of the '<em>IS Design Pattern Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DESIGN_PATTERN_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternRoleImpl <em>IS Design Pattern Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDesignPatternRole()
	 * @generated
	 */
	int IS_DESIGN_PATTERN_ROLE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DESIGN_PATTERN_ROLE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DESIGN_PATTERN_ROLE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Design Pattern Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DESIGN_PATTERN_ROLE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologySpecificationImpl <em>IS Technology Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologySpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTechnologySpecification()
	 * @generated
	 */
	int IS_TECHNOLOGY_SPECIFICATION = 38;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TECHNOLOGY_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Technological Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES = 1;

	/**
	 * The number of structural features of the '<em>IS Technology Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TECHNOLOGY_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologicalCorrespondenceImpl <em>IS Technological Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologicalCorrespondenceImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTechnologicalCorrespondence()
	 * @generated
	 */
	int IS_TECHNOLOGICAL_CORRESPONDENCE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TECHNOLOGICAL_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Technological Correspondence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Technological Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TECHNOLOGICAL_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes <em>IS Technological Correspondence Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTechnologicalCorrespondenceTypes()
	 * @generated
	 */
	int IS_TECHNOLOGICAL_CORRESPONDENCE_TYPES = 40;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository
	 * @generated
	 */
	EClass getISFieldOfActivityAnnotationsRepository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Development Artefact Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getBuildSpecification <em>Build Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getBuildSpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_BuildSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTestSpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_TestSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getReleaseSpecification <em>Release Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getReleaseSpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_ReleaseSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDeploymentSpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_DeploymentSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getStaffSpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_StaffSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTechnologySpecification <em>Technology Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTechnologySpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_TechnologySpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDesignPatternSpecification <em>Design Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design Pattern Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDesignPatternSpecification()
	 * @see #getISFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getISFieldOfActivityAnnotationsRepository_DesignPatternSpecification();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification <em>IS Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Development Artefact Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification
	 * @generated
	 */
	EClass getISDevelopmentArtefactSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getParent()
	 * @see #getISDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getISDevelopmentArtefactSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getSourceFiles <em>Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getSourceFiles()
	 * @see #getISDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getISDevelopmentArtefactSpecification_SourceFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getSourceFileAggregations <em>Source File Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source File Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getSourceFileAggregations()
	 * @see #getISDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getISDevelopmentArtefactSpecification_SourceFileAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getMetadataFiles <em>Metadata Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getMetadataFiles()
	 * @see #getISDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getISDevelopmentArtefactSpecification_MetadataFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getMetadataFileAggregations <em>Metadata File Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata File Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getMetadataFileAggregations()
	 * @see #getISDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getISDevelopmentArtefactSpecification_MetadataFileAggregations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile <em>IS Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Source File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile
	 * @generated
	 */
	EClass getISSourceFile();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile#getParent()
	 * @see #getISSourceFile()
	 * @generated
	 */
	EReference getISSourceFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile#getComponent()
	 * @see #getISSourceFile()
	 * @generated
	 */
	EReference getISSourceFile_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation <em>IS Source File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Source File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation
	 * @generated
	 */
	EClass getISSourceFileAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation#getParent()
	 * @see #getISSourceFileAggregation()
	 * @generated
	 */
	EReference getISSourceFileAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation#getComponent()
	 * @see #getISSourceFileAggregation()
	 * @generated
	 */
	EReference getISSourceFileAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile <em>IS Metadata File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Metadata File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile
	 * @generated
	 */
	EClass getISMetadataFile();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile#getParent()
	 * @see #getISMetadataFile()
	 * @generated
	 */
	EReference getISMetadataFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile#getComponent()
	 * @see #getISMetadataFile()
	 * @generated
	 */
	EReference getISMetadataFile_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation <em>IS Metadata File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Metadata File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation
	 * @generated
	 */
	EClass getISMetadataFileAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation#getParent()
	 * @see #getISMetadataFileAggregation()
	 * @generated
	 */
	EReference getISMetadataFileAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation#getComponent()
	 * @see #getISMetadataFileAggregation()
	 * @generated
	 */
	EReference getISMetadataFileAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification <em>IS Build Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Build Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification
	 * @generated
	 */
	EClass getISBuildSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getParent()
	 * @see #getISBuildSpecification()
	 * @generated
	 */
	EReference getISBuildSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getBuildConfigurations <em>Build Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Configurations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getBuildConfigurations()
	 * @see #getISBuildSpecification()
	 * @generated
	 */
	EReference getISBuildSpecification_BuildConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getThirdPartyComponentOrLibraries <em>Third Party Component Or Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Third Party Component Or Libraries</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getThirdPartyComponentOrLibraries()
	 * @see #getISBuildSpecification()
	 * @generated
	 */
	EReference getISBuildSpecification_ThirdPartyComponentOrLibraries();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration <em>IS Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Build Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration
	 * @generated
	 */
	EClass getISBuildConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration#getParent()
	 * @see #getISBuildConfiguration()
	 * @generated
	 */
	EReference getISBuildConfiguration_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration#getComponent()
	 * @see #getISBuildConfiguration()
	 * @generated
	 */
	EReference getISBuildConfiguration_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary <em>IS Third Party Component Or Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Third Party Component Or Library</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary
	 * @generated
	 */
	EClass getISThirdPartyComponentOrLibrary();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getParent()
	 * @see #getISThirdPartyComponentOrLibrary()
	 * @generated
	 */
	EReference getISThirdPartyComponentOrLibrary_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getComponent()
	 * @see #getISThirdPartyComponentOrLibrary()
	 * @generated
	 */
	EReference getISThirdPartyComponentOrLibrary_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification <em>IS Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification
	 * @generated
	 */
	EClass getISTestSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getParent()
	 * @see #getISTestSpecification()
	 * @generated
	 */
	EReference getISTestSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getUnitTestCases <em>Unit Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getUnitTestCases()
	 * @see #getISTestSpecification()
	 * @generated
	 */
	EReference getISTestSpecification_UnitTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getAcceptanceTestCases <em>Acceptance Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getAcceptanceTestCases()
	 * @see #getISTestSpecification()
	 * @generated
	 */
	EReference getISTestSpecification_AcceptanceTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getIntegrationTestCases <em>Integration Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getIntegrationTestCases()
	 * @see #getISTestSpecification()
	 * @generated
	 */
	EReference getISTestSpecification_IntegrationTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getUnitTestCaseAggregations()
	 * @see #getISTestSpecification()
	 * @generated
	 */
	EReference getISTestSpecification_UnitTestCaseAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getAcceptanceTestCaseAggregations <em>Acceptance Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getAcceptanceTestCaseAggregations()
	 * @see #getISTestSpecification()
	 * @generated
	 */
	EReference getISTestSpecification_AcceptanceTestCaseAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getIntegrationTestCaseAggregations <em>Integration Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getIntegrationTestCaseAggregations()
	 * @see #getISTestSpecification()
	 * @generated
	 */
	EReference getISTestSpecification_IntegrationTestCaseAggregations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification <em>IS Release Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Release Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification
	 * @generated
	 */
	EClass getISReleaseSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification#getReleaseConfigurations <em>Release Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Release Configurations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification#getReleaseConfigurations()
	 * @see #getISReleaseSpecification()
	 * @generated
	 */
	EReference getISReleaseSpecification_ReleaseConfigurations();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification#getParent()
	 * @see #getISReleaseSpecification()
	 * @generated
	 */
	EReference getISReleaseSpecification_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration <em>IS Release Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Release Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration
	 * @generated
	 */
	EClass getISReleaseConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getParent()
	 * @see #getISReleaseConfiguration()
	 * @generated
	 */
	EReference getISReleaseConfiguration_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getComponents()
	 * @see #getISReleaseConfiguration()
	 * @generated
	 */
	EReference getISReleaseConfiguration_Components();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getPathname <em>Pathname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pathname</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getPathname()
	 * @see #getISReleaseConfiguration()
	 * @generated
	 */
	EAttribute getISReleaseConfiguration_Pathname();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration#getDescription()
	 * @see #getISReleaseConfiguration()
	 * @generated
	 */
	EAttribute getISReleaseConfiguration_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification <em>IS Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Deployment Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification
	 * @generated
	 */
	EClass getISDeploymentSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getRuntimeInstances <em>Runtime Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Instances</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getRuntimeInstances()
	 * @see #getISDeploymentSpecification()
	 * @generated
	 */
	EReference getISDeploymentSpecification_RuntimeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Instance Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getRuntimeInstanceAggregations()
	 * @see #getISDeploymentSpecification()
	 * @generated
	 */
	EReference getISDeploymentSpecification_RuntimeInstanceAggregations();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getParent()
	 * @see #getISDeploymentSpecification()
	 * @generated
	 */
	EReference getISDeploymentSpecification_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance <em>IS Runtime Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Runtime Instance</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance
	 * @generated
	 */
	EClass getISRuntimeInstance();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getParent()
	 * @see #getISRuntimeInstance()
	 * @generated
	 */
	EReference getISRuntimeInstance_Parent();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getName()
	 * @see #getISRuntimeInstance()
	 * @generated
	 */
	EAttribute getISRuntimeInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getDescription()
	 * @see #getISRuntimeInstance()
	 * @generated
	 */
	EAttribute getISRuntimeInstance_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getComponents()
	 * @see #getISRuntimeInstance()
	 * @generated
	 */
	EReference getISRuntimeInstance_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation <em>IS Runtime Instance Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Runtime Instance Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation
	 * @generated
	 */
	EClass getISRuntimeInstanceAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getParent()
	 * @see #getISRuntimeInstanceAggregation()
	 * @generated
	 */
	EReference getISRuntimeInstanceAggregation_Parent();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getNumberOfInstances <em>Number Of Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Instances</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getNumberOfInstances()
	 * @see #getISRuntimeInstanceAggregation()
	 * @generated
	 */
	EAttribute getISRuntimeInstanceAggregation_NumberOfInstances();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getDescription()
	 * @see #getISRuntimeInstanceAggregation()
	 * @generated
	 */
	EAttribute getISRuntimeInstanceAggregation_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getComponents()
	 * @see #getISRuntimeInstanceAggregation()
	 * @generated
	 */
	EReference getISRuntimeInstanceAggregation_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase <em>IS Unit Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Unit Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase
	 * @generated
	 */
	EClass getISUnitTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase#getParent()
	 * @see #getISUnitTestCase()
	 * @generated
	 */
	EReference getISUnitTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase#getProvidedrole()
	 * @see #getISUnitTestCase()
	 * @generated
	 */
	EReference getISUnitTestCase_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase <em>IS Acceptance Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Acceptance Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase
	 * @generated
	 */
	EClass getISAcceptanceTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase#getParent()
	 * @see #getISAcceptanceTestCase()
	 * @generated
	 */
	EReference getISAcceptanceTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase#getProvidedrole()
	 * @see #getISAcceptanceTestCase()
	 * @generated
	 */
	EReference getISAcceptanceTestCase_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase <em>IS Integration Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Integration Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase
	 * @generated
	 */
	EClass getISIntegrationTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getParent()
	 * @see #getISIntegrationTestCase()
	 * @generated
	 */
	EReference getISIntegrationTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getProvidedrole()
	 * @see #getISIntegrationTestCase()
	 * @generated
	 */
	EReference getISIntegrationTestCase_Providedrole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase#getAssemblyConnector()
	 * @see #getISIntegrationTestCase()
	 * @generated
	 */
	EReference getISIntegrationTestCase_AssemblyConnector();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation <em>IS Unit Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Unit Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation
	 * @generated
	 */
	EClass getISUnitTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation#getParent()
	 * @see #getISUnitTestCaseAggregation()
	 * @generated
	 */
	EReference getISUnitTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation#getProvidedrole()
	 * @see #getISUnitTestCaseAggregation()
	 * @generated
	 */
	EReference getISUnitTestCaseAggregation_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation <em>IS Acceptance Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Acceptance Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation
	 * @generated
	 */
	EClass getISAcceptanceTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation#getParent()
	 * @see #getISAcceptanceTestCaseAggregation()
	 * @generated
	 */
	EReference getISAcceptanceTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation#getProvidedrole()
	 * @see #getISAcceptanceTestCaseAggregation()
	 * @generated
	 */
	EReference getISAcceptanceTestCaseAggregation_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation <em>IS Integration Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Integration Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation
	 * @generated
	 */
	EClass getISIntegrationTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getParent()
	 * @see #getISIntegrationTestCaseAggregation()
	 * @generated
	 */
	EReference getISIntegrationTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getProvidedrole()
	 * @see #getISIntegrationTestCaseAggregation()
	 * @generated
	 */
	EReference getISIntegrationTestCaseAggregation_Providedrole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation#getAssemblyConnector()
	 * @see #getISIntegrationTestCaseAggregation()
	 * @generated
	 */
	EReference getISIntegrationTestCaseAggregation_AssemblyConnector();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification <em>IS Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification
	 * @generated
	 */
	EClass getISStaffSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getParent()
	 * @see #getISStaffSpecification()
	 * @generated
	 */
	EReference getISStaffSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getPersonList()
	 * @see #getISStaffSpecification()
	 * @generated
	 */
	EReference getISStaffSpecification_PersonList();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getRoleList()
	 * @see #getISStaffSpecification()
	 * @generated
	 */
	EReference getISStaffSpecification_RoleList();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList <em>IS Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList
	 * @generated
	 */
	EClass getISPersonList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList#getParent()
	 * @see #getISPersonList()
	 * @generated
	 */
	EReference getISPersonList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList#getPersons()
	 * @see #getISPersonList()
	 * @generated
	 */
	EReference getISPersonList_Persons();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson <em>IS Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson
	 * @generated
	 */
	EClass getISPerson();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson#getParent()
	 * @see #getISPerson()
	 * @generated
	 */
	EReference getISPerson_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson#getRoles()
	 * @see #getISPerson()
	 * @generated
	 */
	EReference getISPerson_Roles();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson#getName()
	 * @see #getISPerson()
	 * @generated
	 */
	EAttribute getISPerson_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole <em>IS Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole
	 * @generated
	 */
	EClass getISRole();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getParent()
	 * @see #getISRole()
	 * @generated
	 */
	EReference getISRole_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getPerson()
	 * @see #getISRole()
	 * @generated
	 */
	EReference getISRole_Person();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getDescription()
	 * @see #getISRole()
	 * @generated
	 */
	EAttribute getISRole_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRole#getComponents()
	 * @see #getISRole()
	 * @generated
	 */
	EReference getISRole_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList <em>IS Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList
	 * @generated
	 */
	EClass getISRoleList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList#getParent()
	 * @see #getISRoleList()
	 * @generated
	 */
	EReference getISRoleList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList#getRoles()
	 * @see #getISRoleList()
	 * @generated
	 */
	EReference getISRoleList_Roles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper <em>IS Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Developer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper
	 * @generated
	 */
	EClass getISDeveloper();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfigurator <em>IS Build Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Build Configurator</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfigurator
	 * @generated
	 */
	EClass getISBuildConfigurator();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestDeveloper <em>IS Test Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Test Developer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestDeveloper
	 * @generated
	 */
	EClass getISTestDeveloper();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTester <em>IS Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Tester</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTester
	 * @generated
	 */
	EClass getISTester();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfigurator <em>IS Release Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Release Configurator</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfigurator
	 * @generated
	 */
	EClass getISReleaseConfigurator();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer <em>IS Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Deployer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer
	 * @generated
	 */
	EClass getISDeployer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile <em>IS File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile
	 * @generated
	 */
	EClass getISFile();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getFilename()
	 * @see #getISFile()
	 * @generated
	 */
	EAttribute getISFile_Filename();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getTechnology()
	 * @see #getISFile()
	 * @generated
	 */
	EAttribute getISFile_Technology();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation <em>IS File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation
	 * @generated
	 */
	EClass getISFileAggregation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation#getNumberOfFiles <em>Number Of Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation#getNumberOfFiles()
	 * @see #getISFileAggregation()
	 * @generated
	 */
	EAttribute getISFileAggregation_NumberOfFiles();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFileAggregation#getTechnology()
	 * @see #getISFileAggregation()
	 * @generated
	 */
	EAttribute getISFileAggregation_Technology();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase <em>IS Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase
	 * @generated
	 */
	EClass getISTestCase();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase#getNameOfTest <em>Name Of Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Test</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase#getNameOfTest()
	 * @see #getISTestCase()
	 * @generated
	 */
	EAttribute getISTestCase_NameOfTest();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation <em>IS Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation
	 * @generated
	 */
	EClass getISTestCaseAggregation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNumberOfTestcases <em>Number Of Testcases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Testcases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNumberOfTestcases()
	 * @see #getISTestCaseAggregation()
	 * @generated
	 */
	EAttribute getISTestCaseAggregation_NumberOfTestcases();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNameOfTestSuite <em>Name Of Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Test Suite</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCaseAggregation#getNameOfTestSuite()
	 * @see #getISTestCaseAggregation()
	 * @generated
	 */
	EAttribute getISTestCaseAggregation_NameOfTestSuite();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification <em>IS Design Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Design Pattern Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification
	 * @generated
	 */
	EClass getISDesignPatternSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification#getParent()
	 * @see #getISDesignPatternSpecification()
	 * @generated
	 */
	EReference getISDesignPatternSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification#getDesignPatternRoles <em>Design Pattern Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Pattern Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification#getDesignPatternRoles()
	 * @see #getISDesignPatternSpecification()
	 * @generated
	 */
	EReference getISDesignPatternSpecification_DesignPatternRoles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole <em>IS Design Pattern Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Design Pattern Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole
	 * @generated
	 */
	EClass getISDesignPatternRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole#getProvidedRole()
	 * @see #getISDesignPatternRole()
	 * @generated
	 */
	EReference getISDesignPatternRole_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole#getComponent()
	 * @see #getISDesignPatternRole()
	 * @generated
	 */
	EReference getISDesignPatternRole_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification <em>IS Technology Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Technology Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification
	 * @generated
	 */
	EClass getISTechnologySpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getParent()
	 * @see #getISTechnologySpecification()
	 * @generated
	 */
	EReference getISTechnologySpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getTechnologicalCorrespondences <em>Technological Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technological Correspondences</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getTechnologicalCorrespondences()
	 * @see #getISTechnologySpecification()
	 * @generated
	 */
	EReference getISTechnologySpecification_TechnologicalCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence <em>IS Technological Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Technological Correspondence</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence
	 * @generated
	 */
	EClass getISTechnologicalCorrespondence();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technological Correspondence Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getTechnologicalCorrespondenceType()
	 * @see #getISTechnologicalCorrespondence()
	 * @generated
	 */
	EAttribute getISTechnologicalCorrespondence_TechnologicalCorrespondenceType();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getComponent()
	 * @see #getISTechnologicalCorrespondence()
	 * @generated
	 */
	EReference getISTechnologicalCorrespondence_Component();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes <em>IS Technological Correspondence Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IS Technological Correspondence Types</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes
	 * @generated
	 */
	EEnum getISTechnologicalCorrespondenceTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ISFieldOfActivityAnnotationsFactory getISFieldOfActivityAnnotationsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISFieldOfActivityAnnotationsRepository()
		 * @generated
		 */
		EClass IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = eINSTANCE.getISFieldOfActivityAnnotationsRepository();

		/**
		 * The meta object literal for the '<em><b>Development Artefact Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification();

		/**
		 * The meta object literal for the '<em><b>Build Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_BuildSpecification();

		/**
		 * The meta object literal for the '<em><b>Test Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_TestSpecification();

		/**
		 * The meta object literal for the '<em><b>Release Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_ReleaseSpecification();

		/**
		 * The meta object literal for the '<em><b>Deployment Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_DeploymentSpecification();

		/**
		 * The meta object literal for the '<em><b>Staff Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_StaffSpecification();

		/**
		 * The meta object literal for the '<em><b>Technology Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_TechnologySpecification();

		/**
		 * The meta object literal for the '<em><b>Design Pattern Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION = eINSTANCE.getISFieldOfActivityAnnotationsRepository_DesignPatternSpecification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl <em>IS Development Artefact Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDevelopmentArtefactSpecification()
		 * @generated
		 */
		EClass IS_DEVELOPMENT_ARTEFACT_SPECIFICATION = eINSTANCE.getISDevelopmentArtefactSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT = eINSTANCE.getISDevelopmentArtefactSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Source Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES = eINSTANCE.getISDevelopmentArtefactSpecification_SourceFiles();

		/**
		 * The meta object literal for the '<em><b>Source File Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS = eINSTANCE.getISDevelopmentArtefactSpecification_SourceFileAggregations();

		/**
		 * The meta object literal for the '<em><b>Metadata Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES = eINSTANCE.getISDevelopmentArtefactSpecification_MetadataFiles();

		/**
		 * The meta object literal for the '<em><b>Metadata File Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS = eINSTANCE.getISDevelopmentArtefactSpecification_MetadataFileAggregations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileImpl <em>IS Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISSourceFile()
		 * @generated
		 */
		EClass IS_SOURCE_FILE = eINSTANCE.getISSourceFile();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SOURCE_FILE__PARENT = eINSTANCE.getISSourceFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SOURCE_FILE__COMPONENT = eINSTANCE.getISSourceFile_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileAggregationImpl <em>IS Source File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISSourceFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISSourceFileAggregation()
		 * @generated
		 */
		EClass IS_SOURCE_FILE_AGGREGATION = eINSTANCE.getISSourceFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SOURCE_FILE_AGGREGATION__PARENT = eINSTANCE.getISSourceFileAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SOURCE_FILE_AGGREGATION__COMPONENT = eINSTANCE.getISSourceFileAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileImpl <em>IS Metadata File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISMetadataFile()
		 * @generated
		 */
		EClass IS_METADATA_FILE = eINSTANCE.getISMetadataFile();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_METADATA_FILE__PARENT = eINSTANCE.getISMetadataFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_METADATA_FILE__COMPONENT = eINSTANCE.getISMetadataFile_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileAggregationImpl <em>IS Metadata File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISMetadataFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISMetadataFileAggregation()
		 * @generated
		 */
		EClass IS_METADATA_FILE_AGGREGATION = eINSTANCE.getISMetadataFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_METADATA_FILE_AGGREGATION__PARENT = eINSTANCE.getISMetadataFileAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_METADATA_FILE_AGGREGATION__COMPONENT = eINSTANCE.getISMetadataFileAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildSpecificationImpl <em>IS Build Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISBuildSpecification()
		 * @generated
		 */
		EClass IS_BUILD_SPECIFICATION = eINSTANCE.getISBuildSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BUILD_SPECIFICATION__PARENT = eINSTANCE.getISBuildSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Build Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS = eINSTANCE.getISBuildSpecification_BuildConfigurations();

		/**
		 * The meta object literal for the '<em><b>Third Party Component Or Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES = eINSTANCE.getISBuildSpecification_ThirdPartyComponentOrLibraries();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfigurationImpl <em>IS Build Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISBuildConfiguration()
		 * @generated
		 */
		EClass IS_BUILD_CONFIGURATION = eINSTANCE.getISBuildConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BUILD_CONFIGURATION__PARENT = eINSTANCE.getISBuildConfiguration_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BUILD_CONFIGURATION__COMPONENT = eINSTANCE.getISBuildConfiguration_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISThirdPartyComponentOrLibraryImpl <em>IS Third Party Component Or Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISThirdPartyComponentOrLibraryImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISThirdPartyComponentOrLibrary()
		 * @generated
		 */
		EClass IS_THIRD_PARTY_COMPONENT_OR_LIBRARY = eINSTANCE.getISThirdPartyComponentOrLibrary();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT = eINSTANCE.getISThirdPartyComponentOrLibrary_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__COMPONENT = eINSTANCE.getISThirdPartyComponentOrLibrary_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl <em>IS Test Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestSpecification()
		 * @generated
		 */
		EClass IS_TEST_SPECIFICATION = eINSTANCE.getISTestSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TEST_SPECIFICATION__PARENT = eINSTANCE.getISTestSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Unit Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TEST_SPECIFICATION__UNIT_TEST_CASES = eINSTANCE.getISTestSpecification_UnitTestCases();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES = eINSTANCE.getISTestSpecification_AcceptanceTestCases();

		/**
		 * The meta object literal for the '<em><b>Integration Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES = eINSTANCE.getISTestSpecification_IntegrationTestCases();

		/**
		 * The meta object literal for the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS = eINSTANCE.getISTestSpecification_UnitTestCaseAggregations();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS = eINSTANCE.getISTestSpecification_AcceptanceTestCaseAggregations();

		/**
		 * The meta object literal for the '<em><b>Integration Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS = eINSTANCE.getISTestSpecification_IntegrationTestCaseAggregations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseSpecificationImpl <em>IS Release Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISReleaseSpecification()
		 * @generated
		 */
		EClass IS_RELEASE_SPECIFICATION = eINSTANCE.getISReleaseSpecification();

		/**
		 * The meta object literal for the '<em><b>Release Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS = eINSTANCE.getISReleaseSpecification_ReleaseConfigurations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RELEASE_SPECIFICATION__PARENT = eINSTANCE.getISReleaseSpecification_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfigurationImpl <em>IS Release Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISReleaseConfiguration()
		 * @generated
		 */
		EClass IS_RELEASE_CONFIGURATION = eINSTANCE.getISReleaseConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RELEASE_CONFIGURATION__PARENT = eINSTANCE.getISReleaseConfiguration_Parent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RELEASE_CONFIGURATION__COMPONENTS = eINSTANCE.getISReleaseConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Pathname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_RELEASE_CONFIGURATION__PATHNAME = eINSTANCE.getISReleaseConfiguration_Pathname();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_RELEASE_CONFIGURATION__DESCRIPTION = eINSTANCE.getISReleaseConfiguration_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl <em>IS Deployment Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDeploymentSpecification()
		 * @generated
		 */
		EClass IS_DEPLOYMENT_SPECIFICATION = eINSTANCE.getISDeploymentSpecification();

		/**
		 * The meta object literal for the '<em><b>Runtime Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES = eINSTANCE.getISDeploymentSpecification_RuntimeInstances();

		/**
		 * The meta object literal for the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS = eINSTANCE.getISDeploymentSpecification_RuntimeInstanceAggregations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEPLOYMENT_SPECIFICATION__PARENT = eINSTANCE.getISDeploymentSpecification_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceImpl <em>IS Runtime Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRuntimeInstance()
		 * @generated
		 */
		EClass IS_RUNTIME_INSTANCE = eINSTANCE.getISRuntimeInstance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RUNTIME_INSTANCE__PARENT = eINSTANCE.getISRuntimeInstance_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_RUNTIME_INSTANCE__NAME = eINSTANCE.getISRuntimeInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_RUNTIME_INSTANCE__DESCRIPTION = eINSTANCE.getISRuntimeInstance_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RUNTIME_INSTANCE__COMPONENTS = eINSTANCE.getISRuntimeInstance_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceAggregationImpl <em>IS Runtime Instance Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRuntimeInstanceAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRuntimeInstanceAggregation()
		 * @generated
		 */
		EClass IS_RUNTIME_INSTANCE_AGGREGATION = eINSTANCE.getISRuntimeInstanceAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RUNTIME_INSTANCE_AGGREGATION__PARENT = eINSTANCE.getISRuntimeInstanceAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES = eINSTANCE.getISRuntimeInstanceAggregation_NumberOfInstances();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION = eINSTANCE.getISRuntimeInstanceAggregation_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_RUNTIME_INSTANCE_AGGREGATION__COMPONENTS = eINSTANCE.getISRuntimeInstanceAggregation_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseImpl <em>IS Unit Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISUnitTestCase()
		 * @generated
		 */
		EClass IS_UNIT_TEST_CASE = eINSTANCE.getISUnitTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_UNIT_TEST_CASE__PARENT = eINSTANCE.getISUnitTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_UNIT_TEST_CASE__PROVIDEDROLE = eINSTANCE.getISUnitTestCase_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseImpl <em>IS Acceptance Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISAcceptanceTestCase()
		 * @generated
		 */
		EClass IS_ACCEPTANCE_TEST_CASE = eINSTANCE.getISAcceptanceTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ACCEPTANCE_TEST_CASE__PARENT = eINSTANCE.getISAcceptanceTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ACCEPTANCE_TEST_CASE__PROVIDEDROLE = eINSTANCE.getISAcceptanceTestCase_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseImpl <em>IS Integration Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISIntegrationTestCase()
		 * @generated
		 */
		EClass IS_INTEGRATION_TEST_CASE = eINSTANCE.getISIntegrationTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTEGRATION_TEST_CASE__PARENT = eINSTANCE.getISIntegrationTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTEGRATION_TEST_CASE__PROVIDEDROLE = eINSTANCE.getISIntegrationTestCase_Providedrole();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR = eINSTANCE.getISIntegrationTestCase_AssemblyConnector();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseAggregationImpl <em>IS Unit Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISUnitTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISUnitTestCaseAggregation()
		 * @generated
		 */
		EClass IS_UNIT_TEST_CASE_AGGREGATION = eINSTANCE.getISUnitTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_UNIT_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getISUnitTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_UNIT_TEST_CASE_AGGREGATION__PROVIDEDROLE = eINSTANCE.getISUnitTestCaseAggregation_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseAggregationImpl <em>IS Acceptance Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISAcceptanceTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISAcceptanceTestCaseAggregation()
		 * @generated
		 */
		EClass IS_ACCEPTANCE_TEST_CASE_AGGREGATION = eINSTANCE.getISAcceptanceTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getISAcceptanceTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ACCEPTANCE_TEST_CASE_AGGREGATION__PROVIDEDROLE = eINSTANCE.getISAcceptanceTestCaseAggregation_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseAggregationImpl <em>IS Integration Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISIntegrationTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISIntegrationTestCaseAggregation()
		 * @generated
		 */
		EClass IS_INTEGRATION_TEST_CASE_AGGREGATION = eINSTANCE.getISIntegrationTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTEGRATION_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getISIntegrationTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTEGRATION_TEST_CASE_AGGREGATION__PROVIDEDROLE = eINSTANCE.getISIntegrationTestCaseAggregation_Providedrole();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTEGRATION_TEST_CASE_AGGREGATION__ASSEMBLY_CONNECTOR = eINSTANCE.getISIntegrationTestCaseAggregation_AssemblyConnector();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISStaffSpecificationImpl <em>IS Staff Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISStaffSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISStaffSpecification()
		 * @generated
		 */
		EClass IS_STAFF_SPECIFICATION = eINSTANCE.getISStaffSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_STAFF_SPECIFICATION__PARENT = eINSTANCE.getISStaffSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Person List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_STAFF_SPECIFICATION__PERSON_LIST = eINSTANCE.getISStaffSpecification_PersonList();

		/**
		 * The meta object literal for the '<em><b>Role List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_STAFF_SPECIFICATION__ROLE_LIST = eINSTANCE.getISStaffSpecification_RoleList();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonListImpl <em>IS Person List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonListImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISPersonList()
		 * @generated
		 */
		EClass IS_PERSON_LIST = eINSTANCE.getISPersonList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_PERSON_LIST__PARENT = eINSTANCE.getISPersonList_Parent();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_PERSON_LIST__PERSONS = eINSTANCE.getISPersonList_Persons();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonImpl <em>IS Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISPerson()
		 * @generated
		 */
		EClass IS_PERSON = eINSTANCE.getISPerson();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_PERSON__PARENT = eINSTANCE.getISPerson_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_PERSON__ROLES = eINSTANCE.getISPerson_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_PERSON__NAME = eINSTANCE.getISPerson_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleImpl <em>IS Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRole()
		 * @generated
		 */
		EClass IS_ROLE = eINSTANCE.getISRole();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ROLE__PARENT = eINSTANCE.getISRole_Parent();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ROLE__PERSON = eINSTANCE.getISRole_Person();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_ROLE__DESCRIPTION = eINSTANCE.getISRole_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ROLE__COMPONENTS = eINSTANCE.getISRole_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleListImpl <em>IS Role List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISRoleListImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISRoleList()
		 * @generated
		 */
		EClass IS_ROLE_LIST = eINSTANCE.getISRoleList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ROLE_LIST__PARENT = eINSTANCE.getISRoleList_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ROLE_LIST__ROLES = eINSTANCE.getISRoleList_Roles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeveloperImpl <em>IS Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeveloperImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDeveloper()
		 * @generated
		 */
		EClass IS_DEVELOPER = eINSTANCE.getISDeveloper();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfiguratorImpl <em>IS Build Configurator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfiguratorImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISBuildConfigurator()
		 * @generated
		 */
		EClass IS_BUILD_CONFIGURATOR = eINSTANCE.getISBuildConfigurator();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestDeveloperImpl <em>IS Test Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestDeveloperImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestDeveloper()
		 * @generated
		 */
		EClass IS_TEST_DEVELOPER = eINSTANCE.getISTestDeveloper();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTesterImpl <em>IS Tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTesterImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTester()
		 * @generated
		 */
		EClass IS_TESTER = eINSTANCE.getISTester();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfiguratorImpl <em>IS Release Configurator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseConfiguratorImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISReleaseConfigurator()
		 * @generated
		 */
		EClass IS_RELEASE_CONFIGURATOR = eINSTANCE.getISReleaseConfigurator();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeployerImpl <em>IS Deployer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeployerImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDeployer()
		 * @generated
		 */
		EClass IS_DEPLOYER = eINSTANCE.getISDeployer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileImpl <em>IS File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISFile()
		 * @generated
		 */
		EClass IS_FILE = eINSTANCE.getISFile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_FILE__FILENAME = eINSTANCE.getISFile_Filename();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_FILE__TECHNOLOGY = eINSTANCE.getISFile_Technology();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileAggregationImpl <em>IS File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISFileAggregation()
		 * @generated
		 */
		EClass IS_FILE_AGGREGATION = eINSTANCE.getISFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_FILE_AGGREGATION__NUMBER_OF_FILES = eINSTANCE.getISFileAggregation_NumberOfFiles();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_FILE_AGGREGATION__TECHNOLOGY = eINSTANCE.getISFileAggregation_Technology();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseImpl <em>IS Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestCase()
		 * @generated
		 */
		EClass IS_TEST_CASE = eINSTANCE.getISTestCase();

		/**
		 * The meta object literal for the '<em><b>Name Of Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_TEST_CASE__NAME_OF_TEST = eINSTANCE.getISTestCase_NameOfTest();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseAggregationImpl <em>IS Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTestCaseAggregation()
		 * @generated
		 */
		EClass IS_TEST_CASE_AGGREGATION = eINSTANCE.getISTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Testcases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = eINSTANCE.getISTestCaseAggregation_NumberOfTestcases();

		/**
		 * The meta object literal for the '<em><b>Name Of Test Suite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = eINSTANCE.getISTestCaseAggregation_NameOfTestSuite();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternSpecificationImpl <em>IS Design Pattern Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDesignPatternSpecification()
		 * @generated
		 */
		EClass IS_DESIGN_PATTERN_SPECIFICATION = eINSTANCE.getISDesignPatternSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DESIGN_PATTERN_SPECIFICATION__PARENT = eINSTANCE.getISDesignPatternSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Design Pattern Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DESIGN_PATTERN_SPECIFICATION__DESIGN_PATTERN_ROLES = eINSTANCE.getISDesignPatternSpecification_DesignPatternRoles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternRoleImpl <em>IS Design Pattern Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISDesignPatternRole()
		 * @generated
		 */
		EClass IS_DESIGN_PATTERN_ROLE = eINSTANCE.getISDesignPatternRole();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE = eINSTANCE.getISDesignPatternRole_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DESIGN_PATTERN_ROLE__COMPONENT = eINSTANCE.getISDesignPatternRole_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologySpecificationImpl <em>IS Technology Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologySpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTechnologySpecification()
		 * @generated
		 */
		EClass IS_TECHNOLOGY_SPECIFICATION = eINSTANCE.getISTechnologySpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TECHNOLOGY_SPECIFICATION__PARENT = eINSTANCE.getISTechnologySpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Technological Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES = eINSTANCE.getISTechnologySpecification_TechnologicalCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologicalCorrespondenceImpl <em>IS Technological Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologicalCorrespondenceImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTechnologicalCorrespondence()
		 * @generated
		 */
		EClass IS_TECHNOLOGICAL_CORRESPONDENCE = eINSTANCE.getISTechnologicalCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Technological Correspondence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE = eINSTANCE.getISTechnologicalCorrespondence_TechnologicalCorrespondenceType();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT = eINSTANCE.getISTechnologicalCorrespondence_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes <em>IS Technological Correspondence Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes
		 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsPackageImpl#getISTechnologicalCorrespondenceTypes()
		 * @generated
		 */
		EEnum IS_TECHNOLOGICAL_CORRESPONDENCE_TYPES = eINSTANCE.getISTechnologicalCorrespondenceTypes();

	}

} //ISFieldOfActivityAnnotationsPackage
