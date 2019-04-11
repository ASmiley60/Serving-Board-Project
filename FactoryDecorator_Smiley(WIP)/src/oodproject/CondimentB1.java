package oodproject;

/**
 * Creating condiment for Entree2
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class CondimentB1 extends Toppings2
{
    //Constructor for objects of class Condiment1
    public CondimentB1(Snack newentree){
     super(newentree);
     System.out.println("Adding Condiment1");
    }
    
    public String getDescription(){
     return entree2.getDescription() + ", Condiment 1";   
    }
    
    public double getCost(){
     return entree2.getCost() + 1.45;    
    }
}
