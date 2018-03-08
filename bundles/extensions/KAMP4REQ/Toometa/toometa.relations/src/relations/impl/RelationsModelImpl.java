/**
 */
package relations.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import relations.Relation;
import relations.RelationType;
import relations.RelationsModel;
import relations.RelationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.RelationsModelImpl#getRelationTypes <em>Relation Types</em>}</li>
 *   <li>{@link relations.impl.RelationsModelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationsModelImpl extends IdentifierImpl implements RelationsModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.RELATIONS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RelationType> getRelationTypes() {
		return (EList<RelationType>)eDynamicGet(RelationsPackage.RELATIONS_MODEL__RELATION_TYPES, RelationsPackage.Literals.RELATIONS_MODEL__RELATION_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eDynamicGet(RelationsPackage.RELATIONS_MODEL__RELATIONS, RelationsPackage.Literals.RELATIONS_MODEL__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationsPackage.RELATIONS_MODEL__RELATION_TYPES:
				return ((InternalEList<?>)getRelationTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationsPackage.RELATIONS_MODEL__RELATION_TYPES:
				return getRelationTypes();
			case RelationsPackage.RELATIONS_MODEL__RELATIONS:
				return getRelations();
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
			case RelationsPackage.RELATIONS_MODEL__RELATION_TYPES:
				getRelationTypes().clear();
				getRelationTypes().addAll((Collection<? extends RelationType>)newValue);
				return;
			case RelationsPackage.RELATIONS_MODEL__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
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
			case RelationsPackage.RELATIONS_MODEL__RELATION_TYPES:
				getRelationTypes().clear();
				return;
			case RelationsPackage.RELATIONS_MODEL__RELATIONS:
				getRelations().clear();
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
			case RelationsPackage.RELATIONS_MODEL__RELATION_TYPES:
				return !getRelationTypes().isEmpty();
			case RelationsPackage.RELATIONS_MODEL__RELATIONS:
				return !getRelations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationsModelImpl
