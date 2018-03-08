/**
 */
package pcmarchoptions;

import archoptions.ReplaceComponents;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Replace Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_ReplaceComponents#getContextsReplacedWith <em>Contexts Replaced With</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_ReplaceComponents#getReplacedContextNames <em>Replaced Context Names</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ReplaceComponents()
 * @model
 * @generated
 */
public interface PCM_ReplaceComponents extends ReplaceComponents {
	/**
	 * Returns the value of the '<em><b>Contexts Replaced With</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts Replaced With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts Replaced With</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ReplaceComponents_ContextsReplacedWith()
	 * @model required="true"
	 * @generated
	 */
	EList<AssemblyContext> getContextsReplacedWith();

	/**
	 * Returns the value of the '<em><b>Replaced Context Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replaced Context Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaced Context Names</em>' attribute list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ReplaceComponents_ReplacedContextNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getReplacedContextNames();

} // PCM_ReplaceComponents
