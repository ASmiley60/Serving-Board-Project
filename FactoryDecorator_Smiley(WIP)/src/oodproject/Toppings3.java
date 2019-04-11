package oodproject;

/**
 * Abstract class Toppings 
 * 
 * See if you can have an abstract class that can implement multiple classes
 * (inheritance)
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */

public class Toppings3 implements Drink 
{
   protected Drink entree3;
   public Toppings3(Drink newentree){
     entree3 = newentree;  
    }
    
   public String getDescription(){
    return entree3.getDescription();
    }
   
   public double getCost(){
     return entree3.getCost();  
    }
}