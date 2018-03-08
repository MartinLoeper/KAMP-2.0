/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelFactory
 * @model kind="package"
 * @generated
 */
public interface DatamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/5.1/bp/DataModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatamodelPackage eINSTANCE = de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataObjectImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DATA_MODEL = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DATA_TYPES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CollectionDataObjectImpl <em>Collection Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CollectionDataObjectImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getCollectionDataObject()
	 * @generated
	 */
	int COLLECTION_DATA_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_OBJECT__ID = DATA_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_OBJECT__ENTITY_NAME = DATA_OBJECT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_OBJECT__DATA_MODEL = DATA_OBJECT__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_OBJECT__DATA_TYPES = DATA_OBJECT__DATA_TYPES;

	/**
	 * The feature id for the '<em><b>Inner Data Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_OBJECT_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CompositeDataObjectImpl <em>Composite Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CompositeDataObjectImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getCompositeDataObject()
	 * @generated
	 */
	int COMPOSITE_DATA_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_OBJECT__ID = DATA_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_OBJECT__ENTITY_NAME = DATA_OBJECT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_OBJECT__DATA_MODEL = DATA_OBJECT__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_OBJECT__DATA_TYPES = DATA_OBJECT__DATA_TYPES;

	/**
	 * The feature id for the '<em><b>Inner Data Object Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_OBJECT_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataModelImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Data Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_OBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.InnerDataObjectDeclarationImpl <em>Inner Data Object Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.InnerDataObjectDeclarationImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getInnerDataObjectDeclaration()
	 * @generated
	 */
	int INNER_DATA_OBJECT_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DATA_OBJECT_DECLARATION__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Data Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite Data Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inner Data Object Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DATA_OBJECT_DECLARATION_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for the container reference '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataModel()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_DataModel();

	/**
	 * Returns the meta object for the reference list '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Types</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataTypes()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_DataTypes();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject <em>Collection Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Data Object</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject
	 * @generated
	 */
	EClass getCollectionDataObject();

	/**
	 * Returns the meta object for the reference list '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject#getInnerDataObjects <em>Inner Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inner Data Objects</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject#getInnerDataObjects()
	 * @see #getCollectionDataObject()
	 * @generated
	 */
	EReference getCollectionDataObject_InnerDataObjects();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject <em>Composite Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Data Object</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject
	 * @generated
	 */
	EClass getCompositeDataObject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject#getInnerDataObjectDeclarations <em>Inner Data Object Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Data Object Declarations</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject#getInnerDataObjectDeclarations()
	 * @see #getCompositeDataObject()
	 * @generated
	 */
	EReference getCompositeDataObject_InnerDataObjectDeclarations();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel#getDataObjects <em>Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Objects</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel#getDataObjects()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_DataObjects();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration <em>Inner Data Object Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Data Object Declaration</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration
	 * @generated
	 */
	EClass getInnerDataObjectDeclaration();

	/**
	 * Returns the meta object for the reference '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getDataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Object</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getDataObject()
	 * @see #getInnerDataObjectDeclaration()
	 * @generated
	 */
	EReference getInnerDataObjectDeclaration_DataObject();

	/**
	 * Returns the meta object for the container reference '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getCompositeDataObject <em>Composite Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Composite Data Object</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getCompositeDataObject()
	 * @see #getInnerDataObjectDeclaration()
	 * @generated
	 */
	EReference getInnerDataObjectDeclaration_CompositeDataObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatamodelFactory getDatamodelFactory();

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
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataObjectImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__DATA_MODEL = eINSTANCE.getDataObject_DataModel();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__DATA_TYPES = eINSTANCE.getDataObject_DataTypes();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CollectionDataObjectImpl <em>Collection Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CollectionDataObjectImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getCollectionDataObject()
		 * @generated
		 */
		EClass COLLECTION_DATA_OBJECT = eINSTANCE.getCollectionDataObject();

		/**
		 * The meta object literal for the '<em><b>Inner Data Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS = eINSTANCE.getCollectionDataObject_InnerDataObjects();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CompositeDataObjectImpl <em>Composite Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CompositeDataObjectImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getCompositeDataObject()
		 * @generated
		 */
		EClass COMPOSITE_DATA_OBJECT = eINSTANCE.getCompositeDataObject();

		/**
		 * The meta object literal for the '<em><b>Inner Data Object Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS = eINSTANCE.getCompositeDataObject_InnerDataObjectDeclarations();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataModelImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Data Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_OBJECTS = eINSTANCE.getDataModel_DataObjects();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.InnerDataObjectDeclarationImpl <em>Inner Data Object Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.InnerDataObjectDeclarationImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl#getInnerDataObjectDeclaration()
		 * @generated
		 */
		EClass INNER_DATA_OBJECT_DECLARATION = eINSTANCE.getInnerDataObjectDeclaration();

		/**
		 * The meta object literal for the '<em><b>Data Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT = eINSTANCE.getInnerDataObjectDeclaration_DataObject();

		/**
		 * The meta object literal for the '<em><b>Composite Data Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT = eINSTANCE.getInnerDataObjectDeclaration_CompositeDataObject();

	}

} //DatamodelPackage
