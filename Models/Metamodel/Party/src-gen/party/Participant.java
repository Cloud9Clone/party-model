/**
 */
package party;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link party.Participant#getName <em>Name</em>}</li>
 *   <li>{@link party.Participant#getAge <em>Age</em>}</li>
 *   <li>{@link party.Participant#getTotalValueOfConsumption <em>Total Value Of Consumption</em>}</li>
 *   <li>{@link party.Participant#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link party.Participant#getSex <em>Sex</em>}</li>
 * </ul>
 *
 * @see party.PartyPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see party.PartyPackage#getParticipant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link party.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see party.PartyPackage#getParticipant_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link party.Participant#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Total Value Of Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Value Of Consumption</em>' attribute.
	 * @see #setTotalValueOfConsumption(double)
	 * @see party.PartyPackage#getParticipant_TotalValueOfConsumption()
	 * @model
	 * @generated
	 */
	double getTotalValueOfConsumption();

	/**
	 * Sets the value of the '{@link party.Participant#getTotalValueOfConsumption <em>Total Value Of Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Value Of Consumption</em>' attribute.
	 * @see #getTotalValueOfConsumption()
	 * @generated
	 */
	void setTotalValueOfConsumption(double value);

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' reference list.
	 * The list contents are of type {@link party.Sustenance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' reference list.
	 * @see party.PartyPackage#getParticipant_Consumes()
	 * @model
	 * @generated
	 */
	EList<Sustenance> getConsumes();

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link party.SexCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see party.SexCategory
	 * @see #setSex(SexCategory)
	 * @see party.PartyPackage#getParticipant_Sex()
	 * @model
	 * @generated
	 */
	SexCategory getSex();

	/**
	 * Sets the value of the '{@link party.Participant#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see party.SexCategory
	 * @see #getSex()
	 * @generated
	 */
	void setSex(SexCategory value);

} // Participant
