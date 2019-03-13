/**
 * Creating condiment for Entree3
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class CondimentC2 extends Toppings3
{
    //Constructor for objects of class Condiment1
    public CondimentC2(Entree3 newentree){
     super(newentree);
     System.out.println("Adding Condiment2");
    }
    
    public String getDescription(){
     return entree3.getDescription() + ", Condiment 2";   
    }
    
    public double getCost(){
     return entree3.getCost() + .15;    
    }
}