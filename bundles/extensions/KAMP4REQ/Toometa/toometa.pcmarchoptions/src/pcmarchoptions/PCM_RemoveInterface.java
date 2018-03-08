/**
 */
package pcmarchoptions;

import archoptions.RemoveInterface;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Remove Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_RemoveInterface#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_RemoveInterface()
 * @model
 * @generated
 */
public interface PCM_RemoveInterface extends RemoveInterface {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_RemoveInterface_Interfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<OperationInterface> getInterfaces();

} // PCM_RemoveInterface
