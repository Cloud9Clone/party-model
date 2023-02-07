/**
 */
package party.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import party.DJ;
import party.Participant;
import party.Party;
import party.PartyPackage;
import party.Sustenance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link party.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link party.impl.PartyImpl#getTotalCosts <em>Total Costs</em>}</li>
 *   <li>{@link party.impl.PartyImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link party.impl.PartyImpl#getDjs <em>Djs</em>}</li>
 *   <li>{@link party.impl.PartyImpl#getSustenances <em>Sustenances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends MinimalEObjectImpl.Container implements Party {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCosts() <em>Total Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCosts()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_COSTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalCosts() <em>Total Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCosts()
	 * @generated
	 * @ordered
	 */
	protected double totalCosts = TOTAL_COSTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The cached value of the '{@link #getDjs() <em>Djs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDjs()
	 * @generated
	 * @ordered
	 */
	protected EList<DJ> djs;

	/**
	 * The cached value of the '{@link #getSustenances() <em>Sustenances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSustenances()
	 * @generated
	 * @ordered
	 */
	protected EList<Sustenance> sustenances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCosts() {
		return totalCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCosts(double newTotalCosts) {
		double oldTotalCosts = totalCosts;
		totalCosts = newTotalCosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY__TOTAL_COSTS, oldTotalCosts,
					totalCosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this,
					PartyPackage.PARTY__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DJ> getDjs() {
		if (djs == null) {
			djs = new EObjectContainmentEList<DJ>(DJ.class, this, PartyPackage.PARTY__DJS);
		}
		return djs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sustenance> getSustenances() {
		if (sustenances == null) {
			sustenances = new EObjectContainmentEList<Sustenance>(Sustenance.class, this,
					PartyPackage.PARTY__SUSTENANCES);
		}
		return sustenances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartyPackage.PARTY__PARTICIPANTS:
			return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
		case PartyPackage.PARTY__DJS:
			return ((InternalEList<?>) getDjs()).basicRemove(otherEnd, msgs);
		case PartyPackage.PARTY__SUSTENANCES:
			return ((InternalEList<?>) getSustenances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PartyPackage.PARTY__NAME:
			return getName();
		case PartyPackage.PARTY__TOTAL_COSTS:
			return getTotalCosts();
		case PartyPackage.PARTY__PARTICIPANTS:
			return getParticipants();
		case PartyPackage.PARTY__DJS:
			return getDjs();
		case PartyPackage.PARTY__SUSTENANCES:
			return getSustenances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PartyPackage.PARTY__NAME:
			setName((String) newValue);
			return;
		case PartyPackage.PARTY__TOTAL_COSTS:
			setTotalCosts((Double) newValue);
			return;
		case PartyPackage.PARTY__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends Participant>) newValue);
			return;
		case PartyPackage.PARTY__DJS:
			getDjs().clear();
			getDjs().addAll((Collection<? extends DJ>) newValue);
			return;
		case PartyPackage.PARTY__SUSTENANCES:
			getSustenances().clear();
			getSustenances().addAll((Collection<? extends Sustenance>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PartyPackage.PARTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PartyPackage.PARTY__TOTAL_COSTS:
			setTotalCosts(TOTAL_COSTS_EDEFAULT);
			return;
		case PartyPackage.PARTY__PARTICIPANTS:
			getParticipants().clear();
			return;
		case PartyPackage.PARTY__DJS:
			getDjs().clear();
			return;
		case PartyPackage.PARTY__SUSTENANCES:
			getSustenances().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PartyPackage.PARTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PartyPackage.PARTY__TOTAL_COSTS:
			return totalCosts != TOTAL_COSTS_EDEFAULT;
		case PartyPackage.PARTY__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case PartyPackage.PARTY__DJS:
			return djs != null && !djs.isEmpty();
		case PartyPackage.PARTY__SUSTENANCES:
			return sustenances != null && !sustenances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", totalCosts: ");
		result.append(totalCosts);
		result.append(')');
		return result.toString();
	}

} //PartyImpl
