package oodproject;

/**
 * Creating condiment for Entree1
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class TopOnion extends Toppings
{
        //Constructor for objects of class Condiment1
    public TopOnion(MainCourse newentree){
     super(newentree);
     System.out.println("Adding Onion");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Onion";   
    }
    
    public double getCost(){
     return entree.getCost() + .50;   
    }
}
