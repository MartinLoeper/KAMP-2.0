/**
 */
package pcmbpoptions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcmbpoptions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmbpoptionsFactoryImpl extends EFactoryImpl implements PcmbpoptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmbpoptionsFactory init() {
		try {
			PcmbpoptionsFactory thePcmbpoptionsFactory = (PcmbpoptionsFactory)EPackage.Registry.INSTANCE.getEFactory(PcmbpoptionsPackage.eNS_URI);
			if (thePcmbpoptionsFactory != null) {
				return thePcmbpoptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmbpoptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmbpoptionsFactoryImpl() {
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
			case PcmbpoptionsPackage.PCM_INTRODUCE_NEW_ENTITY: return (EObject)createPCM_IntroduceNewEntity();
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY: return (EObject)createPCM_ChangeEntity();
			case PcmbpoptionsPackage.PCM_REMOVE_ENTITY: return (EObject)createPCM_RemoveEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_IntroduceNewEntity createPCM_IntroduceNewEntity() {
		PCM_IntroduceNewEntityImpl pcM_IntroduceNewEntity = new PCM_IntroduceNewEntityImpl();
		return pcM_IntroduceNewEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ChangeEntity createPCM_ChangeEntity() {
		PCM_ChangeEntityImpl pcM_ChangeEntity = new PCM_ChangeEntityImpl();
		return pcM_ChangeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_RemoveEntity createPCM_RemoveEntity() {
		PCM_RemoveEntityImpl pcM_RemoveEntity = new PCM_RemoveEntityImpl();
		return pcM_RemoveEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmbpoptionsPackage getPcmbpoptionsPackage() {
		return (PcmbpoptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmbpoptionsPackage getPackage() {
		return PcmbpoptionsPackage.eINSTANCE;
	}

} //PcmbpoptionsFactoryImpl
