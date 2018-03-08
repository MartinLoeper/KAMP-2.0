/**
 */
package requirements.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import requirements.ProcessRequirements;
import requirements.ProjectRequirements;
import requirements.ReqRepository;
import requirements.RequirementsPackage;
import requirements.SystemRequirements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.ReqRepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link requirements.impl.ReqRepositoryImpl#getProjectReqSection <em>Project Req Section</em>}</li>
 *   <li>{@link requirements.impl.ReqRepositoryImpl#getProcessReqSection <em>Process Req Section</em>}</li>
 *   <li>{@link requirements.impl.ReqRepositoryImpl#getSystemReqSection <em>System Req Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReqRepositoryImpl extends IdentifierImpl implements ReqRepository {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "Write a description here ...";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQ_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(RequirementsPackage.REQ_REPOSITORY__DESCRIPTION, RequirementsPackage.Literals.REQ_REPOSITORY__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(RequirementsPackage.REQ_REPOSITORY__DESCRIPTION, RequirementsPackage.Literals.REQ_REPOSITORY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectRequirements getProjectReqSection() {
		return (ProjectRequirements)eDynamicGet(RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION, RequirementsPackage.Literals.REQ_REPOSITORY__PROJECT_REQ_SECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectReqSection(ProjectRequirements newProjectReqSection, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProjectReqSection, RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectReqSection(ProjectRequirements newProjectReqSection) {
		eDynamicSet(RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION, RequirementsPackage.Literals.REQ_REPOSITORY__PROJECT_REQ_SECTION, newProjectReqSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequirements getProcessReqSection() {
		return (ProcessRequirements)eDynamicGet(RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION, RequirementsPackage.Literals.REQ_REPOSITORY__PROCESS_REQ_SECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessReqSection(ProcessRequirements newProcessReqSection, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProcessReqSection, RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessReqSection(ProcessRequirements newProcessReqSection) {
		eDynamicSet(RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION, RequirementsPackage.Literals.REQ_REPOSITORY__PROCESS_REQ_SECTION, newProcessReqSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRequirements getSystemReqSection() {
		return (SystemRequirements)eDynamicGet(RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION, RequirementsPackage.Literals.REQ_REPOSITORY__SYSTEM_REQ_SECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemReqSection(SystemRequirements newSystemReqSection, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSystemReqSection, RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemReqSection(SystemRequirements newSystemReqSection) {
		eDynamicSet(RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION, RequirementsPackage.Literals.REQ_REPOSITORY__SYSTEM_REQ_SECTION, newSystemReqSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION:
				return basicSetProjectReqSection(null, msgs);
			case RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION:
				return basicSetProcessReqSection(null, msgs);
			case RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION:
				return basicSetSystemReqSection(null, msgs);
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
			case RequirementsPackage.REQ_REPOSITORY__DESCRIPTION:
				return getDescription();
			case RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION:
				return getProjectReqSection();
			case RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION:
				return getProcessReqSection();
			case RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION:
				return getSystemReqSection();
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
			case RequirementsPackage.REQ_REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION:
				setProjectReqSection((ProjectRequirements)newValue);
				return;
			case RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION:
				setProcessReqSection((ProcessRequirements)newValue);
				return;
			case RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION:
				setSystemReqSection((SystemRequirements)newValue);
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
			case RequirementsPackage.REQ_REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION:
				setProjectReqSection((ProjectRequirements)null);
				return;
			case RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION:
				setProcessReqSection((ProcessRequirements)null);
				return;
			case RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION:
				setSystemReqSection((SystemRequirements)null);
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
			case RequirementsPackage.REQ_REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case RequirementsPackage.REQ_REPOSITORY__PROJECT_REQ_SECTION:
				return getProjectReqSection() != null;
			case RequirementsPackage.REQ_REPOSITORY__PROCESS_REQ_SECTION:
				return getProcessReqSection() != null;
			case RequirementsPackage.REQ_REPOSITORY__SYSTEM_REQ_SECTION:
				return getSystemReqSection() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReqRepositoryImpl
