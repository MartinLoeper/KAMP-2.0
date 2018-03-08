/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation;

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
 * An implementation of the model object '<em><b>IS Test Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl#getUnitTestCases <em>Unit Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl#getAcceptanceTestCases <em>Acceptance Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl#getIntegrationTestCases <em>Integration Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl#getAcceptanceTestCaseAggregations <em>Acceptance Test Case Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTestSpecificationImpl#getIntegrationTestCaseAggregations <em>Integration Test Case Aggregations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISTestSpecificationImpl extends EObjectImpl implements ISTestSpecification {
	/**
	 * The cached value of the '{@link #getUnitTestCases() <em>Unit Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<ISUnitTestCase> unitTestCases;

	/**
	 * The cached value of the '{@link #getAcceptanceTestCases() <em>Acceptance Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<ISAcceptanceTestCase> acceptanceTestCases;

	/**
	 * The cached value of the '{@link #getIntegrationTestCases() <em>Integration Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<ISIntegrationTestCase> integrationTestCases;

	/**
	 * The cached value of the '{@link #getUnitTestCaseAggregations() <em>Unit Test Case Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitTestCaseAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISUnitTestCaseAggregation> unitTestCaseAggregations;

	/**
	 * The cached value of the '{@link #getAcceptanceTestCaseAggregations() <em>Acceptance Test Case Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceTestCaseAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISAcceptanceTestCaseAggregation> acceptanceTestCaseAggregations;

	/**
	 * The cached value of the '{@link #getIntegrationTestCaseAggregations() <em>Integration Test Case Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationTestCaseAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISIntegrationTestCaseAggregation> integrationTestCaseAggregations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTestSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT) return null;
		return (ISFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISUnitTestCase> getUnitTestCases() {
		if (unitTestCases == null) {
			unitTestCases = new EObjectContainmentWithInverseEList<ISUnitTestCase>(ISUnitTestCase.class, this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES, ISFieldOfActivityAnnotationsPackage.IS_UNIT_TEST_CASE__PARENT);
		}
		return unitTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISAcceptanceTestCase> getAcceptanceTestCases() {
		if (acceptanceTestCases == null) {
			acceptanceTestCases = new EObjectContainmentWithInverseEList<ISAcceptanceTestCase>(ISAcceptanceTestCase.class, this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES, ISFieldOfActivityAnnotationsPackage.IS_ACCEPTANCE_TEST_CASE__PARENT);
		}
		return acceptanceTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISIntegrationTestCase> getIntegrationTestCases() {
		if (integrationTestCases == null) {
			integrationTestCases = new EObjectContainmentWithInverseEList<ISIntegrationTestCase>(ISIntegrationTestCase.class, this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES, ISFieldOfActivityAnnotationsPackage.IS_INTEGRATION_TEST_CASE__PARENT);
		}
		return integrationTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISUnitTestCaseAggregation> getUnitTestCaseAggregations() {
		if (unitTestCaseAggregations == null) {
			unitTestCaseAggregations = new EObjectContainmentWithInverseEList<ISUnitTestCaseAggregation>(ISUnitTestCaseAggregation.class, this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS, ISFieldOfActivityAnnotationsPackage.IS_UNIT_TEST_CASE_AGGREGATION__PARENT);
		}
		return unitTestCaseAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISAcceptanceTestCaseAggregation> getAcceptanceTestCaseAggregations() {
		if (acceptanceTestCaseAggregations == null) {
			acceptanceTestCaseAggregations = new EObjectContainmentWithInverseEList<ISAcceptanceTestCaseAggregation>(ISAcceptanceTestCaseAggregation.class, this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS, ISFieldOfActivityAnnotationsPackage.IS_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT);
		}
		return acceptanceTestCaseAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISIntegrationTestCaseAggregation> getIntegrationTestCaseAggregations() {
		if (integrationTestCaseAggregations == null) {
			integrationTestCaseAggregations = new EObjectContainmentWithInverseEList<ISIntegrationTestCaseAggregation>(ISIntegrationTestCaseAggregation.class, this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS, ISFieldOfActivityAnnotationsPackage.IS_INTEGRATION_TEST_CASE_AGGREGATION__PARENT);
		}
		return integrationTestCaseAggregations;
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
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnitTestCases()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAcceptanceTestCases()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegrationTestCases()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnitTestCaseAggregations()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAcceptanceTestCaseAggregations()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegrationTestCaseAggregations()).basicAdd(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return ((InternalEList<?>)getUnitTestCases()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return ((InternalEList<?>)getAcceptanceTestCases()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES:
				return ((InternalEList<?>)getIntegrationTestCases()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<?>)getUnitTestCaseAggregations()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<?>)getAcceptanceTestCaseAggregations()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<?>)getIntegrationTestCaseAggregations()).basicRemove(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return getUnitTestCases();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return getAcceptanceTestCases();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES:
				return getIntegrationTestCases();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return getUnitTestCaseAggregations();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return getAcceptanceTestCaseAggregations();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS:
				return getIntegrationTestCaseAggregations();
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
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES:
				getUnitTestCases().clear();
				getUnitTestCases().addAll((Collection<? extends ISUnitTestCase>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				getAcceptanceTestCases().clear();
				getAcceptanceTestCases().addAll((Collection<? extends ISAcceptanceTestCase>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES:
				getIntegrationTestCases().clear();
				getIntegrationTestCases().addAll((Collection<? extends ISIntegrationTestCase>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				getUnitTestCaseAggregations().clear();
				getUnitTestCaseAggregations().addAll((Collection<? extends ISUnitTestCaseAggregation>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				getAcceptanceTestCaseAggregations().clear();
				getAcceptanceTestCaseAggregations().addAll((Collection<? extends ISAcceptanceTestCaseAggregation>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS:
				getIntegrationTestCaseAggregations().clear();
				getIntegrationTestCaseAggregations().addAll((Collection<? extends ISIntegrationTestCaseAggregation>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES:
				getUnitTestCases().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				getAcceptanceTestCases().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES:
				getIntegrationTestCases().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				getUnitTestCaseAggregations().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				getAcceptanceTestCaseAggregations().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS:
				getIntegrationTestCaseAggregations().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return unitTestCases != null && !unitTestCases.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return acceptanceTestCases != null && !acceptanceTestCases.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES:
				return integrationTestCases != null && !integrationTestCases.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return unitTestCaseAggregations != null && !unitTestCaseAggregations.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return acceptanceTestCaseAggregations != null && !acceptanceTestCaseAggregations.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS:
				return integrationTestCaseAggregations != null && !integrationTestCaseAggregations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISTestSpecificationImpl
