/**
 */
package pcmarchoptions;

import archoptions.IntroduceNewComponent;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Introduce New Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_IntroduceNewComponent#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewComponent()
 * @model
 * @generated
 */
public interface PCM_IntroduceNewComponent extends IntroduceNewComponent {
	/**
	 * Returns the value of the '<em><b>Assembly Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Contexts</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewComponent_AssemblyContexts()
	 * @model
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts();

} // PCM_IntroduceNewComponent
