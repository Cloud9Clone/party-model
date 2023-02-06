/**
 */
package party;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see party.PartyFactory
 * @model kind="package"
 * @generated
 */
public interface PartyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "party";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/party";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "party";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartyPackage eINSTANCE = party.impl.PartyPackageImpl.init();

	/**
	 * The meta object id for the '{@link party.impl.PartyModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.impl.PartyModelImpl
	 * @see party.impl.PartyPackageImpl#getPartyModel()
	 * @generated
	 */
	int PARTY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_MODEL__PARTIES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link party.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.impl.PartyImpl
	 * @see party.impl.PartyPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__TOTAL_COSTS = 1;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTICIPANTS = 2;

	/**
	 * The feature id for the '<em><b>Djs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__DJS = 3;

	/**
	 * The feature id for the '<em><b>Sustenances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SUSTENANCES = 4;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link party.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.impl.ParticipantImpl
	 * @see party.impl.PartyPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__AGE = 1;

	/**
	 * The feature id for the '<em><b>Total Value Of Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__TOTAL_VALUE_OF_CONSUMPTION = 2;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONSUMES = 3;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SEX = 4;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link party.impl.SustenanceImpl <em>Sustenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.impl.SustenanceImpl
	 * @see party.impl.PartyPackageImpl#getSustenance()
	 * @generated
	 */
	int SUSTENANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTENANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTENANCE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Sustenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTENANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sustenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link party.impl.DrinkImpl <em>Drink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.impl.DrinkImpl
	 * @see party.impl.PartyPackageImpl#getDrink()
	 * @generated
	 */
	int DRINK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__NAME = SUSTENANCE__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__PRICE = SUSTENANCE__PRICE;

	/**
	 * The feature id for the '<em><b>Alcohol Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__ALCOHOL_CONTENT = SUSTENANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK__TYPE = SUSTENANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Drink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_FEATURE_COUNT = SUSTENANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Drink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRINK_OPERATION_COUNT = SUSTENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link party.impl.FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.impl.FoodImpl
	 * @see party.impl.PartyPackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__NAME = SUSTENANCE__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__PRICE = SUSTENANCE__PRICE;

	/**
	 * The feature id for the '<em><b>Calories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__CALORIES = SUSTENANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__TYPE = SUSTENANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = SUSTENANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = SUSTENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link party.impl.DJImpl <em>DJ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.impl.DJImpl
	 * @see party.impl.PartyPackageImpl#getDJ()
	 * @generated
	 */
	int DJ = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Honorarium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DJ__HONORARIUM = 1;

	/**
	 * The number of structural features of the '<em>DJ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DJ_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DJ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DJ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link party.DrinksCategory <em>Drinks Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.DrinksCategory
	 * @see party.impl.PartyPackageImpl#getDrinksCategory()
	 * @generated
	 */
	int DRINKS_CATEGORY = 7;

	/**
	 * The meta object id for the '{@link party.FoodCategory <em>Food Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.FoodCategory
	 * @see party.impl.PartyPackageImpl#getFoodCategory()
	 * @generated
	 */
	int FOOD_CATEGORY = 8;

	/**
	 * The meta object id for the '{@link party.SexCategory <em>Sex Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see party.SexCategory
	 * @see party.impl.PartyPackageImpl#getSexCategory()
	 * @generated
	 */
	int SEX_CATEGORY = 9;

	/**
	 * Returns the meta object for class '{@link party.PartyModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see party.PartyModel
	 * @generated
	 */
	EClass getPartyModel();

	/**
	 * Returns the meta object for the containment reference list '{@link party.PartyModel#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parties</em>'.
	 * @see party.PartyModel#getParties()
	 * @see #getPartyModel()
	 * @generated
	 */
	EReference getPartyModel_Parties();

	/**
	 * Returns the meta object for class '{@link party.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see party.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the attribute '{@link party.Party#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see party.Party#getName()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Name();

	/**
	 * Returns the meta object for the attribute '{@link party.Party#getTotalCosts <em>Total Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Costs</em>'.
	 * @see party.Party#getTotalCosts()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_TotalCosts();

	/**
	 * Returns the meta object for the containment reference list '{@link party.Party#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see party.Party#getParticipants()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link party.Party#getDjs <em>Djs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Djs</em>'.
	 * @see party.Party#getDjs()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Djs();

	/**
	 * Returns the meta object for the containment reference list '{@link party.Party#getSustenances <em>Sustenances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sustenances</em>'.
	 * @see party.Party#getSustenances()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Sustenances();

	/**
	 * Returns the meta object for class '{@link party.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see party.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link party.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see party.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for the attribute '{@link party.Participant#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see party.Participant#getAge()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Age();

	/**
	 * Returns the meta object for the attribute '{@link party.Participant#getTotalValueOfConsumption <em>Total Value Of Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Value Of Consumption</em>'.
	 * @see party.Participant#getTotalValueOfConsumption()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_TotalValueOfConsumption();

	/**
	 * Returns the meta object for the reference list '{@link party.Participant#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumes</em>'.
	 * @see party.Participant#getConsumes()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Consumes();

	/**
	 * Returns the meta object for the attribute '{@link party.Participant#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see party.Participant#getSex()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Sex();

	/**
	 * Returns the meta object for class '{@link party.Sustenance <em>Sustenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sustenance</em>'.
	 * @see party.Sustenance
	 * @generated
	 */
	EClass getSustenance();

	/**
	 * Returns the meta object for the attribute '{@link party.Sustenance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see party.Sustenance#getName()
	 * @see #getSustenance()
	 * @generated
	 */
	EAttribute getSustenance_Name();

	/**
	 * Returns the meta object for the attribute '{@link party.Sustenance#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see party.Sustenance#getPrice()
	 * @see #getSustenance()
	 * @generated
	 */
	EAttribute getSustenance_Price();

	/**
	 * Returns the meta object for class '{@link party.Drink <em>Drink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drink</em>'.
	 * @see party.Drink
	 * @generated
	 */
	EClass getDrink();

	/**
	 * Returns the meta object for the attribute '{@link party.Drink#getAlcoholContent <em>Alcohol Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alcohol Content</em>'.
	 * @see party.Drink#getAlcoholContent()
	 * @see #getDrink()
	 * @generated
	 */
	EAttribute getDrink_AlcoholContent();

	/**
	 * Returns the meta object for the attribute '{@link party.Drink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see party.Drink#getType()
	 * @see #getDrink()
	 * @generated
	 */
	EAttribute getDrink_Type();

	/**
	 * Returns the meta object for class '{@link party.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see party.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for the attribute '{@link party.Food#getCalories <em>Calories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calories</em>'.
	 * @see party.Food#getCalories()
	 * @see #getFood()
	 * @generated
	 */
	EAttribute getFood_Calories();

	/**
	 * Returns the meta object for the attribute '{@link party.Food#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see party.Food#getType()
	 * @see #getFood()
	 * @generated
	 */
	EAttribute getFood_Type();

	/**
	 * Returns the meta object for class '{@link party.DJ <em>DJ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DJ</em>'.
	 * @see party.DJ
	 * @generated
	 */
	EClass getDJ();

	/**
	 * Returns the meta object for the attribute '{@link party.DJ#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see party.DJ#getName()
	 * @see #getDJ()
	 * @generated
	 */
	EAttribute getDJ_Name();

	/**
	 * Returns the meta object for the attribute '{@link party.DJ#getHonorarium <em>Honorarium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honorarium</em>'.
	 * @see party.DJ#getHonorarium()
	 * @see #getDJ()
	 * @generated
	 */
	EAttribute getDJ_Honorarium();

	/**
	 * Returns the meta object for enum '{@link party.DrinksCategory <em>Drinks Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drinks Category</em>'.
	 * @see party.DrinksCategory
	 * @generated
	 */
	EEnum getDrinksCategory();

	/**
	 * Returns the meta object for enum '{@link party.FoodCategory <em>Food Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food Category</em>'.
	 * @see party.FoodCategory
	 * @generated
	 */
	EEnum getFoodCategory();

	/**
	 * Returns the meta object for enum '{@link party.SexCategory <em>Sex Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex Category</em>'.
	 * @see party.SexCategory
	 * @generated
	 */
	EEnum getSexCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartyFactory getPartyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link party.impl.PartyModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.impl.PartyModelImpl
		 * @see party.impl.PartyPackageImpl#getPartyModel()
		 * @generated
		 */
		EClass PARTY_MODEL = eINSTANCE.getPartyModel();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_MODEL__PARTIES = eINSTANCE.getPartyModel_Parties();

		/**
		 * The meta object literal for the '{@link party.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.impl.PartyImpl
		 * @see party.impl.PartyPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__NAME = eINSTANCE.getParty_Name();

		/**
		 * The meta object literal for the '<em><b>Total Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__TOTAL_COSTS = eINSTANCE.getParty_TotalCosts();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTICIPANTS = eINSTANCE.getParty_Participants();

		/**
		 * The meta object literal for the '<em><b>Djs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__DJS = eINSTANCE.getParty_Djs();

		/**
		 * The meta object literal for the '<em><b>Sustenances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__SUSTENANCES = eINSTANCE.getParty_Sustenances();

		/**
		 * The meta object literal for the '{@link party.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.impl.ParticipantImpl
		 * @see party.impl.PartyPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__AGE = eINSTANCE.getParticipant_Age();

		/**
		 * The meta object literal for the '<em><b>Total Value Of Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__TOTAL_VALUE_OF_CONSUMPTION = eINSTANCE.getParticipant_TotalValueOfConsumption();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__CONSUMES = eINSTANCE.getParticipant_Consumes();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__SEX = eINSTANCE.getParticipant_Sex();

		/**
		 * The meta object literal for the '{@link party.impl.SustenanceImpl <em>Sustenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.impl.SustenanceImpl
		 * @see party.impl.PartyPackageImpl#getSustenance()
		 * @generated
		 */
		EClass SUSTENANCE = eINSTANCE.getSustenance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSTENANCE__NAME = eINSTANCE.getSustenance_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSTENANCE__PRICE = eINSTANCE.getSustenance_Price();

		/**
		 * The meta object literal for the '{@link party.impl.DrinkImpl <em>Drink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.impl.DrinkImpl
		 * @see party.impl.PartyPackageImpl#getDrink()
		 * @generated
		 */
		EClass DRINK = eINSTANCE.getDrink();

		/**
		 * The meta object literal for the '<em><b>Alcohol Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK__ALCOHOL_CONTENT = eINSTANCE.getDrink_AlcoholContent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRINK__TYPE = eINSTANCE.getDrink_Type();

		/**
		 * The meta object literal for the '{@link party.impl.FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.impl.FoodImpl
		 * @see party.impl.PartyPackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '<em><b>Calories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD__CALORIES = eINSTANCE.getFood_Calories();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD__TYPE = eINSTANCE.getFood_Type();

		/**
		 * The meta object literal for the '{@link party.impl.DJImpl <em>DJ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.impl.DJImpl
		 * @see party.impl.PartyPackageImpl#getDJ()
		 * @generated
		 */
		EClass DJ = eINSTANCE.getDJ();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DJ__NAME = eINSTANCE.getDJ_Name();

		/**
		 * The meta object literal for the '<em><b>Honorarium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DJ__HONORARIUM = eINSTANCE.getDJ_Honorarium();

		/**
		 * The meta object literal for the '{@link party.DrinksCategory <em>Drinks Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.DrinksCategory
		 * @see party.impl.PartyPackageImpl#getDrinksCategory()
		 * @generated
		 */
		EEnum DRINKS_CATEGORY = eINSTANCE.getDrinksCategory();

		/**
		 * The meta object literal for the '{@link party.FoodCategory <em>Food Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.FoodCategory
		 * @see party.impl.PartyPackageImpl#getFoodCategory()
		 * @generated
		 */
		EEnum FOOD_CATEGORY = eINSTANCE.getFoodCategory();

		/**
		 * The meta object literal for the '{@link party.SexCategory <em>Sex Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see party.SexCategory
		 * @see party.impl.PartyPackageImpl#getSexCategory()
		 * @generated
		 */
		EEnum SEX_CATEGORY = eINSTANCE.getSexCategory();

	}

} //PartyPackage
