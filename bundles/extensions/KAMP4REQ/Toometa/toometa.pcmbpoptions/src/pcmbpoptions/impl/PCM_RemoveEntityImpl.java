/**
 */
package pcmbpoptions.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.Entity;

import pcmbpoptions.PCM_RemoveEntity;
import pcmbpoptions.PcmbpoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Remove Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmbpoptions.impl.PCM_RemoveEntityImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_RemoveEntityImpl extends PCM_EntityOptionImpl implements PCM_RemoveEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_RemoveEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmbpoptionsPackage.Literals.PCM_REMOVE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getEntities() {
		return (EList<Entity>)eDynamicGet(PcmbpoptionsPackage.PCM_REMOVE_ENTITY__ENTITIES, PcmbpoptionsPackage.Literals.PCM_REMOVE_ENTITY__ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmbpoptionsPackage.PCM_REMOVE_ENTITY__ENTITIES:
				return getEntities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcmbpoptionsPackage.PCM_REMOVE_ENTITY__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcmbpoptionsPackage.PCM_REMOVE_ENTITY__ENTITIES:
				getEntities().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcmbpoptionsPackage.PCM_REMOVE_ENTITY__ENTITIES:
				return !getEntities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_RemoveEntityImpl
