/**
 */
package qualities.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualities.Accuracy;
import qualities.Adaptability;
import qualities.Analyzability;
import qualities.Attractiveness;
import qualities.Changeability;
import qualities.CoExistence;
import qualities.Efficiency;
import qualities.EfficiencyCompliance;
import qualities.FaultTolerance;
import qualities.Functionality;
import qualities.FunctionalityCompliance;
import qualities.Installability;
import qualities.Interoperability;
import qualities.Learnability;
import qualities.Maintainability;
import qualities.MaintainabilityCompliance;
import qualities.Maturity;
import qualities.Operability;
import qualities.Performance;
import qualities.Portability;
import qualities.PortabilityCompliance;
import qualities.QualitiesFactory;
import qualities.QualitiesPackage;
import qualities.QualityType;
import qualities.QualityTypeRepository;
import qualities.Recoverability;
import qualities.Reliability;
import qualities.ReliabilityCompliance;
import qualities.Replaceability;
import qualities.RessourceUtilization;
import qualities.Safety;
import qualities.Security;
import qualities.Stability;
import qualities.Suitability;
import qualities.Testability;
import qualities.TextQuality;
import qualities.TimeBehaviour;
import qualities.Understandability;
import qualities.Usability;
import qualities.UsabilityCompliance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitiesPackageImpl extends EPackageImpl implements QualitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainabilityComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maturityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attractivenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoverabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass understandabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portabilityComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceUtilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interoperabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultToleranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityTypeRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accuracyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalityComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass efficiencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass efficiencyComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suitabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learnabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usabilityComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textQualityEClass = null;

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
	 * @see qualities.QualitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualitiesPackageImpl() {
		super(eNS_URI, QualitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QualitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualitiesPackage init() {
		if (isInited) return (QualitiesPackage)EPackage.Registry.INSTANCE.getEPackage(QualitiesPackage.eNS_URI);

		// Obtain or create and register package
		QualitiesPackageImpl theQualitiesPackage = (QualitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualitiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DimensionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQualitiesPackage.createPackageContents();

		// Initialize created meta-data
		theQualitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualitiesPackage.eNS_URI, theQualitiesPackage);
		return theQualitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliabilityCompliance() {
		return reliabilityComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstallability() {
		return installabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliability() {
		return reliabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoExistence() {
		return coExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperability() {
		return operabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStability() {
		return stabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintainabilityCompliance() {
		return maintainabilityComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortability() {
		return portabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintainability() {
		return maintainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaturity() {
		return maturityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttractiveness() {
		return attractivenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyzability() {
		return analyzabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceability() {
		return replaceabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecoverability() {
		return recoverabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnderstandability() {
		return understandabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortabilityCompliance() {
		return portabilityComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourceUtilization() {
		return ressourceUtilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeability() {
		return changeabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteroperability() {
		return interoperabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultTolerance() {
		return faultToleranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityTypeRepository() {
		return qualityTypeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityTypeRepository_QualityType() {
		return (EReference)qualityTypeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptability() {
		return adaptabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionality() {
		return functionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBehaviour() {
		return timeBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccuracy() {
		return accuracyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalityCompliance() {
		return functionalityComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEfficiency() {
		return efficiencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafety() {
		return safetyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEfficiencyCompliance() {
		return efficiencyComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuitability() {
		return suitabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearnability() {
		return learnabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityType() {
		return qualityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityType_Description() {
		return (EAttribute)qualityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityType_QualityTypeRepository() {
		return (EReference)qualityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityType_Dimension() {
		return (EReference)qualityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsability() {
		return usabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformance() {
		return performanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestability() {
		return testabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsabilityCompliance() {
		return usabilityComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextQuality() {
		return textQualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitiesFactory getQualitiesFactory() {
		return (QualitiesFactory)getEFactoryInstance();
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
		reliabilityComplianceEClass = createEClass(RELIABILITY_COMPLIANCE);

		installabilityEClass = createEClass(INSTALLABILITY);

		reliabilityEClass = createEClass(RELIABILITY);

		coExistenceEClass = createEClass(CO_EXISTENCE);

		operabilityEClass = createEClass(OPERABILITY);

		stabilityEClass = createEClass(STABILITY);

		maintainabilityComplianceEClass = createEClass(MAINTAINABILITY_COMPLIANCE);

		portabilityEClass = createEClass(PORTABILITY);

		maintainabilityEClass = createEClass(MAINTAINABILITY);

		maturityEClass = createEClass(MATURITY);

		attractivenessEClass = createEClass(ATTRACTIVENESS);

		analyzabilityEClass = createEClass(ANALYZABILITY);

		replaceabilityEClass = createEClass(REPLACEABILITY);

		recoverabilityEClass = createEClass(RECOVERABILITY);

		understandabilityEClass = createEClass(UNDERSTANDABILITY);

		portabilityComplianceEClass = createEClass(PORTABILITY_COMPLIANCE);

		ressourceUtilizationEClass = createEClass(RESSOURCE_UTILIZATION);

		changeabilityEClass = createEClass(CHANGEABILITY);

		interoperabilityEClass = createEClass(INTEROPERABILITY);

		faultToleranceEClass = createEClass(FAULT_TOLERANCE);

		qualityTypeRepositoryEClass = createEClass(QUALITY_TYPE_REPOSITORY);
		createEReference(qualityTypeRepositoryEClass, QUALITY_TYPE_REPOSITORY__QUALITY_TYPE);

		adaptabilityEClass = createEClass(ADAPTABILITY);

		functionalityEClass = createEClass(FUNCTIONALITY);

		timeBehaviourEClass = createEClass(TIME_BEHAVIOUR);

		securityEClass = createEClass(SECURITY);

		accuracyEClass = createEClass(ACCURACY);

		functionalityComplianceEClass = createEClass(FUNCTIONALITY_COMPLIANCE);

		efficiencyEClass = createEClass(EFFICIENCY);

		safetyEClass = createEClass(SAFETY);

		efficiencyComplianceEClass = createEClass(EFFICIENCY_COMPLIANCE);

		suitabilityEClass = createEClass(SUITABILITY);

		learnabilityEClass = createEClass(LEARNABILITY);

		qualityTypeEClass = createEClass(QUALITY_TYPE);
		createEAttribute(qualityTypeEClass, QUALITY_TYPE__DESCRIPTION);
		createEReference(qualityTypeEClass, QUALITY_TYPE__QUALITY_TYPE_REPOSITORY);
		createEReference(qualityTypeEClass, QUALITY_TYPE__DIMENSION);

		usabilityEClass = createEClass(USABILITY);

		performanceEClass = createEClass(PERFORMANCE);

		testabilityEClass = createEClass(TESTABILITY);

		usabilityComplianceEClass = createEClass(USABILITY_COMPLIANCE);

		textQualityEClass = createEClass(TEXT_QUALITY);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		DimensionsPackage theDimensionsPackage = (DimensionsPackage)EPackage.Registry.INSTANCE.getEPackage(DimensionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reliabilityComplianceEClass.getESuperTypes().add(this.getReliability());
		installabilityEClass.getESuperTypes().add(this.getPortability());
		reliabilityEClass.getESuperTypes().add(this.getQualityType());
		coExistenceEClass.getESuperTypes().add(this.getPortability());
		operabilityEClass.getESuperTypes().add(this.getUsability());
		stabilityEClass.getESuperTypes().add(this.getMaintainability());
		maintainabilityComplianceEClass.getESuperTypes().add(this.getMaintainability());
		portabilityEClass.getESuperTypes().add(this.getQualityType());
		maintainabilityEClass.getESuperTypes().add(this.getQualityType());
		maturityEClass.getESuperTypes().add(this.getReliability());
		attractivenessEClass.getESuperTypes().add(this.getUsability());
		analyzabilityEClass.getESuperTypes().add(this.getMaintainability());
		replaceabilityEClass.getESuperTypes().add(this.getPortability());
		recoverabilityEClass.getESuperTypes().add(this.getReliability());
		understandabilityEClass.getESuperTypes().add(this.getUsability());
		portabilityComplianceEClass.getESuperTypes().add(this.getPortability());
		ressourceUtilizationEClass.getESuperTypes().add(this.getEfficiency());
		changeabilityEClass.getESuperTypes().add(this.getMaintainability());
		interoperabilityEClass.getESuperTypes().add(this.getFunctionality());
		faultToleranceEClass.getESuperTypes().add(this.getReliability());
		qualityTypeRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		adaptabilityEClass.getESuperTypes().add(this.getPortability());
		functionalityEClass.getESuperTypes().add(this.getQualityType());
		timeBehaviourEClass.getESuperTypes().add(this.getEfficiency());
		securityEClass.getESuperTypes().add(this.getFunctionality());
		accuracyEClass.getESuperTypes().add(this.getFunctionality());
		functionalityComplianceEClass.getESuperTypes().add(this.getFunctionality());
		efficiencyEClass.getESuperTypes().add(this.getQualityType());
		safetyEClass.getESuperTypes().add(this.getQualityType());
		efficiencyComplianceEClass.getESuperTypes().add(this.getEfficiency());
		suitabilityEClass.getESuperTypes().add(this.getFunctionality());
		learnabilityEClass.getESuperTypes().add(this.getUsability());
		qualityTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		usabilityEClass.getESuperTypes().add(this.getQualityType());
		performanceEClass.getESuperTypes().add(this.getQualityType());
		testabilityEClass.getESuperTypes().add(this.getMaintainability());
		usabilityComplianceEClass.getESuperTypes().add(this.getUsability());
		textQualityEClass.getESuperTypes().add(this.getQualityType());

		// Initialize classes and features; add operations and parameters
		initEClass(reliabilityComplianceEClass, ReliabilityCompliance.class, "ReliabilityCompliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(installabilityEClass, Installability.class, "Installability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reliabilityEClass, Reliability.class, "Reliability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coExistenceEClass, CoExistence.class, "CoExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operabilityEClass, Operability.class, "Operability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stabilityEClass, Stability.class, "Stability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintainabilityComplianceEClass, MaintainabilityCompliance.class, "MaintainabilityCompliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portabilityEClass, Portability.class, "Portability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintainabilityEClass, Maintainability.class, "Maintainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maturityEClass, Maturity.class, "Maturity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attractivenessEClass, Attractiveness.class, "Attractiveness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analyzabilityEClass, Analyzability.class, "Analyzability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replaceabilityEClass, Replaceability.class, "Replaceability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recoverabilityEClass, Recoverability.class, "Recoverability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(understandabilityEClass, Understandability.class, "Understandability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portabilityComplianceEClass, PortabilityCompliance.class, "PortabilityCompliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ressourceUtilizationEClass, RessourceUtilization.class, "RessourceUtilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeabilityEClass, Changeability.class, "Changeability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interoperabilityEClass, Interoperability.class, "Interoperability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(faultToleranceEClass, FaultTolerance.class, "FaultTolerance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityTypeRepositoryEClass, QualityTypeRepository.class, "QualityTypeRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityTypeRepository_QualityType(), this.getQualityType(), this.getQualityType_QualityTypeRepository(), "qualityType", null, 0, -1, QualityTypeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptabilityEClass, Adaptability.class, "Adaptability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalityEClass, Functionality.class, "Functionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeBehaviourEClass, TimeBehaviour.class, "TimeBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accuracyEClass, Accuracy.class, "Accuracy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalityComplianceEClass, FunctionalityCompliance.class, "FunctionalityCompliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(efficiencyEClass, Efficiency.class, "Efficiency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(safetyEClass, Safety.class, "Safety", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(efficiencyComplianceEClass, EfficiencyCompliance.class, "EfficiencyCompliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suitabilityEClass, Suitability.class, "Suitability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(learnabilityEClass, Learnability.class, "Learnability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityTypeEClass, QualityType.class, "QualityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualityType_Description(), ecorePackage.getEString(), "description", null, 0, 1, QualityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityType_QualityTypeRepository(), this.getQualityTypeRepository(), this.getQualityTypeRepository_QualityType(), "qualityTypeRepository", null, 1, 1, QualityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityType_Dimension(), theDimensionsPackage.getDimension(), null, "dimension", null, 0, 1, QualityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usabilityEClass, Usability.class, "Usability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(performanceEClass, Performance.class, "Performance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testabilityEClass, Testability.class, "Testability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usabilityComplianceEClass, UsabilityCompliance.class, "UsabilityCompliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textQualityEClass, TextQuality.class, "TextQuality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //QualitiesPackageImpl
