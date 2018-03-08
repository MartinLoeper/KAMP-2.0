/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.impl;

import de.uhd.ifi.se.pcm.bppcm.datamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatamodelFactoryImpl extends EFactoryImpl implements DatamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatamodelFactory init() {
		try {
			DatamodelFactory theDatamodelFactory = (DatamodelFactory)EPackage.Registry.INSTANCE.getEFactory(DatamodelPackage.eNS_URI);
			if (theDatamodelFactory != null) {
				return theDatamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatamodelPackage.COLLECTION_DATA_OBJECT: return createCollectionDataObject();
			case DatamodelPackage.COMPOSITE_DATA_OBJECT: return createCompositeDataObject();
			case DatamodelPackage.DATA_MODEL: return createDataModel();
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION: return createInnerDataObjectDeclaration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDataObject createCollectionDataObject() {
		CollectionDataObjectImpl collectionDataObject = new CollectionDataObjectImpl();
		return collectionDataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataObject createCompositeDataObject() {
		CompositeDataObjectImpl compositeDataObject = new CompositeDataObjectImpl();
		return compositeDataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerDataObjectDeclaration createInnerDataObjectDeclaration() {
		InnerDataObjectDeclarationImpl innerDataObjectDeclaration = new InnerDataObjectDeclarationImpl();
		return innerDataObjectDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatamodelPackage getDatamodelPackage() {
		return (DatamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatamodelPackage getPackage() {
		return DatamodelPackage.eINSTANCE;
	}

} //DatamodelFactoryImpl
