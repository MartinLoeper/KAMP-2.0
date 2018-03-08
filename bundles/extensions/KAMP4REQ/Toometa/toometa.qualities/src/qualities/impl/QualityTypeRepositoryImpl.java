/**
 */
package qualities.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import qualities.QualitiesPackage;
import qualities.QualityType;
import qualities.QualityTypeRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualities.impl.QualityTypeRepositoryImpl#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityTypeRepositoryImpl extends IdentifierImpl implements QualityTypeRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityTypeRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<QualityType> getQualityType() {
		return (EList<QualityType>)eDynamicGet(QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE, QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualityType()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE:
				return ((InternalEList<?>)getQualityType()).basicRemove(otherEnd, msgs);
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
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE:
				return getQualityType();
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
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE:
				getQualityType().clear();
				getQualityType().addAll((Collection<? extends QualityType>)newValue);
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
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE:
				getQualityType().clear();
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
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE:
				return !getQualityType().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityTypeRepositoryImpl
