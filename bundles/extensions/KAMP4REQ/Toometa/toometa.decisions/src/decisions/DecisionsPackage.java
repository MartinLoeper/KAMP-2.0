/**
 */
package decisions;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see decisions.DecisionsFactory
 * @model kind="package"
 * @generated
 */
public interface DecisionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "decisions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toometa.de/decisions/0.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "decisions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecisionsPackage eINSTANCE = decisions.impl.DecisionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link decisions.impl.DecisionRepositoryImpl <em>Decision Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisions.impl.DecisionRepositoryImpl
	 * @see decisions.impl.DecisionsPackageImpl#getDecisionRepository()
	 * @generated
	 */
	int DECISION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_REPOSITORY__DECISIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link decisions.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisions.impl.DecisionImpl
	 * @see decisions.impl.DecisionsPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__RELATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CONFLICTS_WITH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAS_CONFLICTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DUPLICATE_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAS_DUPLICATES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DEPENDS_ON = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAS_DEPENDENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PARENT_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SUBPART_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TRIGGER_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TRIGGERED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__RESOLVES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__RESOLVED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ALTERNATIVE_TO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAS_ALTERNATIVES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__COULD_RESOLVE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__COULD_BE_RESOLVED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STAKEHOLDER_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAS_STAKEHOLDERS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SELECTED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SELECTED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__RATIONALES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STATUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TIMESTAMP = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__USED_TERMS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link decisions.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisions.impl.RationaleImpl
	 * @see decisions.impl.DecisionsPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link decisions.impl.TextDecisionImpl <em>Text Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisions.impl.TextDecisionImpl
	 * @see decisions.impl.DecisionsPackageImpl#getTextDecision()
	 * @generated
	 */
	int TEXT_DECISION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__ID = DECISION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__RELATIONS = DECISION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__CONFLICTS_WITH = DECISION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__HAS_CONFLICTS = DECISION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__DUPLICATE_OF = DECISION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__HAS_DUPLICATES = DECISION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__DEPENDS_ON = DECISION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__HAS_DEPENDENTS = DECISION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__PARENT_OF = DECISION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__SUBPART_OF = DECISION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__TRIGGER_OF = DECISION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__TRIGGERED_BY = DECISION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__RESOLVES = DECISION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__RESOLVED_BY = DECISION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__ALTERNATIVE_TO = DECISION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__HAS_ALTERNATIVES = DECISION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__COULD_RESOLVE = DECISION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__COULD_BE_RESOLVED_BY = DECISION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__STAKEHOLDER_OF = DECISION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__HAS_STAKEHOLDERS = DECISION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__SELECTED = DECISION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__SELECTED_BY = DECISION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__RATIONALES = DECISION__RATIONALES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__DESCRIPTION = DECISION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__STATUS = DECISION__STATUS;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__TIMESTAMP = DECISION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__REPOSITORY = DECISION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION__USED_TERMS = DECISION__USED_TERMS;

	/**
	 * The number of structural features of the '<em>Text Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DECISION_FEATURE_COUNT = DECISION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link decisions.impl.TextRationaleImpl <em>Text Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisions.impl.TextRationaleImpl
	 * @see decisions.impl.DecisionsPackageImpl#getTextRationale()
	 * @generated
	 */
	int TEXT_RATIONALE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RATIONALE__ID = RATIONALE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RATIONALE__DESCRIPTION = RATIONALE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Text Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RATIONALE_FEATURE_COUNT = RATIONALE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link decisions.DecisionStatusEnum <em>Decision Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisions.DecisionStatusEnum
	 * @see decisions.impl.DecisionsPackageImpl#getDecisionStatusEnum()
	 * @generated
	 */
	int DECISION_STATUS_ENUM = 5;


	/**
	 * Returns the meta object for class '{@link decisions.DecisionRepository <em>Decision Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Repository</em>'.
	 * @see decisions.DecisionRepository
	 * @generated
	 */
	EClass getDecisionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link decisions.DecisionRepository#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see decisions.DecisionRepository#getDecisions()
	 * @see #getDecisionRepository()
	 * @generated
	 */
	EReference getDecisionRepository_Decisions();

	/**
	 * Returns the meta object for class '{@link decisions.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see decisions.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link decisions.Decision#getRationales <em>Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rationales</em>'.
	 * @see decisions.Decision#getRationales()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Rationales();

	/**
	 * Returns the meta object for the attribute '{@link decisions.Decision#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see decisions.Decision#getDescription()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Description();

	/**
	 * Returns the meta object for the attribute '{@link decisions.Decision#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see decisions.Decision#getStatus()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Status();

	/**
	 * Returns the meta object for the attribute '{@link decisions.Decision#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see decisions.Decision#getTimestamp()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Timestamp();

	/**
	 * Returns the meta object for the container reference '{@link decisions.Decision#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see decisions.Decision#getRepository()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Repository();

	/**
	 * Returns the meta object for the reference list '{@link decisions.Decision#getUsedTerms <em>Used Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Terms</em>'.
	 * @see decisions.Decision#getUsedTerms()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_UsedTerms();

	/**
	 * Returns the meta object for class '{@link decisions.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see decisions.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the attribute '{@link decisions.Rationale#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see decisions.Rationale#getDescription()
	 * @see #getRationale()
	 * @generated
	 */
	EAttribute getRationale_Description();

	/**
	 * Returns the meta object for class '{@link decisions.TextDecision <em>Text Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Decision</em>'.
	 * @see decisions.TextDecision
	 * @generated
	 */
	EClass getTextDecision();

	/**
	 * Returns the meta object for class '{@link decisions.TextRationale <em>Text Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Rationale</em>'.
	 * @see decisions.TextRationale
	 * @generated
	 */
	EClass getTextRationale();

	/**
	 * Returns the meta object for enum '{@link decisions.DecisionStatusEnum <em>Decision Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Status Enum</em>'.
	 * @see decisions.DecisionStatusEnum
	 * @generated
	 */
	EEnum getDecisionStatusEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DecisionsFactory getDecisionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link decisions.impl.DecisionRepositoryImpl <em>Decision Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisions.impl.DecisionRepositoryImpl
		 * @see decisions.impl.DecisionsPackageImpl#getDecisionRepository()
		 * @generated
		 */
		EClass DECISION_REPOSITORY = eINSTANCE.getDecisionRepository();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_REPOSITORY__DECISIONS = eINSTANCE.getDecisionRepository_Decisions();

		/**
		 * The meta object literal for the '{@link decisions.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisions.impl.DecisionImpl
		 * @see decisions.impl.DecisionsPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Rationales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__RATIONALES = eINSTANCE.getDecision_Rationales();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__DESCRIPTION = eINSTANCE.getDecision_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__STATUS = eINSTANCE.getDecision_Status();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__TIMESTAMP = eINSTANCE.getDecision_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__REPOSITORY = eINSTANCE.getDecision_Repository();

		/**
		 * The meta object literal for the '<em><b>Used Terms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__USED_TERMS = eINSTANCE.getDecision_UsedTerms();

		/**
		 * The meta object literal for the '{@link decisions.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisions.impl.RationaleImpl
		 * @see decisions.impl.DecisionsPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONALE__DESCRIPTION = eINSTANCE.getRationale_Description();

		/**
		 * The meta object literal for the '{@link decisions.impl.TextDecisionImpl <em>Text Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisions.impl.TextDecisionImpl
		 * @see decisions.impl.DecisionsPackageImpl#getTextDecision()
		 * @generated
		 */
		EClass TEXT_DECISION = eINSTANCE.getTextDecision();

		/**
		 * The meta object literal for the '{@link decisions.impl.TextRationaleImpl <em>Text Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisions.impl.TextRationaleImpl
		 * @see decisions.impl.DecisionsPackageImpl#getTextRationale()
		 * @generated
		 */
		EClass TEXT_RATIONALE = eINSTANCE.getTextRationale();

		/**
		 * The meta object literal for the '{@link decisions.DecisionStatusEnum <em>Decision Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisions.DecisionStatusEnum
		 * @see decisions.impl.DecisionsPackageImpl#getDecisionStatusEnum()
		 * @generated
		 */
		EEnum DECISION_STATUS_ENUM = eINSTANCE.getDecisionStatusEnum();

	}

} //DecisionsPackage
