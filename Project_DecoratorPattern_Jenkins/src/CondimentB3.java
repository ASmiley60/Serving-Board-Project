/**
 * Creating condiment for Entree2
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class CondimentB3 extends Toppings2
{
    //Constructor for objects of class Condiment1
    public CondimentB3(Entree2 newentree){
     super(newentree);
     System.out.println("Adding Condiment3");
    }
    
    public String getDescription(){
     return entree2.getDescription() + ", Condiment 3";   
    }
    
    public double getCost(){
     return entree2.getCost() + 2.50;    
    }
}
