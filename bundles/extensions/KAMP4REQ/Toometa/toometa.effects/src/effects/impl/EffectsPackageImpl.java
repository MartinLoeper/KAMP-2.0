/**
 */
package effects.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import effects.CategoryEffect;
import effects.Effect;
import effects.EffectCategory;
import effects.EffectRepository;
import effects.EffectType;
import effects.EffectsFactory;
import effects.EffectsPackage;
import effects.QualityEffect;
import effects.SimpleEffect;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualities.QualitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EffectsPackageImpl extends EPackageImpl implements EffectsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effectTypeEEnum = null;

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
	 * @see effects.EffectsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EffectsPackageImpl() {
		super(eNS_URI, EffectsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EffectsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EffectsPackage init() {
		if (isInited) return (EffectsPackage)EPackage.Registry.INSTANCE.getEPackage(EffectsPackage.eNS_URI);

		// Obtain or create and register package
		EffectsPackageImpl theEffectsPackage = (EffectsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EffectsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EffectsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QualitiesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEffectsPackage.createPackageContents();

		// Initialize created meta-data
		theEffectsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEffectsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EffectsPackage.eNS_URI, theEffectsPackage);
		return theEffectsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleEffect() {
		return simpleEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectRepository() {
		return effectRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectRepository_KnownEffects() {
		return (EReference)effectRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectRepository_EffectCategories() {
		return (EReference)effectRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffect() {
		return effectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_EffectType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Description() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectCategory() {
		return effectCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityEffect() {
		return qualityEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityEffect_QualityType() {
		return (EReference)qualityEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryEffect() {
		return categoryEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryEffect_Category() {
		return (EReference)categoryEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEffectType() {
		return effectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectsFactory getEffectsFactory() {
		return (EffectsFactory)getEFactoryInstance();
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
		simpleEffectEClass = createEClass(SIMPLE_EFFECT);

		effectRepositoryEClass = createEClass(EFFECT_REPOSITORY);
		createEReference(effectRepositoryEClass, EFFECT_REPOSITORY__KNOWN_EFFECTS);
		createEReference(effectRepositoryEClass, EFFECT_REPOSITORY__EFFECT_CATEGORIES);

		effectEClass = createEClass(EFFECT);
		createEAttribute(effectEClass, EFFECT__EFFECT_TYPE);
		createEAttribute(effectEClass, EFFECT__DESCRIPTION);

		effectCategoryEClass = createEClass(EFFECT_CATEGORY);

		qualityEffectEClass = createEClass(QUALITY_EFFECT);
		createEReference(qualityEffectEClass, QUALITY_EFFECT__QUALITY_TYPE);

		categoryEffectEClass = createEClass(CATEGORY_EFFECT);
		createEReference(categoryEffectEClass, CATEGORY_EFFECT__CATEGORY);

		// Create enums
		effectTypeEEnum = createEEnum(EFFECT_TYPE);
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
		QualitiesPackage theQualitiesPackage = (QualitiesPackage)EPackage.Registry.INSTANCE.getEPackage(QualitiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleEffectEClass.getESuperTypes().add(this.getEffect());
		effectRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		effectEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		effectCategoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		qualityEffectEClass.getESuperTypes().add(this.getEffect());
		categoryEffectEClass.getESuperTypes().add(this.getEffect());

		// Initialize classes and features; add operations and parameters
		initEClass(simpleEffectEClass, SimpleEffect.class, "SimpleEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(effectRepositoryEClass, EffectRepository.class, "EffectRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectRepository_KnownEffects(), this.getEffect(), null, "knownEffects", null, 0, -1, EffectRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectRepository_EffectCategories(), this.getEffectCategory(), null, "effectCategories", null, 0, -1, EffectRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectEClass, Effect.class, "Effect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffect_EffectType(), this.getEffectType(), "EffectType", "neutral", 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Description(), ecorePackage.getEString(), "description", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectCategoryEClass, EffectCategory.class, "EffectCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityEffectEClass, QualityEffect.class, "QualityEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityEffect_QualityType(), theQualitiesPackage.getQualityType(), null, "qualityType", null, 1, 1, QualityEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEffectEClass, CategoryEffect.class, "CategoryEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryEffect_Category(), this.getEffectCategory(), null, "category", null, 0, -1, CategoryEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(effectTypeEEnum, EffectType.class, "EffectType");
		addEEnumLiteral(effectTypeEEnum, EffectType.NEUTRAL);
		addEEnumLiteral(effectTypeEEnum, EffectType.POSITIVE);
		addEEnumLiteral(effectTypeEEnum, EffectType.NEGATIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //EffectsPackageImpl
