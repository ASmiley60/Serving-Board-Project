package oodproject;

/**
 * Creating condiment for Entree1
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class TopCheese extends Toppings
{
    //Constructor for objects of class Condiment1
    public TopCheese(MainCourse newentree){
     super(newentree);
     System.out.println("Adding Cheese");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Cheese";   
    }
    
    public double getCost(){
     return entree.getCost() + .50;   
    }
}
