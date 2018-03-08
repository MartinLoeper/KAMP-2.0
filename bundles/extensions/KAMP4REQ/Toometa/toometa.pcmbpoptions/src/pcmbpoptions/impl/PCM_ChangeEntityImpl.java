/**
 */
package pcmbpoptions.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.Entity;

import pcmbpoptions.PCM_ChangeEntity;
import pcmbpoptions.PcmbpoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Change Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmbpoptions.impl.PCM_ChangeEntityImpl#getOldEntities <em>Old Entities</em>}</li>
 *   <li>{@link pcmbpoptions.impl.PCM_ChangeEntityImpl#getNewEntities <em>New Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ChangeEntityImpl extends PCM_EntityOptionImpl implements PCM_ChangeEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ChangeEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmbpoptionsPackage.Literals.PCM_CHANGE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getOldEntities() {
		return (EList<Entity>)eDynamicGet(PcmbpoptionsPackage.PCM_CHANGE_ENTITY__OLD_ENTITIES, PcmbpoptionsPackage.Literals.PCM_CHANGE_ENTITY__OLD_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getNewEntities() {
		return (EList<Entity>)eDynamicGet(PcmbpoptionsPackage.PCM_CHANGE_ENTITY__NEW_ENTITIES, PcmbpoptionsPackage.Literals.PCM_CHANGE_ENTITY__NEW_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__OLD_ENTITIES:
				return getOldEntities();
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__NEW_ENTITIES:
				return getNewEntities();
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
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__OLD_ENTITIES:
				getOldEntities().clear();
				getOldEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__NEW_ENTITIES:
				getNewEntities().clear();
				getNewEntities().addAll((Collection<? extends Entity>)newValue);
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
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__OLD_ENTITIES:
				getOldEntities().clear();
				return;
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__NEW_ENTITIES:
				getNewEntities().clear();
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
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__OLD_ENTITIES:
				return !getOldEntities().isEmpty();
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY__NEW_ENTITIES:
				return !getNewEntities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_ChangeEntityImpl
