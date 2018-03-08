/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqModificationmarksFactoryImpl extends EFactoryImpl implements ReqModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReqModificationmarksFactory init() {
		try {
			ReqModificationmarksFactory theReqModificationmarksFactory = (ReqModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(ReqModificationmarksPackage.eNS_URI);
			if (theReqModificationmarksFactory != null) {
				return theReqModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReqModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReqModificationmarksPackage.REQ_MODIFICATION_REPOSITORY: return createReqModificationRepository();
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS: return createReqSeedModifications();
			case ReqModificationmarksPackage.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: return createReqChangePropagationDueToSpecificationDependencies();
			case ReqModificationmarksPackage.REQ_MODIFY_ENTITY: return createReqModifyEntity();
			case ReqModificationmarksPackage.REQ_MODIFY_REQUIREMENT: return createReqModifyRequirement();
			case ReqModificationmarksPackage.REQ_MODIFY_DECISION: return createReqModifyDecision();
			case ReqModificationmarksPackage.REQ_MODIFY_OPTION: return createReqModifyOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModificationRepository createReqModificationRepository() {
		ReqModificationRepositoryImpl reqModificationRepository = new ReqModificationRepositoryImpl();
		return reqModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqSeedModifications createReqSeedModifications() {
		ReqSeedModificationsImpl reqSeedModifications = new ReqSeedModificationsImpl();
		return reqSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqChangePropagationDueToSpecificationDependencies createReqChangePropagationDueToSpecificationDependencies() {
		ReqChangePropagationDueToSpecificationDependenciesImpl reqChangePropagationDueToSpecificationDependencies = new ReqChangePropagationDueToSpecificationDependenciesImpl();
		return reqChangePropagationDueToSpecificationDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModifyEntity createReqModifyEntity() {
		ReqModifyEntityImpl reqModifyEntity = new ReqModifyEntityImpl();
		return reqModifyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModifyRequirement createReqModifyRequirement() {
		ReqModifyRequirementImpl reqModifyRequirement = new ReqModifyRequirementImpl();
		return reqModifyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModifyDecision createReqModifyDecision() {
		ReqModifyDecisionImpl reqModifyDecision = new ReqModifyDecisionImpl();
		return reqModifyDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModifyOption createReqModifyOption() {
		ReqModifyOptionImpl reqModifyOption = new ReqModifyOptionImpl();
		return reqModifyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModificationmarksPackage getReqModificationmarksPackage() {
		return (ReqModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReqModificationmarksPackage getPackage() {
		return ReqModificationmarksPackage.eINSTANCE;
	}

} //ReqModificationmarksFactoryImpl
