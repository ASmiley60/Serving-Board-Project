/**
 * Abstract class Toppings 
 * 
 * See if you can have an abstract class that can implement multiple classes
 * (inheritance)
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */

public class Toppings2 implements Entree2 
{
   protected Entree2 entree2;
   public Toppings2(Entree2 newentree){
     entree2 = newentree;  
    }
    
   public String getDescription(){
    return entree2.getDescription();
    }
   
   public double getCost(){
     return entree2.getCost();  
    }
}
