/**
 */
package party.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import party.Participant;
import party.PartyPackage;
import party.SexCategory;
import party.Sustenance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link party.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link party.impl.ParticipantImpl#getAge <em>Age</em>}</li>
 *   <li>{@link party.impl.ParticipantImpl#getTotalValueOfConsumption <em>Total Value Of Consumption</em>}</li>
 *   <li>{@link party.impl.ParticipantImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link party.impl.ParticipantImpl#getSex <em>Sex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalValueOfConsumption() <em>Total Value Of Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValueOfConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_VALUE_OF_CONSUMPTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalValueOfConsumption() <em>Total Value Of Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValueOfConsumption()
	 * @generated
	 * @ordered
	 */
	protected double totalValueOfConsumption = TOTAL_VALUE_OF_CONSUMPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Sustenance> consumes;

	/**
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final SexCategory SEX_EDEFAULT = SexCategory.MALE;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected SexCategory sex = SEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTICIPANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTICIPANT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalValueOfConsumption() {
		return totalValueOfConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalValueOfConsumption(double newTotalValueOfConsumption) {
		double oldTotalValueOfConsumption = totalValueOfConsumption;
		totalValueOfConsumption = newTotalValueOfConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTICIPANT__TOTAL_VALUE_OF_CONSUMPTION,
					oldTotalValueOfConsumption, totalValueOfConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sustenance> getConsumes() {
		if (consumes == null) {
			consumes = new EObjectResolvingEList<Sustenance>(Sustenance.class, this,
					PartyPackage.PARTICIPANT__CONSUMES);
		}
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SexCategory getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(SexCategory newSex) {
		SexCategory oldSex = sex;
		sex = newSex == null ? SEX_EDEFAULT : newSex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTICIPANT__SEX, oldSex, sex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PartyPackage.PARTICIPANT__NAME:
			return getName();
		case PartyPackage.PARTICIPANT__AGE:
			return getAge();
		case PartyPackage.PARTICIPANT__TOTAL_VALUE_OF_CONSUMPTION:
			return getTotalValueOfConsumption();
		case PartyPackage.PARTICIPANT__CONSUMES:
			return getConsumes();
		case PartyPackage.PARTICIPANT__SEX:
			return getSex();
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
		case PartyPackage.PARTICIPANT__NAME:
			setName((String) newValue);
			return;
		case PartyPackage.PARTICIPANT__AGE:
			setAge((Integer) newValue);
			return;
		case PartyPackage.PARTICIPANT__TOTAL_VALUE_OF_CONSUMPTION:
			setTotalValueOfConsumption((Double) newValue);
			return;
		case PartyPackage.PARTICIPANT__CONSUMES:
			getConsumes().clear();
			getConsumes().addAll((Collection<? extends Sustenance>) newValue);
			return;
		case PartyPackage.PARTICIPANT__SEX:
			setSex((SexCategory) newValue);
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
		case PartyPackage.PARTICIPANT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PartyPackage.PARTICIPANT__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case PartyPackage.PARTICIPANT__TOTAL_VALUE_OF_CONSUMPTION:
			setTotalValueOfConsumption(TOTAL_VALUE_OF_CONSUMPTION_EDEFAULT);
			return;
		case PartyPackage.PARTICIPANT__CONSUMES:
			getConsumes().clear();
			return;
		case PartyPackage.PARTICIPANT__SEX:
			setSex(SEX_EDEFAULT);
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
		case PartyPackage.PARTICIPANT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PartyPackage.PARTICIPANT__AGE:
			return age != AGE_EDEFAULT;
		case PartyPackage.PARTICIPANT__TOTAL_VALUE_OF_CONSUMPTION:
			return totalValueOfConsumption != TOTAL_VALUE_OF_CONSUMPTION_EDEFAULT;
		case PartyPackage.PARTICIPANT__CONSUMES:
			return consumes != null && !consumes.isEmpty();
		case PartyPackage.PARTICIPANT__SEX:
			return sex != SEX_EDEFAULT;
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
		result.append(", age: ");
		result.append(age);
		result.append(", totalValueOfConsumption: ");
		result.append(totalValueOfConsumption);
		result.append(", sex: ");
		result.append(sex);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
