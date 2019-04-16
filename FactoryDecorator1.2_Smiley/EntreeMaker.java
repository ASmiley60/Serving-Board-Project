package oodproject;

import java.lang.reflect.InvocationTargetException;

/**
 * Creating a Test Class 
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class EntreeMaker
{
   public static void main(String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
     MainCourse hamburger = new TopLettuce(new TopOnion(new MCSandwich())); 
     System.out.println("Creating Hamburger example");
     System.out.println("Description: " + hamburger.getDescription());
     System.out.println("Cost: " + hamburger.getCost() + "0\n");
     
   
     //MainCourse hotdog = new MCHotdog_Mustard(new MCHotdog_Onion(new MCHotdog())); 
     //System.out.println("Creating Hotdog example");
     //System.out.println("Description: " + hotdog.getDescription());
     //System.out.println("Cost: " + hotdog.getCost() + "0\n");
     
        
     MainCourse salad = new TopCaesar(new MCSalad()); 
     System.out.println("Creating Salad example");
     System.out.println("Description: " + salad.getDescription());
     System.out.println("Cost: " + salad.getCost() + "0\n");
     
     Factory factory = Factory.getFactory();
     MainCourse soda = factory.create("DrSoda", "Dr. Pepper"); 
     System.out.println("Creating Soda example");
     System.out.println("Description: " + soda.getDescription());
     System.out.println("Cost: " + soda.getCost() + "0\n");
     
   }
}
