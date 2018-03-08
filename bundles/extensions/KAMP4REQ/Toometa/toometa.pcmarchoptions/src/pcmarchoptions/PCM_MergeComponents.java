/**
 */
package pcmarchoptions;

import archoptions.MergeComponents;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Merge Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_MergeComponents#getInitialContextsNameList <em>Initial Contexts Name List</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_MergeComponents#getFinalContext <em>Final Context</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MergeComponents()
 * @model
 * @generated
 */
public interface PCM_MergeComponents extends MergeComponents {
	/**
	 * Returns the value of the '<em><b>Initial Contexts Name List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Contexts Name List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Contexts Name List</em>' attribute list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MergeComponents_InitialContextsNameList()
	 * @model lower="2"
	 * @generated
	 */
	EList<String> getInitialContextsNameList();

	/**
	 * Returns the value of the '<em><b>Final Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Context</em>' reference.
	 * @see #setFinalContext(AssemblyContext)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MergeComponents_FinalContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getFinalContext();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_MergeComponents#getFinalContext <em>Final Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Context</em>' reference.
	 * @see #getFinalContext()
	 * @generated
	 */
	void setFinalContext(AssemblyContext value);

} // PCM_MergeComponents
