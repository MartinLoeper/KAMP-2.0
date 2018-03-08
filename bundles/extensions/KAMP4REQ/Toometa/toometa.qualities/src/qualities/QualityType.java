/**
 */
package qualities;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualities.QualityType#getDescription <em>Description</em>}</li>
 *   <li>{@link qualities.QualityType#getQualityTypeRepository <em>Quality Type Repository</em>}</li>
 *   <li>{@link qualities.QualityType#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see qualities.QualitiesPackage#getQualityType()
 * @model abstract="true"
 * @generated
 */
public interface QualityType extends Identifier {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see qualities.QualitiesPackage#getQualityType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link qualities.QualityType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Quality Type Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualities.QualityTypeRepository#getQualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Type Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Type Repository</em>' container reference.
	 * @see #setQualityTypeRepository(QualityTypeRepository)
	 * @see qualities.QualitiesPackage#getQualityType_QualityTypeRepository()
	 * @see qualities.QualityTypeRepository#getQualityType
	 * @model opposite="qualityType" required="true" transient="false"
	 * @generated
	 */
	QualityTypeRepository getQualityTypeRepository();

	/**
	 * Sets the value of the '{@link qualities.QualityType#getQualityTypeRepository <em>Quality Type Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Type Repository</em>' container reference.
	 * @see #getQualityTypeRepository()
	 * @generated
	 */
	void setQualityTypeRepository(QualityTypeRepository value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(Dimension)
	 * @see qualities.QualitiesPackage#getQualityType_Dimension()
	 * @model
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link qualities.QualityType#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

} // QualityType
