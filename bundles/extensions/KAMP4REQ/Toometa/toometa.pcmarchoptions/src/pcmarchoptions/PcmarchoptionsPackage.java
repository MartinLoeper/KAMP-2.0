/**
 */
package pcmarchoptions;

import archoptions.ArchoptionsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see pcmarchoptions.PcmarchoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface PcmarchoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmarchoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toometa.de/pcmarchoptions/0.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmarchoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmarchoptionsPackage eINSTANCE = pcmarchoptions.impl.PcmarchoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_SplitComponentImpl <em>PCM Split Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_SplitComponentImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_SplitComponent()
	 * @generated
	 */
	int PCM_SPLIT_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__ID = ArchoptionsPackage.SPLIT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__RELATIONS = ArchoptionsPackage.SPLIT_COMPONENT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__CONFLICTS_WITH = ArchoptionsPackage.SPLIT_COMPONENT__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__HAS_CONFLICTS = ArchoptionsPackage.SPLIT_COMPONENT__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__DUPLICATE_OF = ArchoptionsPackage.SPLIT_COMPONENT__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__HAS_DUPLICATES = ArchoptionsPackage.SPLIT_COMPONENT__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__DEPENDS_ON = ArchoptionsPackage.SPLIT_COMPONENT__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__HAS_DEPENDENTS = ArchoptionsPackage.SPLIT_COMPONENT__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__PARENT_OF = ArchoptionsPackage.SPLIT_COMPONENT__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__SUBPART_OF = ArchoptionsPackage.SPLIT_COMPONENT__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__TRIGGER_OF = ArchoptionsPackage.SPLIT_COMPONENT__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__TRIGGERED_BY = ArchoptionsPackage.SPLIT_COMPONENT__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__RESOLVES = ArchoptionsPackage.SPLIT_COMPONENT__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__RESOLVED_BY = ArchoptionsPackage.SPLIT_COMPONENT__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__ALTERNATIVE_TO = ArchoptionsPackage.SPLIT_COMPONENT__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__HAS_ALTERNATIVES = ArchoptionsPackage.SPLIT_COMPONENT__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__COULD_RESOLVE = ArchoptionsPackage.SPLIT_COMPONENT__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__COULD_BE_RESOLVED_BY = ArchoptionsPackage.SPLIT_COMPONENT__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__STAKEHOLDER_OF = ArchoptionsPackage.SPLIT_COMPONENT__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__HAS_STAKEHOLDERS = ArchoptionsPackage.SPLIT_COMPONENT__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__SELECTED = ArchoptionsPackage.SPLIT_COMPONENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__SELECTED_BY = ArchoptionsPackage.SPLIT_COMPONENT__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__DESCRIPTION = ArchoptionsPackage.SPLIT_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__KEYWORDS = ArchoptionsPackage.SPLIT_COMPONENT__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__REPOSITORY = ArchoptionsPackage.SPLIT_COMPONENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__RATIONALE = ArchoptionsPackage.SPLIT_COMPONENT__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__IS_MODELLED = ArchoptionsPackage.SPLIT_COMPONENT__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__IS_IMPLEMENTED = ArchoptionsPackage.SPLIT_COMPONENT__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__TIME_STAMP = ArchoptionsPackage.SPLIT_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__EFFECTS = ArchoptionsPackage.SPLIT_COMPONENT__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__USED_TERMS = ArchoptionsPackage.SPLIT_COMPONENT__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__ANALYSIS_RATIONALE = ArchoptionsPackage.SPLIT_COMPONENT__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Initial Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME = ArchoptionsPackage.SPLIT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT__FINAL_CONTEXTS = ArchoptionsPackage.SPLIT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Split Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_SPLIT_COMPONENT_FEATURE_COUNT = ArchoptionsPackage.SPLIT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_AllocateTogetherImpl <em>PCM Allocate Together</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_AllocateTogetherImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_AllocateTogether()
	 * @generated
	 */
	int PCM_ALLOCATE_TOGETHER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__ID = ArchoptionsPackage.ALLOCATE_TOGETHER__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__RELATIONS = ArchoptionsPackage.ALLOCATE_TOGETHER__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__CONFLICTS_WITH = ArchoptionsPackage.ALLOCATE_TOGETHER__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__HAS_CONFLICTS = ArchoptionsPackage.ALLOCATE_TOGETHER__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__DUPLICATE_OF = ArchoptionsPackage.ALLOCATE_TOGETHER__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__HAS_DUPLICATES = ArchoptionsPackage.ALLOCATE_TOGETHER__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__DEPENDS_ON = ArchoptionsPackage.ALLOCATE_TOGETHER__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__HAS_DEPENDENTS = ArchoptionsPackage.ALLOCATE_TOGETHER__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__PARENT_OF = ArchoptionsPackage.ALLOCATE_TOGETHER__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__SUBPART_OF = ArchoptionsPackage.ALLOCATE_TOGETHER__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__TRIGGER_OF = ArchoptionsPackage.ALLOCATE_TOGETHER__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__TRIGGERED_BY = ArchoptionsPackage.ALLOCATE_TOGETHER__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__RESOLVES = ArchoptionsPackage.ALLOCATE_TOGETHER__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__RESOLVED_BY = ArchoptionsPackage.ALLOCATE_TOGETHER__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__ALTERNATIVE_TO = ArchoptionsPackage.ALLOCATE_TOGETHER__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__HAS_ALTERNATIVES = ArchoptionsPackage.ALLOCATE_TOGETHER__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__COULD_RESOLVE = ArchoptionsPackage.ALLOCATE_TOGETHER__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ALLOCATE_TOGETHER__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__STAKEHOLDER_OF = ArchoptionsPackage.ALLOCATE_TOGETHER__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__HAS_STAKEHOLDERS = ArchoptionsPackage.ALLOCATE_TOGETHER__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__SELECTED = ArchoptionsPackage.ALLOCATE_TOGETHER__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__SELECTED_BY = ArchoptionsPackage.ALLOCATE_TOGETHER__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__DESCRIPTION = ArchoptionsPackage.ALLOCATE_TOGETHER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__KEYWORDS = ArchoptionsPackage.ALLOCATE_TOGETHER__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__REPOSITORY = ArchoptionsPackage.ALLOCATE_TOGETHER__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__RATIONALE = ArchoptionsPackage.ALLOCATE_TOGETHER__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__IS_MODELLED = ArchoptionsPackage.ALLOCATE_TOGETHER__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__IS_IMPLEMENTED = ArchoptionsPackage.ALLOCATE_TOGETHER__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__TIME_STAMP = ArchoptionsPackage.ALLOCATE_TOGETHER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__EFFECTS = ArchoptionsPackage.ALLOCATE_TOGETHER__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__USED_TERMS = ArchoptionsPackage.ALLOCATE_TOGETHER__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__ANALYSIS_RATIONALE = ArchoptionsPackage.ALLOCATE_TOGETHER__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER__ALLOCATION_CONTEXTS = ArchoptionsPackage.ALLOCATE_TOGETHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Allocate Together</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_TOGETHER_FEATURE_COUNT = ArchoptionsPackage.ALLOCATE_TOGETHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_NeverAllocateToSpecificNodesImpl <em>PCM Never Allocate To Specific Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_NeverAllocateToSpecificNodesImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_NeverAllocateToSpecificNodes()
	 * @generated
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ID = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__RELATIONS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__CONFLICTS_WITH = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_CONFLICTS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__DUPLICATE_OF = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_DUPLICATES = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__DEPENDS_ON = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_DEPENDENTS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__PARENT_OF = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__SUBPART_OF = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__TRIGGER_OF = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__TRIGGERED_BY = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__RESOLVES = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__RESOLVED_BY = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALTERNATIVE_TO = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_ALTERNATIVES = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__COULD_RESOLVE = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__COULD_BE_RESOLVED_BY = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__STAKEHOLDER_OF = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_STAKEHOLDERS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__SELECTED = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__SELECTED_BY = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__DESCRIPTION = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__KEYWORDS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__REPOSITORY = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__RATIONALE = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__IS_MODELLED = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__IS_IMPLEMENTED = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__TIME_STAMP = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__EFFECTS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__USED_TERMS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ANALYSIS_RATIONALE = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hw Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Never Allocate To Specific Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES_FEATURE_COUNT = ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_IntroduceNewAdapterImpl <em>PCM Introduce New Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_IntroduceNewAdapterImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewAdapter()
	 * @generated
	 */
	int PCM_INTRODUCE_NEW_ADAPTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__ID = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__RELATIONS = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__CONFLICTS_WITH = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__HAS_CONFLICTS = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__DUPLICATE_OF = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__HAS_DUPLICATES = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__DEPENDS_ON = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__HAS_DEPENDENTS = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__PARENT_OF = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__SUBPART_OF = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__TRIGGER_OF = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__TRIGGERED_BY = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__RESOLVES = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__ALTERNATIVE_TO = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__HAS_ALTERNATIVES = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__COULD_RESOLVE = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__COULD_BE_RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__STAKEHOLDER_OF = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__HAS_STAKEHOLDERS = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__SELECTED = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__SELECTED_BY = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__DESCRIPTION = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__KEYWORDS = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__REPOSITORY = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__IS_MODELLED = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__IS_IMPLEMENTED = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__TIME_STAMP = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__EFFECTS = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__USED_TERMS = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__ANALYSIS_RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Adapter Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Being Adapted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Introduce New Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_ADAPTER_FEATURE_COUNT = ArchoptionsPackage.INTRODUCE_NEW_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_IntroduceNewComponentImpl <em>PCM Introduce New Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_IntroduceNewComponentImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewComponent()
	 * @generated
	 */
	int PCM_INTRODUCE_NEW_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__ID = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__RELATIONS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__CONFLICTS_WITH = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__HAS_CONFLICTS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__DUPLICATE_OF = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__HAS_DUPLICATES = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__DEPENDS_ON = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__HAS_DEPENDENTS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__PARENT_OF = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__SUBPART_OF = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__TRIGGER_OF = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__TRIGGERED_BY = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__RESOLVES = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__ALTERNATIVE_TO = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__HAS_ALTERNATIVES = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__COULD_RESOLVE = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__COULD_BE_RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__STAKEHOLDER_OF = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__HAS_STAKEHOLDERS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__SELECTED = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__SELECTED_BY = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__DESCRIPTION = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__KEYWORDS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__REPOSITORY = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__IS_MODELLED = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__IS_IMPLEMENTED = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__TIME_STAMP = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__EFFECTS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__USED_TERMS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__ANALYSIS_RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXTS = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Introduce New Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_COMPONENT_FEATURE_COUNT = ArchoptionsPackage.INTRODUCE_NEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_MoveComponentsImpl <em>PCM Move Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_MoveComponentsImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MoveComponents()
	 * @generated
	 */
	int PCM_MOVE_COMPONENTS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__ID = ArchoptionsPackage.MOVE_COMPONENTS__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__RELATIONS = ArchoptionsPackage.MOVE_COMPONENTS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__CONFLICTS_WITH = ArchoptionsPackage.MOVE_COMPONENTS__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__HAS_CONFLICTS = ArchoptionsPackage.MOVE_COMPONENTS__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__DUPLICATE_OF = ArchoptionsPackage.MOVE_COMPONENTS__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__HAS_DUPLICATES = ArchoptionsPackage.MOVE_COMPONENTS__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__DEPENDS_ON = ArchoptionsPackage.MOVE_COMPONENTS__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__HAS_DEPENDENTS = ArchoptionsPackage.MOVE_COMPONENTS__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__PARENT_OF = ArchoptionsPackage.MOVE_COMPONENTS__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__SUBPART_OF = ArchoptionsPackage.MOVE_COMPONENTS__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__TRIGGER_OF = ArchoptionsPackage.MOVE_COMPONENTS__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__TRIGGERED_BY = ArchoptionsPackage.MOVE_COMPONENTS__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__RESOLVES = ArchoptionsPackage.MOVE_COMPONENTS__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__RESOLVED_BY = ArchoptionsPackage.MOVE_COMPONENTS__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__ALTERNATIVE_TO = ArchoptionsPackage.MOVE_COMPONENTS__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__HAS_ALTERNATIVES = ArchoptionsPackage.MOVE_COMPONENTS__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__COULD_RESOLVE = ArchoptionsPackage.MOVE_COMPONENTS__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__COULD_BE_RESOLVED_BY = ArchoptionsPackage.MOVE_COMPONENTS__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__STAKEHOLDER_OF = ArchoptionsPackage.MOVE_COMPONENTS__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__HAS_STAKEHOLDERS = ArchoptionsPackage.MOVE_COMPONENTS__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__SELECTED = ArchoptionsPackage.MOVE_COMPONENTS__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__SELECTED_BY = ArchoptionsPackage.MOVE_COMPONENTS__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__DESCRIPTION = ArchoptionsPackage.MOVE_COMPONENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__KEYWORDS = ArchoptionsPackage.MOVE_COMPONENTS__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__REPOSITORY = ArchoptionsPackage.MOVE_COMPONENTS__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__RATIONALE = ArchoptionsPackage.MOVE_COMPONENTS__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__IS_MODELLED = ArchoptionsPackage.MOVE_COMPONENTS__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__IS_IMPLEMENTED = ArchoptionsPackage.MOVE_COMPONENTS__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__TIME_STAMP = ArchoptionsPackage.MOVE_COMPONENTS__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__EFFECTS = ArchoptionsPackage.MOVE_COMPONENTS__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__USED_TERMS = ArchoptionsPackage.MOVE_COMPONENTS__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__ANALYSIS_RATIONALE = ArchoptionsPackage.MOVE_COMPONENTS__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS = ArchoptionsPackage.MOVE_COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Hw Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__FROM_HW_NODE = ArchoptionsPackage.MOVE_COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Hw Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS__TO_HW_NODE = ArchoptionsPackage.MOVE_COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PCM Move Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MOVE_COMPONENTS_FEATURE_COUNT = ArchoptionsPackage.MOVE_COMPONENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_OnlySingleInstantiationImpl <em>PCM Only Single Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_OnlySingleInstantiationImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_OnlySingleInstantiation()
	 * @generated
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__ID = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__RELATIONS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__CONFLICTS_WITH = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__HAS_CONFLICTS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__DUPLICATE_OF = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__HAS_DUPLICATES = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__DEPENDS_ON = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__HAS_DEPENDENTS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__PARENT_OF = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__SUBPART_OF = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__TRIGGER_OF = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__TRIGGERED_BY = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__RESOLVES = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__RESOLVED_BY = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__ALTERNATIVE_TO = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__HAS_ALTERNATIVES = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__COULD_RESOLVE = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__STAKEHOLDER_OF = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__HAS_STAKEHOLDERS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__SELECTED = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__SELECTED_BY = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__DESCRIPTION = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__KEYWORDS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__REPOSITORY = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__RATIONALE = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__IS_MODELLED = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__IS_IMPLEMENTED = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__TIME_STAMP = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__EFFECTS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__USED_TERMS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__ANALYSIS_RATIONALE = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION__ASSEMBLY_CONTEXTS = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Only Single Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_INSTANTIATION_FEATURE_COUNT = ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_ChangeRolesImpl <em>PCM Change Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_ChangeRolesImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ChangeRoles()
	 * @generated
	 */
	int PCM_CHANGE_ROLES = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__ID = ArchoptionsPackage.CHANGE_ROLES__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__RELATIONS = ArchoptionsPackage.CHANGE_ROLES__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__CONFLICTS_WITH = ArchoptionsPackage.CHANGE_ROLES__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__HAS_CONFLICTS = ArchoptionsPackage.CHANGE_ROLES__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__DUPLICATE_OF = ArchoptionsPackage.CHANGE_ROLES__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__HAS_DUPLICATES = ArchoptionsPackage.CHANGE_ROLES__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__DEPENDS_ON = ArchoptionsPackage.CHANGE_ROLES__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__HAS_DEPENDENTS = ArchoptionsPackage.CHANGE_ROLES__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__PARENT_OF = ArchoptionsPackage.CHANGE_ROLES__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__SUBPART_OF = ArchoptionsPackage.CHANGE_ROLES__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__TRIGGER_OF = ArchoptionsPackage.CHANGE_ROLES__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__TRIGGERED_BY = ArchoptionsPackage.CHANGE_ROLES__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__RESOLVES = ArchoptionsPackage.CHANGE_ROLES__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__RESOLVED_BY = ArchoptionsPackage.CHANGE_ROLES__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__ALTERNATIVE_TO = ArchoptionsPackage.CHANGE_ROLES__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__HAS_ALTERNATIVES = ArchoptionsPackage.CHANGE_ROLES__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__COULD_RESOLVE = ArchoptionsPackage.CHANGE_ROLES__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__COULD_BE_RESOLVED_BY = ArchoptionsPackage.CHANGE_ROLES__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__STAKEHOLDER_OF = ArchoptionsPackage.CHANGE_ROLES__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__HAS_STAKEHOLDERS = ArchoptionsPackage.CHANGE_ROLES__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__SELECTED = ArchoptionsPackage.CHANGE_ROLES__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__SELECTED_BY = ArchoptionsPackage.CHANGE_ROLES__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__DESCRIPTION = ArchoptionsPackage.CHANGE_ROLES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__KEYWORDS = ArchoptionsPackage.CHANGE_ROLES__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__REPOSITORY = ArchoptionsPackage.CHANGE_ROLES__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__RATIONALE = ArchoptionsPackage.CHANGE_ROLES__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__IS_MODELLED = ArchoptionsPackage.CHANGE_ROLES__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__IS_IMPLEMENTED = ArchoptionsPackage.CHANGE_ROLES__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__TIME_STAMP = ArchoptionsPackage.CHANGE_ROLES__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__EFFECTS = ArchoptionsPackage.CHANGE_ROLES__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__USED_TERMS = ArchoptionsPackage.CHANGE_ROLES__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__ANALYSIS_RATIONALE = ArchoptionsPackage.CHANGE_ROLES__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT = ArchoptionsPackage.CHANGE_ROLES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES__ROLES = ArchoptionsPackage.CHANGE_ROLES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Change Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_ROLES_FEATURE_COUNT = ArchoptionsPackage.CHANGE_ROLES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_AllocateNeverTogetherImpl <em>PCM Allocate Never Together</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_AllocateNeverTogetherImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_AllocateNeverTogether()
	 * @generated
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__ID = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__RELATIONS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__CONFLICTS_WITH = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__HAS_CONFLICTS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__DUPLICATE_OF = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__HAS_DUPLICATES = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__DEPENDS_ON = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__HAS_DEPENDENTS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__PARENT_OF = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__SUBPART_OF = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__TRIGGER_OF = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__TRIGGERED_BY = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__RESOLVES = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__RESOLVED_BY = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__ALTERNATIVE_TO = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__HAS_ALTERNATIVES = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__COULD_RESOLVE = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__STAKEHOLDER_OF = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__HAS_STAKEHOLDERS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__SELECTED = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__SELECTED_BY = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__DESCRIPTION = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__KEYWORDS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__REPOSITORY = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__RATIONALE = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__IS_MODELLED = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__IS_IMPLEMENTED = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__TIME_STAMP = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__EFFECTS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__USED_TERMS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__ANALYSIS_RATIONALE = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER__ALLOCATION_CONTEXTS = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Allocate Never Together</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ALLOCATE_NEVER_TOGETHER_FEATURE_COUNT = ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_MultipleInstantiationImpl <em>PCM Multiple Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_MultipleInstantiationImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MultipleInstantiation()
	 * @generated
	 */
	int PCM_MULTIPLE_INSTANTIATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__ID = ArchoptionsPackage.MULTIPLE_INSTANTIATION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__RELATIONS = ArchoptionsPackage.MULTIPLE_INSTANTIATION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__CONFLICTS_WITH = ArchoptionsPackage.MULTIPLE_INSTANTIATION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__HAS_CONFLICTS = ArchoptionsPackage.MULTIPLE_INSTANTIATION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__DUPLICATE_OF = ArchoptionsPackage.MULTIPLE_INSTANTIATION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__HAS_DUPLICATES = ArchoptionsPackage.MULTIPLE_INSTANTIATION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__DEPENDS_ON = ArchoptionsPackage.MULTIPLE_INSTANTIATION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__HAS_DEPENDENTS = ArchoptionsPackage.MULTIPLE_INSTANTIATION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__PARENT_OF = ArchoptionsPackage.MULTIPLE_INSTANTIATION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__SUBPART_OF = ArchoptionsPackage.MULTIPLE_INSTANTIATION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__TRIGGER_OF = ArchoptionsPackage.MULTIPLE_INSTANTIATION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__TRIGGERED_BY = ArchoptionsPackage.MULTIPLE_INSTANTIATION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__RESOLVES = ArchoptionsPackage.MULTIPLE_INSTANTIATION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__RESOLVED_BY = ArchoptionsPackage.MULTIPLE_INSTANTIATION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__ALTERNATIVE_TO = ArchoptionsPackage.MULTIPLE_INSTANTIATION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__HAS_ALTERNATIVES = ArchoptionsPackage.MULTIPLE_INSTANTIATION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__COULD_RESOLVE = ArchoptionsPackage.MULTIPLE_INSTANTIATION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.MULTIPLE_INSTANTIATION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__STAKEHOLDER_OF = ArchoptionsPackage.MULTIPLE_INSTANTIATION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__HAS_STAKEHOLDERS = ArchoptionsPackage.MULTIPLE_INSTANTIATION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__SELECTED = ArchoptionsPackage.MULTIPLE_INSTANTIATION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__SELECTED_BY = ArchoptionsPackage.MULTIPLE_INSTANTIATION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__DESCRIPTION = ArchoptionsPackage.MULTIPLE_INSTANTIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__KEYWORDS = ArchoptionsPackage.MULTIPLE_INSTANTIATION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__REPOSITORY = ArchoptionsPackage.MULTIPLE_INSTANTIATION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__RATIONALE = ArchoptionsPackage.MULTIPLE_INSTANTIATION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__IS_MODELLED = ArchoptionsPackage.MULTIPLE_INSTANTIATION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__IS_IMPLEMENTED = ArchoptionsPackage.MULTIPLE_INSTANTIATION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__TIME_STAMP = ArchoptionsPackage.MULTIPLE_INSTANTIATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__EFFECTS = ArchoptionsPackage.MULTIPLE_INSTANTIATION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__USED_TERMS = ArchoptionsPackage.MULTIPLE_INSTANTIATION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__ANALYSIS_RATIONALE = ArchoptionsPackage.MULTIPLE_INSTANTIATION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION__ASSEMBLY_CONTEXTS = ArchoptionsPackage.MULTIPLE_INSTANTIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Multiple Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_INSTANTIATION_FEATURE_COUNT = ArchoptionsPackage.MULTIPLE_INSTANTIATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_BanComponentImpl <em>PCM Ban Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_BanComponentImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_BanComponent()
	 * @generated
	 */
	int PCM_BAN_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__ID = ArchoptionsPackage.BAN_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__RELATIONS = ArchoptionsPackage.BAN_COMPONENT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__CONFLICTS_WITH = ArchoptionsPackage.BAN_COMPONENT__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__HAS_CONFLICTS = ArchoptionsPackage.BAN_COMPONENT__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__DUPLICATE_OF = ArchoptionsPackage.BAN_COMPONENT__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__HAS_DUPLICATES = ArchoptionsPackage.BAN_COMPONENT__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__DEPENDS_ON = ArchoptionsPackage.BAN_COMPONENT__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__HAS_DEPENDENTS = ArchoptionsPackage.BAN_COMPONENT__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__PARENT_OF = ArchoptionsPackage.BAN_COMPONENT__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__SUBPART_OF = ArchoptionsPackage.BAN_COMPONENT__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__TRIGGER_OF = ArchoptionsPackage.BAN_COMPONENT__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__TRIGGERED_BY = ArchoptionsPackage.BAN_COMPONENT__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__RESOLVES = ArchoptionsPackage.BAN_COMPONENT__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__RESOLVED_BY = ArchoptionsPackage.BAN_COMPONENT__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__ALTERNATIVE_TO = ArchoptionsPackage.BAN_COMPONENT__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__HAS_ALTERNATIVES = ArchoptionsPackage.BAN_COMPONENT__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__COULD_RESOLVE = ArchoptionsPackage.BAN_COMPONENT__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__COULD_BE_RESOLVED_BY = ArchoptionsPackage.BAN_COMPONENT__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__STAKEHOLDER_OF = ArchoptionsPackage.BAN_COMPONENT__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__HAS_STAKEHOLDERS = ArchoptionsPackage.BAN_COMPONENT__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__SELECTED = ArchoptionsPackage.BAN_COMPONENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__SELECTED_BY = ArchoptionsPackage.BAN_COMPONENT__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__DESCRIPTION = ArchoptionsPackage.BAN_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__KEYWORDS = ArchoptionsPackage.BAN_COMPONENT__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__REPOSITORY = ArchoptionsPackage.BAN_COMPONENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__RATIONALE = ArchoptionsPackage.BAN_COMPONENT__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__IS_MODELLED = ArchoptionsPackage.BAN_COMPONENT__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__IS_IMPLEMENTED = ArchoptionsPackage.BAN_COMPONENT__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__TIME_STAMP = ArchoptionsPackage.BAN_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__EFFECTS = ArchoptionsPackage.BAN_COMPONENT__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__USED_TERMS = ArchoptionsPackage.BAN_COMPONENT__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__ANALYSIS_RATIONALE = ArchoptionsPackage.BAN_COMPONENT__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Banned Context Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES = ArchoptionsPackage.BAN_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Ban Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BAN_COMPONENT_FEATURE_COUNT = ArchoptionsPackage.BAN_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_MultipleAllocationImpl <em>PCM Multiple Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_MultipleAllocationImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MultipleAllocation()
	 * @generated
	 */
	int PCM_MULTIPLE_ALLOCATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__ID = ArchoptionsPackage.MULTIPLE_ALLOCATION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__RELATIONS = ArchoptionsPackage.MULTIPLE_ALLOCATION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__CONFLICTS_WITH = ArchoptionsPackage.MULTIPLE_ALLOCATION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__HAS_CONFLICTS = ArchoptionsPackage.MULTIPLE_ALLOCATION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__DUPLICATE_OF = ArchoptionsPackage.MULTIPLE_ALLOCATION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__HAS_DUPLICATES = ArchoptionsPackage.MULTIPLE_ALLOCATION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__DEPENDS_ON = ArchoptionsPackage.MULTIPLE_ALLOCATION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__HAS_DEPENDENTS = ArchoptionsPackage.MULTIPLE_ALLOCATION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__PARENT_OF = ArchoptionsPackage.MULTIPLE_ALLOCATION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__SUBPART_OF = ArchoptionsPackage.MULTIPLE_ALLOCATION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__TRIGGER_OF = ArchoptionsPackage.MULTIPLE_ALLOCATION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__TRIGGERED_BY = ArchoptionsPackage.MULTIPLE_ALLOCATION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__RESOLVES = ArchoptionsPackage.MULTIPLE_ALLOCATION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__RESOLVED_BY = ArchoptionsPackage.MULTIPLE_ALLOCATION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__ALTERNATIVE_TO = ArchoptionsPackage.MULTIPLE_ALLOCATION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__HAS_ALTERNATIVES = ArchoptionsPackage.MULTIPLE_ALLOCATION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__COULD_RESOLVE = ArchoptionsPackage.MULTIPLE_ALLOCATION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.MULTIPLE_ALLOCATION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__STAKEHOLDER_OF = ArchoptionsPackage.MULTIPLE_ALLOCATION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__HAS_STAKEHOLDERS = ArchoptionsPackage.MULTIPLE_ALLOCATION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__SELECTED = ArchoptionsPackage.MULTIPLE_ALLOCATION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__SELECTED_BY = ArchoptionsPackage.MULTIPLE_ALLOCATION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__DESCRIPTION = ArchoptionsPackage.MULTIPLE_ALLOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__KEYWORDS = ArchoptionsPackage.MULTIPLE_ALLOCATION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__REPOSITORY = ArchoptionsPackage.MULTIPLE_ALLOCATION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__RATIONALE = ArchoptionsPackage.MULTIPLE_ALLOCATION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__IS_MODELLED = ArchoptionsPackage.MULTIPLE_ALLOCATION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__IS_IMPLEMENTED = ArchoptionsPackage.MULTIPLE_ALLOCATION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__TIME_STAMP = ArchoptionsPackage.MULTIPLE_ALLOCATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__EFFECTS = ArchoptionsPackage.MULTIPLE_ALLOCATION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__USED_TERMS = ArchoptionsPackage.MULTIPLE_ALLOCATION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__ANALYSIS_RATIONALE = ArchoptionsPackage.MULTIPLE_ALLOCATION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION__ALLOCATION_CONTEXTS = ArchoptionsPackage.MULTIPLE_ALLOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Multiple Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MULTIPLE_ALLOCATION_FEATURE_COUNT = ArchoptionsPackage.MULTIPLE_ALLOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_ProvidedFunctionalityImpl <em>PCM Provided Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_ProvidedFunctionalityImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ProvidedFunctionality()
	 * @generated
	 */
	int PCM_PROVIDED_FUNCTIONALITY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__ID = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__RELATIONS = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__CONFLICTS_WITH = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__HAS_CONFLICTS = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__DUPLICATE_OF = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__HAS_DUPLICATES = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__DEPENDS_ON = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__HAS_DEPENDENTS = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__PARENT_OF = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__SUBPART_OF = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__TRIGGER_OF = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__TRIGGERED_BY = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__RESOLVES = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__RESOLVED_BY = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__ALTERNATIVE_TO = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__HAS_ALTERNATIVES = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__COULD_RESOLVE = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__COULD_BE_RESOLVED_BY = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__STAKEHOLDER_OF = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__HAS_STAKEHOLDERS = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__SELECTED = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__SELECTED_BY = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__DESCRIPTION = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__KEYWORDS = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__REPOSITORY = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__RATIONALE = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__IS_MODELLED = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__IS_IMPLEMENTED = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__TIME_STAMP = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__EFFECTS = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__USED_TERMS = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__ANALYSIS_RATIONALE = ArchoptionsPackage.PROVIDED_FUNCTIONALITY__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES = ArchoptionsPackage.PROVIDED_FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Provided Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_FUNCTIONALITY_FEATURE_COUNT = ArchoptionsPackage.PROVIDED_FUNCTIONALITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_ReplaceComponentsImpl <em>PCM Replace Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_ReplaceComponentsImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ReplaceComponents()
	 * @generated
	 */
	int PCM_REPLACE_COMPONENTS = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__ID = ArchoptionsPackage.REPLACE_COMPONENTS__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__RELATIONS = ArchoptionsPackage.REPLACE_COMPONENTS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__CONFLICTS_WITH = ArchoptionsPackage.REPLACE_COMPONENTS__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__HAS_CONFLICTS = ArchoptionsPackage.REPLACE_COMPONENTS__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__DUPLICATE_OF = ArchoptionsPackage.REPLACE_COMPONENTS__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__HAS_DUPLICATES = ArchoptionsPackage.REPLACE_COMPONENTS__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__DEPENDS_ON = ArchoptionsPackage.REPLACE_COMPONENTS__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__HAS_DEPENDENTS = ArchoptionsPackage.REPLACE_COMPONENTS__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__PARENT_OF = ArchoptionsPackage.REPLACE_COMPONENTS__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__SUBPART_OF = ArchoptionsPackage.REPLACE_COMPONENTS__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__TRIGGER_OF = ArchoptionsPackage.REPLACE_COMPONENTS__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__TRIGGERED_BY = ArchoptionsPackage.REPLACE_COMPONENTS__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__RESOLVES = ArchoptionsPackage.REPLACE_COMPONENTS__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__RESOLVED_BY = ArchoptionsPackage.REPLACE_COMPONENTS__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__ALTERNATIVE_TO = ArchoptionsPackage.REPLACE_COMPONENTS__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__HAS_ALTERNATIVES = ArchoptionsPackage.REPLACE_COMPONENTS__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__COULD_RESOLVE = ArchoptionsPackage.REPLACE_COMPONENTS__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__COULD_BE_RESOLVED_BY = ArchoptionsPackage.REPLACE_COMPONENTS__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__STAKEHOLDER_OF = ArchoptionsPackage.REPLACE_COMPONENTS__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__HAS_STAKEHOLDERS = ArchoptionsPackage.REPLACE_COMPONENTS__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__SELECTED = ArchoptionsPackage.REPLACE_COMPONENTS__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__SELECTED_BY = ArchoptionsPackage.REPLACE_COMPONENTS__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__DESCRIPTION = ArchoptionsPackage.REPLACE_COMPONENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__KEYWORDS = ArchoptionsPackage.REPLACE_COMPONENTS__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__REPOSITORY = ArchoptionsPackage.REPLACE_COMPONENTS__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__RATIONALE = ArchoptionsPackage.REPLACE_COMPONENTS__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__IS_MODELLED = ArchoptionsPackage.REPLACE_COMPONENTS__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__IS_IMPLEMENTED = ArchoptionsPackage.REPLACE_COMPONENTS__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__TIME_STAMP = ArchoptionsPackage.REPLACE_COMPONENTS__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__EFFECTS = ArchoptionsPackage.REPLACE_COMPONENTS__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__USED_TERMS = ArchoptionsPackage.REPLACE_COMPONENTS__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__ANALYSIS_RATIONALE = ArchoptionsPackage.REPLACE_COMPONENTS__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Contexts Replaced With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH = ArchoptionsPackage.REPLACE_COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replaced Context Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES = ArchoptionsPackage.REPLACE_COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Replace Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REPLACE_COMPONENTS_FEATURE_COUNT = ArchoptionsPackage.REPLACE_COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_ReuseComponentImpl <em>PCM Reuse Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_ReuseComponentImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ReuseComponent()
	 * @generated
	 */
	int PCM_REUSE_COMPONENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__ID = ArchoptionsPackage.REUSE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__RELATIONS = ArchoptionsPackage.REUSE_COMPONENT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__CONFLICTS_WITH = ArchoptionsPackage.REUSE_COMPONENT__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__HAS_CONFLICTS = ArchoptionsPackage.REUSE_COMPONENT__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__DUPLICATE_OF = ArchoptionsPackage.REUSE_COMPONENT__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__HAS_DUPLICATES = ArchoptionsPackage.REUSE_COMPONENT__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__DEPENDS_ON = ArchoptionsPackage.REUSE_COMPONENT__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__HAS_DEPENDENTS = ArchoptionsPackage.REUSE_COMPONENT__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__PARENT_OF = ArchoptionsPackage.REUSE_COMPONENT__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__SUBPART_OF = ArchoptionsPackage.REUSE_COMPONENT__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__TRIGGER_OF = ArchoptionsPackage.REUSE_COMPONENT__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__TRIGGERED_BY = ArchoptionsPackage.REUSE_COMPONENT__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__RESOLVES = ArchoptionsPackage.REUSE_COMPONENT__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__RESOLVED_BY = ArchoptionsPackage.REUSE_COMPONENT__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__ALTERNATIVE_TO = ArchoptionsPackage.REUSE_COMPONENT__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__HAS_ALTERNATIVES = ArchoptionsPackage.REUSE_COMPONENT__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__COULD_RESOLVE = ArchoptionsPackage.REUSE_COMPONENT__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__COULD_BE_RESOLVED_BY = ArchoptionsPackage.REUSE_COMPONENT__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__STAKEHOLDER_OF = ArchoptionsPackage.REUSE_COMPONENT__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__HAS_STAKEHOLDERS = ArchoptionsPackage.REUSE_COMPONENT__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__SELECTED = ArchoptionsPackage.REUSE_COMPONENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__SELECTED_BY = ArchoptionsPackage.REUSE_COMPONENT__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__DESCRIPTION = ArchoptionsPackage.REUSE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__KEYWORDS = ArchoptionsPackage.REUSE_COMPONENT__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__REPOSITORY = ArchoptionsPackage.REUSE_COMPONENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__RATIONALE = ArchoptionsPackage.REUSE_COMPONENT__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__IS_MODELLED = ArchoptionsPackage.REUSE_COMPONENT__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__IS_IMPLEMENTED = ArchoptionsPackage.REUSE_COMPONENT__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__TIME_STAMP = ArchoptionsPackage.REUSE_COMPONENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__EFFECTS = ArchoptionsPackage.REUSE_COMPONENT__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__USED_TERMS = ArchoptionsPackage.REUSE_COMPONENT__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__ANALYSIS_RATIONALE = ArchoptionsPackage.REUSE_COMPONENT__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS = ArchoptionsPackage.REUSE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Reuse Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REUSE_COMPONENT_FEATURE_COUNT = ArchoptionsPackage.REUSE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_FunctionalityConnectionImpl <em>PCM Functionality Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_FunctionalityConnectionImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_FunctionalityConnection()
	 * @generated
	 */
	int PCM_FUNCTIONALITY_CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__ID = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__RELATIONS = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__CONFLICTS_WITH = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__HAS_CONFLICTS = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__DUPLICATE_OF = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__HAS_DUPLICATES = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__DEPENDS_ON = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__HAS_DEPENDENTS = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__PARENT_OF = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__SUBPART_OF = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__TRIGGER_OF = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__TRIGGERED_BY = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__RESOLVES = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__RESOLVED_BY = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__ALTERNATIVE_TO = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__HAS_ALTERNATIVES = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__COULD_RESOLVE = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__STAKEHOLDER_OF = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__HAS_STAKEHOLDERS = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__SELECTED = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__SELECTED_BY = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__DESCRIPTION = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__KEYWORDS = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__REPOSITORY = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__RATIONALE = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__IS_MODELLED = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__IS_IMPLEMENTED = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__TIME_STAMP = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__EFFECTS = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__USED_TERMS = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__ANALYSIS_RATIONALE = ArchoptionsPackage.FUNCTIONALITY_CONNECTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__CONNECTOR = ArchoptionsPackage.FUNCTIONALITY_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE = ArchoptionsPackage.FUNCTIONALITY_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE = ArchoptionsPackage.FUNCTIONALITY_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PCM Functionality Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FUNCTIONALITY_CONNECTION_FEATURE_COUNT = ArchoptionsPackage.FUNCTIONALITY_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_MergeComponentsImpl <em>PCM Merge Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_MergeComponentsImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MergeComponents()
	 * @generated
	 */
	int PCM_MERGE_COMPONENTS = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__ID = ArchoptionsPackage.MERGE_COMPONENTS__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__RELATIONS = ArchoptionsPackage.MERGE_COMPONENTS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__CONFLICTS_WITH = ArchoptionsPackage.MERGE_COMPONENTS__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__HAS_CONFLICTS = ArchoptionsPackage.MERGE_COMPONENTS__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__DUPLICATE_OF = ArchoptionsPackage.MERGE_COMPONENTS__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__HAS_DUPLICATES = ArchoptionsPackage.MERGE_COMPONENTS__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__DEPENDS_ON = ArchoptionsPackage.MERGE_COMPONENTS__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__HAS_DEPENDENTS = ArchoptionsPackage.MERGE_COMPONENTS__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__PARENT_OF = ArchoptionsPackage.MERGE_COMPONENTS__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__SUBPART_OF = ArchoptionsPackage.MERGE_COMPONENTS__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__TRIGGER_OF = ArchoptionsPackage.MERGE_COMPONENTS__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__TRIGGERED_BY = ArchoptionsPackage.MERGE_COMPONENTS__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__RESOLVES = ArchoptionsPackage.MERGE_COMPONENTS__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__RESOLVED_BY = ArchoptionsPackage.MERGE_COMPONENTS__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__ALTERNATIVE_TO = ArchoptionsPackage.MERGE_COMPONENTS__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__HAS_ALTERNATIVES = ArchoptionsPackage.MERGE_COMPONENTS__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__COULD_RESOLVE = ArchoptionsPackage.MERGE_COMPONENTS__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__COULD_BE_RESOLVED_BY = ArchoptionsPackage.MERGE_COMPONENTS__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__STAKEHOLDER_OF = ArchoptionsPackage.MERGE_COMPONENTS__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__HAS_STAKEHOLDERS = ArchoptionsPackage.MERGE_COMPONENTS__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__SELECTED = ArchoptionsPackage.MERGE_COMPONENTS__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__SELECTED_BY = ArchoptionsPackage.MERGE_COMPONENTS__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__DESCRIPTION = ArchoptionsPackage.MERGE_COMPONENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__KEYWORDS = ArchoptionsPackage.MERGE_COMPONENTS__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__REPOSITORY = ArchoptionsPackage.MERGE_COMPONENTS__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__RATIONALE = ArchoptionsPackage.MERGE_COMPONENTS__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__IS_MODELLED = ArchoptionsPackage.MERGE_COMPONENTS__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__IS_IMPLEMENTED = ArchoptionsPackage.MERGE_COMPONENTS__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__TIME_STAMP = ArchoptionsPackage.MERGE_COMPONENTS__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__EFFECTS = ArchoptionsPackage.MERGE_COMPONENTS__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__USED_TERMS = ArchoptionsPackage.MERGE_COMPONENTS__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__ANALYSIS_RATIONALE = ArchoptionsPackage.MERGE_COMPONENTS__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Initial Contexts Name List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST = ArchoptionsPackage.MERGE_COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS__FINAL_CONTEXT = ArchoptionsPackage.MERGE_COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Merge Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_MERGE_COMPONENTS_FEATURE_COUNT = ArchoptionsPackage.MERGE_COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_OnlySingleAllocationImpl <em>PCM Only Single Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_OnlySingleAllocationImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_OnlySingleAllocation()
	 * @generated
	 */
	int PCM_ONLY_SINGLE_ALLOCATION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__ID = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__RELATIONS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__CONFLICTS_WITH = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__HAS_CONFLICTS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__DUPLICATE_OF = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__HAS_DUPLICATES = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__DEPENDS_ON = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__HAS_DEPENDENTS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__PARENT_OF = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__SUBPART_OF = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__TRIGGER_OF = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__TRIGGERED_BY = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__RESOLVES = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__RESOLVED_BY = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__ALTERNATIVE_TO = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__HAS_ALTERNATIVES = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__COULD_RESOLVE = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__STAKEHOLDER_OF = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__HAS_STAKEHOLDERS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__SELECTED = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__SELECTED_BY = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__DESCRIPTION = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__KEYWORDS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__REPOSITORY = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__RATIONALE = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__IS_MODELLED = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__IS_IMPLEMENTED = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__TIME_STAMP = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__EFFECTS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__USED_TERMS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__ANALYSIS_RATIONALE = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Only Single Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ONLY_SINGLE_ALLOCATION_FEATURE_COUNT = ArchoptionsPackage.ONLY_SINGLE_ALLOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_RequiredFunctionalityImpl <em>PCM Required Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_RequiredFunctionalityImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_RequiredFunctionality()
	 * @generated
	 */
	int PCM_REQUIRED_FUNCTIONALITY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__ID = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__RELATIONS = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__CONFLICTS_WITH = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__HAS_CONFLICTS = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__DUPLICATE_OF = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__HAS_DUPLICATES = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__DEPENDS_ON = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__HAS_DEPENDENTS = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__PARENT_OF = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__SUBPART_OF = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__TRIGGER_OF = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__TRIGGERED_BY = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__RESOLVES = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__RESOLVED_BY = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__ALTERNATIVE_TO = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__HAS_ALTERNATIVES = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__COULD_RESOLVE = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__COULD_BE_RESOLVED_BY = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__STAKEHOLDER_OF = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__HAS_STAKEHOLDERS = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__SELECTED = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__SELECTED_BY = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__DESCRIPTION = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__KEYWORDS = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__REPOSITORY = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__RATIONALE = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__IS_MODELLED = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__IS_IMPLEMENTED = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__TIME_STAMP = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__EFFECTS = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__USED_TERMS = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__ANALYSIS_RATIONALE = ArchoptionsPackage.REQUIRED_FUNCTIONALITY__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES = ArchoptionsPackage.REQUIRED_FUNCTIONALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Required Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REQUIRED_FUNCTIONALITY_FEATURE_COUNT = ArchoptionsPackage.REQUIRED_FUNCTIONALITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_ChangeDataTypeImpl <em>PCM Change Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_ChangeDataTypeImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ChangeDataType()
	 * @generated
	 */
	int PCM_CHANGE_DATA_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__ID = ArchoptionsPackage.CHANGE_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__RELATIONS = ArchoptionsPackage.CHANGE_DATA_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__CONFLICTS_WITH = ArchoptionsPackage.CHANGE_DATA_TYPE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__HAS_CONFLICTS = ArchoptionsPackage.CHANGE_DATA_TYPE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__DUPLICATE_OF = ArchoptionsPackage.CHANGE_DATA_TYPE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__HAS_DUPLICATES = ArchoptionsPackage.CHANGE_DATA_TYPE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__DEPENDS_ON = ArchoptionsPackage.CHANGE_DATA_TYPE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__HAS_DEPENDENTS = ArchoptionsPackage.CHANGE_DATA_TYPE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__PARENT_OF = ArchoptionsPackage.CHANGE_DATA_TYPE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__SUBPART_OF = ArchoptionsPackage.CHANGE_DATA_TYPE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__TRIGGER_OF = ArchoptionsPackage.CHANGE_DATA_TYPE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__TRIGGERED_BY = ArchoptionsPackage.CHANGE_DATA_TYPE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__RESOLVES = ArchoptionsPackage.CHANGE_DATA_TYPE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__RESOLVED_BY = ArchoptionsPackage.CHANGE_DATA_TYPE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__ALTERNATIVE_TO = ArchoptionsPackage.CHANGE_DATA_TYPE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__HAS_ALTERNATIVES = ArchoptionsPackage.CHANGE_DATA_TYPE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__COULD_RESOLVE = ArchoptionsPackage.CHANGE_DATA_TYPE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__COULD_BE_RESOLVED_BY = ArchoptionsPackage.CHANGE_DATA_TYPE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__STAKEHOLDER_OF = ArchoptionsPackage.CHANGE_DATA_TYPE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__HAS_STAKEHOLDERS = ArchoptionsPackage.CHANGE_DATA_TYPE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__SELECTED = ArchoptionsPackage.CHANGE_DATA_TYPE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__SELECTED_BY = ArchoptionsPackage.CHANGE_DATA_TYPE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__DESCRIPTION = ArchoptionsPackage.CHANGE_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__KEYWORDS = ArchoptionsPackage.CHANGE_DATA_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__REPOSITORY = ArchoptionsPackage.CHANGE_DATA_TYPE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__RATIONALE = ArchoptionsPackage.CHANGE_DATA_TYPE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__IS_MODELLED = ArchoptionsPackage.CHANGE_DATA_TYPE__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__IS_IMPLEMENTED = ArchoptionsPackage.CHANGE_DATA_TYPE__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__TIME_STAMP = ArchoptionsPackage.CHANGE_DATA_TYPE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__EFFECTS = ArchoptionsPackage.CHANGE_DATA_TYPE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__USED_TERMS = ArchoptionsPackage.CHANGE_DATA_TYPE__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__ANALYSIS_RATIONALE = ArchoptionsPackage.CHANGE_DATA_TYPE__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES = ArchoptionsPackage.CHANGE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES = ArchoptionsPackage.CHANGE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Change Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_DATA_TYPE_FEATURE_COUNT = ArchoptionsPackage.CHANGE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_IntroduceNewDataTypeImpl <em>PCM Introduce New Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_IntroduceNewDataTypeImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewDataType()
	 * @generated
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__ID = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__RELATIONS = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__CONFLICTS_WITH = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__HAS_CONFLICTS = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__DUPLICATE_OF = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__HAS_DUPLICATES = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__DEPENDS_ON = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__HAS_DEPENDENTS = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__PARENT_OF = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__SUBPART_OF = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__TRIGGER_OF = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__TRIGGERED_BY = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__RESOLVES = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__ALTERNATIVE_TO = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__HAS_ALTERNATIVES = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__COULD_RESOLVE = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__COULD_BE_RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__STAKEHOLDER_OF = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__HAS_STAKEHOLDERS = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__SELECTED = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__SELECTED_BY = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__DESCRIPTION = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__KEYWORDS = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__REPOSITORY = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__IS_MODELLED = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__IS_IMPLEMENTED = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__TIME_STAMP = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__EFFECTS = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__USED_TERMS = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__ANALYSIS_RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Introduce New Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_DATA_TYPE_FEATURE_COUNT = ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_RemoveDataTypeImpl <em>PCM Remove Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_RemoveDataTypeImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_RemoveDataType()
	 * @generated
	 */
	int PCM_REMOVE_DATA_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__ID = ArchoptionsPackage.REMOVE_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__RELATIONS = ArchoptionsPackage.REMOVE_DATA_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__CONFLICTS_WITH = ArchoptionsPackage.REMOVE_DATA_TYPE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__HAS_CONFLICTS = ArchoptionsPackage.REMOVE_DATA_TYPE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__DUPLICATE_OF = ArchoptionsPackage.REMOVE_DATA_TYPE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__HAS_DUPLICATES = ArchoptionsPackage.REMOVE_DATA_TYPE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__DEPENDS_ON = ArchoptionsPackage.REMOVE_DATA_TYPE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__HAS_DEPENDENTS = ArchoptionsPackage.REMOVE_DATA_TYPE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__PARENT_OF = ArchoptionsPackage.REMOVE_DATA_TYPE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__SUBPART_OF = ArchoptionsPackage.REMOVE_DATA_TYPE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__TRIGGER_OF = ArchoptionsPackage.REMOVE_DATA_TYPE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__TRIGGERED_BY = ArchoptionsPackage.REMOVE_DATA_TYPE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__RESOLVES = ArchoptionsPackage.REMOVE_DATA_TYPE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__RESOLVED_BY = ArchoptionsPackage.REMOVE_DATA_TYPE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__ALTERNATIVE_TO = ArchoptionsPackage.REMOVE_DATA_TYPE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__HAS_ALTERNATIVES = ArchoptionsPackage.REMOVE_DATA_TYPE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__COULD_RESOLVE = ArchoptionsPackage.REMOVE_DATA_TYPE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__COULD_BE_RESOLVED_BY = ArchoptionsPackage.REMOVE_DATA_TYPE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__STAKEHOLDER_OF = ArchoptionsPackage.REMOVE_DATA_TYPE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__HAS_STAKEHOLDERS = ArchoptionsPackage.REMOVE_DATA_TYPE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__SELECTED = ArchoptionsPackage.REMOVE_DATA_TYPE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__SELECTED_BY = ArchoptionsPackage.REMOVE_DATA_TYPE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__DESCRIPTION = ArchoptionsPackage.REMOVE_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__KEYWORDS = ArchoptionsPackage.REMOVE_DATA_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__REPOSITORY = ArchoptionsPackage.REMOVE_DATA_TYPE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__RATIONALE = ArchoptionsPackage.REMOVE_DATA_TYPE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__IS_MODELLED = ArchoptionsPackage.REMOVE_DATA_TYPE__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__IS_IMPLEMENTED = ArchoptionsPackage.REMOVE_DATA_TYPE__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__TIME_STAMP = ArchoptionsPackage.REMOVE_DATA_TYPE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__EFFECTS = ArchoptionsPackage.REMOVE_DATA_TYPE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__USED_TERMS = ArchoptionsPackage.REMOVE_DATA_TYPE__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__ANALYSIS_RATIONALE = ArchoptionsPackage.REMOVE_DATA_TYPE__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE__DATA_TYPES = ArchoptionsPackage.REMOVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Remove Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_DATA_TYPE_FEATURE_COUNT = ArchoptionsPackage.REMOVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_IntroduceNewInterfaceImpl <em>PCM Introduce New Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_IntroduceNewInterfaceImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewInterface()
	 * @generated
	 */
	int PCM_INTRODUCE_NEW_INTERFACE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__ID = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__RELATIONS = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__CONFLICTS_WITH = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__HAS_CONFLICTS = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__DUPLICATE_OF = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__HAS_DUPLICATES = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__DEPENDS_ON = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__HAS_DEPENDENTS = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__PARENT_OF = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__SUBPART_OF = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__TRIGGER_OF = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__TRIGGERED_BY = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__RESOLVES = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__ALTERNATIVE_TO = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__HAS_ALTERNATIVES = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__COULD_RESOLVE = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__COULD_BE_RESOLVED_BY = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__STAKEHOLDER_OF = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__HAS_STAKEHOLDERS = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__SELECTED = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__SELECTED_BY = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__DESCRIPTION = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__KEYWORDS = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__REPOSITORY = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__IS_MODELLED = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__IS_IMPLEMENTED = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__TIME_STAMP = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__EFFECTS = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__USED_TERMS = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__ANALYSIS_RATIONALE = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE__INTERFACES = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Introduce New Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTRODUCE_NEW_INTERFACE_FEATURE_COUNT = ArchoptionsPackage.INTRODUCE_NEW_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_ChangeInterfaceImpl <em>PCM Change Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_ChangeInterfaceImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ChangeInterface()
	 * @generated
	 */
	int PCM_CHANGE_INTERFACE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__ID = ArchoptionsPackage.CHANGE_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__RELATIONS = ArchoptionsPackage.CHANGE_INTERFACE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__CONFLICTS_WITH = ArchoptionsPackage.CHANGE_INTERFACE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__HAS_CONFLICTS = ArchoptionsPackage.CHANGE_INTERFACE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__DUPLICATE_OF = ArchoptionsPackage.CHANGE_INTERFACE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__HAS_DUPLICATES = ArchoptionsPackage.CHANGE_INTERFACE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__DEPENDS_ON = ArchoptionsPackage.CHANGE_INTERFACE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__HAS_DEPENDENTS = ArchoptionsPackage.CHANGE_INTERFACE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__PARENT_OF = ArchoptionsPackage.CHANGE_INTERFACE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__SUBPART_OF = ArchoptionsPackage.CHANGE_INTERFACE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__TRIGGER_OF = ArchoptionsPackage.CHANGE_INTERFACE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__TRIGGERED_BY = ArchoptionsPackage.CHANGE_INTERFACE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__RESOLVES = ArchoptionsPackage.CHANGE_INTERFACE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__RESOLVED_BY = ArchoptionsPackage.CHANGE_INTERFACE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__ALTERNATIVE_TO = ArchoptionsPackage.CHANGE_INTERFACE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__HAS_ALTERNATIVES = ArchoptionsPackage.CHANGE_INTERFACE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__COULD_RESOLVE = ArchoptionsPackage.CHANGE_INTERFACE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__COULD_BE_RESOLVED_BY = ArchoptionsPackage.CHANGE_INTERFACE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__STAKEHOLDER_OF = ArchoptionsPackage.CHANGE_INTERFACE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__HAS_STAKEHOLDERS = ArchoptionsPackage.CHANGE_INTERFACE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__SELECTED = ArchoptionsPackage.CHANGE_INTERFACE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__SELECTED_BY = ArchoptionsPackage.CHANGE_INTERFACE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__DESCRIPTION = ArchoptionsPackage.CHANGE_INTERFACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__KEYWORDS = ArchoptionsPackage.CHANGE_INTERFACE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__REPOSITORY = ArchoptionsPackage.CHANGE_INTERFACE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__RATIONALE = ArchoptionsPackage.CHANGE_INTERFACE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__IS_MODELLED = ArchoptionsPackage.CHANGE_INTERFACE__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__IS_IMPLEMENTED = ArchoptionsPackage.CHANGE_INTERFACE__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__TIME_STAMP = ArchoptionsPackage.CHANGE_INTERFACE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__EFFECTS = ArchoptionsPackage.CHANGE_INTERFACE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__USED_TERMS = ArchoptionsPackage.CHANGE_INTERFACE__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__ANALYSIS_RATIONALE = ArchoptionsPackage.CHANGE_INTERFACE__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__OLD_INTERFACES = ArchoptionsPackage.CHANGE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE__NEW_INTERFACES = ArchoptionsPackage.CHANGE_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCM Change Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CHANGE_INTERFACE_FEATURE_COUNT = ArchoptionsPackage.CHANGE_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pcmarchoptions.impl.PCM_RemoveInterfaceImpl <em>PCM Remove Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmarchoptions.impl.PCM_RemoveInterfaceImpl
	 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_RemoveInterface()
	 * @generated
	 */
	int PCM_REMOVE_INTERFACE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__ID = ArchoptionsPackage.REMOVE_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__RELATIONS = ArchoptionsPackage.REMOVE_INTERFACE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__CONFLICTS_WITH = ArchoptionsPackage.REMOVE_INTERFACE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__HAS_CONFLICTS = ArchoptionsPackage.REMOVE_INTERFACE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__DUPLICATE_OF = ArchoptionsPackage.REMOVE_INTERFACE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__HAS_DUPLICATES = ArchoptionsPackage.REMOVE_INTERFACE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__DEPENDS_ON = ArchoptionsPackage.REMOVE_INTERFACE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__HAS_DEPENDENTS = ArchoptionsPackage.REMOVE_INTERFACE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__PARENT_OF = ArchoptionsPackage.REMOVE_INTERFACE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__SUBPART_OF = ArchoptionsPackage.REMOVE_INTERFACE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__TRIGGER_OF = ArchoptionsPackage.REMOVE_INTERFACE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__TRIGGERED_BY = ArchoptionsPackage.REMOVE_INTERFACE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__RESOLVES = ArchoptionsPackage.REMOVE_INTERFACE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__RESOLVED_BY = ArchoptionsPackage.REMOVE_INTERFACE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__ALTERNATIVE_TO = ArchoptionsPackage.REMOVE_INTERFACE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__HAS_ALTERNATIVES = ArchoptionsPackage.REMOVE_INTERFACE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__COULD_RESOLVE = ArchoptionsPackage.REMOVE_INTERFACE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__COULD_BE_RESOLVED_BY = ArchoptionsPackage.REMOVE_INTERFACE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__STAKEHOLDER_OF = ArchoptionsPackage.REMOVE_INTERFACE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__HAS_STAKEHOLDERS = ArchoptionsPackage.REMOVE_INTERFACE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__SELECTED = ArchoptionsPackage.REMOVE_INTERFACE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__SELECTED_BY = ArchoptionsPackage.REMOVE_INTERFACE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__DESCRIPTION = ArchoptionsPackage.REMOVE_INTERFACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__KEYWORDS = ArchoptionsPackage.REMOVE_INTERFACE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__REPOSITORY = ArchoptionsPackage.REMOVE_INTERFACE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__RATIONALE = ArchoptionsPackage.REMOVE_INTERFACE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__IS_MODELLED = ArchoptionsPackage.REMOVE_INTERFACE__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__IS_IMPLEMENTED = ArchoptionsPackage.REMOVE_INTERFACE__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__TIME_STAMP = ArchoptionsPackage.REMOVE_INTERFACE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__EFFECTS = ArchoptionsPackage.REMOVE_INTERFACE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__USED_TERMS = ArchoptionsPackage.REMOVE_INTERFACE__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__ANALYSIS_RATIONALE = ArchoptionsPackage.REMOVE_INTERFACE__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE__INTERFACES = ArchoptionsPackage.REMOVE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Remove Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_REMOVE_INTERFACE_FEATURE_COUNT = ArchoptionsPackage.REMOVE_INTERFACE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_SplitComponent <em>PCM Split Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Split Component</em>'.
	 * @see pcmarchoptions.PCM_SplitComponent
	 * @generated
	 */
	EClass getPCM_SplitComponent();

	/**
	 * Returns the meta object for the attribute '{@link pcmarchoptions.PCM_SplitComponent#getInitialContextName <em>Initial Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Context Name</em>'.
	 * @see pcmarchoptions.PCM_SplitComponent#getInitialContextName()
	 * @see #getPCM_SplitComponent()
	 * @generated
	 */
	EAttribute getPCM_SplitComponent_InitialContextName();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_SplitComponent#getFinalContexts <em>Final Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final Contexts</em>'.
	 * @see pcmarchoptions.PCM_SplitComponent#getFinalContexts()
	 * @see #getPCM_SplitComponent()
	 * @generated
	 */
	EReference getPCM_SplitComponent_FinalContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_AllocateTogether <em>PCM Allocate Together</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Allocate Together</em>'.
	 * @see pcmarchoptions.PCM_AllocateTogether
	 * @generated
	 */
	EClass getPCM_AllocateTogether();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_AllocateTogether#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Contexts</em>'.
	 * @see pcmarchoptions.PCM_AllocateTogether#getAllocationContexts()
	 * @see #getPCM_AllocateTogether()
	 * @generated
	 */
	EReference getPCM_AllocateTogether_AllocationContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_NeverAllocateToSpecificNodes <em>PCM Never Allocate To Specific Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Never Allocate To Specific Nodes</em>'.
	 * @see pcmarchoptions.PCM_NeverAllocateToSpecificNodes
	 * @generated
	 */
	EClass getPCM_NeverAllocateToSpecificNodes();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_NeverAllocateToSpecificNodes#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Contexts</em>'.
	 * @see pcmarchoptions.PCM_NeverAllocateToSpecificNodes#getAllocationContexts()
	 * @see #getPCM_NeverAllocateToSpecificNodes()
	 * @generated
	 */
	EReference getPCM_NeverAllocateToSpecificNodes_AllocationContexts();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_NeverAllocateToSpecificNodes#getHwNodes <em>Hw Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hw Nodes</em>'.
	 * @see pcmarchoptions.PCM_NeverAllocateToSpecificNodes#getHwNodes()
	 * @see #getPCM_NeverAllocateToSpecificNodes()
	 * @generated
	 */
	EReference getPCM_NeverAllocateToSpecificNodes_HwNodes();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_IntroduceNewAdapter <em>PCM Introduce New Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Introduce New Adapter</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewAdapter
	 * @generated
	 */
	EClass getPCM_IntroduceNewAdapter();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_IntroduceNewAdapter#getAdapterContext <em>Adapter Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adapter Context</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewAdapter#getAdapterContext()
	 * @see #getPCM_IntroduceNewAdapter()
	 * @generated
	 */
	EReference getPCM_IntroduceNewAdapter_AdapterContext();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_IntroduceNewAdapter#getContextBeingAdapted <em>Context Being Adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Being Adapted</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewAdapter#getContextBeingAdapted()
	 * @see #getPCM_IntroduceNewAdapter()
	 * @generated
	 */
	EReference getPCM_IntroduceNewAdapter_ContextBeingAdapted();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_IntroduceNewComponent <em>PCM Introduce New Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Introduce New Component</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewComponent
	 * @generated
	 */
	EClass getPCM_IntroduceNewComponent();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_IntroduceNewComponent#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Contexts</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewComponent#getAssemblyContexts()
	 * @see #getPCM_IntroduceNewComponent()
	 * @generated
	 */
	EReference getPCM_IntroduceNewComponent_AssemblyContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_MoveComponents <em>PCM Move Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Move Components</em>'.
	 * @see pcmarchoptions.PCM_MoveComponents
	 * @generated
	 */
	EClass getPCM_MoveComponents();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_MoveComponents#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Contexts</em>'.
	 * @see pcmarchoptions.PCM_MoveComponents#getAllocationContexts()
	 * @see #getPCM_MoveComponents()
	 * @generated
	 */
	EReference getPCM_MoveComponents_AllocationContexts();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_MoveComponents#getFromHwNode <em>From Hw Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Hw Node</em>'.
	 * @see pcmarchoptions.PCM_MoveComponents#getFromHwNode()
	 * @see #getPCM_MoveComponents()
	 * @generated
	 */
	EReference getPCM_MoveComponents_FromHwNode();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_MoveComponents#getToHwNode <em>To Hw Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Hw Node</em>'.
	 * @see pcmarchoptions.PCM_MoveComponents#getToHwNode()
	 * @see #getPCM_MoveComponents()
	 * @generated
	 */
	EReference getPCM_MoveComponents_ToHwNode();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_OnlySingleInstantiation <em>PCM Only Single Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Only Single Instantiation</em>'.
	 * @see pcmarchoptions.PCM_OnlySingleInstantiation
	 * @generated
	 */
	EClass getPCM_OnlySingleInstantiation();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_OnlySingleInstantiation#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Contexts</em>'.
	 * @see pcmarchoptions.PCM_OnlySingleInstantiation#getAssemblyContexts()
	 * @see #getPCM_OnlySingleInstantiation()
	 * @generated
	 */
	EReference getPCM_OnlySingleInstantiation_AssemblyContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_ChangeRoles <em>PCM Change Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Change Roles</em>'.
	 * @see pcmarchoptions.PCM_ChangeRoles
	 * @generated
	 */
	EClass getPCM_ChangeRoles();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_ChangeRoles#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see pcmarchoptions.PCM_ChangeRoles#getAssemblyContext()
	 * @see #getPCM_ChangeRoles()
	 * @generated
	 */
	EReference getPCM_ChangeRoles_AssemblyContext();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ChangeRoles#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see pcmarchoptions.PCM_ChangeRoles#getRoles()
	 * @see #getPCM_ChangeRoles()
	 * @generated
	 */
	EReference getPCM_ChangeRoles_Roles();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_AllocateNeverTogether <em>PCM Allocate Never Together</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Allocate Never Together</em>'.
	 * @see pcmarchoptions.PCM_AllocateNeverTogether
	 * @generated
	 */
	EClass getPCM_AllocateNeverTogether();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_AllocateNeverTogether#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Contexts</em>'.
	 * @see pcmarchoptions.PCM_AllocateNeverTogether#getAllocationContexts()
	 * @see #getPCM_AllocateNeverTogether()
	 * @generated
	 */
	EReference getPCM_AllocateNeverTogether_AllocationContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_MultipleInstantiation <em>PCM Multiple Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Multiple Instantiation</em>'.
	 * @see pcmarchoptions.PCM_MultipleInstantiation
	 * @generated
	 */
	EClass getPCM_MultipleInstantiation();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_MultipleInstantiation#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Contexts</em>'.
	 * @see pcmarchoptions.PCM_MultipleInstantiation#getAssemblyContexts()
	 * @see #getPCM_MultipleInstantiation()
	 * @generated
	 */
	EReference getPCM_MultipleInstantiation_AssemblyContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_BanComponent <em>PCM Ban Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Ban Component</em>'.
	 * @see pcmarchoptions.PCM_BanComponent
	 * @generated
	 */
	EClass getPCM_BanComponent();

	/**
	 * Returns the meta object for the attribute list '{@link pcmarchoptions.PCM_BanComponent#getBannedContextNames <em>Banned Context Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Banned Context Names</em>'.
	 * @see pcmarchoptions.PCM_BanComponent#getBannedContextNames()
	 * @see #getPCM_BanComponent()
	 * @generated
	 */
	EAttribute getPCM_BanComponent_BannedContextNames();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_MultipleAllocation <em>PCM Multiple Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Multiple Allocation</em>'.
	 * @see pcmarchoptions.PCM_MultipleAllocation
	 * @generated
	 */
	EClass getPCM_MultipleAllocation();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_MultipleAllocation#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Contexts</em>'.
	 * @see pcmarchoptions.PCM_MultipleAllocation#getAllocationContexts()
	 * @see #getPCM_MultipleAllocation()
	 * @generated
	 */
	EReference getPCM_MultipleAllocation_AllocationContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_ProvidedFunctionality <em>PCM Provided Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Provided Functionality</em>'.
	 * @see pcmarchoptions.PCM_ProvidedFunctionality
	 * @generated
	 */
	EClass getPCM_ProvidedFunctionality();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ProvidedFunctionality#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Roles</em>'.
	 * @see pcmarchoptions.PCM_ProvidedFunctionality#getProvidedRoles()
	 * @see #getPCM_ProvidedFunctionality()
	 * @generated
	 */
	EReference getPCM_ProvidedFunctionality_ProvidedRoles();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_ReplaceComponents <em>PCM Replace Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Replace Components</em>'.
	 * @see pcmarchoptions.PCM_ReplaceComponents
	 * @generated
	 */
	EClass getPCM_ReplaceComponents();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ReplaceComponents#getContextsReplacedWith <em>Contexts Replaced With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexts Replaced With</em>'.
	 * @see pcmarchoptions.PCM_ReplaceComponents#getContextsReplacedWith()
	 * @see #getPCM_ReplaceComponents()
	 * @generated
	 */
	EReference getPCM_ReplaceComponents_ContextsReplacedWith();

	/**
	 * Returns the meta object for the attribute list '{@link pcmarchoptions.PCM_ReplaceComponents#getReplacedContextNames <em>Replaced Context Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Replaced Context Names</em>'.
	 * @see pcmarchoptions.PCM_ReplaceComponents#getReplacedContextNames()
	 * @see #getPCM_ReplaceComponents()
	 * @generated
	 */
	EAttribute getPCM_ReplaceComponents_ReplacedContextNames();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_ReuseComponent <em>PCM Reuse Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Reuse Component</em>'.
	 * @see pcmarchoptions.PCM_ReuseComponent
	 * @generated
	 */
	EClass getPCM_ReuseComponent();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ReuseComponent#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Contexts</em>'.
	 * @see pcmarchoptions.PCM_ReuseComponent#getAssemblyContexts()
	 * @see #getPCM_ReuseComponent()
	 * @generated
	 */
	EReference getPCM_ReuseComponent_AssemblyContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_FunctionalityConnection <em>PCM Functionality Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Functionality Connection</em>'.
	 * @see pcmarchoptions.PCM_FunctionalityConnection
	 * @generated
	 */
	EClass getPCM_FunctionalityConnection();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_FunctionalityConnection#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see pcmarchoptions.PCM_FunctionalityConnection#getConnector()
	 * @see #getPCM_FunctionalityConnection()
	 * @generated
	 */
	EReference getPCM_FunctionalityConnection_Connector();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_FunctionalityConnection#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see pcmarchoptions.PCM_FunctionalityConnection#getRequiredRole()
	 * @see #getPCM_FunctionalityConnection()
	 * @generated
	 */
	EReference getPCM_FunctionalityConnection_RequiredRole();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_FunctionalityConnection#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see pcmarchoptions.PCM_FunctionalityConnection#getProvidedRole()
	 * @see #getPCM_FunctionalityConnection()
	 * @generated
	 */
	EReference getPCM_FunctionalityConnection_ProvidedRole();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_MergeComponents <em>PCM Merge Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Merge Components</em>'.
	 * @see pcmarchoptions.PCM_MergeComponents
	 * @generated
	 */
	EClass getPCM_MergeComponents();

	/**
	 * Returns the meta object for the attribute list '{@link pcmarchoptions.PCM_MergeComponents#getInitialContextsNameList <em>Initial Contexts Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Initial Contexts Name List</em>'.
	 * @see pcmarchoptions.PCM_MergeComponents#getInitialContextsNameList()
	 * @see #getPCM_MergeComponents()
	 * @generated
	 */
	EAttribute getPCM_MergeComponents_InitialContextsNameList();

	/**
	 * Returns the meta object for the reference '{@link pcmarchoptions.PCM_MergeComponents#getFinalContext <em>Final Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final Context</em>'.
	 * @see pcmarchoptions.PCM_MergeComponents#getFinalContext()
	 * @see #getPCM_MergeComponents()
	 * @generated
	 */
	EReference getPCM_MergeComponents_FinalContext();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_OnlySingleAllocation <em>PCM Only Single Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Only Single Allocation</em>'.
	 * @see pcmarchoptions.PCM_OnlySingleAllocation
	 * @generated
	 */
	EClass getPCM_OnlySingleAllocation();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_OnlySingleAllocation#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Contexts</em>'.
	 * @see pcmarchoptions.PCM_OnlySingleAllocation#getAllocationContexts()
	 * @see #getPCM_OnlySingleAllocation()
	 * @generated
	 */
	EReference getPCM_OnlySingleAllocation_AllocationContexts();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_RequiredFunctionality <em>PCM Required Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Required Functionality</em>'.
	 * @see pcmarchoptions.PCM_RequiredFunctionality
	 * @generated
	 */
	EClass getPCM_RequiredFunctionality();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_RequiredFunctionality#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Roles</em>'.
	 * @see pcmarchoptions.PCM_RequiredFunctionality#getRequiredRoles()
	 * @see #getPCM_RequiredFunctionality()
	 * @generated
	 */
	EReference getPCM_RequiredFunctionality_RequiredRoles();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_ChangeDataType <em>PCM Change Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Change Data Type</em>'.
	 * @see pcmarchoptions.PCM_ChangeDataType
	 * @generated
	 */
	EClass getPCM_ChangeDataType();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ChangeDataType#getOldDataTypes <em>Old Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Data Types</em>'.
	 * @see pcmarchoptions.PCM_ChangeDataType#getOldDataTypes()
	 * @see #getPCM_ChangeDataType()
	 * @generated
	 */
	EReference getPCM_ChangeDataType_OldDataTypes();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ChangeDataType#getNewDataTypes <em>New Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Data Types</em>'.
	 * @see pcmarchoptions.PCM_ChangeDataType#getNewDataTypes()
	 * @see #getPCM_ChangeDataType()
	 * @generated
	 */
	EReference getPCM_ChangeDataType_NewDataTypes();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_IntroduceNewDataType <em>PCM Introduce New Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Introduce New Data Type</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewDataType
	 * @generated
	 */
	EClass getPCM_IntroduceNewDataType();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_IntroduceNewDataType#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Types</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewDataType#getDataTypes()
	 * @see #getPCM_IntroduceNewDataType()
	 * @generated
	 */
	EReference getPCM_IntroduceNewDataType_DataTypes();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_RemoveDataType <em>PCM Remove Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Remove Data Type</em>'.
	 * @see pcmarchoptions.PCM_RemoveDataType
	 * @generated
	 */
	EClass getPCM_RemoveDataType();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_RemoveDataType#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Types</em>'.
	 * @see pcmarchoptions.PCM_RemoveDataType#getDataTypes()
	 * @see #getPCM_RemoveDataType()
	 * @generated
	 */
	EReference getPCM_RemoveDataType_DataTypes();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_IntroduceNewInterface <em>PCM Introduce New Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Introduce New Interface</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewInterface
	 * @generated
	 */
	EClass getPCM_IntroduceNewInterface();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_IntroduceNewInterface#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see pcmarchoptions.PCM_IntroduceNewInterface#getInterfaces()
	 * @see #getPCM_IntroduceNewInterface()
	 * @generated
	 */
	EReference getPCM_IntroduceNewInterface_Interfaces();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_ChangeInterface <em>PCM Change Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Change Interface</em>'.
	 * @see pcmarchoptions.PCM_ChangeInterface
	 * @generated
	 */
	EClass getPCM_ChangeInterface();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ChangeInterface#getOldInterfaces <em>Old Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Interfaces</em>'.
	 * @see pcmarchoptions.PCM_ChangeInterface#getOldInterfaces()
	 * @see #getPCM_ChangeInterface()
	 * @generated
	 */
	EReference getPCM_ChangeInterface_OldInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_ChangeInterface#getNewInterfaces <em>New Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Interfaces</em>'.
	 * @see pcmarchoptions.PCM_ChangeInterface#getNewInterfaces()
	 * @see #getPCM_ChangeInterface()
	 * @generated
	 */
	EReference getPCM_ChangeInterface_NewInterfaces();

	/**
	 * Returns the meta object for class '{@link pcmarchoptions.PCM_RemoveInterface <em>PCM Remove Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Remove Interface</em>'.
	 * @see pcmarchoptions.PCM_RemoveInterface
	 * @generated
	 */
	EClass getPCM_RemoveInterface();

	/**
	 * Returns the meta object for the reference list '{@link pcmarchoptions.PCM_RemoveInterface#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see pcmarchoptions.PCM_RemoveInterface#getInterfaces()
	 * @see #getPCM_RemoveInterface()
	 * @generated
	 */
	EReference getPCM_RemoveInterface_Interfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmarchoptionsFactory getPcmarchoptionsFactory();

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
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_SplitComponentImpl <em>PCM Split Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_SplitComponentImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_SplitComponent()
		 * @generated
		 */
		EClass PCM_SPLIT_COMPONENT = eINSTANCE.getPCM_SplitComponent();

		/**
		 * The meta object literal for the '<em><b>Initial Context Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME = eINSTANCE.getPCM_SplitComponent_InitialContextName();

		/**
		 * The meta object literal for the '<em><b>Final Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_SPLIT_COMPONENT__FINAL_CONTEXTS = eINSTANCE.getPCM_SplitComponent_FinalContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_AllocateTogetherImpl <em>PCM Allocate Together</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_AllocateTogetherImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_AllocateTogether()
		 * @generated
		 */
		EClass PCM_ALLOCATE_TOGETHER = eINSTANCE.getPCM_AllocateTogether();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ALLOCATE_TOGETHER__ALLOCATION_CONTEXTS = eINSTANCE.getPCM_AllocateTogether_AllocationContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_NeverAllocateToSpecificNodesImpl <em>PCM Never Allocate To Specific Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_NeverAllocateToSpecificNodesImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_NeverAllocateToSpecificNodes()
		 * @generated
		 */
		EClass PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES = eINSTANCE.getPCM_NeverAllocateToSpecificNodes();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS = eINSTANCE.getPCM_NeverAllocateToSpecificNodes_AllocationContexts();

		/**
		 * The meta object literal for the '<em><b>Hw Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES = eINSTANCE.getPCM_NeverAllocateToSpecificNodes_HwNodes();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_IntroduceNewAdapterImpl <em>PCM Introduce New Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_IntroduceNewAdapterImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewAdapter()
		 * @generated
		 */
		EClass PCM_INTRODUCE_NEW_ADAPTER = eINSTANCE.getPCM_IntroduceNewAdapter();

		/**
		 * The meta object literal for the '<em><b>Adapter Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT = eINSTANCE.getPCM_IntroduceNewAdapter_AdapterContext();

		/**
		 * The meta object literal for the '<em><b>Context Being Adapted</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED = eINSTANCE.getPCM_IntroduceNewAdapter_ContextBeingAdapted();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_IntroduceNewComponentImpl <em>PCM Introduce New Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_IntroduceNewComponentImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewComponent()
		 * @generated
		 */
		EClass PCM_INTRODUCE_NEW_COMPONENT = eINSTANCE.getPCM_IntroduceNewComponent();

		/**
		 * The meta object literal for the '<em><b>Assembly Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXTS = eINSTANCE.getPCM_IntroduceNewComponent_AssemblyContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_MoveComponentsImpl <em>PCM Move Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_MoveComponentsImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MoveComponents()
		 * @generated
		 */
		EClass PCM_MOVE_COMPONENTS = eINSTANCE.getPCM_MoveComponents();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS = eINSTANCE.getPCM_MoveComponents_AllocationContexts();

		/**
		 * The meta object literal for the '<em><b>From Hw Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MOVE_COMPONENTS__FROM_HW_NODE = eINSTANCE.getPCM_MoveComponents_FromHwNode();

		/**
		 * The meta object literal for the '<em><b>To Hw Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MOVE_COMPONENTS__TO_HW_NODE = eINSTANCE.getPCM_MoveComponents_ToHwNode();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_OnlySingleInstantiationImpl <em>PCM Only Single Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_OnlySingleInstantiationImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_OnlySingleInstantiation()
		 * @generated
		 */
		EClass PCM_ONLY_SINGLE_INSTANTIATION = eINSTANCE.getPCM_OnlySingleInstantiation();

		/**
		 * The meta object literal for the '<em><b>Assembly Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ONLY_SINGLE_INSTANTIATION__ASSEMBLY_CONTEXTS = eINSTANCE.getPCM_OnlySingleInstantiation_AssemblyContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_ChangeRolesImpl <em>PCM Change Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_ChangeRolesImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ChangeRoles()
		 * @generated
		 */
		EClass PCM_CHANGE_ROLES = eINSTANCE.getPCM_ChangeRoles();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT = eINSTANCE.getPCM_ChangeRoles_AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_ROLES__ROLES = eINSTANCE.getPCM_ChangeRoles_Roles();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_AllocateNeverTogetherImpl <em>PCM Allocate Never Together</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_AllocateNeverTogetherImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_AllocateNeverTogether()
		 * @generated
		 */
		EClass PCM_ALLOCATE_NEVER_TOGETHER = eINSTANCE.getPCM_AllocateNeverTogether();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ALLOCATE_NEVER_TOGETHER__ALLOCATION_CONTEXTS = eINSTANCE.getPCM_AllocateNeverTogether_AllocationContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_MultipleInstantiationImpl <em>PCM Multiple Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_MultipleInstantiationImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MultipleInstantiation()
		 * @generated
		 */
		EClass PCM_MULTIPLE_INSTANTIATION = eINSTANCE.getPCM_MultipleInstantiation();

		/**
		 * The meta object literal for the '<em><b>Assembly Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MULTIPLE_INSTANTIATION__ASSEMBLY_CONTEXTS = eINSTANCE.getPCM_MultipleInstantiation_AssemblyContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_BanComponentImpl <em>PCM Ban Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_BanComponentImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_BanComponent()
		 * @generated
		 */
		EClass PCM_BAN_COMPONENT = eINSTANCE.getPCM_BanComponent();

		/**
		 * The meta object literal for the '<em><b>Banned Context Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES = eINSTANCE.getPCM_BanComponent_BannedContextNames();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_MultipleAllocationImpl <em>PCM Multiple Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_MultipleAllocationImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MultipleAllocation()
		 * @generated
		 */
		EClass PCM_MULTIPLE_ALLOCATION = eINSTANCE.getPCM_MultipleAllocation();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MULTIPLE_ALLOCATION__ALLOCATION_CONTEXTS = eINSTANCE.getPCM_MultipleAllocation_AllocationContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_ProvidedFunctionalityImpl <em>PCM Provided Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_ProvidedFunctionalityImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ProvidedFunctionality()
		 * @generated
		 */
		EClass PCM_PROVIDED_FUNCTIONALITY = eINSTANCE.getPCM_ProvidedFunctionality();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES = eINSTANCE.getPCM_ProvidedFunctionality_ProvidedRoles();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_ReplaceComponentsImpl <em>PCM Replace Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_ReplaceComponentsImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ReplaceComponents()
		 * @generated
		 */
		EClass PCM_REPLACE_COMPONENTS = eINSTANCE.getPCM_ReplaceComponents();

		/**
		 * The meta object literal for the '<em><b>Contexts Replaced With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH = eINSTANCE.getPCM_ReplaceComponents_ContextsReplacedWith();

		/**
		 * The meta object literal for the '<em><b>Replaced Context Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES = eINSTANCE.getPCM_ReplaceComponents_ReplacedContextNames();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_ReuseComponentImpl <em>PCM Reuse Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_ReuseComponentImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ReuseComponent()
		 * @generated
		 */
		EClass PCM_REUSE_COMPONENT = eINSTANCE.getPCM_ReuseComponent();

		/**
		 * The meta object literal for the '<em><b>Assembly Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS = eINSTANCE.getPCM_ReuseComponent_AssemblyContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_FunctionalityConnectionImpl <em>PCM Functionality Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_FunctionalityConnectionImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_FunctionalityConnection()
		 * @generated
		 */
		EClass PCM_FUNCTIONALITY_CONNECTION = eINSTANCE.getPCM_FunctionalityConnection();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_FUNCTIONALITY_CONNECTION__CONNECTOR = eINSTANCE.getPCM_FunctionalityConnection_Connector();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE = eINSTANCE.getPCM_FunctionalityConnection_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE = eINSTANCE.getPCM_FunctionalityConnection_ProvidedRole();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_MergeComponentsImpl <em>PCM Merge Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_MergeComponentsImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_MergeComponents()
		 * @generated
		 */
		EClass PCM_MERGE_COMPONENTS = eINSTANCE.getPCM_MergeComponents();

		/**
		 * The meta object literal for the '<em><b>Initial Contexts Name List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST = eINSTANCE.getPCM_MergeComponents_InitialContextsNameList();

		/**
		 * The meta object literal for the '<em><b>Final Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_MERGE_COMPONENTS__FINAL_CONTEXT = eINSTANCE.getPCM_MergeComponents_FinalContext();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_OnlySingleAllocationImpl <em>PCM Only Single Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_OnlySingleAllocationImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_OnlySingleAllocation()
		 * @generated
		 */
		EClass PCM_ONLY_SINGLE_ALLOCATION = eINSTANCE.getPCM_OnlySingleAllocation();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS = eINSTANCE.getPCM_OnlySingleAllocation_AllocationContexts();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_RequiredFunctionalityImpl <em>PCM Required Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_RequiredFunctionalityImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_RequiredFunctionality()
		 * @generated
		 */
		EClass PCM_REQUIRED_FUNCTIONALITY = eINSTANCE.getPCM_RequiredFunctionality();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES = eINSTANCE.getPCM_RequiredFunctionality_RequiredRoles();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_ChangeDataTypeImpl <em>PCM Change Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_ChangeDataTypeImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ChangeDataType()
		 * @generated
		 */
		EClass PCM_CHANGE_DATA_TYPE = eINSTANCE.getPCM_ChangeDataType();

		/**
		 * The meta object literal for the '<em><b>Old Data Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES = eINSTANCE.getPCM_ChangeDataType_OldDataTypes();

		/**
		 * The meta object literal for the '<em><b>New Data Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES = eINSTANCE.getPCM_ChangeDataType_NewDataTypes();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_IntroduceNewDataTypeImpl <em>PCM Introduce New Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_IntroduceNewDataTypeImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewDataType()
		 * @generated
		 */
		EClass PCM_INTRODUCE_NEW_DATA_TYPE = eINSTANCE.getPCM_IntroduceNewDataType();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES = eINSTANCE.getPCM_IntroduceNewDataType_DataTypes();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_RemoveDataTypeImpl <em>PCM Remove Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_RemoveDataTypeImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_RemoveDataType()
		 * @generated
		 */
		EClass PCM_REMOVE_DATA_TYPE = eINSTANCE.getPCM_RemoveDataType();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_REMOVE_DATA_TYPE__DATA_TYPES = eINSTANCE.getPCM_RemoveDataType_DataTypes();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_IntroduceNewInterfaceImpl <em>PCM Introduce New Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_IntroduceNewInterfaceImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_IntroduceNewInterface()
		 * @generated
		 */
		EClass PCM_INTRODUCE_NEW_INTERFACE = eINSTANCE.getPCM_IntroduceNewInterface();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_INTRODUCE_NEW_INTERFACE__INTERFACES = eINSTANCE.getPCM_IntroduceNewInterface_Interfaces();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_ChangeInterfaceImpl <em>PCM Change Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_ChangeInterfaceImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_ChangeInterface()
		 * @generated
		 */
		EClass PCM_CHANGE_INTERFACE = eINSTANCE.getPCM_ChangeInterface();

		/**
		 * The meta object literal for the '<em><b>Old Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_INTERFACE__OLD_INTERFACES = eINSTANCE.getPCM_ChangeInterface_OldInterfaces();

		/**
		 * The meta object literal for the '<em><b>New Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CHANGE_INTERFACE__NEW_INTERFACES = eINSTANCE.getPCM_ChangeInterface_NewInterfaces();

		/**
		 * The meta object literal for the '{@link pcmarchoptions.impl.PCM_RemoveInterfaceImpl <em>PCM Remove Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmarchoptions.impl.PCM_RemoveInterfaceImpl
		 * @see pcmarchoptions.impl.PcmarchoptionsPackageImpl#getPCM_RemoveInterface()
		 * @generated
		 */
		EClass PCM_REMOVE_INTERFACE = eINSTANCE.getPCM_RemoveInterface();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_REMOVE_INTERFACE__INTERFACES = eINSTANCE.getPCM_RemoveInterface_Interfaces();

	}

} //PcmarchoptionsPackage
