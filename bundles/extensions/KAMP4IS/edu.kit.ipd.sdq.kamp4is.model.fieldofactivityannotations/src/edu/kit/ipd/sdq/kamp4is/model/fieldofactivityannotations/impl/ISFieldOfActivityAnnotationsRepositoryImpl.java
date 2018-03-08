/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getBuildSpecification <em>Build Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getReleaseSpecification <em>Release Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getDeploymentSpecification <em>Deployment Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getStaffSpecification <em>Staff Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getTechnologySpecification <em>Technology Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl#getDesignPatternSpecification <em>Design Pattern Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISFieldOfActivityAnnotationsRepositoryImpl extends EObjectImpl implements ISFieldOfActivityAnnotationsRepository {
	/**
	 * The cached value of the '{@link #getDevelopmentArtefactSpecification() <em>Development Artefact Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 * @ordered
	 */
	protected ISDevelopmentArtefactSpecification developmentArtefactSpecification;

	/**
	 * The cached value of the '{@link #getBuildSpecification() <em>Build Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildSpecification()
	 * @generated
	 * @ordered
	 */
	protected ISBuildSpecification buildSpecification;

	/**
	 * The cached value of the '{@link #getTestSpecification() <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSpecification()
	 * @generated
	 * @ordered
	 */
	protected ISTestSpecification testSpecification;

	/**
	 * The cached value of the '{@link #getReleaseSpecification() <em>Release Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseSpecification()
	 * @generated
	 * @ordered
	 */
	protected ISReleaseSpecification releaseSpecification;

	/**
	 * The cached value of the '{@link #getDeploymentSpecification() <em>Deployment Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentSpecification()
	 * @generated
	 * @ordered
	 */
	protected ISDeploymentSpecification deploymentSpecification;

	/**
	 * The cached value of the '{@link #getStaffSpecification() <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffSpecification()
	 * @generated
	 * @ordered
	 */
	protected ISStaffSpecification staffSpecification;

	/**
	 * The cached value of the '{@link #getTechnologySpecification() <em>Technology Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologySpecification()
	 * @generated
	 * @ordered
	 */
	protected ISTechnologySpecification technologySpecification;

	/**
	 * The cached value of the '{@link #getDesignPatternSpecification() <em>Design Pattern Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignPatternSpecification()
	 * @generated
	 * @ordered
	 */
	protected ISDesignPatternSpecification designPatternSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISFieldOfActivityAnnotationsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDevelopmentArtefactSpecification getDevelopmentArtefactSpecification() {
		return developmentArtefactSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevelopmentArtefactSpecification(ISDevelopmentArtefactSpecification newDevelopmentArtefactSpecification, NotificationChain msgs) {
		ISDevelopmentArtefactSpecification oldDevelopmentArtefactSpecification = developmentArtefactSpecification;
		developmentArtefactSpecification = newDevelopmentArtefactSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, oldDevelopmentArtefactSpecification, newDevelopmentArtefactSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentArtefactSpecification(ISDevelopmentArtefactSpecification newDevelopmentArtefactSpecification) {
		if (newDevelopmentArtefactSpecification != developmentArtefactSpecification) {
			NotificationChain msgs = null;
			if (developmentArtefactSpecification != null)
				msgs = ((InternalEObject)developmentArtefactSpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, ISDevelopmentArtefactSpecification.class, msgs);
			if (newDevelopmentArtefactSpecification != null)
				msgs = ((InternalEObject)newDevelopmentArtefactSpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, ISDevelopmentArtefactSpecification.class, msgs);
			msgs = basicSetDevelopmentArtefactSpecification(newDevelopmentArtefactSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, newDevelopmentArtefactSpecification, newDevelopmentArtefactSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISBuildSpecification getBuildSpecification() {
		return buildSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildSpecification(ISBuildSpecification newBuildSpecification, NotificationChain msgs) {
		ISBuildSpecification oldBuildSpecification = buildSpecification;
		buildSpecification = newBuildSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, oldBuildSpecification, newBuildSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildSpecification(ISBuildSpecification newBuildSpecification) {
		if (newBuildSpecification != buildSpecification) {
			NotificationChain msgs = null;
			if (buildSpecification != null)
				msgs = ((InternalEObject)buildSpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT, ISBuildSpecification.class, msgs);
			if (newBuildSpecification != null)
				msgs = ((InternalEObject)newBuildSpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT, ISBuildSpecification.class, msgs);
			msgs = basicSetBuildSpecification(newBuildSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, newBuildSpecification, newBuildSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTestSpecification getTestSpecification() {
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestSpecification(ISTestSpecification newTestSpecification, NotificationChain msgs) {
		ISTestSpecification oldTestSpecification = testSpecification;
		testSpecification = newTestSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, oldTestSpecification, newTestSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestSpecification(ISTestSpecification newTestSpecification) {
		if (newTestSpecification != testSpecification) {
			NotificationChain msgs = null;
			if (testSpecification != null)
				msgs = ((InternalEObject)testSpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT, ISTestSpecification.class, msgs);
			if (newTestSpecification != null)
				msgs = ((InternalEObject)newTestSpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__PARENT, ISTestSpecification.class, msgs);
			msgs = basicSetTestSpecification(newTestSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, newTestSpecification, newTestSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISReleaseSpecification getReleaseSpecification() {
		return releaseSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseSpecification(ISReleaseSpecification newReleaseSpecification, NotificationChain msgs) {
		ISReleaseSpecification oldReleaseSpecification = releaseSpecification;
		releaseSpecification = newReleaseSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION, oldReleaseSpecification, newReleaseSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseSpecification(ISReleaseSpecification newReleaseSpecification) {
		if (newReleaseSpecification != releaseSpecification) {
			NotificationChain msgs = null;
			if (releaseSpecification != null)
				msgs = ((InternalEObject)releaseSpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT, ISReleaseSpecification.class, msgs);
			if (newReleaseSpecification != null)
				msgs = ((InternalEObject)newReleaseSpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT, ISReleaseSpecification.class, msgs);
			msgs = basicSetReleaseSpecification(newReleaseSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION, newReleaseSpecification, newReleaseSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDeploymentSpecification getDeploymentSpecification() {
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentSpecification(ISDeploymentSpecification newDeploymentSpecification, NotificationChain msgs) {
		ISDeploymentSpecification oldDeploymentSpecification = deploymentSpecification;
		deploymentSpecification = newDeploymentSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION, oldDeploymentSpecification, newDeploymentSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentSpecification(ISDeploymentSpecification newDeploymentSpecification) {
		if (newDeploymentSpecification != deploymentSpecification) {
			NotificationChain msgs = null;
			if (deploymentSpecification != null)
				msgs = ((InternalEObject)deploymentSpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT, ISDeploymentSpecification.class, msgs);
			if (newDeploymentSpecification != null)
				msgs = ((InternalEObject)newDeploymentSpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT, ISDeploymentSpecification.class, msgs);
			msgs = basicSetDeploymentSpecification(newDeploymentSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION, newDeploymentSpecification, newDeploymentSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISStaffSpecification getStaffSpecification() {
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaffSpecification(ISStaffSpecification newStaffSpecification, NotificationChain msgs) {
		ISStaffSpecification oldStaffSpecification = staffSpecification;
		staffSpecification = newStaffSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, oldStaffSpecification, newStaffSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffSpecification(ISStaffSpecification newStaffSpecification) {
		if (newStaffSpecification != staffSpecification) {
			NotificationChain msgs = null;
			if (staffSpecification != null)
				msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT, ISStaffSpecification.class, msgs);
			if (newStaffSpecification != null)
				msgs = ((InternalEObject)newStaffSpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT, ISStaffSpecification.class, msgs);
			msgs = basicSetStaffSpecification(newStaffSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, newStaffSpecification, newStaffSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTechnologySpecification getTechnologySpecification() {
		return technologySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnologySpecification(ISTechnologySpecification newTechnologySpecification, NotificationChain msgs) {
		ISTechnologySpecification oldTechnologySpecification = technologySpecification;
		technologySpecification = newTechnologySpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION, oldTechnologySpecification, newTechnologySpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologySpecification(ISTechnologySpecification newTechnologySpecification) {
		if (newTechnologySpecification != technologySpecification) {
			NotificationChain msgs = null;
			if (technologySpecification != null)
				msgs = ((InternalEObject)technologySpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT, ISTechnologySpecification.class, msgs);
			if (newTechnologySpecification != null)
				msgs = ((InternalEObject)newTechnologySpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT, ISTechnologySpecification.class, msgs);
			msgs = basicSetTechnologySpecification(newTechnologySpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION, newTechnologySpecification, newTechnologySpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDesignPatternSpecification getDesignPatternSpecification() {
		return designPatternSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignPatternSpecification(ISDesignPatternSpecification newDesignPatternSpecification, NotificationChain msgs) {
		ISDesignPatternSpecification oldDesignPatternSpecification = designPatternSpecification;
		designPatternSpecification = newDesignPatternSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION, oldDesignPatternSpecification, newDesignPatternSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignPatternSpecification(ISDesignPatternSpecification newDesignPatternSpecification) {
		if (newDesignPatternSpecification != designPatternSpecification) {
			NotificationChain msgs = null;
			if (designPatternSpecification != null)
				msgs = ((InternalEObject)designPatternSpecification).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_SPECIFICATION__PARENT, ISDesignPatternSpecification.class, msgs);
			if (newDesignPatternSpecification != null)
				msgs = ((InternalEObject)newDesignPatternSpecification).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_SPECIFICATION__PARENT, ISDesignPatternSpecification.class, msgs);
			msgs = basicSetDesignPatternSpecification(newDesignPatternSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION, newDesignPatternSpecification, newDesignPatternSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				if (developmentArtefactSpecification != null)
					msgs = ((InternalEObject)developmentArtefactSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, null, msgs);
				return basicSetDevelopmentArtefactSpecification((ISDevelopmentArtefactSpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION:
				if (buildSpecification != null)
					msgs = ((InternalEObject)buildSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, null, msgs);
				return basicSetBuildSpecification((ISBuildSpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				if (testSpecification != null)
					msgs = ((InternalEObject)testSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, null, msgs);
				return basicSetTestSpecification((ISTestSpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION:
				if (releaseSpecification != null)
					msgs = ((InternalEObject)releaseSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION, null, msgs);
				return basicSetReleaseSpecification((ISReleaseSpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				if (deploymentSpecification != null)
					msgs = ((InternalEObject)deploymentSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION, null, msgs);
				return basicSetDeploymentSpecification((ISDeploymentSpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				if (staffSpecification != null)
					msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, null, msgs);
				return basicSetStaffSpecification((ISStaffSpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION:
				if (technologySpecification != null)
					msgs = ((InternalEObject)technologySpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION, null, msgs);
				return basicSetTechnologySpecification((ISTechnologySpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION:
				if (designPatternSpecification != null)
					msgs = ((InternalEObject)designPatternSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION, null, msgs);
				return basicSetDesignPatternSpecification((ISDesignPatternSpecification)otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return basicSetDevelopmentArtefactSpecification(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION:
				return basicSetBuildSpecification(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				return basicSetTestSpecification(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION:
				return basicSetReleaseSpecification(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				return basicSetDeploymentSpecification(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				return basicSetStaffSpecification(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION:
				return basicSetTechnologySpecification(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION:
				return basicSetDesignPatternSpecification(null, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return getDevelopmentArtefactSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION:
				return getBuildSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				return getTestSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION:
				return getReleaseSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				return getDeploymentSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				return getStaffSpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION:
				return getTechnologySpecification();
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION:
				return getDesignPatternSpecification();
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
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				setDevelopmentArtefactSpecification((ISDevelopmentArtefactSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION:
				setBuildSpecification((ISBuildSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((ISTestSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION:
				setReleaseSpecification((ISReleaseSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				setDeploymentSpecification((ISDeploymentSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((ISStaffSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION:
				setTechnologySpecification((ISTechnologySpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION:
				setDesignPatternSpecification((ISDesignPatternSpecification)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				setDevelopmentArtefactSpecification((ISDevelopmentArtefactSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION:
				setBuildSpecification((ISBuildSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((ISTestSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION:
				setReleaseSpecification((ISReleaseSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				setDeploymentSpecification((ISDeploymentSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((ISStaffSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION:
				setTechnologySpecification((ISTechnologySpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION:
				setDesignPatternSpecification((ISDesignPatternSpecification)null);
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
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return developmentArtefactSpecification != null;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION:
				return buildSpecification != null;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				return testSpecification != null;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION:
				return releaseSpecification != null;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				return deploymentSpecification != null;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				return staffSpecification != null;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION:
				return technologySpecification != null;
			case ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION:
				return designPatternSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //ISFieldOfActivityAnnotationsRepositoryImpl
