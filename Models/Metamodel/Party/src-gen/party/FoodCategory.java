/**
 */
package party;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Food Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see party.PartyPackage#getFoodCategory()
 * @model
 * @generated
 */
public enum FoodCategory implements Enumerator {
	/**
	 * The '<em><b>PIZZA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIZZA_VALUE
	 * @generated
	 * @ordered
	 */
	PIZZA(0, "PIZZA", "PIZZA"),

	/**
	 * The '<em><b>MEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAT_VALUE
	 * @generated
	 * @ordered
	 */
	MEAT(1, "MEAT", "MEAT"),

	/**
	 * The '<em><b>SALAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALAD_VALUE
	 * @generated
	 * @ordered
	 */
	SALAD(2, "SALAD", "SALAD"),

	/**
	 * The '<em><b>CAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAKE_VALUE
	 * @generated
	 * @ordered
	 */
	CAKE(3, "CAKE", "CAKE");

	/**
	 * The '<em><b>PIZZA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIZZA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIZZA_VALUE = 0;

	/**
	 * The '<em><b>MEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEAT_VALUE = 1;

	/**
	 * The '<em><b>SALAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SALAD_VALUE = 2;

	/**
	 * The '<em><b>CAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAKE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Food Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FoodCategory[] VALUES_ARRAY = new FoodCategory[] { PIZZA, MEAT, SALAD, CAKE, };

	/**
	 * A public read-only list of all the '<em><b>Food Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FoodCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Food Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FoodCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FoodCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodCategory get(int value) {
		switch (value) {
		case PIZZA_VALUE:
			return PIZZA;
		case MEAT_VALUE:
			return MEAT;
		case SALAD_VALUE:
			return SALAD;
		case CAKE_VALUE:
			return CAKE;
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
	private FoodCategory(int value, String name, String literal) {
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

} //FoodCategory
