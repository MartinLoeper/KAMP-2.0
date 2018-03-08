/**
 */
package effects;

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
 * @see effects.EffectsFactory
 * @model kind="package"
 * @generated
 */
public interface EffectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "effects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toometa.de/effects/0.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "effects";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EffectsPackage eINSTANCE = effects.impl.EffectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link effects.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see effects.impl.EffectImpl
	 * @see effects.impl.EffectsPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__EFFECT_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link effects.impl.SimpleEffectImpl <em>Simple Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see effects.impl.SimpleEffectImpl
	 * @see effects.impl.EffectsPackageImpl#getSimpleEffect()
	 * @generated
	 */
	int SIMPLE_EFFECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EFFECT__ID = EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EFFECT__EFFECT_TYPE = EFFECT__EFFECT_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EFFECT__DESCRIPTION = EFFECT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Simple Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link effects.impl.EffectRepositoryImpl <em>Effect Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see effects.impl.EffectRepositoryImpl
	 * @see effects.impl.EffectsPackageImpl#getEffectRepository()
	 * @generated
	 */
	int EFFECT_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Known Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_REPOSITORY__KNOWN_EFFECTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effect Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_REPOSITORY__EFFECT_CATEGORIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Effect Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link effects.impl.EffectCategoryImpl <em>Effect Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see effects.impl.EffectCategoryImpl
	 * @see effects.impl.EffectsPackageImpl#getEffectCategory()
	 * @generated
	 */
	int EFFECT_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_CATEGORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The number of structural features of the '<em>Effect Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_CATEGORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link effects.impl.QualityEffectImpl <em>Quality Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see effects.impl.QualityEffectImpl
	 * @see effects.impl.EffectsPackageImpl#getQualityEffect()
	 * @generated
	 */
	int QUALITY_EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_EFFECT__ID = EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_EFFECT__EFFECT_TYPE = EFFECT__EFFECT_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_EFFECT__DESCRIPTION = EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Quality Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_EFFECT__QUALITY_TYPE = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link effects.impl.CategoryEffectImpl <em>Category Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see effects.impl.CategoryEffectImpl
	 * @see effects.impl.EffectsPackageImpl#getCategoryEffect()
	 * @generated
	 */
	int CATEGORY_EFFECT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_EFFECT__ID = EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_EFFECT__EFFECT_TYPE = EFFECT__EFFECT_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_EFFECT__DESCRIPTION = EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_EFFECT__CATEGORY = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link effects.EffectType <em>Effect Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see effects.EffectType
	 * @see effects.impl.EffectsPackageImpl#getEffectType()
	 * @generated
	 */
	int EFFECT_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link effects.SimpleEffect <em>Simple Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Effect</em>'.
	 * @see effects.SimpleEffect
	 * @generated
	 */
	EClass getSimpleEffect();

	/**
	 * Returns the meta object for class '{@link effects.EffectRepository <em>Effect Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect Repository</em>'.
	 * @see effects.EffectRepository
	 * @generated
	 */
	EClass getEffectRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link effects.EffectRepository#getKnownEffects <em>Known Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Known Effects</em>'.
	 * @see effects.EffectRepository#getKnownEffects()
	 * @see #getEffectRepository()
	 * @generated
	 */
	EReference getEffectRepository_KnownEffects();

	/**
	 * Returns the meta object for the containment reference list '{@link effects.EffectRepository#getEffectCategories <em>Effect Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect Categories</em>'.
	 * @see effects.EffectRepository#getEffectCategories()
	 * @see #getEffectRepository()
	 * @generated
	 */
	EReference getEffectRepository_EffectCategories();

	/**
	 * Returns the meta object for class '{@link effects.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see effects.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the attribute '{@link effects.Effect#getEffectType <em>Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Type</em>'.
	 * @see effects.Effect#getEffectType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_EffectType();

	/**
	 * Returns the meta object for the attribute '{@link effects.Effect#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see effects.Effect#getDescription()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Description();

	/**
	 * Returns the meta object for class '{@link effects.EffectCategory <em>Effect Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect Category</em>'.
	 * @see effects.EffectCategory
	 * @generated
	 */
	EClass getEffectCategory();

	/**
	 * Returns the meta object for class '{@link effects.QualityEffect <em>Quality Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Effect</em>'.
	 * @see effects.QualityEffect
	 * @generated
	 */
	EClass getQualityEffect();

	/**
	 * Returns the meta object for the reference '{@link effects.QualityEffect#getQualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quality Type</em>'.
	 * @see effects.QualityEffect#getQualityType()
	 * @see #getQualityEffect()
	 * @generated
	 */
	EReference getQualityEffect_QualityType();

	/**
	 * Returns the meta object for class '{@link effects.CategoryEffect <em>Category Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Effect</em>'.
	 * @see effects.CategoryEffect
	 * @generated
	 */
	EClass getCategoryEffect();

	/**
	 * Returns the meta object for the reference list '{@link effects.CategoryEffect#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see effects.CategoryEffect#getCategory()
	 * @see #getCategoryEffect()
	 * @generated
	 */
	EReference getCategoryEffect_Category();

	/**
	 * Returns the meta object for enum '{@link effects.EffectType <em>Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effect Type</em>'.
	 * @see effects.EffectType
	 * @generated
	 */
	EEnum getEffectType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EffectsFactory getEffectsFactory();

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
		 * The meta object literal for the '{@link effects.impl.SimpleEffectImpl <em>Simple Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see effects.impl.SimpleEffectImpl
		 * @see effects.impl.EffectsPackageImpl#getSimpleEffect()
		 * @generated
		 */
		EClass SIMPLE_EFFECT = eINSTANCE.getSimpleEffect();

		/**
		 * The meta object literal for the '{@link effects.impl.EffectRepositoryImpl <em>Effect Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see effects.impl.EffectRepositoryImpl
		 * @see effects.impl.EffectsPackageImpl#getEffectRepository()
		 * @generated
		 */
		EClass EFFECT_REPOSITORY = eINSTANCE.getEffectRepository();

		/**
		 * The meta object literal for the '<em><b>Known Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_REPOSITORY__KNOWN_EFFECTS = eINSTANCE.getEffectRepository_KnownEffects();

		/**
		 * The meta object literal for the '<em><b>Effect Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_REPOSITORY__EFFECT_CATEGORIES = eINSTANCE.getEffectRepository_EffectCategories();

		/**
		 * The meta object literal for the '{@link effects.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see effects.impl.EffectImpl
		 * @see effects.impl.EffectsPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '<em><b>Effect Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__EFFECT_TYPE = eINSTANCE.getEffect_EffectType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DESCRIPTION = eINSTANCE.getEffect_Description();

		/**
		 * The meta object literal for the '{@link effects.impl.EffectCategoryImpl <em>Effect Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see effects.impl.EffectCategoryImpl
		 * @see effects.impl.EffectsPackageImpl#getEffectCategory()
		 * @generated
		 */
		EClass EFFECT_CATEGORY = eINSTANCE.getEffectCategory();

		/**
		 * The meta object literal for the '{@link effects.impl.QualityEffectImpl <em>Quality Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see effects.impl.QualityEffectImpl
		 * @see effects.impl.EffectsPackageImpl#getQualityEffect()
		 * @generated
		 */
		EClass QUALITY_EFFECT = eINSTANCE.getQualityEffect();

		/**
		 * The meta object literal for the '<em><b>Quality Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_EFFECT__QUALITY_TYPE = eINSTANCE.getQualityEffect_QualityType();

		/**
		 * The meta object literal for the '{@link effects.impl.CategoryEffectImpl <em>Category Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see effects.impl.CategoryEffectImpl
		 * @see effects.impl.EffectsPackageImpl#getCategoryEffect()
		 * @generated
		 */
		EClass CATEGORY_EFFECT = eINSTANCE.getCategoryEffect();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_EFFECT__CATEGORY = eINSTANCE.getCategoryEffect_Category();

		/**
		 * The meta object literal for the '{@link effects.EffectType <em>Effect Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see effects.EffectType
		 * @see effects.impl.EffectsPackageImpl#getEffectType()
		 * @generated
		 */
		EEnum EFFECT_TYPE = eINSTANCE.getEffectType();

	}

} //EffectsPackage
