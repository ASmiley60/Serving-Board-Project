package oodproject;

/**
 * Creating a Test Class 
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class EntreeMaker
{
   public static void main(String [] args){
     MainCourse first = new MCSandwich_Lettuce(new MCSandwich_Onion(new MCHotdog())); 
     System.out.println("Creating Entree 1");
     System.out.println("Ingredients: " + first.getDescription());
     System.out.println("Cost: " + first.getCost() + "\n");
     
   
     Snack second = new CondimentB3(new CondimentB2(new SnChips())); 
     System.out.println("Creating Entree 2");
     System.out.println("Ingredients: " + second.getDescription());
     System.out.println("Cost: " + second.getCost() + "\n");
     
   
        
     Drink third = new CondimentC1(new CondimentC2(new DrWater())); 
     System.out.println("Creating Entree 3");
     System.out.println("Ingredients: " + third.getDescription());
     System.out.println("Cost: " + third.getCost() + "\n");
     
     
     
    }
}
