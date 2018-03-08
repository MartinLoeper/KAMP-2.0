/**
 */
package pcmarchoptions;

import archoptions.OnlySingleInstantiation;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Only Single Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_OnlySingleInstantiation#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleInstantiation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleInstantiation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleInstantiation='assemblyContext.parentStructure__AssemblyContext.assemblyContexts__ComposedStructure->select(a : composition::AssemblyContext| a.encapsulatedComponent__AssemblyContext = assemblyContext.encapsulatedComponent__AssemblyContext)->size()=1'"
 * @generated
 */
public interface PCM_OnlySingleInstantiation extends OnlySingleInstantiation {
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
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleInstantiation_AssemblyContexts()
	 * @model required="true"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts();

} // PCM_OnlySingleInstantiation
