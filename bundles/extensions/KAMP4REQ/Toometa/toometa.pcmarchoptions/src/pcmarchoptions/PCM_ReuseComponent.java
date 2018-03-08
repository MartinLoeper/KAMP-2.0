/**
 */
package pcmarchoptions;

import archoptions.ReuseComponent;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Reuse Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_ReuseComponent#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ReuseComponent()
 * @model
 * @generated
 */
public interface PCM_ReuseComponent extends ReuseComponent {
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
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ReuseComponent_AssemblyContexts()
	 * @model required="true"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts();

} // PCM_ReuseComponent
