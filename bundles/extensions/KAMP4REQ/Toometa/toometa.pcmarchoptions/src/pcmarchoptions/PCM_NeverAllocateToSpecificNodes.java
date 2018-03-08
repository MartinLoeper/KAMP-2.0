/**
 */
package pcmarchoptions;

import archoptions.NeverAllocateToSpecificNodes;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.allocation.AllocationContext;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Never Allocate To Specific Nodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_NeverAllocateToSpecificNodes#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_NeverAllocateToSpecificNodes#getHwNodes <em>Hw Nodes</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_NeverAllocateToSpecificNodes()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NeverAllocateToSpecificNodes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NeverAllocateToSpecificNodes='allocationContexts->forAll(a:allocation::AllocationContext | not hwNodes->exists(h|a.resourceContainer_AllocationContext=h))'"
 * @generated
 */
public interface PCM_NeverAllocateToSpecificNodes extends NeverAllocateToSpecificNodes {
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
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_NeverAllocateToSpecificNodes_AllocationContexts()
	 * @model required="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

	/**
	 * Returns the value of the '<em><b>Hw Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Nodes</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_NeverAllocateToSpecificNodes_HwNodes()
	 * @model required="true"
	 * @generated
	 */
	EList<ResourceContainer> getHwNodes();

} // PCM_NeverAllocateToSpecificNodes
