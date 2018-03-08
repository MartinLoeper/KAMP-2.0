/**
 */
package pcmarchoptions;

import archoptions.MoveComponents;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.allocation.AllocationContext;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Move Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_MoveComponents#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_MoveComponents#getFromHwNode <em>From Hw Node</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_MoveComponents#getToHwNode <em>To Hw Node</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MoveComponents()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MoveComponents'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MoveComponents='allocationContexts->forAll(a:allocation::AllocationContext | a.resourceContainer_AllocationContext<>fromHwNode and a.resourceContainer_AllocationContext=toHwNode)'"
 * @generated
 */
public interface PCM_MoveComponents extends MoveComponents {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.allocation.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MoveComponents_AllocationContexts()
	 * @model required="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

	/**
	 * Returns the value of the '<em><b>From Hw Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Hw Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Hw Node</em>' reference.
	 * @see #setFromHwNode(ResourceContainer)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MoveComponents_FromHwNode()
	 * @model required="true"
	 * @generated
	 */
	ResourceContainer getFromHwNode();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_MoveComponents#getFromHwNode <em>From Hw Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Hw Node</em>' reference.
	 * @see #getFromHwNode()
	 * @generated
	 */
	void setFromHwNode(ResourceContainer value);

	/**
	 * Returns the value of the '<em><b>To Hw Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Hw Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Hw Node</em>' reference.
	 * @see #setToHwNode(ResourceContainer)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MoveComponents_ToHwNode()
	 * @model required="true"
	 * @generated
	 */
	ResourceContainer getToHwNode();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_MoveComponents#getToHwNode <em>To Hw Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Hw Node</em>' reference.
	 * @see #getToHwNode()
	 * @generated
	 */
	void setToHwNode(ResourceContainer value);

} // PCM_MoveComponents
