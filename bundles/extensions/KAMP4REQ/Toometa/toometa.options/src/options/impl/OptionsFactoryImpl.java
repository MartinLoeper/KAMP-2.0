/**
 */
package options.impl;

import options.*;

import org.eclipse.emf.ecore.EClass;
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
public class OptionsFactoryImpl extends EFactoryImpl implements OptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OptionsFactory init() {
		try {
			OptionsFactory theOptionsFactory = (OptionsFactory)EPackage.Registry.INSTANCE.getEFactory(OptionsPackage.eNS_URI);
			if (theOptionsFactory != null) {
				return theOptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsFactoryImpl() {
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
			case OptionsPackage.TEXT_OPTION: return (EObject)createTextOption();
			case OptionsPackage.OPTION_REPOSITORY: return (EObject)createOptionRepository();
			case OptionsPackage.CONSTRAINT: return (EObject)createConstraint();
			case OptionsPackage.TEXT_RATIONALE: return (EObject)createTextRationale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOption createTextOption() {
		TextOptionImpl textOption = new TextOptionImpl();
		return textOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionRepository createOptionRepository() {
		OptionRepositoryImpl optionRepository = new OptionRepositoryImpl();
		return optionRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRationale createTextRationale() {
		TextRationaleImpl textRationale = new TextRationaleImpl();
		return textRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsPackage getOptionsPackage() {
		return (OptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OptionsPackage getPackage() {
		return OptionsPackage.eINSTANCE;
	}

} //OptionsFactoryImpl
