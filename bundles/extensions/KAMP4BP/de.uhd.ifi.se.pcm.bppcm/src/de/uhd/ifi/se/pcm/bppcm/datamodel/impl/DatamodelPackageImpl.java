/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl;

import de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelFactory;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;
import de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatamodelPackageImpl extends EPackageImpl implements DatamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionDataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDataObjectDeclarationEClass = null;

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
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatamodelPackageImpl() {
		super(eNS_URI, DatamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatamodelPackage init() {
		if (isInited) return (DatamodelPackage)EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI);

		// Obtain or create and register package
		DatamodelPackageImpl theDatamodelPackage = (DatamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatamodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BpusagemodelPackageImpl theBpusagemodelPackage = (BpusagemodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BpusagemodelPackage.eNS_URI) instanceof BpusagemodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BpusagemodelPackage.eNS_URI) : BpusagemodelPackage.eINSTANCE);
		OrganizationenvironmentmodelPackageImpl theOrganizationenvironmentmodelPackage = (OrganizationenvironmentmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationenvironmentmodelPackage.eNS_URI) instanceof OrganizationenvironmentmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationenvironmentmodelPackage.eNS_URI) : OrganizationenvironmentmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theDatamodelPackage.createPackageContents();
		theBpusagemodelPackage.createPackageContents();
		theOrganizationenvironmentmodelPackage.createPackageContents();

		// Initialize created meta-data
		theDatamodelPackage.initializePackageContents();
		theBpusagemodelPackage.initializePackageContents();
		theOrganizationenvironmentmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatamodelPackage.eNS_URI, theDatamodelPackage);
		return theDatamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_DataModel() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_DataTypes() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionDataObject() {
		return collectionDataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionDataObject_InnerDataObjects() {
		return (EReference)collectionDataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeDataObject() {
		return compositeDataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDataObject_InnerDataObjectDeclarations() {
		return (EReference)compositeDataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModel() {
		return dataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_DataObjects() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInnerDataObjectDeclaration() {
		return innerDataObjectDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInnerDataObjectDeclaration_DataObject() {
		return (EReference)innerDataObjectDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInnerDataObjectDeclaration_CompositeDataObject() {
		return (EReference)innerDataObjectDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatamodelFactory getDatamodelFactory() {
		return (DatamodelFactory)getEFactoryInstance();
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
		dataObjectEClass = createEClass(DATA_OBJECT);
		createEReference(dataObjectEClass, DATA_OBJECT__DATA_MODEL);
		createEReference(dataObjectEClass, DATA_OBJECT__DATA_TYPES);

		collectionDataObjectEClass = createEClass(COLLECTION_DATA_OBJECT);
		createEReference(collectionDataObjectEClass, COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS);

		compositeDataObjectEClass = createEClass(COMPOSITE_DATA_OBJECT);
		createEReference(compositeDataObjectEClass, COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS);

		dataModelEClass = createEClass(DATA_MODEL);
		createEReference(dataModelEClass, DATA_MODEL__DATA_OBJECTS);

		innerDataObjectDeclarationEClass = createEClass(INNER_DATA_OBJECT_DECLARATION);
		createEReference(innerDataObjectDeclarationEClass, INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT);
		createEReference(innerDataObjectDeclarationEClass, INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT);
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
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters
		ETypeParameter dataObjectEClass_T = addETypeParameter(dataObjectEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theRepositoryPackage.getDataType());
		dataObjectEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		dataObjectEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getDataObject());
		EGenericType g2 = createEGenericType(theRepositoryPackage.getCollectionDataType());
		g1.getETypeArguments().add(g2);
		collectionDataObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataObject());
		g2 = createEGenericType(theRepositoryPackage.getCompositeDataType());
		g1.getETypeArguments().add(g2);
		compositeDataObjectEClass.getEGenericSuperTypes().add(g1);
		innerDataObjectDeclarationEClass.getESuperTypes().add(theEntityPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(dataObjectEClass, DataObject.class, "DataObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataObject_DataModel(), this.getDataModel(), this.getDataModel_DataObjects(), "dataModel", null, 1, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(dataObjectEClass_T);
		initEReference(getDataObject_DataTypes(), g1, null, "dataTypes", null, 0, -1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionDataObjectEClass, CollectionDataObject.class, "CollectionDataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getDataObject());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getCollectionDataObject_InnerDataObjects(), g1, null, "innerDataObjects", null, 0, -1, CollectionDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compositeDataObjectEClass, CompositeDataObject.class, "CompositeDataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDataObject_InnerDataObjectDeclarations(), this.getInnerDataObjectDeclaration(), this.getInnerDataObjectDeclaration_CompositeDataObject(), "innerDataObjectDeclarations", null, 0, -1, CompositeDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataModelEClass, DataModel.class, "DataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getDataObject());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getDataModel_DataObjects(), g1, this.getDataObject_DataModel(), "dataObjects", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(innerDataObjectDeclarationEClass, InnerDataObjectDeclaration.class, "InnerDataObjectDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getDataObject());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getInnerDataObjectDeclaration_DataObject(), g1, null, "dataObject", null, 1, 1, InnerDataObjectDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInnerDataObjectDeclaration_CompositeDataObject(), this.getCompositeDataObject(), this.getCompositeDataObject_InnerDataObjectDeclarations(), "compositeDataObject", null, 1, 1, InnerDataObjectDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatamodelPackageImpl
