/**
 */
package relations;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.RelationObject#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getRelationObject()
 * @model abstract="true"
 * @generated
 */
public interface RelationObject extends Identifier {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link relations.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see relations.RelationsPackage#getRelationObject_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // RelationObject
