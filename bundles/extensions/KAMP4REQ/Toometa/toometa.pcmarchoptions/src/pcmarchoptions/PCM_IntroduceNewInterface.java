/**
 */
package pcmarchoptions;

import archoptions.IntroduceNewInterface;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Introduce New Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_IntroduceNewInterface#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewInterface()
 * @model
 * @generated
 */
public interface PCM_IntroduceNewInterface extends IntroduceNewInterface {
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
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewInterface_Interfaces()
	 * @model
	 * @generated
	 */
	EList<OperationInterface> getInterfaces();

} // PCM_IntroduceNewInterface
