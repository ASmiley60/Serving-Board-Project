package oodproject;

/**
 * Creating condiment for Entree1
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class MCSandwich_Lettuce extends Toppings
{
    //Constructor for objects of class Condiment1
    public MCSandwich_Lettuce(MainCourse newentree){
     super(newentree);
     System.out.println("Adding Lettuce");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Condiment 1";   
    }
    
    public double getCost(){
     return entree.getCost() + .50;   
    }
}
