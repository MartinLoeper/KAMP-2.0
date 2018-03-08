/**
 */
package pcmbpoptions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcmbpoptions.PcmbpoptionsPackage
 * @generated
 */
public interface PcmbpoptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmbpoptionsFactory eINSTANCE = pcmbpoptions.impl.PcmbpoptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM Introduce New Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Introduce New Entity</em>'.
	 * @generated
	 */
	PCM_IntroduceNewEntity createPCM_IntroduceNewEntity();

	/**
	 * Returns a new object of class '<em>PCM Change Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Change Entity</em>'.
	 * @generated
	 */
	PCM_ChangeEntity createPCM_ChangeEntity();

	/**
	 * Returns a new object of class '<em>PCM Remove Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Remove Entity</em>'.
	 * @generated
	 */
	PCM_RemoveEntity createPCM_RemoveEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcmbpoptionsPackage getPcmbpoptionsPackage();

} //PcmbpoptionsFactory
