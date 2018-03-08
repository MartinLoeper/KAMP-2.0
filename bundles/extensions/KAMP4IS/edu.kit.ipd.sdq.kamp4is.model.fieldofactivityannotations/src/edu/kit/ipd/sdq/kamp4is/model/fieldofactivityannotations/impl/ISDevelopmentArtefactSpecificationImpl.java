/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Development Artefact Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl#getSourceFileAggregations <em>Source File Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl#getMetadataFiles <em>Metadata Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDevelopmentArtefactSpecificationImpl#getMetadataFileAggregations <em>Metadata File Aggregations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISDevelopmentArtefactSpecificationImpl extends EObjectImpl implements ISDevelopmentArtefactSpecification {
	/**
	 * The cached value of the '{@link #getSourceFiles() <em>Source Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ISSourceFile> sourceFiles;

	/**
	 * The cached value of the '{@link #getSourceFileAggregations() <em>Source File Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFileAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISSourceFileAggregation> sourceFileAggregations;

	/**
	 * The cached value of the '{@link #getMetadataFiles() <em>Metadata Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ISMetadataFile> metadataFiles;

	/**
	 * The cached value of the '{@link #getMetadataFileAggregations() <em>Metadata File Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFileAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISMetadataFileAggregation> metadataFileAggregations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDevelopmentArtefactSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT) return null;
		return (ISFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISSourceFile> getSourceFiles() {
		if (sourceFiles == null) {
			sourceFiles = new EObjectContainmentWithInverseEList<ISSourceFile>(ISSourceFile.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES, ISFieldOfActivityAnnotationsPackage.IS_SOURCE_FILE__PARENT);
		}
		return sourceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISSourceFileAggregation> getSourceFileAggregations() {
		if (sourceFileAggregations == null) {
			sourceFileAggregations = new EObjectContainmentWithInverseEList<ISSourceFileAggregation>(ISSourceFileAggregation.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS, ISFieldOfActivityAnnotationsPackage.IS_SOURCE_FILE_AGGREGATION__PARENT);
		}
		return sourceFileAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISMetadataFile> getMetadataFiles() {
		if (metadataFiles == null) {
			metadataFiles = new EObjectContainmentWithInverseEList<ISMetadataFile>(ISMetadataFile.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES, ISFieldOfActivityAnnotationsPackage.IS_METADATA_FILE__PARENT);
		}
		return metadataFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISMetadataFileAggregation> getMetadataFileAggregations() {
		if (metadataFileAggregations == null) {
			metadataFileAggregations = new EObjectContainmentWithInverseEList<ISMetadataFileAggregation>(ISMetadataFileAggregation.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS, ISFieldOfActivityAnnotationsPackage.IS_METADATA_FILE_AGGREGATION__PARENT);
		}
		return metadataFileAggregations;
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceFiles()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceFileAggregations()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetadataFiles()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetadataFileAggregations()).basicAdd(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return ((InternalEList<?>)getSourceFiles()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return ((InternalEList<?>)getSourceFileAggregations()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return ((InternalEList<?>)getMetadataFiles()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return ((InternalEList<?>)getMetadataFileAggregations()).basicRemove(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return getSourceFiles();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return getSourceFileAggregations();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return getMetadataFiles();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return getMetadataFileAggregations();
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				getSourceFiles().clear();
				getSourceFiles().addAll((Collection<? extends ISSourceFile>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				getSourceFileAggregations().addAll((Collection<? extends ISSourceFileAggregation>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				getMetadataFiles().clear();
				getMetadataFiles().addAll((Collection<? extends ISMetadataFile>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				getMetadataFileAggregations().clear();
				getMetadataFileAggregations().addAll((Collection<? extends ISMetadataFileAggregation>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				getSourceFiles().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				getMetadataFiles().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				getMetadataFileAggregations().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return sourceFiles != null && !sourceFiles.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return sourceFileAggregations != null && !sourceFileAggregations.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return metadataFiles != null && !metadataFiles.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return metadataFileAggregations != null && !metadataFileAggregations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISDevelopmentArtefactSpecificationImpl
