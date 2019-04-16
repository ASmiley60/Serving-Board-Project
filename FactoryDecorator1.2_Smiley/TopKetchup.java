package oodproject;

public class TopKetchup extends Toppings
{
  //Constructor for objects of class Condiment1
  public TopKetchup(MainCourse newentree){
   super(newentree);
   System.out.println("Adding Ketchup");
  }
  
  public String getDescription(){
   return entree.getDescription() + ", Ketchup";   
  }
  
  public double getCost(){
   return entree.getCost() + .25;    
  }
}
