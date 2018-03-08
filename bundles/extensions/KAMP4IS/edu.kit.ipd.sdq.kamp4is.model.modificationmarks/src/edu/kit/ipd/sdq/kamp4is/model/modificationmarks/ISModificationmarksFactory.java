/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

import org.palladiosimulator.pcm.repository.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage
 * @generated
 */
public interface ISModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ISModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modification Repository</em>'.
	 * @generated
	 */
	ISModificationRepository createISModificationRepository();

	/**
	 * Returns a new object of class '<em>IS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Seed Modifications</em>'.
	 * @generated
	 */
	ISSeedModifications createISSeedModifications();

	/**
	 * Returns a new object of class '<em>IS Change Propagation Due To Data Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Change Propagation Due To Data Dependencies</em>'.
	 * @generated
	 */
	ISChangePropagationDueToDataDependencies createISChangePropagationDueToDataDependencies();

	/**
	 * Returns a new object of class '<em>IS Change Propagation Due To Interface Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Change Propagation Due To Interface Dependencies</em>'.
	 * @generated
	 */
	ISChangePropagationDueToInterfaceDependencies createISChangePropagationDueToInterfaceDependencies();

	/**
	 * Returns a new object of class '<em>IS Intercomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Intercomponent Propagation</em>'.
	 * @generated
	 */
	ISIntercomponentPropagation createISIntercomponentPropagation();

	/**
	 * Returns a new object of class '<em>IS Intracomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Intracomponent Propagation</em>'.
	 * @generated
	 */
	ISIntracomponentPropagation createISIntracomponentPropagation();

	/**
	 * Returns a new object of class '<em>IS Modify Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Data Type</em>'.
	 * @generated
	 */
	ISModifyDataType createISModifyDataType();

	/**
	 * Returns a new object of class '<em>IS Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Component</em>'.
	 * @generated
	 */
	ISModifyComponent createISModifyComponent();

	/**
	 * Returns a new object of class '<em>IS Modify Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Connector</em>'.
	 * @generated
	 */
	ISModifyConnector createISModifyConnector();

	/**
	 * Returns a new object of class '<em>IS Modify Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Role</em>'.
	 * @generated
	 */
	<T extends Role> ISModifyRole<T> createISModifyRole();

	/**
	 * Returns a new object of class '<em>IS Modify Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Provided Role</em>'.
	 * @generated
	 */
	ISModifyProvidedRole createISModifyProvidedRole();

	/**
	 * Returns a new object of class '<em>IS Modify Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Required Role</em>'.
	 * @generated
	 */
	ISModifyRequiredRole createISModifyRequiredRole();

	/**
	 * Returns a new object of class '<em>IS Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Interface</em>'.
	 * @generated
	 */
	ISModifyInterface createISModifyInterface();

	/**
	 * Returns a new object of class '<em>IS Modify Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS Modify Signature</em>'.
	 * @generated
	 */
	ISModifySignature createISModifySignature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ISModificationmarksPackage getISModificationmarksPackage();

} //ISModificationmarksFactory
