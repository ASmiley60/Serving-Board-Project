package oodproject;

/**
 * Write a description of class Condiment3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MCSandwich_Pickle extends Toppings
{
           //Constructor for objects of class Condiment1
    public MCSandwich_Pickle(MainCourse newentree){
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
