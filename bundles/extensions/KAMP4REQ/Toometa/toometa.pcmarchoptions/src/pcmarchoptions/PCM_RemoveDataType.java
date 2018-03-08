/**
 */
package pcmarchoptions;

import archoptions.RemoveDataType;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Remove Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_RemoveDataType#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_RemoveDataType()
 * @model
 * @generated
 */
public interface PCM_RemoveDataType extends RemoveDataType {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_RemoveDataType_DataTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // PCM_RemoveDataType
