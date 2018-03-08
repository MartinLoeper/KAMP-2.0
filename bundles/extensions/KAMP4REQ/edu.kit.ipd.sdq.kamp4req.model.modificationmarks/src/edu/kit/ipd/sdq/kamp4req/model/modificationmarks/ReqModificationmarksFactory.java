/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage
 * @generated
 */
public interface ReqModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Req Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Modification Repository</em>'.
	 * @generated
	 */
	ReqModificationRepository createReqModificationRepository();

	/**
	 * Returns a new object of class '<em>Req Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Seed Modifications</em>'.
	 * @generated
	 */
	ReqSeedModifications createReqSeedModifications();

	/**
	 * Returns a new object of class '<em>Req Change Propagation Due To Specification Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Change Propagation Due To Specification Dependencies</em>'.
	 * @generated
	 */
	ReqChangePropagationDueToSpecificationDependencies createReqChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns a new object of class '<em>Req Modify Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Modify Entity</em>'.
	 * @generated
	 */
	ReqModifyEntity createReqModifyEntity();

	/**
	 * Returns a new object of class '<em>Req Modify Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Modify Requirement</em>'.
	 * @generated
	 */
	ReqModifyRequirement createReqModifyRequirement();

	/**
	 * Returns a new object of class '<em>Req Modify Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Modify Decision</em>'.
	 * @generated
	 */
	ReqModifyDecision createReqModifyDecision();

	/**
	 * Returns a new object of class '<em>Req Modify Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Modify Option</em>'.
	 * @generated
	 */
	ReqModifyOption createReqModifyOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReqModificationmarksPackage getReqModificationmarksPackage();

} //ReqModificationmarksFactory
