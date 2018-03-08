/**
 */
package pcmbpoptions;

import archoptions.ArchoptionsPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see pcmbpoptions.PcmbpoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface PcmbpoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmbpoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toometa.de/pcmbpoptions/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmbpoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmbpoptionsPackage eINSTANCE = pcmbpoptions.impl.PcmbpoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcmbpoptions.impl.PCM_EntityOptionImpl <em>PCM Entity Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmbpoptions.impl.PCM_EntityOptionImpl
	 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_EntityOption()
	 * @generated
	 */
	int PCM_ENTITY_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__ID = ArchoptionsPackage.ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__RELATIONS = ArchoptionsPackage.ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__CONFLICTS_WITH = ArchoptionsPackage.ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__HAS_CONFLICTS = ArchoptionsPackage.ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__DUPLICATE_OF = ArchoptionsPackage.ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__HAS_DUPLICATES = ArchoptionsPackage.ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__DEPENDS_ON = ArchoptionsPackage.ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__HAS_DEPENDENTS = ArchoptionsPackage.ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__PARENT_OF = ArchoptionsPackage.ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__SUBPART_OF = ArchoptionsPackage.ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__TRIGGER_OF = ArchoptionsPackage.ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__TRIGGERED_BY = ArchoptionsPackage.ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__RESOLVES = ArchoptionsPackage.ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__RESOLVED_BY = ArchoptionsPackage.ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__ALTERNATIVE_TO = ArchoptionsPackage.ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__HAS_ALTERNATIVES = ArchoptionsPackage.ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__COULD_RESOLVE = ArchoptionsPackage.ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__STAKEHOLDER_OF = ArchoptionsPackage.ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__HAS_STAKEHOLDERS = ArchoptionsPackage.ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__SELECTED = ArchoptionsPackage.ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__SELECTED_BY = ArchoptionsPackage.ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__DESCRIPTION = ArchoptionsPackage.ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__KEYWORDS = ArchoptionsPackage.ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__REPOSITORY = ArchoptionsPackage.ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__RATIONALE = ArchoptionsPackage.ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__IS_MODELLED = ArchoptionsPackage.ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__IS_IMPLEMENTED = ArchoptionsPackage.ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__TIME_STAMP = ArchoptionsPackage.ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__EFFECTS = ArchoptionsPackage.ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__USED_TERMS = ArchoptionsPackage.ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION__ANALYSIS_RATIONALE = ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>PCM Entity Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ENTITY_OPTION_FEATURE_COUNT = ArchoptionsPackage.ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmbpoptions.impl.PCM_IntroduceNewEntityImpl <em>PCM Introduce New Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmbpoptions.impl.PCM_IntroduceNewEntityImpl
	 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_IntroduceNewEntity()
	 * @generated
	 */
	int PCM_INTRODUCE_NEW_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__ID = PCM_ENTITY_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__RELATIONS = PCM_ENTITY_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__CONFLICTS_WITH = PCM_ENTITY_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__HAS_CONFLICTS = PCM_ENTITY_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__DUPLICATE_OF = PCM_ENTITY_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__HAS_DUPLICATES = PCM_ENTITY_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__DEPENDS_ON = PCM_ENTITY_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__HAS_DEPENDENTS = PCM_ENTITY_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__PARENT_OF = PCM_ENTITY_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__SUBPART_OF = PCM_ENTITY_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__TRIGGER_OF = PCM_ENTITY_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__TRIGGERED_BY = PCM_ENTITY_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__RESOLVES = PCM_ENTITY_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__RESOLVED_BY = PCM_ENTITY_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__ALTERNATIVE_TO = PCM_ENTITY_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__HAS_ALTERNATIVES = PCM_ENTITY_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__COULD_RESOLVE = PCM_ENTITY_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__COULD_BE_RESOLVED_BY = PCM_ENTITY_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__STAKEHOLDER_OF = PCM_ENTITY_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__HAS_STAKEHOLDERS = PCM_ENTITY_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__SELECTED = PCM_ENTITY_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__SELECTED_BY = PCM_ENTITY_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__DESCRIPTION = PCM_ENTITY_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__KEYWORDS = PCM_ENTITY_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__REPOSITORY = PCM_ENTITY_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__RATIONALE = PCM_ENTITY_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__IS_MODELLED = PCM_ENTITY_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__IS_IMPLEMENTED = PCM_ENTITY_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__TIME_STAMP = PCM_ENTITY_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__EFFECTS = PCM_ENTITY_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__USED_TERMS = PCM_ENTITY_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__ANALYSIS_RATIONALE = PCM_ENTITY_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY__ENTITIES = PCM_ENTITY_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Introduce New Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ENTITY_FEATURE_COUNT = PCM_ENTITY_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmbpoptions.impl.PCM_ChangeEntityImpl <em>PCM Change Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmbpoptions.impl.PCM_ChangeEntityImpl
	 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_ChangeEntity()
	 * @generated
	 */
	int PCM_CHANGE_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__ID = PCM_ENTITY_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__RELATIONS = PCM_ENTITY_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__CONFLICTS_WITH = PCM_ENTITY_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__HAS_CONFLICTS = PCM_ENTITY_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__DUPLICATE_OF = PCM_ENTITY_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__HAS_DUPLICATES = PCM_ENTITY_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__DEPENDS_ON = PCM_ENTITY_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__HAS_DEPENDENTS = PCM_ENTITY_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__PARENT_OF = PCM_ENTITY_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__SUBPART_OF = PCM_ENTITY_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__TRIGGER_OF = PCM_ENTITY_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__TRIGGERED_BY = PCM_ENTITY_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__RESOLVES = PCM_ENTITY_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__RESOLVED_BY = PCM_ENTITY_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__ALTERNATIVE_TO = PCM_ENTITY_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__HAS_ALTERNATIVES = PCM_ENTITY_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__COULD_RESOLVE = PCM_ENTITY_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__COULD_BE_RESOLVED_BY = PCM_ENTITY_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__STAKEHOLDER_OF = PCM_ENTITY_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__HAS_STAKEHOLDERS = PCM_ENTITY_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__SELECTED = PCM_ENTITY_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__SELECTED_BY = PCM_ENTITY_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__DESCRIPTION = PCM_ENTITY_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__KEYWORDS = PCM_ENTITY_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__REPOSITORY = PCM_ENTITY_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__RATIONALE = PCM_ENTITY_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__IS_MODELLED = PCM_ENTITY_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__IS_IMPLEMENTED = PCM_ENTITY_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__TIME_STAMP = PCM_ENTITY_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__EFFECTS = PCM_ENTITY_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__USED_TERMS = PCM_ENTITY_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__ANALYSIS_RATIONALE = PCM_ENTITY_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__OLD_ENTITIES = PCM_ENTITY_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY__NEW_ENTITIES = PCM_ENTITY_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Change Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ENTITY_FEATURE_COUNT = PCM_ENTITY_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmbpoptions.impl.PCM_RemoveEntityImpl <em>PCM Remove Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmbpoptions.impl.PCM_RemoveEntityImpl
	 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_RemoveEntity()
	 * @generated
	 */
	int PCM_REMOVE_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__ID = PCM_ENTITY_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__RELATIONS = PCM_ENTITY_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__CONFLICTS_WITH = PCM_ENTITY_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__HAS_CONFLICTS = PCM_ENTITY_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__DUPLICATE_OF = PCM_ENTITY_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__HAS_DUPLICATES = PCM_ENTITY_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__DEPENDS_ON = PCM_ENTITY_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__HAS_DEPENDENTS = PCM_ENTITY_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__PARENT_OF = PCM_ENTITY_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__SUBPART_OF = PCM_ENTITY_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__TRIGGER_OF = PCM_ENTITY_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__TRIGGERED_BY = PCM_ENTITY_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__RESOLVES = PCM_ENTITY_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__RESOLVED_BY = PCM_ENTITY_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__ALTERNATIVE_TO = PCM_ENTITY_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__HAS_ALTERNATIVES = PCM_ENTITY_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__COULD_RESOLVE = PCM_ENTITY_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__COULD_BE_RESOLVED_BY = PCM_ENTITY_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__STAKEHOLDER_OF = PCM_ENTITY_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__HAS_STAKEHOLDERS = PCM_ENTITY_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__SELECTED = PCM_ENTITY_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__SELECTED_BY = PCM_ENTITY_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__DESCRIPTION = PCM_ENTITY_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__KEYWORDS = PCM_ENTITY_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__REPOSITORY = PCM_ENTITY_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__RATIONALE = PCM_ENTITY_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__IS_MODELLED = PCM_ENTITY_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__IS_IMPLEMENTED = PCM_ENTITY_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__TIME_STAMP = PCM_ENTITY_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__EFFECTS = PCM_ENTITY_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__USED_TERMS = PCM_ENTITY_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__ANALYSIS_RATIONALE = PCM_ENTITY_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY__ENTITIES = PCM_ENTITY_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Remove Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_ENTITY_FEATURE_COUNT = PCM_ENTITY_OPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link pcmbpoptions.PCM_EntityOption <em>PCM Entity Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Entity Option</em>'.
	 * @see pcmbpoptions.PCM_EntityOption
	 * @generated
	 */
	EClass getPCM_EntityOption();

	/**
	 * Returns the meta object for class '{@link pcmbpoptions.PCM_IntroduceNewEntity <em>PCM Introduce New Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Introduce New Entity</em>'.
	 * @see pcmbpoptions.PCM_IntroduceNewEntity
	 * @generated
	 */
	EClass getPCM_IntroduceNewEntity();

	/**
	 * Returns the meta object for the reference list '{@link pcmbpoptions.PCM_IntroduceNewEntity#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see pcmbpoptions.PCM_IntroduceNewEntity#getEntities()
	 * @see #getPCM_IntroduceNewEntity()
	 * @generated
	 */
	EReference getPCM_IntroduceNewEntity_Entities();

	/**
	 * Returns the meta object for class '{@link pcmbpoptions.PCM_ChangeEntity <em>PCM Change Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Change Entity</em>'.
	 * @see pcmbpoptions.PCM_ChangeEntity
	 * @generated
	 */
	EClass getPCM_ChangeEntity();

	/**
	 * Returns the meta object for the reference list '{@link pcmbpoptions.PCM_ChangeEntity#getOldEntities <em>Old Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Entities</em>'.
	 * @see pcmbpoptions.PCM_ChangeEntity#getOldEntities()
	 * @see #getPCM_ChangeEntity()
	 * @generated
	 */
	EReference getPCM_ChangeEntity_OldEntities();

	/**
	 * Returns the meta object for the reference list '{@link pcmbpoptions.PCM_ChangeEntity#getNewEntities <em>New Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Entities</em>'.
	 * @see pcmbpoptions.PCM_ChangeEntity#getNewEntities()
	 * @see #getPCM_ChangeEntity()
	 * @generated
	 */
	EReference getPCM_ChangeEntity_NewEntities();

	/**
	 * Returns the meta object for class '{@link pcmbpoptions.PCM_RemoveEntity <em>PCM Remove Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Remove Entity</em>'.
	 * @see pcmbpoptions.PCM_RemoveEntity
	 * @generated
	 */
	EClass getPCM_RemoveEntity();

	/**
	 * Returns the meta object for the reference list '{@link pcmbpoptions.PCM_RemoveEntity#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see pcmbpoptions.PCM_RemoveEntity#getEntities()
	 * @see #getPCM_RemoveEntity()
	 * @generated
	 */
	EReference getPCM_RemoveEntity_Entities();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmbpoptionsFactory getPcmbpoptionsFactory();

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
		 * The meta object literal for the '{@link pcmbpoptions.impl.PCM_EntityOptionImpl <em>PCM Entity Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmbpoptions.impl.PCM_EntityOptionImpl
		 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_EntityOption()
		 * @generated
		 */
		EClass PCM_ENTITY_OPTION = eINSTANCE.getPCM_EntityOption();

		/**
		 * The meta object literal for the '{@link pcmbpoptions.impl.PCM_IntroduceNewEntityImpl <em>PCM Introduce New Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmbpoptions.impl.PCM_IntroduceNewEntityImpl
		 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_IntroduceNewEntity()
		 * @generated
		 */
		EClass PCM_INTRODUCE_NEW_ENTITY = eINSTANCE.getPCM_IntroduceNewEntity();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_INTRODUCE_NEW_ENTITY__ENTITIES = eINSTANCE.getPCM_IntroduceNewEntity_Entities();

		/**
		 * The meta object literal for the '{@link pcmbpoptions.impl.PCM_ChangeEntityImpl <em>PCM Change Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmbpoptions.impl.PCM_ChangeEntityImpl
		 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_ChangeEntity()
		 * @generated
		 */
		EClass PCM_CHANGE_ENTITY = eINSTANCE.getPCM_ChangeEntity();

		/**
		 * The meta object literal for the '<em><b>Old Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_ENTITY__OLD_ENTITIES = eINSTANCE.getPCM_ChangeEntity_OldEntities();

		/**
		 * The meta object literal for the '<em><b>New Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_ENTITY__NEW_ENTITIES = eINSTANCE.getPCM_ChangeEntity_NewEntities();

		/**
		 * The meta object literal for the '{@link pcmbpoptions.impl.PCM_RemoveEntityImpl <em>PCM Remove Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmbpoptions.impl.PCM_RemoveEntityImpl
		 * @see pcmbpoptions.impl.PcmbpoptionsPackageImpl#getPCM_RemoveEntity()
		 * @generated
		 */
		EClass PCM_REMOVE_ENTITY = eINSTANCE.getPCM_RemoveEntity();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_REMOVE_ENTITY__ENTITIES = eINSTANCE.getPCM_RemoveEntity_Entities();

	}

} //PcmbpoptionsPackage
