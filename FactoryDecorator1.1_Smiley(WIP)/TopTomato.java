package oodproject;

/**
 * Creating condiment for Entree1
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class TopTomato extends Toppings
{
    //Constructor for objects of class Condiment1
    public TopTomato(MainCourse newentree){
     super(newentree);
     System.out.println("Adding Tomato");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Tomato";   
    }
    
    public double getCost(){
     return entree.getCost() + .50;   
    }
}
