/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Modify Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ISModifyEntityImpl<T extends Entity> extends AbstractModificationImpl<T, EObject> implements ISModifyEntity<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISModifyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_MODIFY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} //ISModifyEntityImpl
