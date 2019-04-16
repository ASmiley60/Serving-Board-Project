package oodproject;

/**
 * Creating condiment for Entree2
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class TopRelish extends Toppings
{
    //Constructor for objects of class Condiment1
    public TopRelish(MainCourse newentree){
     super(newentree);
     System.out.println("Adding Relish");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Relish";   
    }
    
    public double getCost(){
     return entree.getCost() + .25;    
    }
}
