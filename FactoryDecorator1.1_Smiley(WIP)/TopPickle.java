package oodproject;

/**
 * Write a description of class Condiment3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TopPickle extends Toppings
{
           //Constructor for objects of class Condiment1
    public TopPickle(MainCourse newentree){
     super(newentree);
     System.out.println("Adding Pickle");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Pickle";   
    }
    
    public double getCost(){
     return entree.getCost() + .50;   
    }
}
