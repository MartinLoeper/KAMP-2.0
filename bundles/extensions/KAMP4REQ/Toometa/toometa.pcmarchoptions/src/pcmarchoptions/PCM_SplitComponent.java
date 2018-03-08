/**
 */
package pcmarchoptions;

import archoptions.SplitComponent;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Split Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_SplitComponent#getInitialContextName <em>Initial Context Name</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_SplitComponent#getFinalContexts <em>Final Contexts</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_SplitComponent()
 * @model
 * @generated
 */
public interface PCM_SplitComponent extends SplitComponent {
	/**
	 * Returns the value of the '<em><b>Initial Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Context Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Context Name</em>' attribute.
	 * @see #setInitialContextName(String)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_SplitComponent_InitialContextName()
	 * @model required="true"
	 * @generated
	 */
	String getInitialContextName();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_SplitComponent#getInitialContextName <em>Initial Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Context Name</em>' attribute.
	 * @see #getInitialContextName()
	 * @generated
	 */
	void setInitialContextName(String value);

	/**
	 * Returns the value of the '<em><b>Final Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Contexts</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_SplitComponent_FinalContexts()
	 * @model lower="2"
	 * @generated
	 */
	EList<AssemblyContext> getFinalContexts();

} // PCM_SplitComponent
