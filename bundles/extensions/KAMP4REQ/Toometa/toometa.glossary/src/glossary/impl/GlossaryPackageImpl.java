/**
 */
package glossary.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import glossary.Glossary;
import glossary.GlossaryFactory;
import glossary.GlossaryPackage;
import glossary.GlossaryTerm;
import glossary.TermCategory;
import glossary.TermInfluenceProperty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryPackageImpl extends EPackageImpl implements GlossaryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum termInfluencePropertyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum termCategoryEEnum = null;

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
	 * @see glossary.GlossaryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlossaryPackageImpl() {
		super(eNS_URI, GlossaryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GlossaryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlossaryPackage init() {
		if (isInited) return (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);

		// Obtain or create and register package
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GlossaryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GlossaryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGlossaryPackage.createPackageContents();

		// Initialize created meta-data
		theGlossaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGlossaryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlossaryPackage.eNS_URI, theGlossaryPackage);
		return theGlossaryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlossaryTerm() {
		return glossaryTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossaryTerm_Glossary() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossaryTerm_Term() {
		return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossaryTerm_Definition() {
		return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossaryTerm_Synonym() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossaryTerm_Otherforms() {
		return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossaryTerm_Termcategory() {
		return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossaryTerm_Termproperty() {
		return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossaryTerm_Antonym() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlossary() {
		return glossaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossary_Terms() {
		return (EReference)glossaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossary_Title() {
		return (EAttribute)glossaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTermInfluenceProperty() {
		return termInfluencePropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTermCategory() {
		return termCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryFactory getGlossaryFactory() {
		return (GlossaryFactory)getEFactoryInstance();
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
		glossaryTermEClass = createEClass(GLOSSARY_TERM);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__GLOSSARY);
		createEAttribute(glossaryTermEClass, GLOSSARY_TERM__TERM);
		createEAttribute(glossaryTermEClass, GLOSSARY_TERM__DEFINITION);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__SYNONYM);
		createEAttribute(glossaryTermEClass, GLOSSARY_TERM__OTHERFORMS);
		createEAttribute(glossaryTermEClass, GLOSSARY_TERM__TERMCATEGORY);
		createEAttribute(glossaryTermEClass, GLOSSARY_TERM__TERMPROPERTY);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__ANTONYM);

		glossaryEClass = createEClass(GLOSSARY);
		createEReference(glossaryEClass, GLOSSARY__TERMS);
		createEAttribute(glossaryEClass, GLOSSARY__TITLE);

		// Create enums
		termInfluencePropertyEEnum = createEEnum(TERM_INFLUENCE_PROPERTY);
		termCategoryEEnum = createEEnum(TERM_CATEGORY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		glossaryTermEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		glossaryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(glossaryTermEClass, GlossaryTerm.class, "GlossaryTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossaryTerm_Glossary(), this.getGlossary(), this.getGlossary_Terms(), "glossary", null, 1, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryTerm_Term(), ecorePackage.getEString(), "term", "", 1, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryTerm_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlossaryTerm_Synonym(), this.getGlossaryTerm(), null, "synonym", null, 0, -1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryTerm_Otherforms(), ecorePackage.getEString(), "otherforms", null, 0, -1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryTerm_Termcategory(), this.getTermCategory(), "termcategory", null, 1, -1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryTerm_Termproperty(), this.getTermInfluenceProperty(), "termproperty", "neutral", 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlossaryTerm_Antonym(), this.getGlossaryTerm(), null, "antonym", null, 0, -1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glossaryEClass, Glossary.class, "Glossary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossary_Terms(), this.getGlossaryTerm(), this.getGlossaryTerm_Glossary(), "terms", null, 0, -1, Glossary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossary_Title(), ecorePackage.getEString(), "title", null, 0, 1, Glossary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(termInfluencePropertyEEnum, TermInfluenceProperty.class, "TermInfluenceProperty");
		addEEnumLiteral(termInfluencePropertyEEnum, TermInfluenceProperty.NEUTRAL);
		addEEnumLiteral(termInfluencePropertyEEnum, TermInfluenceProperty.POSITIVE);
		addEEnumLiteral(termInfluencePropertyEEnum, TermInfluenceProperty.NEGATIVE);

		initEEnum(termCategoryEEnum, TermCategory.class, "TermCategory");
		addEEnumLiteral(termCategoryEEnum, TermCategory.KEYWORD);
		addEEnumLiteral(termCategoryEEnum, TermCategory.GVERB);
		addEEnumLiteral(termCategoryEEnum, TermCategory.GOBJECT);
		addEEnumLiteral(termCategoryEEnum, TermCategory.QUESTION);
		addEEnumLiteral(termCategoryEEnum, TermCategory.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //GlossaryPackageImpl
