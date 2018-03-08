/**
 */
package qualities.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import qualities.QualitiesPackage;
import qualities.QualityType;
import qualities.QualityTypeRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualities.impl.QualityTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualities.impl.QualityTypeImpl#getQualityTypeRepository <em>Quality Type Repository</em>}</li>
 *   <li>{@link qualities.impl.QualityTypeImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QualityTypeImpl extends IdentifierImpl implements QualityType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualitiesPackage.Literals.QUALITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(QualitiesPackage.QUALITY_TYPE__DESCRIPTION, QualitiesPackage.Literals.QUALITY_TYPE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(QualitiesPackage.QUALITY_TYPE__DESCRIPTION, QualitiesPackage.Literals.QUALITY_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeRepository getQualityTypeRepository() {
		return (QualityTypeRepository)eDynamicGet(QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY, QualitiesPackage.Literals.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualityTypeRepository(QualityTypeRepository newQualityTypeRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQualityTypeRepository, QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityTypeRepository(QualityTypeRepository newQualityTypeRepository) {
		eDynamicSet(QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY, QualitiesPackage.Literals.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY, newQualityTypeRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		return (Dimension)eDynamicGet(QualitiesPackage.QUALITY_TYPE__DIMENSION, QualitiesPackage.Literals.QUALITY_TYPE__DIMENSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetDimension() {
		return (Dimension)eDynamicGet(QualitiesPackage.QUALITY_TYPE__DIMENSION, QualitiesPackage.Literals.QUALITY_TYPE__DIMENSION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		eDynamicSet(QualitiesPackage.QUALITY_TYPE__DIMENSION, QualitiesPackage.Literals.QUALITY_TYPE__DIMENSION, newDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQualityTypeRepository((QualityTypeRepository)otherEnd, msgs);
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
			case QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY:
				return basicSetQualityTypeRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE, QualityTypeRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualitiesPackage.QUALITY_TYPE__DESCRIPTION:
				return getDescription();
			case QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY:
				return getQualityTypeRepository();
			case QualitiesPackage.QUALITY_TYPE__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualitiesPackage.QUALITY_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY:
				setQualityTypeRepository((QualityTypeRepository)newValue);
				return;
			case QualitiesPackage.QUALITY_TYPE__DIMENSION:
				setDimension((Dimension)newValue);
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
			case QualitiesPackage.QUALITY_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY:
				setQualityTypeRepository((QualityTypeRepository)null);
				return;
			case QualitiesPackage.QUALITY_TYPE__DIMENSION:
				setDimension((Dimension)null);
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
			case QualitiesPackage.QUALITY_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case QualitiesPackage.QUALITY_TYPE__QUALITY_TYPE_REPOSITORY:
				return getQualityTypeRepository() != null;
			case QualitiesPackage.QUALITY_TYPE__DIMENSION:
				return basicGetDimension() != null;
		}
		return super.eIsSet(featureID);
	}

} //QualityTypeImpl
