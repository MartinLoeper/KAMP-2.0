/**
 */
package pcmarchoptions;

import archoptions.OnlySingleAllocation;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Only Single Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_OnlySingleAllocation#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleAllocation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleAllocation='allocationContext.allocation_AllocationContext.allocationContexts_Allocation->select(a : allocation :: AllocationContext|a.assemblyContext_AllocationContext=allocationContext.assemblyContext_AllocationContext)->size()=1'"
 * @generated
 */
public interface PCM_OnlySingleAllocation extends OnlySingleAllocation {
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
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleAllocation_AllocationContexts()
	 * @model required="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // PCM_OnlySingleAllocation
