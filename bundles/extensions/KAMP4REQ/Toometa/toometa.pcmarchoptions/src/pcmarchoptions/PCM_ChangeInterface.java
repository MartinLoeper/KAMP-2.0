/**
 */
package pcmarchoptions;

import archoptions.ChangeInterface;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Change Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_ChangeInterface#getOldInterfaces <em>Old Interfaces</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_ChangeInterface#getNewInterfaces <em>New Interfaces</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeInterface()
 * @model
 * @generated
 */
public interface PCM_ChangeInterface extends ChangeInterface {
	/**
	 * Returns the value of the '<em><b>Old Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Interfaces</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeInterface_OldInterfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<OperationInterface> getOldInterfaces();

	/**
	 * Returns the value of the '<em><b>New Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Interfaces</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeInterface_NewInterfaces()
	 * @model
	 * @generated
	 */
	EList<OperationInterface> getNewInterfaces();

} // PCM_ChangeInterface
