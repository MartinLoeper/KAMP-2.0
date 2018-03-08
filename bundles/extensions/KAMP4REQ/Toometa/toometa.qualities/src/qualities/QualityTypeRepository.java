/**
 */
package qualities;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualities.QualityTypeRepository#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @see qualities.QualitiesPackage#getQualityTypeRepository()
 * @model
 * @generated
 */
public interface QualityTypeRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Quality Type</b></em>' containment reference list.
	 * The list contents are of type {@link qualities.QualityType}.
	 * It is bidirectional and its opposite is '{@link qualities.QualityType#getQualityTypeRepository <em>Quality Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Type</em>' containment reference list.
	 * @see qualities.QualitiesPackage#getQualityTypeRepository_QualityType()
	 * @see qualities.QualityType#getQualityTypeRepository
	 * @model opposite="qualityTypeRepository" containment="true"
	 * @generated
	 */
	EList<QualityType> getQualityType();

} // QualityTypeRepository
