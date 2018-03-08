/**
 */
package requirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see requirements.RequirementsPackage
 * @generated
 */
public interface RequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsFactory eINSTANCE = requirements.impl.RequirementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Req Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Repository</em>'.
	 * @generated
	 */
	ReqRepository createReqRepository();

	/**
	 * Returns a new object of class '<em>Project Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Requirement</em>'.
	 * @generated
	 */
	ProjectRequirement createProjectRequirement();

	/**
	 * Returns a new object of class '<em>Process Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Requirement</em>'.
	 * @generated
	 */
	ProcessRequirement createProcessRequirement();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Requirement</em>'.
	 * @generated
	 */
	FunctionalRequirement createFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Requirement</em>'.
	 * @generated
	 */
	QualityRequirement createQualityRequirement();

	/**
	 * Returns a new object of class '<em>Project Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Requirements</em>'.
	 * @generated
	 */
	ProjectRequirements createProjectRequirements();

	/**
	 * Returns a new object of class '<em>System Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Requirements</em>'.
	 * @generated
	 */
	SystemRequirements createSystemRequirements();

	/**
	 * Returns a new object of class '<em>Process Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Requirements</em>'.
	 * @generated
	 */
	ProcessRequirements createProcessRequirements();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementsPackage getRequirementsPackage();

} //RequirementsFactory
