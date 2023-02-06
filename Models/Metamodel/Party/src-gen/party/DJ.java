/**
 */
package party;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DJ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link party.DJ#getName <em>Name</em>}</li>
 *   <li>{@link party.DJ#getHonorarium <em>Honorarium</em>}</li>
 * </ul>
 *
 * @see party.PartyPackage#getDJ()
 * @model
 * @generated
 */
public interface DJ extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see party.PartyPackage#getDJ_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link party.DJ#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Honorarium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Honorarium</em>' attribute.
	 * @see #setHonorarium(double)
	 * @see party.PartyPackage#getDJ_Honorarium()
	 * @model
	 * @generated
	 */
	double getHonorarium();

	/**
	 * Sets the value of the '{@link party.DJ#getHonorarium <em>Honorarium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Honorarium</em>' attribute.
	 * @see #getHonorarium()
	 * @generated
	 */
	void setHonorarium(double value);

} // DJ
