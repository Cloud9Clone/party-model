/**
 */
package party;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link party.PartyModel#getParties <em>Parties</em>}</li>
 * </ul>
 *
 * @see party.PartyPackage#getPartyModel()
 * @model
 * @generated
 */
public interface PartyModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
	 * The list contents are of type {@link party.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference list.
	 * @see party.PartyPackage#getPartyModel_Parties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Party> getParties();

} // PartyModel
