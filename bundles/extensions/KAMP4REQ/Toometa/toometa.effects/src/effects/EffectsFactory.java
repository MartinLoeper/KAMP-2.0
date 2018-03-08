/**
 */
package effects;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see effects.EffectsPackage
 * @generated
 */
public interface EffectsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EffectsFactory eINSTANCE = effects.impl.EffectsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Effect</em>'.
	 * @generated
	 */
	SimpleEffect createSimpleEffect();

	/**
	 * Returns a new object of class '<em>Effect Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Repository</em>'.
	 * @generated
	 */
	EffectRepository createEffectRepository();

	/**
	 * Returns a new object of class '<em>Effect Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Category</em>'.
	 * @generated
	 */
	EffectCategory createEffectCategory();

	/**
	 * Returns a new object of class '<em>Quality Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Effect</em>'.
	 * @generated
	 */
	QualityEffect createQualityEffect();

	/**
	 * Returns a new object of class '<em>Category Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Effect</em>'.
	 * @generated
	 */
	CategoryEffect createCategoryEffect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EffectsPackage getEffectsPackage();

} //EffectsFactory
