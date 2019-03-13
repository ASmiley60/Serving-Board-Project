
/**
 * Write a description of class Condiment3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CondimentA3 extends Toppings
{
           //Constructor for objects of class Condiment1
    public CondimentA3(Entree1 newentree){
     super(newentree);
     System.out.println("Adding Condiment 3");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Condiment 3";   
    }
    
    public double getCost(){
     return entree.getCost() + .75;   
    }
}
