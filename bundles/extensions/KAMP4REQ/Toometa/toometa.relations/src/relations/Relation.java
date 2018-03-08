/**
 */
package relations;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.Relation#getType <em>Type</em>}</li>
 *   <li>{@link relations.Relation#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link relations.Relation#getFrom <em>From</em>}</li>
 *   <li>{@link relations.Relation#getTo <em>To</em>}</li>
 *   <li>{@link relations.Relation#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends Identifier {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RelationType)
	 * @see relations.RelationsPackage#getRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	RelationType getType();

	/**
	 * Sets the value of the '{@link relations.Relation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationType value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Relation)
	 * @see relations.RelationsPackage#getRelation_Opposite()
	 * @model
	 * @generated
	 */
	Relation getOpposite();

	/**
	 * Sets the value of the '{@link relations.Relation#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Relation value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(RelationObject)
	 * @see relations.RelationsPackage#getRelation_From()
	 * @model
	 * @generated
	 */
	RelationObject getFrom();

	/**
	 * Sets the value of the '{@link relations.Relation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(RelationObject value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RelationObject)
	 * @see relations.RelationsPackage#getRelation_To()
	 * @model required="true"
	 * @generated
	 */
	RelationObject getTo();

	/**
	 * Sets the value of the '{@link relations.Relation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RelationObject value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see relations.RelationsPackage#getRelation_Bidirectional()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link relations.Relation#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

} // Relation
