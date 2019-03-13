/**
 * Creating condiment for Entree1
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class CondimentA2 extends Toppings
{
        //Constructor for objects of class Condiment1
    public CondimentA2(Entree1 newentree){
     super(newentree);
     System.out.println("Adding Condiment2");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Condiment 2";   
    }
    
    public double getCost(){
     return entree.getCost() + 1.50;   
    }
}
