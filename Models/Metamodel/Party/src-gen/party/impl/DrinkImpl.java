/**
 */
package party.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import party.Drink;
import party.DrinksCategory;
import party.PartyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link party.impl.DrinkImpl#getAlcoholContent <em>Alcohol Content</em>}</li>
 *   <li>{@link party.impl.DrinkImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrinkImpl extends SustenanceImpl implements Drink {
	/**
	 * The default value of the '{@link #getAlcoholContent() <em>Alcohol Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholContent()
	 * @generated
	 * @ordered
	 */
	protected static final double ALCOHOL_CONTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlcoholContent() <em>Alcohol Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholContent()
	 * @generated
	 * @ordered
	 */
	protected double alcoholContent = ALCOHOL_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DrinksCategory TYPE_EDEFAULT = DrinksCategory.JUICE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DrinksCategory type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.DRINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlcoholContent() {
		return alcoholContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlcoholContent(double newAlcoholContent) {
		double oldAlcoholContent = alcoholContent;
		alcoholContent = newAlcoholContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.DRINK__ALCOHOL_CONTENT,
					oldAlcoholContent, alcoholContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrinksCategory getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DrinksCategory newType) {
		DrinksCategory oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.DRINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PartyPackage.DRINK__ALCOHOL_CONTENT:
			return getAlcoholContent();
		case PartyPackage.DRINK__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PartyPackage.DRINK__ALCOHOL_CONTENT:
			setAlcoholContent((Double) newValue);
			return;
		case PartyPackage.DRINK__TYPE:
			setType((DrinksCategory) newValue);
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
		case PartyPackage.DRINK__ALCOHOL_CONTENT:
			setAlcoholContent(ALCOHOL_CONTENT_EDEFAULT);
			return;
		case PartyPackage.DRINK__TYPE:
			setType(TYPE_EDEFAULT);
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
		case PartyPackage.DRINK__ALCOHOL_CONTENT:
			return alcoholContent != ALCOHOL_CONTENT_EDEFAULT;
		case PartyPackage.DRINK__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (alcoholContent: ");
		result.append(alcoholContent);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DrinkImpl
