/**
 */
package requirements.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import requirements.ProcessRequirement;
import requirements.ProcessRequirements;
import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.ProcessRequirementsImpl#getProcessRrequirements <em>Process Rrequirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequirementsImpl extends IdentifierImpl implements ProcessRequirements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.PROCESS_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessRequirement> getProcessRrequirements() {
		return (EList<ProcessRequirement>)eDynamicGet(RequirementsPackage.PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS, RequirementsPackage.Literals.PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS:
				return ((InternalEList<?>)getProcessRrequirements()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS:
				return getProcessRrequirements();
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
			case RequirementsPackage.PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS:
				getProcessRrequirements().clear();
				getProcessRrequirements().addAll((Collection<? extends ProcessRequirement>)newValue);
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
			case RequirementsPackage.PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS:
				getProcessRrequirements().clear();
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
			case RequirementsPackage.PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS:
				return !getProcessRrequirements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessRequirementsImpl
