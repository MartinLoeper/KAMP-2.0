/**
 */
package pcmbpoptions;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Introduce New Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmbpoptions.PCM_IntroduceNewEntity#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see pcmbpoptions.PcmbpoptionsPackage#getPCM_IntroduceNewEntity()
 * @model
 * @generated
 */
public interface PCM_IntroduceNewEntity extends PCM_EntityOption {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.entity.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see pcmbpoptions.PcmbpoptionsPackage#getPCM_IntroduceNewEntity_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

} // PCM_IntroduceNewEntity
