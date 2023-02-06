/**
 */
package party;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link party.Party#getName <em>Name</em>}</li>
 *   <li>{@link party.Party#getTotalCosts <em>Total Costs</em>}</li>
 *   <li>{@link party.Party#getParticipants <em>Participants</em>}</li>
 *   <li>{@link party.Party#getDjs <em>Djs</em>}</li>
 *   <li>{@link party.Party#getSustenances <em>Sustenances</em>}</li>
 * </ul>
 *
 * @see party.PartyPackage#getParty()
 * @model
 * @generated
 */
public interface Party extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see party.PartyPackage#getParty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link party.Party#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Costs</em>' attribute.
	 * @see #setTotalCosts(double)
	 * @see party.PartyPackage#getParty_TotalCosts()
	 * @model
	 * @generated
	 */
	double getTotalCosts();

	/**
	 * Sets the value of the '{@link party.Party#getTotalCosts <em>Total Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Costs</em>' attribute.
	 * @see #getTotalCosts()
	 * @generated
	 */
	void setTotalCosts(double value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link party.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see party.PartyPackage#getParty_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Djs</b></em>' containment reference list.
	 * The list contents are of type {@link party.DJ}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Djs</em>' containment reference list.
	 * @see party.PartyPackage#getParty_Djs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DJ> getDjs();

	/**
	 * Returns the value of the '<em><b>Sustenances</b></em>' containment reference list.
	 * The list contents are of type {@link party.Sustenance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sustenances</em>' containment reference list.
	 * @see party.PartyPackage#getParty_Sustenances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sustenance> getSustenances();

} // Party
