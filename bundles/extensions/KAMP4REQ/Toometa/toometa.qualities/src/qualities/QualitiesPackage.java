/**
 */
package qualities;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see qualities.QualitiesFactory
 * @model kind="package"
 * @generated
 */
public interface QualitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toometa.de/qualities/0.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qualities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualitiesPackage eINSTANCE = qualities.impl.QualitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualities.impl.QualityTypeImpl <em>Quality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.QualityTypeImpl
	 * @see qualities.impl.QualitiesPackageImpl#getQualityType()
	 * @generated
	 */
	int QUALITY_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE__QUALITY_TYPE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE__DIMENSION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link qualities.impl.ReliabilityImpl <em>Reliability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.ReliabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getReliability()
	 * @generated
	 */
	int RELIABILITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.ReliabilityComplianceImpl <em>Reliability Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.ReliabilityComplianceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getReliabilityCompliance()
	 * @generated
	 */
	int RELIABILITY_COMPLIANCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_COMPLIANCE__ID = RELIABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_COMPLIANCE__DESCRIPTION = RELIABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_COMPLIANCE__QUALITY_TYPE_REPOSITORY = RELIABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_COMPLIANCE__DIMENSION = RELIABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Reliability Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_COMPLIANCE_FEATURE_COUNT = RELIABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.PortabilityImpl <em>Portability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.PortabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getPortability()
	 * @generated
	 */
	int PORTABILITY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Portability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.InstallabilityImpl <em>Installability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.InstallabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getInstallability()
	 * @generated
	 */
	int INSTALLABILITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABILITY__ID = PORTABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABILITY__DESCRIPTION = PORTABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABILITY__QUALITY_TYPE_REPOSITORY = PORTABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABILITY__DIMENSION = PORTABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Installability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABILITY_FEATURE_COUNT = PORTABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.CoExistenceImpl <em>Co Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.CoExistenceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getCoExistence()
	 * @generated
	 */
	int CO_EXISTENCE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE__ID = PORTABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE__DESCRIPTION = PORTABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE__QUALITY_TYPE_REPOSITORY = PORTABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE__DIMENSION = PORTABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Co Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE_FEATURE_COUNT = PORTABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.UsabilityImpl <em>Usability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.UsabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getUsability()
	 * @generated
	 */
	int USABILITY = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Usability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.OperabilityImpl <em>Operability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.OperabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getOperability()
	 * @generated
	 */
	int OPERABILITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERABILITY__ID = USABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERABILITY__DESCRIPTION = USABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERABILITY__QUALITY_TYPE_REPOSITORY = USABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERABILITY__DIMENSION = USABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Operability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERABILITY_FEATURE_COUNT = USABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.MaintainabilityImpl <em>Maintainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.MaintainabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getMaintainability()
	 * @generated
	 */
	int MAINTAINABILITY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Maintainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.StabilityImpl <em>Stability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.StabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getStability()
	 * @generated
	 */
	int STABILITY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABILITY__ID = MAINTAINABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABILITY__DESCRIPTION = MAINTAINABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABILITY__QUALITY_TYPE_REPOSITORY = MAINTAINABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABILITY__DIMENSION = MAINTAINABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Stability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABILITY_FEATURE_COUNT = MAINTAINABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.MaintainabilityComplianceImpl <em>Maintainability Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.MaintainabilityComplianceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getMaintainabilityCompliance()
	 * @generated
	 */
	int MAINTAINABILITY_COMPLIANCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_COMPLIANCE__ID = MAINTAINABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_COMPLIANCE__DESCRIPTION = MAINTAINABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_COMPLIANCE__QUALITY_TYPE_REPOSITORY = MAINTAINABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_COMPLIANCE__DIMENSION = MAINTAINABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Maintainability Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_COMPLIANCE_FEATURE_COUNT = MAINTAINABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.MaturityImpl <em>Maturity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.MaturityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getMaturity()
	 * @generated
	 */
	int MATURITY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY__ID = RELIABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY__DESCRIPTION = RELIABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY__QUALITY_TYPE_REPOSITORY = RELIABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY__DIMENSION = RELIABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Maturity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_FEATURE_COUNT = RELIABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.AttractivenessImpl <em>Attractiveness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.AttractivenessImpl
	 * @see qualities.impl.QualitiesPackageImpl#getAttractiveness()
	 * @generated
	 */
	int ATTRACTIVENESS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRACTIVENESS__ID = USABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRACTIVENESS__DESCRIPTION = USABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRACTIVENESS__QUALITY_TYPE_REPOSITORY = USABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRACTIVENESS__DIMENSION = USABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Attractiveness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRACTIVENESS_FEATURE_COUNT = USABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.AnalyzabilityImpl <em>Analyzability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.AnalyzabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getAnalyzability()
	 * @generated
	 */
	int ANALYZABILITY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZABILITY__ID = MAINTAINABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZABILITY__DESCRIPTION = MAINTAINABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZABILITY__QUALITY_TYPE_REPOSITORY = MAINTAINABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZABILITY__DIMENSION = MAINTAINABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Analyzability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZABILITY_FEATURE_COUNT = MAINTAINABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.ReplaceabilityImpl <em>Replaceability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.ReplaceabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getReplaceability()
	 * @generated
	 */
	int REPLACEABILITY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEABILITY__ID = PORTABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEABILITY__DESCRIPTION = PORTABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEABILITY__QUALITY_TYPE_REPOSITORY = PORTABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEABILITY__DIMENSION = PORTABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Replaceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEABILITY_FEATURE_COUNT = PORTABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.RecoverabilityImpl <em>Recoverability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.RecoverabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getRecoverability()
	 * @generated
	 */
	int RECOVERABILITY = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERABILITY__ID = RELIABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERABILITY__DESCRIPTION = RELIABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERABILITY__QUALITY_TYPE_REPOSITORY = RELIABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERABILITY__DIMENSION = RELIABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Recoverability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERABILITY_FEATURE_COUNT = RELIABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.UnderstandabilityImpl <em>Understandability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.UnderstandabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getUnderstandability()
	 * @generated
	 */
	int UNDERSTANDABILITY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSTANDABILITY__ID = USABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSTANDABILITY__DESCRIPTION = USABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSTANDABILITY__QUALITY_TYPE_REPOSITORY = USABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSTANDABILITY__DIMENSION = USABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Understandability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERSTANDABILITY_FEATURE_COUNT = USABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.PortabilityComplianceImpl <em>Portability Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.PortabilityComplianceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getPortabilityCompliance()
	 * @generated
	 */
	int PORTABILITY_COMPLIANCE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY_COMPLIANCE__ID = PORTABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY_COMPLIANCE__DESCRIPTION = PORTABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY_COMPLIANCE__QUALITY_TYPE_REPOSITORY = PORTABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY_COMPLIANCE__DIMENSION = PORTABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Portability Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABILITY_COMPLIANCE_FEATURE_COUNT = PORTABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.EfficiencyImpl <em>Efficiency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.EfficiencyImpl
	 * @see qualities.impl.QualitiesPackageImpl#getEfficiency()
	 * @generated
	 */
	int EFFICIENCY = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Efficiency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.RessourceUtilizationImpl <em>Ressource Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.RessourceUtilizationImpl
	 * @see qualities.impl.QualitiesPackageImpl#getRessourceUtilization()
	 * @generated
	 */
	int RESSOURCE_UTILIZATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_UTILIZATION__ID = EFFICIENCY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_UTILIZATION__DESCRIPTION = EFFICIENCY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_UTILIZATION__QUALITY_TYPE_REPOSITORY = EFFICIENCY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_UTILIZATION__DIMENSION = EFFICIENCY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Ressource Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_UTILIZATION_FEATURE_COUNT = EFFICIENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.ChangeabilityImpl <em>Changeability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.ChangeabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getChangeability()
	 * @generated
	 */
	int CHANGEABILITY = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABILITY__ID = MAINTAINABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABILITY__DESCRIPTION = MAINTAINABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABILITY__QUALITY_TYPE_REPOSITORY = MAINTAINABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABILITY__DIMENSION = MAINTAINABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Changeability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABILITY_FEATURE_COUNT = MAINTAINABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.FunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.FunctionalityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getFunctionality()
	 * @generated
	 */
	int FUNCTIONALITY = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.InteroperabilityImpl <em>Interoperability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.InteroperabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getInteroperability()
	 * @generated
	 */
	int INTEROPERABILITY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY__ID = FUNCTIONALITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY__QUALITY_TYPE_REPOSITORY = FUNCTIONALITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY__DIMENSION = FUNCTIONALITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Interoperability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.FaultToleranceImpl <em>Fault Tolerance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.FaultToleranceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getFaultTolerance()
	 * @generated
	 */
	int FAULT_TOLERANCE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE__ID = RELIABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE__DESCRIPTION = RELIABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE__QUALITY_TYPE_REPOSITORY = RELIABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE__DIMENSION = RELIABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Fault Tolerance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_FEATURE_COUNT = RELIABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.QualityTypeRepositoryImpl <em>Quality Type Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.QualityTypeRepositoryImpl
	 * @see qualities.impl.QualitiesPackageImpl#getQualityTypeRepository()
	 * @generated
	 */
	int QUALITY_TYPE_REPOSITORY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Quality Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE_REPOSITORY__QUALITY_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_TYPE_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualities.impl.AdaptabilityImpl <em>Adaptability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.AdaptabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getAdaptability()
	 * @generated
	 */
	int ADAPTABILITY = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY__ID = PORTABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY__DESCRIPTION = PORTABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY__QUALITY_TYPE_REPOSITORY = PORTABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY__DIMENSION = PORTABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Adaptability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_FEATURE_COUNT = PORTABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.TimeBehaviourImpl <em>Time Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.TimeBehaviourImpl
	 * @see qualities.impl.QualitiesPackageImpl#getTimeBehaviour()
	 * @generated
	 */
	int TIME_BEHAVIOUR = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BEHAVIOUR__ID = EFFICIENCY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BEHAVIOUR__DESCRIPTION = EFFICIENCY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BEHAVIOUR__QUALITY_TYPE_REPOSITORY = EFFICIENCY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BEHAVIOUR__DIMENSION = EFFICIENCY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Time Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BEHAVIOUR_FEATURE_COUNT = EFFICIENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.SecurityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__ID = FUNCTIONALITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__QUALITY_TYPE_REPOSITORY = FUNCTIONALITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__DIMENSION = FUNCTIONALITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.AccuracyImpl <em>Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.AccuracyImpl
	 * @see qualities.impl.QualitiesPackageImpl#getAccuracy()
	 * @generated
	 */
	int ACCURACY = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__ID = FUNCTIONALITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__QUALITY_TYPE_REPOSITORY = FUNCTIONALITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__DIMENSION = FUNCTIONALITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.FunctionalityComplianceImpl <em>Functionality Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.FunctionalityComplianceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getFunctionalityCompliance()
	 * @generated
	 */
	int FUNCTIONALITY_COMPLIANCE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_COMPLIANCE__ID = FUNCTIONALITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_COMPLIANCE__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_COMPLIANCE__QUALITY_TYPE_REPOSITORY = FUNCTIONALITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_COMPLIANCE__DIMENSION = FUNCTIONALITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Functionality Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_COMPLIANCE_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.SafetyImpl <em>Safety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.SafetyImpl
	 * @see qualities.impl.QualitiesPackageImpl#getSafety()
	 * @generated
	 */
	int SAFETY = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.EfficiencyComplianceImpl <em>Efficiency Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.EfficiencyComplianceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getEfficiencyCompliance()
	 * @generated
	 */
	int EFFICIENCY_COMPLIANCE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_COMPLIANCE__ID = EFFICIENCY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_COMPLIANCE__DESCRIPTION = EFFICIENCY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_COMPLIANCE__QUALITY_TYPE_REPOSITORY = EFFICIENCY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_COMPLIANCE__DIMENSION = EFFICIENCY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Efficiency Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_COMPLIANCE_FEATURE_COUNT = EFFICIENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.SuitabilityImpl <em>Suitability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.SuitabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getSuitability()
	 * @generated
	 */
	int SUITABILITY = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITABILITY__ID = FUNCTIONALITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITABILITY__DESCRIPTION = FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITABILITY__QUALITY_TYPE_REPOSITORY = FUNCTIONALITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITABILITY__DIMENSION = FUNCTIONALITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Suitability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITABILITY_FEATURE_COUNT = FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.LearnabilityImpl <em>Learnability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.LearnabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getLearnability()
	 * @generated
	 */
	int LEARNABILITY = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNABILITY__ID = USABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNABILITY__DESCRIPTION = USABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNABILITY__QUALITY_TYPE_REPOSITORY = USABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNABILITY__DIMENSION = USABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Learnability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNABILITY_FEATURE_COUNT = USABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.PerformanceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.TestabilityImpl <em>Testability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.TestabilityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getTestability()
	 * @generated
	 */
	int TESTABILITY = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABILITY__ID = MAINTAINABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABILITY__DESCRIPTION = MAINTAINABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABILITY__QUALITY_TYPE_REPOSITORY = MAINTAINABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABILITY__DIMENSION = MAINTAINABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Testability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABILITY_FEATURE_COUNT = MAINTAINABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.UsabilityComplianceImpl <em>Usability Compliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.UsabilityComplianceImpl
	 * @see qualities.impl.QualitiesPackageImpl#getUsabilityCompliance()
	 * @generated
	 */
	int USABILITY_COMPLIANCE = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_COMPLIANCE__ID = USABILITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_COMPLIANCE__DESCRIPTION = USABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_COMPLIANCE__QUALITY_TYPE_REPOSITORY = USABILITY__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_COMPLIANCE__DIMENSION = USABILITY__DIMENSION;

	/**
	 * The number of structural features of the '<em>Usability Compliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_COMPLIANCE_FEATURE_COUNT = USABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualities.impl.TextQualityImpl <em>Text Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualities.impl.TextQualityImpl
	 * @see qualities.impl.QualitiesPackageImpl#getTextQuality()
	 * @generated
	 */
	int TEXT_QUALITY = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUALITY__ID = QUALITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUALITY__DESCRIPTION = QUALITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUALITY__QUALITY_TYPE_REPOSITORY = QUALITY_TYPE__QUALITY_TYPE_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUALITY__DIMENSION = QUALITY_TYPE__DIMENSION;

	/**
	 * The number of structural features of the '<em>Text Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUALITY_FEATURE_COUNT = QUALITY_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link qualities.ReliabilityCompliance <em>Reliability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability Compliance</em>'.
	 * @see qualities.ReliabilityCompliance
	 * @generated
	 */
	EClass getReliabilityCompliance();

	/**
	 * Returns the meta object for class '{@link qualities.Installability <em>Installability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installability</em>'.
	 * @see qualities.Installability
	 * @generated
	 */
	EClass getInstallability();

	/**
	 * Returns the meta object for class '{@link qualities.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability</em>'.
	 * @see qualities.Reliability
	 * @generated
	 */
	EClass getReliability();

	/**
	 * Returns the meta object for class '{@link qualities.CoExistence <em>Co Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Co Existence</em>'.
	 * @see qualities.CoExistence
	 * @generated
	 */
	EClass getCoExistence();

	/**
	 * Returns the meta object for class '{@link qualities.Operability <em>Operability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operability</em>'.
	 * @see qualities.Operability
	 * @generated
	 */
	EClass getOperability();

	/**
	 * Returns the meta object for class '{@link qualities.Stability <em>Stability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stability</em>'.
	 * @see qualities.Stability
	 * @generated
	 */
	EClass getStability();

	/**
	 * Returns the meta object for class '{@link qualities.MaintainabilityCompliance <em>Maintainability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintainability Compliance</em>'.
	 * @see qualities.MaintainabilityCompliance
	 * @generated
	 */
	EClass getMaintainabilityCompliance();

	/**
	 * Returns the meta object for class '{@link qualities.Portability <em>Portability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portability</em>'.
	 * @see qualities.Portability
	 * @generated
	 */
	EClass getPortability();

	/**
	 * Returns the meta object for class '{@link qualities.Maintainability <em>Maintainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintainability</em>'.
	 * @see qualities.Maintainability
	 * @generated
	 */
	EClass getMaintainability();

	/**
	 * Returns the meta object for class '{@link qualities.Maturity <em>Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maturity</em>'.
	 * @see qualities.Maturity
	 * @generated
	 */
	EClass getMaturity();

	/**
	 * Returns the meta object for class '{@link qualities.Attractiveness <em>Attractiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attractiveness</em>'.
	 * @see qualities.Attractiveness
	 * @generated
	 */
	EClass getAttractiveness();

	/**
	 * Returns the meta object for class '{@link qualities.Analyzability <em>Analyzability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzability</em>'.
	 * @see qualities.Analyzability
	 * @generated
	 */
	EClass getAnalyzability();

	/**
	 * Returns the meta object for class '{@link qualities.Replaceability <em>Replaceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replaceability</em>'.
	 * @see qualities.Replaceability
	 * @generated
	 */
	EClass getReplaceability();

	/**
	 * Returns the meta object for class '{@link qualities.Recoverability <em>Recoverability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recoverability</em>'.
	 * @see qualities.Recoverability
	 * @generated
	 */
	EClass getRecoverability();

	/**
	 * Returns the meta object for class '{@link qualities.Understandability <em>Understandability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Understandability</em>'.
	 * @see qualities.Understandability
	 * @generated
	 */
	EClass getUnderstandability();

	/**
	 * Returns the meta object for class '{@link qualities.PortabilityCompliance <em>Portability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portability Compliance</em>'.
	 * @see qualities.PortabilityCompliance
	 * @generated
	 */
	EClass getPortabilityCompliance();

	/**
	 * Returns the meta object for class '{@link qualities.RessourceUtilization <em>Ressource Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Utilization</em>'.
	 * @see qualities.RessourceUtilization
	 * @generated
	 */
	EClass getRessourceUtilization();

	/**
	 * Returns the meta object for class '{@link qualities.Changeability <em>Changeability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Changeability</em>'.
	 * @see qualities.Changeability
	 * @generated
	 */
	EClass getChangeability();

	/**
	 * Returns the meta object for class '{@link qualities.Interoperability <em>Interoperability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interoperability</em>'.
	 * @see qualities.Interoperability
	 * @generated
	 */
	EClass getInteroperability();

	/**
	 * Returns the meta object for class '{@link qualities.FaultTolerance <em>Fault Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Tolerance</em>'.
	 * @see qualities.FaultTolerance
	 * @generated
	 */
	EClass getFaultTolerance();

	/**
	 * Returns the meta object for class '{@link qualities.QualityTypeRepository <em>Quality Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Type Repository</em>'.
	 * @see qualities.QualityTypeRepository
	 * @generated
	 */
	EClass getQualityTypeRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link qualities.QualityTypeRepository#getQualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Type</em>'.
	 * @see qualities.QualityTypeRepository#getQualityType()
	 * @see #getQualityTypeRepository()
	 * @generated
	 */
	EReference getQualityTypeRepository_QualityType();

	/**
	 * Returns the meta object for class '{@link qualities.Adaptability <em>Adaptability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptability</em>'.
	 * @see qualities.Adaptability
	 * @generated
	 */
	EClass getAdaptability();

	/**
	 * Returns the meta object for class '{@link qualities.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see qualities.Functionality
	 * @generated
	 */
	EClass getFunctionality();

	/**
	 * Returns the meta object for class '{@link qualities.TimeBehaviour <em>Time Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Behaviour</em>'.
	 * @see qualities.TimeBehaviour
	 * @generated
	 */
	EClass getTimeBehaviour();

	/**
	 * Returns the meta object for class '{@link qualities.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see qualities.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for class '{@link qualities.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accuracy</em>'.
	 * @see qualities.Accuracy
	 * @generated
	 */
	EClass getAccuracy();

	/**
	 * Returns the meta object for class '{@link qualities.FunctionalityCompliance <em>Functionality Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality Compliance</em>'.
	 * @see qualities.FunctionalityCompliance
	 * @generated
	 */
	EClass getFunctionalityCompliance();

	/**
	 * Returns the meta object for class '{@link qualities.Efficiency <em>Efficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Efficiency</em>'.
	 * @see qualities.Efficiency
	 * @generated
	 */
	EClass getEfficiency();

	/**
	 * Returns the meta object for class '{@link qualities.Safety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety</em>'.
	 * @see qualities.Safety
	 * @generated
	 */
	EClass getSafety();

	/**
	 * Returns the meta object for class '{@link qualities.EfficiencyCompliance <em>Efficiency Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Efficiency Compliance</em>'.
	 * @see qualities.EfficiencyCompliance
	 * @generated
	 */
	EClass getEfficiencyCompliance();

	/**
	 * Returns the meta object for class '{@link qualities.Suitability <em>Suitability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suitability</em>'.
	 * @see qualities.Suitability
	 * @generated
	 */
	EClass getSuitability();

	/**
	 * Returns the meta object for class '{@link qualities.Learnability <em>Learnability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learnability</em>'.
	 * @see qualities.Learnability
	 * @generated
	 */
	EClass getLearnability();

	/**
	 * Returns the meta object for class '{@link qualities.QualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Type</em>'.
	 * @see qualities.QualityType
	 * @generated
	 */
	EClass getQualityType();

	/**
	 * Returns the meta object for the attribute '{@link qualities.QualityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see qualities.QualityType#getDescription()
	 * @see #getQualityType()
	 * @generated
	 */
	EAttribute getQualityType_Description();

	/**
	 * Returns the meta object for the container reference '{@link qualities.QualityType#getQualityTypeRepository <em>Quality Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Quality Type Repository</em>'.
	 * @see qualities.QualityType#getQualityTypeRepository()
	 * @see #getQualityType()
	 * @generated
	 */
	EReference getQualityType_QualityTypeRepository();

	/**
	 * Returns the meta object for the reference '{@link qualities.QualityType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see qualities.QualityType#getDimension()
	 * @see #getQualityType()
	 * @generated
	 */
	EReference getQualityType_Dimension();

	/**
	 * Returns the meta object for class '{@link qualities.Usability <em>Usability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usability</em>'.
	 * @see qualities.Usability
	 * @generated
	 */
	EClass getUsability();

	/**
	 * Returns the meta object for class '{@link qualities.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see qualities.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for class '{@link qualities.Testability <em>Testability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testability</em>'.
	 * @see qualities.Testability
	 * @generated
	 */
	EClass getTestability();

	/**
	 * Returns the meta object for class '{@link qualities.UsabilityCompliance <em>Usability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usability Compliance</em>'.
	 * @see qualities.UsabilityCompliance
	 * @generated
	 */
	EClass getUsabilityCompliance();

	/**
	 * Returns the meta object for class '{@link qualities.TextQuality <em>Text Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Quality</em>'.
	 * @see qualities.TextQuality
	 * @generated
	 */
	EClass getTextQuality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualitiesFactory getQualitiesFactory();

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
		 * The meta object literal for the '{@link qualities.impl.ReliabilityComplianceImpl <em>Reliability Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.ReliabilityComplianceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getReliabilityCompliance()
		 * @generated
		 */
		EClass RELIABILITY_COMPLIANCE = eINSTANCE.getReliabilityCompliance();

		/**
		 * The meta object literal for the '{@link qualities.impl.InstallabilityImpl <em>Installability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.InstallabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getInstallability()
		 * @generated
		 */
		EClass INSTALLABILITY = eINSTANCE.getInstallability();

		/**
		 * The meta object literal for the '{@link qualities.impl.ReliabilityImpl <em>Reliability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.ReliabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getReliability()
		 * @generated
		 */
		EClass RELIABILITY = eINSTANCE.getReliability();

		/**
		 * The meta object literal for the '{@link qualities.impl.CoExistenceImpl <em>Co Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.CoExistenceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getCoExistence()
		 * @generated
		 */
		EClass CO_EXISTENCE = eINSTANCE.getCoExistence();

		/**
		 * The meta object literal for the '{@link qualities.impl.OperabilityImpl <em>Operability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.OperabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getOperability()
		 * @generated
		 */
		EClass OPERABILITY = eINSTANCE.getOperability();

		/**
		 * The meta object literal for the '{@link qualities.impl.StabilityImpl <em>Stability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.StabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getStability()
		 * @generated
		 */
		EClass STABILITY = eINSTANCE.getStability();

		/**
		 * The meta object literal for the '{@link qualities.impl.MaintainabilityComplianceImpl <em>Maintainability Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.MaintainabilityComplianceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getMaintainabilityCompliance()
		 * @generated
		 */
		EClass MAINTAINABILITY_COMPLIANCE = eINSTANCE.getMaintainabilityCompliance();

		/**
		 * The meta object literal for the '{@link qualities.impl.PortabilityImpl <em>Portability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.PortabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getPortability()
		 * @generated
		 */
		EClass PORTABILITY = eINSTANCE.getPortability();

		/**
		 * The meta object literal for the '{@link qualities.impl.MaintainabilityImpl <em>Maintainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.MaintainabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getMaintainability()
		 * @generated
		 */
		EClass MAINTAINABILITY = eINSTANCE.getMaintainability();

		/**
		 * The meta object literal for the '{@link qualities.impl.MaturityImpl <em>Maturity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.MaturityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getMaturity()
		 * @generated
		 */
		EClass MATURITY = eINSTANCE.getMaturity();

		/**
		 * The meta object literal for the '{@link qualities.impl.AttractivenessImpl <em>Attractiveness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.AttractivenessImpl
		 * @see qualities.impl.QualitiesPackageImpl#getAttractiveness()
		 * @generated
		 */
		EClass ATTRACTIVENESS = eINSTANCE.getAttractiveness();

		/**
		 * The meta object literal for the '{@link qualities.impl.AnalyzabilityImpl <em>Analyzability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.AnalyzabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getAnalyzability()
		 * @generated
		 */
		EClass ANALYZABILITY = eINSTANCE.getAnalyzability();

		/**
		 * The meta object literal for the '{@link qualities.impl.ReplaceabilityImpl <em>Replaceability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.ReplaceabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getReplaceability()
		 * @generated
		 */
		EClass REPLACEABILITY = eINSTANCE.getReplaceability();

		/**
		 * The meta object literal for the '{@link qualities.impl.RecoverabilityImpl <em>Recoverability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.RecoverabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getRecoverability()
		 * @generated
		 */
		EClass RECOVERABILITY = eINSTANCE.getRecoverability();

		/**
		 * The meta object literal for the '{@link qualities.impl.UnderstandabilityImpl <em>Understandability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.UnderstandabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getUnderstandability()
		 * @generated
		 */
		EClass UNDERSTANDABILITY = eINSTANCE.getUnderstandability();

		/**
		 * The meta object literal for the '{@link qualities.impl.PortabilityComplianceImpl <em>Portability Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.PortabilityComplianceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getPortabilityCompliance()
		 * @generated
		 */
		EClass PORTABILITY_COMPLIANCE = eINSTANCE.getPortabilityCompliance();

		/**
		 * The meta object literal for the '{@link qualities.impl.RessourceUtilizationImpl <em>Ressource Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.RessourceUtilizationImpl
		 * @see qualities.impl.QualitiesPackageImpl#getRessourceUtilization()
		 * @generated
		 */
		EClass RESSOURCE_UTILIZATION = eINSTANCE.getRessourceUtilization();

		/**
		 * The meta object literal for the '{@link qualities.impl.ChangeabilityImpl <em>Changeability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.ChangeabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getChangeability()
		 * @generated
		 */
		EClass CHANGEABILITY = eINSTANCE.getChangeability();

		/**
		 * The meta object literal for the '{@link qualities.impl.InteroperabilityImpl <em>Interoperability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.InteroperabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getInteroperability()
		 * @generated
		 */
		EClass INTEROPERABILITY = eINSTANCE.getInteroperability();

		/**
		 * The meta object literal for the '{@link qualities.impl.FaultToleranceImpl <em>Fault Tolerance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.FaultToleranceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getFaultTolerance()
		 * @generated
		 */
		EClass FAULT_TOLERANCE = eINSTANCE.getFaultTolerance();

		/**
		 * The meta object literal for the '{@link qualities.impl.QualityTypeRepositoryImpl <em>Quality Type Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.QualityTypeRepositoryImpl
		 * @see qualities.impl.QualitiesPackageImpl#getQualityTypeRepository()
		 * @generated
		 */
		EClass QUALITY_TYPE_REPOSITORY = eINSTANCE.getQualityTypeRepository();

		/**
		 * The meta object literal for the '<em><b>Quality Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_TYPE_REPOSITORY__QUALITY_TYPE = eINSTANCE.getQualityTypeRepository_QualityType();

		/**
		 * The meta object literal for the '{@link qualities.impl.AdaptabilityImpl <em>Adaptability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.AdaptabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getAdaptability()
		 * @generated
		 */
		EClass ADAPTABILITY = eINSTANCE.getAdaptability();

		/**
		 * The meta object literal for the '{@link qualities.impl.FunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.FunctionalityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getFunctionality()
		 * @generated
		 */
		EClass FUNCTIONALITY = eINSTANCE.getFunctionality();

		/**
		 * The meta object literal for the '{@link qualities.impl.TimeBehaviourImpl <em>Time Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.TimeBehaviourImpl
		 * @see qualities.impl.QualitiesPackageImpl#getTimeBehaviour()
		 * @generated
		 */
		EClass TIME_BEHAVIOUR = eINSTANCE.getTimeBehaviour();

		/**
		 * The meta object literal for the '{@link qualities.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.SecurityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '{@link qualities.impl.AccuracyImpl <em>Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.AccuracyImpl
		 * @see qualities.impl.QualitiesPackageImpl#getAccuracy()
		 * @generated
		 */
		EClass ACCURACY = eINSTANCE.getAccuracy();

		/**
		 * The meta object literal for the '{@link qualities.impl.FunctionalityComplianceImpl <em>Functionality Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.FunctionalityComplianceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getFunctionalityCompliance()
		 * @generated
		 */
		EClass FUNCTIONALITY_COMPLIANCE = eINSTANCE.getFunctionalityCompliance();

		/**
		 * The meta object literal for the '{@link qualities.impl.EfficiencyImpl <em>Efficiency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.EfficiencyImpl
		 * @see qualities.impl.QualitiesPackageImpl#getEfficiency()
		 * @generated
		 */
		EClass EFFICIENCY = eINSTANCE.getEfficiency();

		/**
		 * The meta object literal for the '{@link qualities.impl.SafetyImpl <em>Safety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.SafetyImpl
		 * @see qualities.impl.QualitiesPackageImpl#getSafety()
		 * @generated
		 */
		EClass SAFETY = eINSTANCE.getSafety();

		/**
		 * The meta object literal for the '{@link qualities.impl.EfficiencyComplianceImpl <em>Efficiency Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.EfficiencyComplianceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getEfficiencyCompliance()
		 * @generated
		 */
		EClass EFFICIENCY_COMPLIANCE = eINSTANCE.getEfficiencyCompliance();

		/**
		 * The meta object literal for the '{@link qualities.impl.SuitabilityImpl <em>Suitability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.SuitabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getSuitability()
		 * @generated
		 */
		EClass SUITABILITY = eINSTANCE.getSuitability();

		/**
		 * The meta object literal for the '{@link qualities.impl.LearnabilityImpl <em>Learnability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.LearnabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getLearnability()
		 * @generated
		 */
		EClass LEARNABILITY = eINSTANCE.getLearnability();

		/**
		 * The meta object literal for the '{@link qualities.impl.QualityTypeImpl <em>Quality Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.QualityTypeImpl
		 * @see qualities.impl.QualitiesPackageImpl#getQualityType()
		 * @generated
		 */
		EClass QUALITY_TYPE = eINSTANCE.getQualityType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_TYPE__DESCRIPTION = eINSTANCE.getQualityType_Description();

		/**
		 * The meta object literal for the '<em><b>Quality Type Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_TYPE__QUALITY_TYPE_REPOSITORY = eINSTANCE.getQualityType_QualityTypeRepository();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_TYPE__DIMENSION = eINSTANCE.getQualityType_Dimension();

		/**
		 * The meta object literal for the '{@link qualities.impl.UsabilityImpl <em>Usability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.UsabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getUsability()
		 * @generated
		 */
		EClass USABILITY = eINSTANCE.getUsability();

		/**
		 * The meta object literal for the '{@link qualities.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.PerformanceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '{@link qualities.impl.TestabilityImpl <em>Testability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.TestabilityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getTestability()
		 * @generated
		 */
		EClass TESTABILITY = eINSTANCE.getTestability();

		/**
		 * The meta object literal for the '{@link qualities.impl.UsabilityComplianceImpl <em>Usability Compliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.UsabilityComplianceImpl
		 * @see qualities.impl.QualitiesPackageImpl#getUsabilityCompliance()
		 * @generated
		 */
		EClass USABILITY_COMPLIANCE = eINSTANCE.getUsabilityCompliance();

		/**
		 * The meta object literal for the '{@link qualities.impl.TextQualityImpl <em>Text Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualities.impl.TextQualityImpl
		 * @see qualities.impl.QualitiesPackageImpl#getTextQuality()
		 * @generated
		 */
		EClass TEXT_QUALITY = eINSTANCE.getTextQuality();

	}

} //QualitiesPackage
