/**
 */
package requirements;

import org.eclipse.emf.common.util.EList;

import qualities.QualityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements.QualityRequirement#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends SystemRequirement {
	/**
	 * Returns the value of the '<em><b>Quality Type</b></em>' reference list.
	 * The list contents are of type {@link qualities.QualityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Type</em>' reference list.
	 * @see requirements.RequirementsPackage#getQualityRequirement_QualityType()
	 * @model required="true"
	 * @generated
	 */
	EList<QualityType> getQualityType();

} // QualityRequirement
