/**
 */
package relations.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import relations.AlternativeObject;
import relations.ConflictObject;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.DuplicationObject;
import relations.ParentalObject;
import relations.Relation;
import relations.RelationObject;
import relations.RelationType;
import relations.RelationsFactory;
import relations.RelationsModel;
import relations.RelationsPackage;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.StakeholderObject;
import relations.TraceableObject;
import relations.TriggerObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationsPackageImpl extends EPackageImpl implements RelationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass duplicationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couldResolveObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionObjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see relations.RelationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationsPackageImpl() {
		super(eNS_URI, RelationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RelationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationsPackage init() {
		if (isInited) return (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);

		// Obtain or create and register package
		RelationsPackageImpl theRelationsPackage = (RelationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RelationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RelationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRelationsPackage.createPackageContents();

		// Initialize created meta-data
		theRelationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationsPackage.eNS_URI, theRelationsPackage);
		return theRelationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceableObject() {
		return traceableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationType() {
		return relationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Description() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuplicationObject() {
		return duplicationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuplicationObject_DuplicateOf() {
		return (EReference)duplicationObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuplicationObject_HasDuplicates() {
		return (EReference)duplicationObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentalObject() {
		return parentalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentalObject_ParentOf() {
		return (EReference)parentalObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentalObject_SubpartOf() {
		return (EReference)parentalObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationObject() {
		return relationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationObject_Relations() {
		return (EReference)relationObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerObject() {
		return triggerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerObject_TriggerOf() {
		return (EReference)triggerObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerObject_TriggeredBy() {
		return (EReference)triggerObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyObject() {
		return dependencyObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyObject_DependsOn() {
		return (EReference)dependencyObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyObject_HasDependents() {
		return (EReference)dependencyObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflictObject() {
		return conflictObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictObject_ConflictsWith() {
		return (EReference)conflictObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictObject_HasConflicts() {
		return (EReference)conflictObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeObject() {
		return alternativeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeObject_AlternativeTo() {
		return (EReference)alternativeObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeObject_HasAlternatives() {
		return (EReference)alternativeObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationsModel() {
		return relationsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationsModel_RelationTypes() {
		return (EReference)relationsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationsModel_Relations() {
		return (EReference)relationsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveObject() {
		return resolveObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveObject_Resolves() {
		return (EReference)resolveObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveObject_ResolvedBy() {
		return (EReference)resolveObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Type() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Opposite() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_From() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_To() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Bidirectional() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCouldResolveObject() {
		return couldResolveObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCouldResolveObject_CouldResolve() {
		return (EReference)couldResolveObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCouldResolveObject_CouldBeResolvedBy() {
		return (EReference)couldResolveObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholderObject() {
		return stakeholderObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeholderObject_StakeholderOf() {
		return (EReference)stakeholderObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeholderObject_HasStakeholders() {
		return (EReference)stakeholderObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionObject() {
		return selectionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionObject_Selected() {
		return (EReference)selectionObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionObject_SelectedBy() {
		return (EReference)selectionObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsFactory getRelationsFactory() {
		return (RelationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		traceableObjectEClass = createEClass(TRACEABLE_OBJECT);

		relationTypeEClass = createEClass(RELATION_TYPE);
		createEAttribute(relationTypeEClass, RELATION_TYPE__DESCRIPTION);

		duplicationObjectEClass = createEClass(DUPLICATION_OBJECT);
		createEReference(duplicationObjectEClass, DUPLICATION_OBJECT__DUPLICATE_OF);
		createEReference(duplicationObjectEClass, DUPLICATION_OBJECT__HAS_DUPLICATES);

		parentalObjectEClass = createEClass(PARENTAL_OBJECT);
		createEReference(parentalObjectEClass, PARENTAL_OBJECT__PARENT_OF);
		createEReference(parentalObjectEClass, PARENTAL_OBJECT__SUBPART_OF);

		relationObjectEClass = createEClass(RELATION_OBJECT);
		createEReference(relationObjectEClass, RELATION_OBJECT__RELATIONS);

		triggerObjectEClass = createEClass(TRIGGER_OBJECT);
		createEReference(triggerObjectEClass, TRIGGER_OBJECT__TRIGGER_OF);
		createEReference(triggerObjectEClass, TRIGGER_OBJECT__TRIGGERED_BY);

		dependencyObjectEClass = createEClass(DEPENDENCY_OBJECT);
		createEReference(dependencyObjectEClass, DEPENDENCY_OBJECT__DEPENDS_ON);
		createEReference(dependencyObjectEClass, DEPENDENCY_OBJECT__HAS_DEPENDENTS);

		conflictObjectEClass = createEClass(CONFLICT_OBJECT);
		createEReference(conflictObjectEClass, CONFLICT_OBJECT__CONFLICTS_WITH);
		createEReference(conflictObjectEClass, CONFLICT_OBJECT__HAS_CONFLICTS);

		alternativeObjectEClass = createEClass(ALTERNATIVE_OBJECT);
		createEReference(alternativeObjectEClass, ALTERNATIVE_OBJECT__ALTERNATIVE_TO);
		createEReference(alternativeObjectEClass, ALTERNATIVE_OBJECT__HAS_ALTERNATIVES);

		relationsModelEClass = createEClass(RELATIONS_MODEL);
		createEReference(relationsModelEClass, RELATIONS_MODEL__RELATION_TYPES);
		createEReference(relationsModelEClass, RELATIONS_MODEL__RELATIONS);

		resolveObjectEClass = createEClass(RESOLVE_OBJECT);
		createEReference(resolveObjectEClass, RESOLVE_OBJECT__RESOLVES);
		createEReference(resolveObjectEClass, RESOLVE_OBJECT__RESOLVED_BY);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__TYPE);
		createEReference(relationEClass, RELATION__OPPOSITE);
		createEReference(relationEClass, RELATION__FROM);
		createEReference(relationEClass, RELATION__TO);
		createEAttribute(relationEClass, RELATION__BIDIRECTIONAL);

		couldResolveObjectEClass = createEClass(COULD_RESOLVE_OBJECT);
		createEReference(couldResolveObjectEClass, COULD_RESOLVE_OBJECT__COULD_RESOLVE);
		createEReference(couldResolveObjectEClass, COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY);

		stakeholderObjectEClass = createEClass(STAKEHOLDER_OBJECT);
		createEReference(stakeholderObjectEClass, STAKEHOLDER_OBJECT__STAKEHOLDER_OF);
		createEReference(stakeholderObjectEClass, STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS);

		selectionObjectEClass = createEClass(SELECTION_OBJECT);
		createEReference(selectionObjectEClass, SELECTION_OBJECT__SELECTED);
		createEReference(selectionObjectEClass, SELECTION_OBJECT__SELECTED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		traceableObjectEClass.getESuperTypes().add(this.getRelationObject());
		traceableObjectEClass.getESuperTypes().add(this.getConflictObject());
		traceableObjectEClass.getESuperTypes().add(this.getDuplicationObject());
		traceableObjectEClass.getESuperTypes().add(this.getDependencyObject());
		traceableObjectEClass.getESuperTypes().add(this.getParentalObject());
		traceableObjectEClass.getESuperTypes().add(this.getTriggerObject());
		traceableObjectEClass.getESuperTypes().add(this.getResolveObject());
		traceableObjectEClass.getESuperTypes().add(this.getAlternativeObject());
		traceableObjectEClass.getESuperTypes().add(this.getCouldResolveObject());
		traceableObjectEClass.getESuperTypes().add(this.getStakeholderObject());
		traceableObjectEClass.getESuperTypes().add(this.getSelectionObject());
		relationTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		relationObjectEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		relationsModelEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		relationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(traceableObjectEClass, TraceableObject.class, "TraceableObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationTypeEClass, RelationType.class, "RelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(duplicationObjectEClass, DuplicationObject.class, "DuplicationObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDuplicationObject_DuplicateOf(), this.getDuplicationObject(), this.getDuplicationObject_HasDuplicates(), "duplicateOf", null, 0, -1, DuplicationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDuplicationObject_HasDuplicates(), this.getDuplicationObject(), this.getDuplicationObject_DuplicateOf(), "hasDuplicates", null, 0, -1, DuplicationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentalObjectEClass, ParentalObject.class, "ParentalObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParentalObject_ParentOf(), this.getParentalObject(), this.getParentalObject_SubpartOf(), "parentOf", null, 0, -1, ParentalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParentalObject_SubpartOf(), this.getParentalObject(), this.getParentalObject_ParentOf(), "subpartOf", null, 0, -1, ParentalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationObjectEClass, RelationObject.class, "RelationObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationObject_Relations(), this.getRelation(), null, "relations", null, 0, -1, RelationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerObjectEClass, TriggerObject.class, "TriggerObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerObject_TriggerOf(), this.getTriggerObject(), this.getTriggerObject_TriggeredBy(), "triggerOf", null, 0, -1, TriggerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerObject_TriggeredBy(), this.getTriggerObject(), this.getTriggerObject_TriggerOf(), "triggeredBy", null, 0, -1, TriggerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyObjectEClass, DependencyObject.class, "DependencyObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyObject_DependsOn(), this.getDependencyObject(), this.getDependencyObject_HasDependents(), "dependsOn", null, 0, -1, DependencyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyObject_HasDependents(), this.getDependencyObject(), this.getDependencyObject_DependsOn(), "hasDependents", null, 0, -1, DependencyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictObjectEClass, ConflictObject.class, "ConflictObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflictObject_ConflictsWith(), this.getConflictObject(), this.getConflictObject_HasConflicts(), "conflictsWith", null, 0, -1, ConflictObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflictObject_HasConflicts(), this.getConflictObject(), this.getConflictObject_ConflictsWith(), "hasConflicts", null, 0, -1, ConflictObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeObjectEClass, AlternativeObject.class, "AlternativeObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeObject_AlternativeTo(), this.getAlternativeObject(), this.getAlternativeObject_HasAlternatives(), "alternativeTo", null, 0, -1, AlternativeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlternativeObject_HasAlternatives(), this.getAlternativeObject(), this.getAlternativeObject_AlternativeTo(), "hasAlternatives", null, 0, -1, AlternativeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationsModelEClass, RelationsModel.class, "RelationsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationsModel_RelationTypes(), this.getRelationType(), null, "relationTypes", null, 0, -1, RelationsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationsModel_Relations(), this.getRelation(), null, "relations", null, 0, -1, RelationsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveObjectEClass, ResolveObject.class, "ResolveObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolveObject_Resolves(), this.getResolveObject(), this.getResolveObject_ResolvedBy(), "resolves", null, 0, -1, ResolveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolveObject_ResolvedBy(), this.getResolveObject(), this.getResolveObject_Resolves(), "resolvedBy", null, 0, -1, ResolveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Type(), this.getRelationType(), null, "type", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Opposite(), this.getRelation(), null, "opposite", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_From(), this.getRelationObject(), null, "from", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_To(), this.getRelationObject(), null, "to", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Bidirectional(), theXMLTypePackage.getBoolean(), "bidirectional", "false", 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(couldResolveObjectEClass, CouldResolveObject.class, "CouldResolveObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCouldResolveObject_CouldResolve(), this.getCouldResolveObject(), this.getCouldResolveObject_CouldBeResolvedBy(), "couldResolve", null, 0, -1, CouldResolveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCouldResolveObject_CouldBeResolvedBy(), this.getCouldResolveObject(), this.getCouldResolveObject_CouldResolve(), "couldBeResolvedBy", null, 0, -1, CouldResolveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stakeholderObjectEClass, StakeholderObject.class, "StakeholderObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeholderObject_StakeholderOf(), this.getStakeholderObject(), this.getStakeholderObject_HasStakeholders(), "stakeholderOf", null, 0, -1, StakeholderObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeholderObject_HasStakeholders(), this.getStakeholderObject(), this.getStakeholderObject_StakeholderOf(), "hasStakeholders", null, 0, -1, StakeholderObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionObjectEClass, SelectionObject.class, "SelectionObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectionObject_Selected(), this.getSelectionObject(), this.getSelectionObject_SelectedBy(), "selected", null, 0, -1, SelectionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionObject_SelectedBy(), this.getSelectionObject(), this.getSelectionObject_Selected(), "selectedBy", null, 0, -1, SelectionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RelationsPackageImpl
