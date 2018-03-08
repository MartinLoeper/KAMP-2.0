/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.util;

import de.uhd.ifi.se.pcm.bppcm.datamodel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage
 * @generated
 */
public class DatamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DatamodelValidator INSTANCE = new DatamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uhd.ifi.se.pcm.bppcm.datamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DatamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DatamodelPackage.DATA_OBJECT:
				return validateDataObject((DataObject<?>)value, diagnostics, context);
			case DatamodelPackage.COLLECTION_DATA_OBJECT:
				return validateCollectionDataObject((CollectionDataObject)value, diagnostics, context);
			case DatamodelPackage.COMPOSITE_DATA_OBJECT:
				return validateCompositeDataObject((CompositeDataObject)value, diagnostics, context);
			case DatamodelPackage.DATA_MODEL:
				return validateDataModel((DataModel)value, diagnostics, context);
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION:
				return validateInnerDataObjectDeclaration((InnerDataObjectDeclaration)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject(DataObject<?> dataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionDataObject(CollectionDataObject collectionDataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionDataObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionDataObject_InnerTypeShouldMatchInnerObjects(collectionDataObject, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InnerTypeShouldMatchInnerObjects constraint of '<em>Collection Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLLECTION_DATA_OBJECT__INNER_TYPE_SHOULD_MATCH_INNER_OBJECTS__EEXPRESSION = "self.innerDataObjects->forAll(innerDataObject|innerDataObject.dataType=self.dataType.oclAsType(repository::CollectionDataType).innerType_CollectionDataType)";

	/**
	 * Validates the InnerTypeShouldMatchInnerObjects constraint of '<em>Collection Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionDataObject_InnerTypeShouldMatchInnerObjects(CollectionDataObject collectionDataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DatamodelPackage.Literals.COLLECTION_DATA_OBJECT,
				 collectionDataObject,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InnerTypeShouldMatchInnerObjects",
				 COLLECTION_DATA_OBJECT__INNER_TYPE_SHOULD_MATCH_INNER_OBJECTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeDataObject(CompositeDataObject compositeDataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeDataObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeDataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeDataObject_InnerDeclarationsShouldMatchTypesInnerDeclarations(compositeDataObject, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InnerDeclarationsShouldMatchTypesInnerDeclarations constraint of '<em>Composite Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_DATA_OBJECT__INNER_DECLARATIONS_SHOULD_MATCH_TYPES_INNER_DECLARATIONS__EEXPRESSION = "self.innerDataObjectDeclarations->forAll(innerDataObjectDeclaration|self.dataType.oclAsType(repository::CompositeDataType).innerDeclaration_CompositeDataType->one(innerDataTypeDeclaration|innerDataTypeDeclaration.entityName=innerDataObjectDeclaration.entityName and innerDataTypeDeclaration.datatype_InnerDeclaration=innerDataObjectDeclaration.dataObject.dataType))";

	/**
	 * Validates the InnerDeclarationsShouldMatchTypesInnerDeclarations constraint of '<em>Composite Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeDataObject_InnerDeclarationsShouldMatchTypesInnerDeclarations(CompositeDataObject compositeDataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DatamodelPackage.Literals.COMPOSITE_DATA_OBJECT,
				 compositeDataObject,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InnerDeclarationsShouldMatchTypesInnerDeclarations",
				 COMPOSITE_DATA_OBJECT__INNER_DECLARATIONS_SHOULD_MATCH_TYPES_INNER_DECLARATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataModel(DataModel dataModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerDataObjectDeclaration(InnerDataObjectDeclaration innerDataObjectDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerDataObjectDeclaration, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DatamodelValidator
