/**
 */
package pcmarchoptions;

import archoptions.AllocateTogether;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Allocate Together</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_AllocateTogether#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_AllocateTogether()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TogetherAllocation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL TogetherAllocation='allocationContexts->forAll(a:allocation::AllocationContext, b:allocation::AllocationContext | a<>b implies (a.resourceContainer_AllocationContext=b.resourceContainer_AllocationContext and a.assemblyContext_AllocationContext <> b.assemblyContext_AllocationContext))'"
 * @generated
 */
public interface PCM_AllocateTogether extends AllocateTogether {
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
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_AllocateTogether_AllocationContexts()
	 * @model lower="2"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // PCM_AllocateTogether
