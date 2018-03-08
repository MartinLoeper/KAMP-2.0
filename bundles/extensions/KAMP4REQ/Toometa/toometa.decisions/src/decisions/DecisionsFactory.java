/**
 */
package decisions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see decisions.DecisionsPackage
 * @generated
 */
public interface DecisionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecisionsFactory eINSTANCE = decisions.impl.DecisionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decision Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Repository</em>'.
	 * @generated
	 */
	DecisionRepository createDecisionRepository();

	/**
	 * Returns a new object of class '<em>Text Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Decision</em>'.
	 * @generated
	 */
	TextDecision createTextDecision();

	/**
	 * Returns a new object of class '<em>Text Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Rationale</em>'.
	 * @generated
	 */
	TextRationale createTextRationale();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DecisionsPackage getDecisionsPackage();

} //DecisionsFactory
