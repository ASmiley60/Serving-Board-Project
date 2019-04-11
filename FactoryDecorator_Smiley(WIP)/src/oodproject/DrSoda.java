package oodproject;

/**
 * This is the type of entree that the user will pick. 
 * Ex. Nachos, Jalapeno Nachos, etc. 
 * It is also a concrete class that will extend the Entree3 interface and act
 * as a default
 *@author (Wendell Jenkins)
 * @version1 (3/7/19)
 */
public class DrSoda implements Drink
{
    
    @Override
    public String getDescription(){
        return "Soda";
    }
    
    @Override
    public double getCost(){
        return 1.0;
    }
    
}
