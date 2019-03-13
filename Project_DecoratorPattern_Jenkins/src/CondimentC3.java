
/**
 * Creating condiment for Entree3
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class CondimentC3 extends Toppings3
{
    //Constructor for objects of class Condiment1
    public CondimentC3(Entree3 newentree){
     super(newentree);
     System.out.println("Adding Condiment3");
    }
    
    public String getDescription(){
     return entree3.getDescription() + ", Condiment 3";   
    }
    
    public double getCost(){
     return entree3.getCost() + 3.25;    
    }
}