package TestPartyModel.design;

import java.util.List;
import java.util.Random;

import org.eclipse.emf.ecore.EObject;

import party.DJ;
import party.Drink;
import party.Food;
import party.Participant;
import party.Party;
import party.Sustenance;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    // A private function for generating random double values between certain limits
    private Double generateRandomValue(int minValue, int maxValue ) {
    	Random theRandom = new Random();
        double theRandomValue = 0.0;
        if( Double.valueOf(maxValue - minValue).isInfinite() == false ) {
        	theRandomValue = minValue + (maxValue - minValue) * theRandom.nextDouble();
        	theRandomValue = Math.round(theRandomValue * 100.0) / 100.0;
        }
        return Double.valueOf(theRandomValue);
    }
    
    // ----- Methods for Food class -----
    public Double generateRandomFoodPrice(Food food) {
    	double randomValue = generateRandomValue(10, 30);
    	food.setPrice(randomValue);
    	
    	Party p = (Party) food.eContainer();
        p.setTotalCosts(calculateTotalCostsOfParty(p));
    	
    	return randomValue;
    }
    
    public Double returnZeroAndCalculateTotalCosts(Food food) {
    	food.setPrice(0);
    	Party p = (Party) food.eContainer();
        p.setTotalCosts(calculateTotalCostsOfParty(p));
        return 0.0;
    }
    
    // ----- Methods for Drink class -----
    public Double generateRandomDrinkPrice(Drink drink) {
    	double randomValue = generateRandomValue(10, 40);
        drink.setPrice(randomValue);
        
        Party p = (Party) drink.eContainer();
        p.setTotalCosts(calculateTotalCostsOfParty(p));
        
        return randomValue;
    }
    
    public Double returnZeroAndCalculateTotalCosts(Drink drink) {
    	drink.setPrice(0);
    	
    	// Deduct from the Party's totalCosts
    	Party p = (Party) drink.eContainer();
        p.setTotalCosts(calculateTotalCostsOfParty(p));
        
//        // Detect from all the people who have an edge with it
//        List<EObject> objects = drink.eCrossReferences();
//        if (objects.size() != 0) {
//        	for (EObject eobj : objects) {
//        		if (eobj instanceof Participant) {
//        			Participant prt = (Participant) eobj;
//        			prt.setTotalValueOfConsumption(calculateTotalValueOfConsumption(prt));
//        		}
//        	}
//        }
//        
        return 0.0;
    }
    
    // ----- Methods for Participant class -----
    public Double calculateTotalValueOfConsumption(Participant participant) {
    	List<Sustenance> consumedSustenance = participant.getConsumes();
    	double totalValueOfConsumption = 0;
    	if (consumedSustenance.size() != 0) {
    		for (Sustenance s : consumedSustenance) {
        		totalValueOfConsumption += s.getPrice();
        	}
    	}
    	return totalValueOfConsumption;
    }
    
    // ----- Methods for Party class ----- 
    public Double calculateTotalCostsOfParty(Party party) {
    	double totalCostsOfParty = 0;
    	List<Sustenance> purchasedSustenance = party.getSustenances();
    	if (purchasedSustenance.size() != 0) {
    		for (Sustenance s : purchasedSustenance) {
        		totalCostsOfParty += s.getPrice();
        	}
    	}
    	List<DJ> djs = party.getDjs();
    	if (djs.size() != 0) {
    		for (DJ dj : djs) {
        		totalCostsOfParty += dj.getHonorarium();
        	}
    	}
    	party.setTotalCosts(totalCostsOfParty);
    	return totalCostsOfParty;
    }
    
    // ----- Methods for DJ class ----- 
    public Double generateRandomHonorarium(DJ dj) {
    	double randomValue = generateRandomValue(200, 400);
        dj.setHonorarium(randomValue);
        
        Party p = (Party) dj.eContainer();
        p.setTotalCosts(calculateTotalCostsOfParty(p));
        
        return randomValue;
    }
    
    public String generateRandomDJName(DJ dj) {
    	String[] djNames = {"Hardwell", "Calvin Harris", "David Guetta", "Martin Garrix"};
    	Random rn = new Random();
    	int randomNum =  rn.nextInt(djNames.length);
    	return djNames[randomNum];
    }
    
    public Double returnZeroAndCalculateTotalCosts(DJ dj) {
    	dj.setHonorarium(0);
    	Party p = (Party) dj.eContainer();
        p.setTotalCosts(calculateTotalCostsOfParty(p));
        return 0.0;
    }
}
