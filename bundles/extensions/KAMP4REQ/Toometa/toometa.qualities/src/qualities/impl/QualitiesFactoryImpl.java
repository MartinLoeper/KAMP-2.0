/**
 */
package qualities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualities.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitiesFactoryImpl extends EFactoryImpl implements QualitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualitiesFactory init() {
		try {
			QualitiesFactory theQualitiesFactory = (QualitiesFactory)EPackage.Registry.INSTANCE.getEFactory(QualitiesPackage.eNS_URI);
			if (theQualitiesFactory != null) {
				return theQualitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitiesFactoryImpl() {
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
			case QualitiesPackage.RELIABILITY_COMPLIANCE: return (EObject)createReliabilityCompliance();
			case QualitiesPackage.INSTALLABILITY: return (EObject)createInstallability();
			case QualitiesPackage.RELIABILITY: return (EObject)createReliability();
			case QualitiesPackage.CO_EXISTENCE: return (EObject)createCoExistence();
			case QualitiesPackage.OPERABILITY: return (EObject)createOperability();
			case QualitiesPackage.STABILITY: return (EObject)createStability();
			case QualitiesPackage.MAINTAINABILITY_COMPLIANCE: return (EObject)createMaintainabilityCompliance();
			case QualitiesPackage.PORTABILITY: return (EObject)createPortability();
			case QualitiesPackage.MAINTAINABILITY: return (EObject)createMaintainability();
			case QualitiesPackage.MATURITY: return (EObject)createMaturity();
			case QualitiesPackage.ATTRACTIVENESS: return (EObject)createAttractiveness();
			case QualitiesPackage.ANALYZABILITY: return (EObject)createAnalyzability();
			case QualitiesPackage.REPLACEABILITY: return (EObject)createReplaceability();
			case QualitiesPackage.RECOVERABILITY: return (EObject)createRecoverability();
			case QualitiesPackage.UNDERSTANDABILITY: return (EObject)createUnderstandability();
			case QualitiesPackage.PORTABILITY_COMPLIANCE: return (EObject)createPortabilityCompliance();
			case QualitiesPackage.RESSOURCE_UTILIZATION: return (EObject)createRessourceUtilization();
			case QualitiesPackage.CHANGEABILITY: return (EObject)createChangeability();
			case QualitiesPackage.INTEROPERABILITY: return (EObject)createInteroperability();
			case QualitiesPackage.FAULT_TOLERANCE: return (EObject)createFaultTolerance();
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY: return (EObject)createQualityTypeRepository();
			case QualitiesPackage.ADAPTABILITY: return (EObject)createAdaptability();
			case QualitiesPackage.FUNCTIONALITY: return (EObject)createFunctionality();
			case QualitiesPackage.TIME_BEHAVIOUR: return (EObject)createTimeBehaviour();
			case QualitiesPackage.SECURITY: return (EObject)createSecurity();
			case QualitiesPackage.ACCURACY: return (EObject)createAccuracy();
			case QualitiesPackage.FUNCTIONALITY_COMPLIANCE: return (EObject)createFunctionalityCompliance();
			case QualitiesPackage.EFFICIENCY: return (EObject)createEfficiency();
			case QualitiesPackage.SAFETY: return (EObject)createSafety();
			case QualitiesPackage.EFFICIENCY_COMPLIANCE: return (EObject)createEfficiencyCompliance();
			case QualitiesPackage.SUITABILITY: return (EObject)createSuitability();
			case QualitiesPackage.LEARNABILITY: return (EObject)createLearnability();
			case QualitiesPackage.USABILITY: return (EObject)createUsability();
			case QualitiesPackage.PERFORMANCE: return (EObject)createPerformance();
			case QualitiesPackage.TESTABILITY: return (EObject)createTestability();
			case QualitiesPackage.USABILITY_COMPLIANCE: return (EObject)createUsabilityCompliance();
			case QualitiesPackage.TEXT_QUALITY: return (EObject)createTextQuality();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityCompliance createReliabilityCompliance() {
		ReliabilityComplianceImpl reliabilityCompliance = new ReliabilityComplianceImpl();
		return reliabilityCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Installability createInstallability() {
		InstallabilityImpl installability = new InstallabilityImpl();
		return installability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliability createReliability() {
		ReliabilityImpl reliability = new ReliabilityImpl();
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoExistence createCoExistence() {
		CoExistenceImpl coExistence = new CoExistenceImpl();
		return coExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operability createOperability() {
		OperabilityImpl operability = new OperabilityImpl();
		return operability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stability createStability() {
		StabilityImpl stability = new StabilityImpl();
		return stability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainabilityCompliance createMaintainabilityCompliance() {
		MaintainabilityComplianceImpl maintainabilityCompliance = new MaintainabilityComplianceImpl();
		return maintainabilityCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Portability createPortability() {
		PortabilityImpl portability = new PortabilityImpl();
		return portability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maintainability createMaintainability() {
		MaintainabilityImpl maintainability = new MaintainabilityImpl();
		return maintainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maturity createMaturity() {
		MaturityImpl maturity = new MaturityImpl();
		return maturity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attractiveness createAttractiveness() {
		AttractivenessImpl attractiveness = new AttractivenessImpl();
		return attractiveness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyzability createAnalyzability() {
		AnalyzabilityImpl analyzability = new AnalyzabilityImpl();
		return analyzability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replaceability createReplaceability() {
		ReplaceabilityImpl replaceability = new ReplaceabilityImpl();
		return replaceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recoverability createRecoverability() {
		RecoverabilityImpl recoverability = new RecoverabilityImpl();
		return recoverability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Understandability createUnderstandability() {
		UnderstandabilityImpl understandability = new UnderstandabilityImpl();
		return understandability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortabilityCompliance createPortabilityCompliance() {
		PortabilityComplianceImpl portabilityCompliance = new PortabilityComplianceImpl();
		return portabilityCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceUtilization createRessourceUtilization() {
		RessourceUtilizationImpl ressourceUtilization = new RessourceUtilizationImpl();
		return ressourceUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Changeability createChangeability() {
		ChangeabilityImpl changeability = new ChangeabilityImpl();
		return changeability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interoperability createInteroperability() {
		InteroperabilityImpl interoperability = new InteroperabilityImpl();
		return interoperability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTolerance createFaultTolerance() {
		FaultToleranceImpl faultTolerance = new FaultToleranceImpl();
		return faultTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeRepository createQualityTypeRepository() {
		QualityTypeRepositoryImpl qualityTypeRepository = new QualityTypeRepositoryImpl();
		return qualityTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adaptability createAdaptability() {
		AdaptabilityImpl adaptability = new AdaptabilityImpl();
		return adaptability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functionality createFunctionality() {
		FunctionalityImpl functionality = new FunctionalityImpl();
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBehaviour createTimeBehaviour() {
		TimeBehaviourImpl timeBehaviour = new TimeBehaviourImpl();
		return timeBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accuracy createAccuracy() {
		AccuracyImpl accuracy = new AccuracyImpl();
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalityCompliance createFunctionalityCompliance() {
		FunctionalityComplianceImpl functionalityCompliance = new FunctionalityComplianceImpl();
		return functionalityCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Efficiency createEfficiency() {
		EfficiencyImpl efficiency = new EfficiencyImpl();
		return efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safety createSafety() {
		SafetyImpl safety = new SafetyImpl();
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EfficiencyCompliance createEfficiencyCompliance() {
		EfficiencyComplianceImpl efficiencyCompliance = new EfficiencyComplianceImpl();
		return efficiencyCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suitability createSuitability() {
		SuitabilityImpl suitability = new SuitabilityImpl();
		return suitability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Learnability createLearnability() {
		LearnabilityImpl learnability = new LearnabilityImpl();
		return learnability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usability createUsability() {
		UsabilityImpl usability = new UsabilityImpl();
		return usability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance createPerformance() {
		PerformanceImpl performance = new PerformanceImpl();
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testability createTestability() {
		TestabilityImpl testability = new TestabilityImpl();
		return testability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityCompliance createUsabilityCompliance() {
		UsabilityComplianceImpl usabilityCompliance = new UsabilityComplianceImpl();
		return usabilityCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextQuality createTextQuality() {
		TextQualityImpl textQuality = new TextQualityImpl();
		return textQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitiesPackage getQualitiesPackage() {
		return (QualitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualitiesPackage getPackage() {
		return QualitiesPackage.eINSTANCE;
	}

} //QualitiesFactoryImpl
