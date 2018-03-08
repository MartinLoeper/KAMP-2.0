/**
 */
package decisions.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import decisions.Decision;
import decisions.DecisionRepository;
import decisions.DecisionStatusEnum;
import decisions.DecisionsFactory;
import decisions.DecisionsPackage;
import decisions.Rationale;
import decisions.TextDecision;
import decisions.TextRationale;

import glossary.GlossaryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import relations.RelationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionsPackageImpl extends EPackageImpl implements DecisionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionStatusEnumEEnum = null;

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
	 * @see decisions.DecisionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DecisionsPackageImpl() {
		super(eNS_URI, DecisionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DecisionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DecisionsPackage init() {
		if (isInited) return (DecisionsPackage)EPackage.Registry.INSTANCE.getEPackage(DecisionsPackage.eNS_URI);

		// Obtain or create and register package
		DecisionsPackageImpl theDecisionsPackage = (DecisionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DecisionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DecisionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GlossaryPackage.eINSTANCE.eClass();
		RelationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDecisionsPackage.createPackageContents();

		// Initialize created meta-data
		theDecisionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDecisionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DecisionsPackage.eNS_URI, theDecisionsPackage);
		return theDecisionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionRepository() {
		return decisionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionRepository_Decisions() {
		return (EReference)decisionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Rationales() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Description() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Status() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Timestamp() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Repository() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_UsedTerms() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationale_Description() {
		return (EAttribute)rationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextDecision() {
		return textDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextRationale() {
		return textRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecisionStatusEnum() {
		return decisionStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionsFactory getDecisionsFactory() {
		return (DecisionsFactory)getEFactoryInstance();
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
		decisionRepositoryEClass = createEClass(DECISION_REPOSITORY);
		createEReference(decisionRepositoryEClass, DECISION_REPOSITORY__DECISIONS);

		decisionEClass = createEClass(DECISION);
		createEReference(decisionEClass, DECISION__RATIONALES);
		createEAttribute(decisionEClass, DECISION__DESCRIPTION);
		createEAttribute(decisionEClass, DECISION__STATUS);
		createEAttribute(decisionEClass, DECISION__TIMESTAMP);
		createEReference(decisionEClass, DECISION__REPOSITORY);
		createEReference(decisionEClass, DECISION__USED_TERMS);

		rationaleEClass = createEClass(RATIONALE);
		createEAttribute(rationaleEClass, RATIONALE__DESCRIPTION);

		textDecisionEClass = createEClass(TEXT_DECISION);

		textRationaleEClass = createEClass(TEXT_RATIONALE);

		// Create enums
		decisionStatusEnumEEnum = createEEnum(DECISION_STATUS_ENUM);
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
		RelationsPackage theRelationsPackage = (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		decisionRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		decisionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		decisionEClass.getESuperTypes().add(theRelationsPackage.getTraceableObject());
		rationaleEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		textDecisionEClass.getESuperTypes().add(this.getDecision());
		textRationaleEClass.getESuperTypes().add(this.getRationale());

		// Initialize classes and features; add operations and parameters
		initEClass(decisionRepositoryEClass, DecisionRepository.class, "DecisionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionRepository_Decisions(), this.getDecision(), this.getDecision_Repository(), "decisions", null, 0, -1, DecisionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecision_Rationales(), this.getRationale(), null, "rationales", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Description(), ecorePackage.getEString(), "description", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Status(), this.getDecisionStatusEnum(), "status", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Repository(), this.getDecisionRepository(), this.getDecisionRepository_Decisions(), "repository", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_UsedTerms(), theGlossaryPackage.getGlossaryTerm(), null, "usedTerms", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationaleEClass, Rationale.class, "Rationale", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRationale_Description(), ecorePackage.getEString(), "description", null, 1, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textDecisionEClass, TextDecision.class, "TextDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textRationaleEClass, TextRationale.class, "TextRationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(decisionStatusEnumEEnum, DecisionStatusEnum.class, "DecisionStatusEnum");
		addEEnumLiteral(decisionStatusEnumEEnum, DecisionStatusEnum.OPEN);
		addEEnumLiteral(decisionStatusEnumEEnum, DecisionStatusEnum.TAKEN);
		addEEnumLiteral(decisionStatusEnumEEnum, DecisionStatusEnum.REVIEWED);
		addEEnumLiteral(decisionStatusEnumEEnum, DecisionStatusEnum.OBSOLETE);
		addEEnumLiteral(decisionStatusEnumEEnum, DecisionStatusEnum.REPLACED);
		addEEnumLiteral(decisionStatusEnumEEnum, DecisionStatusEnum.IN_CONFLICT);

		// Create resource
		createResource(eNS_URI);
	}

} //DecisionsPackageImpl
