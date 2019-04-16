package oodproject;

public class TopLettuce extends Toppings
{
    //Constructor for objects of class Condiment1
    public TopLettuce(MainCourse newentree){
     super(newentree);
     System.out.println("Adding Lettuce");
    }
    
    public String getDescription(){
     return entree.getDescription() + ", Lettuce";   
    }
    
    public double getCost(){
     return entree.getCost() + .50;   
    }
}
