/**
 * Creating condiment for Entree1
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class CondimentA1 extends Toppings
{
    //Constructor for objects of class Condiment1
    public CondimentA1(Entree1 newentree){
     super(newentree);
     System.out.println("Adding Condiment1");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Condiment 1";   
    }
    
    public double getCost(){
     return entree.getCost() + .50;   
    }
}
