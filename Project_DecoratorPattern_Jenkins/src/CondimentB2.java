/**
 * Creating condiment for Entree2 
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class CondimentB2 extends Toppings2
{
    //Constructor for objects of class Condiment1
    public CondimentB2(Entree2 newentree){
     super(newentree);
     System.out.println("Adding Condiment2");
    }
    
    public String getDescription(){
     return entree2.getDescription() + ", Condiment 2";   
    }
    
    public double getCost(){
     return entree2.getCost() + 7.50;    
    }
}
