package oodproject;


/**
 * Abstract class Toppings 
 * 
 * See if you can have an abstract class that can implement multiple classes
 * (inheritance)
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */

public abstract class Toppings implements MainCourse 
{
   protected MainCourse entree;
   public Toppings(MainCourse newentree){
     entree = newentree;  
    }
    
   public String getDescription(){
    return entree.getDescription();
    }
   
   public double getCost(){
     return entree.getCost();  
    }
}
