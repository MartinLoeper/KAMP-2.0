/**
 */
package options;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see options.OptionsPackage#getDecisionStatusEnum()
 * @model
 * @generated
 */
public enum DecisionStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(0, "open", "open"),

	/**
	 * The '<em><b>Taken</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TAKEN(1, "taken", "taken"),

	/**
	 * The '<em><b>Reviewed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWED_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWED(2, "reviewed", "reviewed"),

	/**
	 * The '<em><b>Obsolete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSOLETE_VALUE
	 * @generated
	 * @ordered
	 */
	OBSOLETE(3, "obsolete", "obsolete"),

	/**
	 * The '<em><b>Replaced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACED_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACED(4, "replaced", "replaced"),

	/**
	 * The '<em><b>In Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_CONFLICT(5, "inConflict", "inConflict");

	/**
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model name="open"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 0;

	/**
	 * The '<em><b>Taken</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Taken</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAKEN
	 * @model name="taken"
	 * @generated
	 * @ordered
	 */
	public static final int TAKEN_VALUE = 1;

	/**
	 * The '<em><b>Reviewed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reviewed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEWED
	 * @model name="reviewed"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWED_VALUE = 2;

	/**
	 * The '<em><b>Obsolete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Obsolete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSOLETE
	 * @model name="obsolete"
	 * @generated
	 * @ordered
	 */
	public static final int OBSOLETE_VALUE = 3;

	/**
	 * The '<em><b>Replaced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replaced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACED
	 * @model name="replaced"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACED_VALUE = 4;

	/**
	 * The '<em><b>In Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Conflict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_CONFLICT
	 * @model name="inConflict"
	 * @generated
	 * @ordered
	 */
	public static final int IN_CONFLICT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Decision Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionStatusEnum[] VALUES_ARRAY =
		new DecisionStatusEnum[] {
			OPEN,
			TAKEN,
			REVIEWED,
			OBSOLETE,
			REPLACED,
			IN_CONFLICT,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionStatusEnum get(int value) {
		switch (value) {
			case OPEN_VALUE: return OPEN;
			case TAKEN_VALUE: return TAKEN;
			case REVIEWED_VALUE: return REVIEWED;
			case OBSOLETE_VALUE: return OBSOLETE;
			case REPLACED_VALUE: return REPLACED;
			case IN_CONFLICT_VALUE: return IN_CONFLICT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DecisionStatusEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DecisionStatusEnum
