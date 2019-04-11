package oodproject;

/**
 * Creating condiment for Entree1
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class MCSandwich_Onion extends Toppings
{
        //Constructor for objects of class Condiment1
    public MCSandwich_Onion(MainCourse newentree){
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
