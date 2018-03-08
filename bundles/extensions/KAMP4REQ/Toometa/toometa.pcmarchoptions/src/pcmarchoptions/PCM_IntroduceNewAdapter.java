/**
 */
package pcmarchoptions;

import archoptions.IntroduceNewAdapter;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Introduce New Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_IntroduceNewAdapter#getAdapterContext <em>Adapter Context</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_IntroduceNewAdapter#getContextBeingAdapted <em>Context Being Adapted</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewAdapter()
 * @model
 * @generated
 */
public interface PCM_IntroduceNewAdapter extends IntroduceNewAdapter {
	/**
	 * Returns the value of the '<em><b>Adapter Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Context</em>' reference.
	 * @see #setAdapterContext(AssemblyContext)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewAdapter_AdapterContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAdapterContext();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_IntroduceNewAdapter#getAdapterContext <em>Adapter Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Context</em>' reference.
	 * @see #getAdapterContext()
	 * @generated
	 */
	void setAdapterContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Context Being Adapted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Being Adapted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Being Adapted</em>' reference.
	 * @see #setContextBeingAdapted(AssemblyContext)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewAdapter_ContextBeingAdapted()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getContextBeingAdapted();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_IntroduceNewAdapter#getContextBeingAdapted <em>Context Being Adapted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Being Adapted</em>' reference.
	 * @see #getContextBeingAdapted()
	 * @generated
	 */
	void setContextBeingAdapted(AssemblyContext value);

} // PCM_IntroduceNewAdapter
