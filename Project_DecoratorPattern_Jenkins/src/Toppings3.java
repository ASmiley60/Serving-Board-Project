/**
 * Abstract class Toppings 
 * 
 * See if you can have an abstract class that can implement multiple classes
 * (inheritance)
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */

public class Toppings3 implements Entree3 
{
   protected Entree3 entree3;
   public Toppings3(Entree3 newentree){
     entree3 = newentree;  
    }
    
   public String getDescription(){
    return entree3.getDescription();
    }
   
   public double getCost(){
     return entree3.getCost();  
    }
}