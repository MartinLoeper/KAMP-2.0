/**
 */
package pcmarchoptions;

import archoptions.ChangeDataType;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Change Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_ChangeDataType#getOldDataTypes <em>Old Data Types</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_ChangeDataType#getNewDataTypes <em>New Data Types</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeDataType()
 * @model
 * @generated
 */
public interface PCM_ChangeDataType extends ChangeDataType {
	/**
	 * Returns the value of the '<em><b>Old Data Types</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Data Types</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeDataType_OldDataTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<DataType> getOldDataTypes();

	/**
	 * Returns the value of the '<em><b>New Data Types</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data Types</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeDataType_NewDataTypes()
	 * @model
	 * @generated
	 */
	EList<DataType> getNewDataTypes();

} // PCM_ChangeDataType
