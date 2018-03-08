/**
 */
package pcmarchoptions;

import archoptions.MultipleInstantiation;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Multiple Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_MultipleInstantiation#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MultipleInstantiation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameComponent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameComponent='assemblyContexts->forAll(a : composition::AssemblyContext, b : composition::AssemblyContext | a<> b implies (a.encapsulatedComponent__AssemblyContext = b.encapsulatedComponent__AssemblyContext))'"
 * @generated
 */
public interface PCM_MultipleInstantiation extends MultipleInstantiation {
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
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_MultipleInstantiation_AssemblyContexts()
	 * @model lower="2"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts();

} // PCM_MultipleInstantiation
