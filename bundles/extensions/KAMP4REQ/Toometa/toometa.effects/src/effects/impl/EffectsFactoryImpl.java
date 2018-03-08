/**
 */
package effects.impl;

import effects.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EffectsFactoryImpl extends EFactoryImpl implements EffectsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffectsFactory init() {
		try {
			EffectsFactory theEffectsFactory = (EffectsFactory)EPackage.Registry.INSTANCE.getEFactory(EffectsPackage.eNS_URI);
			if (theEffectsFactory != null) {
				return theEffectsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EffectsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectsFactoryImpl() {
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
			case EffectsPackage.SIMPLE_EFFECT: return (EObject)createSimpleEffect();
			case EffectsPackage.EFFECT_REPOSITORY: return (EObject)createEffectRepository();
			case EffectsPackage.EFFECT_CATEGORY: return (EObject)createEffectCategory();
			case EffectsPackage.QUALITY_EFFECT: return (EObject)createQualityEffect();
			case EffectsPackage.CATEGORY_EFFECT: return (EObject)createCategoryEffect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EffectsPackage.EFFECT_TYPE:
				return createEffectTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EffectsPackage.EFFECT_TYPE:
				return convertEffectTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEffect createSimpleEffect() {
		SimpleEffectImpl simpleEffect = new SimpleEffectImpl();
		return simpleEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectRepository createEffectRepository() {
		EffectRepositoryImpl effectRepository = new EffectRepositoryImpl();
		return effectRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectCategory createEffectCategory() {
		EffectCategoryImpl effectCategory = new EffectCategoryImpl();
		return effectCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityEffect createQualityEffect() {
		QualityEffectImpl qualityEffect = new QualityEffectImpl();
		return qualityEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryEffect createCategoryEffect() {
		CategoryEffectImpl categoryEffect = new CategoryEffectImpl();
		return categoryEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectType createEffectTypeFromString(EDataType eDataType, String initialValue) {
		EffectType result = EffectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectsPackage getEffectsPackage() {
		return (EffectsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EffectsPackage getPackage() {
		return EffectsPackage.eINSTANCE;
	}

} //EffectsFactoryImpl
