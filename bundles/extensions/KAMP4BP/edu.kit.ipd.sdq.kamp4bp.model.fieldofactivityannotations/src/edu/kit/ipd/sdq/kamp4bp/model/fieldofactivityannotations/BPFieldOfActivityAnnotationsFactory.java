/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage
 * @generated
 */
public interface BPFieldOfActivityAnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPFieldOfActivityAnnotationsFactory eINSTANCE = edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	BPFieldOfActivityAnnotationsRepository createBPFieldOfActivityAnnotationsRepository();

	/**
	 * Returns a new object of class '<em>BP Good</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Good</em>'.
	 * @generated
	 */
	BPGood createBPGood();

	/**
	 * Returns a new object of class '<em>BP Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Message</em>'.
	 * @generated
	 */
	BPMessage createBPMessage();

	/**
	 * Returns a new object of class '<em>BP Organizational Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Organizational Unit</em>'.
	 * @generated
	 */
	BPOrganizationalUnit createBPOrganizationalUnit();

	/**
	 * Returns a new object of class '<em>BP Training Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Training Course</em>'.
	 * @generated
	 */
	BPTrainingCourse createBPTrainingCourse();

	/**
	 * Returns a new object of class '<em>BP Business Process Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Business Process Specification</em>'.
	 * @generated
	 */
	BPBusinessProcessSpecification createBPBusinessProcessSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BPFieldOfActivityAnnotationsPackage getBPFieldOfActivityAnnotationsPackage();

} //BPFieldOfActivityAnnotationsFactory
