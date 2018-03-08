/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage
 * @generated
 */
public interface DatamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatamodelFactory eINSTANCE = de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Collection Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Data Object</em>'.
	 * @generated
	 */
	CollectionDataObject createCollectionDataObject();

	/**
	 * Returns a new object of class '<em>Composite Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Data Object</em>'.
	 * @generated
	 */
	CompositeDataObject createCompositeDataObject();

	/**
	 * Returns a new object of class '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Model</em>'.
	 * @generated
	 */
	DataModel createDataModel();

	/**
	 * Returns a new object of class '<em>Inner Data Object Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inner Data Object Declaration</em>'.
	 * @generated
	 */
	InnerDataObjectDeclaration createInnerDataObjectDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatamodelPackage getDatamodelPackage();

} //DatamodelFactory
