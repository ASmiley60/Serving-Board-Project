package oodproject;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//This test file is designed to demo the factory working with the decorator to create the user's food items
//It uses a series of switch-case statements to emulate how it may work when we introduce GUI input into the program

public class TestFactory
{
  public static void main (String args[]) throws InstantiationException, IllegalAccessException, 
    ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 
  {
    Factory factory = Factory.getFactory();
    List<MainCourse> mcList = new LinkedList<>();
    List<MainCourse> snList = new LinkedList<>();
    List<MainCourse> drList = new LinkedList<>();
    MainCourse item = null;
    
    double cost = 0.0;
    DecimalFormat df = new DecimalFormat("#.00");
    
    Scanner in = new Scanner(System.in);
    System.out.println("Select an item by entering its ID.");
    String ID = ""; //Stores user input on which entree to choose
    String type = ""; //Stores user input on what type of selected entree to choose
    String condiment = ""; //Stores user input on what condiments to add to the item
    int menuID = 0; //Determines which menu the current item gets printed on
    int condimentLimiter = 0; //Limits the number of condiments that can be added
    boolean hasCondiment = false; //Determines whether to prompt user for condiment choice
    
    while(!ID.equals("d"))
    {
      ID = in.next();
      
      //Takes an ID from user input and uses factory to create the right type of item
      //This will be replaced with GUI actions
      /*
       * ID Guide for menu items:
       * 
       * ----Main Course Items----
       * Sand - Sandwich
       * *  h - Hamburger
       * *  c - Chicken Sandwich
       * *  t - Turkey Sandwich
       * 
       * Dog - Hotdog
       * *  b - Beef Hotdog
       * *  p - Pork Hotdog
       * *  t - Turkey Hotdog
       * 
       * Salad - Salad
       * *  c - Caesar Salad
       * *  v - Balsamic Vinegar Salad
       * *  r - Salad with Ranch
       * 
       * ------Snack Items------
       * 
       * Chips - Chips
       * *  l - Lays Chips
       * *  do - Doritos
       * *  c - Cheetos
       * 
       * Fries - Fries
       * Celery - Celery
       * Apple - Apple Slices
       * 
       * ------Drink Items------
       * 
       * Soda
       * *  dr - Dr. Pepper
       * *  p - Pepsi
       * *  c - Coca-Cola
       * 
       * Tea - Sweet/Unsweet Tea
       * *  y - Sweet Tea
       * *  n - Unsweet Tea
       * 
       * Water - Water
       * 
       * 
       * ID Guide for condiments:
       * 
       * le - lettuce
       * on - onion
       * pi - pickle
       * ke - ketchup
       * to - tomato
       * ch - cheese
       * re - relish
       * 
       */
      switch(ID) 
      {
        
        case "Sand":
          System.out.println("Select sandwich type: \"h\" for hamburger, \"c\" for chicken, or \"t\" for turkey");
          type = in.next();
          hasCondiment = true;
          
          //Selects the sandwich type
          do
          {            
            switch(type) 
            {
              case "h":
                item = factory.create("MCSandwich", "Ham");
                break;
              
              case "c":
                item = factory.create("MCSandwich", "Chicken");
                break;
                
              case "t":
                item = factory.create("MCSandwich", "Turkey");
                break;
                
              default:
                System.out.println(type + " is not a valid type of sandwich. Please try again.");
                break;
            }
          } while(!type.matches("h|c|t"));
          break;
          
          
        case "Dog":
          System.out.println("Select hotdog type: \"b\" for beef, \"p\" for pork, or \"t\" for turkey.");
          type = in.next();
          hasCondiment = true;
          
          //Selects the hotdog type
          do  
          {
            switch(type) 
            {
              case "b":
                item = factory.create("MCHotdog", "Beef");
                break;
              
              case "p":
                item = factory.create("MCHotdog", "Pork");
                break;
                
              case "t":
                item = factory.create("MCHotdog", "Turkey");
                break;
                
              default:
                System.out.println(type + " is not a valid type of hotdog. Please try again.");
                break;
            }
          } while (!type.matches("b|p|t"));
          break;
          
          
        case "Salad":
          System.out.println("Select sandwich type: \"c\" for Caesar, \"v\" for balsamic vinegar, or \"r\" for ranch.");
          type = in.next();
          
          //Selects the salad type
          do
          {
            switch(type) 
            {
              case "c":
                item = factory.create("MCSalad", "Caesar");
                break;
              
              case "v":
                item = factory.create("MCSalad", "Balsamic Vinegar");
                break;
                
              case "r":
                item = factory.create("MCSalad", "Ranch");
                break;
                
              default:
                System.out.println(type + " is not a valid type of salad. Please try again.");
                break;
            }
          } while (!type.matches("c|v|r"));
          break;
          
          
        case "Chips":
          System.out.println("Select chips brand: \"l\" for Lays, \"do\" for Doritos, or \"c\" for Cheetos.");
          type = in.next();
          menuID = 1;
          
          //Selects the brand of chips
          do
          {
            switch(type) 
            {
              case "l":
                item = factory.create("SnChips", "Lays");
                break;
              
              case "do":
                item = factory.create("SnChips", "Doritos");
                break;
                
              case "c":
                item = factory.create("SnChips", "Cheetos");
                break;
                
              default:
                System.out.println(type + " is not a valid brand of chips. Please try again.");
                break;
            }
          } while (!type.matches("l|do|c"));
          break;
          
        
        case "Fries":
          item = factory.create("SnFries");
          menuID = 1;
          break;
          
          
        case "Celery":
          item = factory.create("SnCelery");
          menuID = 1;
          break;
          
          
        case "Apple":
          item = factory.create("SnAppleSlices");
          menuID = 1;
          break;
          
          
        case "Soda":
          System.out.println("Select soft drink brand: \"dr\" for Dr. Pepper, \"p\" for Pepsi, or \"c\" for Coca-Cola.");
          type = in.next();
          menuID = 2;
          
          //Selects the brand of soda
          do
          {
            switch(type) 
            {
              case "dr":
                item = factory.create("DrSoda", "Dr. Pepper");
                break;
              
              case "p":
                item = factory.create("DrSoda", "Pepsi");
                break;
                
              case "c":
                item = factory.create("DrSoda", "Coca-Cola");
                break;
                
              default:
                System.out.println(type + " is not a valid brand of soda. Please try again.");
                break;
            }
          } while (!type.matches("dr|p|c"));
          break;
          
        
        case "Tea":
          System.out.println("Sweetened? \"y\" for yes, \"n\" for no.");
          type = in.next();
          menuID = 2;
          
          if(type.equals("y")) item = factory.create("DrTea", "Sweet");
          else item = factory.create("DrTea", "Unsweetened");
          break;
          
        case "Water":
          item = factory.create("DrWater");
          menuID = 2;
          break;
          
          
        case "d":
          continue;
          
          
        default:
          System.out.println(ID + " is not a valid Entree ID");
          break;
      }
      
      if (item != null && hasCondiment) System.out.println("Select condiments to go with it. Enter 'd' when done.");
      
      
      //Selects condiments to go with the current item
      while(!condiment.equals("d") && item != null && hasCondiment)
      {
        condiment = in.next();
        switch(condiment)
        {
          case "le":
            item = new TopLettuce(item);
            break;
            
          case "on":
            item = new TopOnion(item);
            break;
            
          case "ke":
            item = new TopKetchup(item);
            break;
            
          case "re":
            item = new TopRelish(item);
            break;
            
          case "pi":
            item = new TopPickle(item);
            break;
          
          case "to":
            item = new TopTomato(item);
            break;
            
          case "ch":
            item = new TopCheese(item);
            break;
            
          case "d":
            System.out.println("Select another menu item or enter 'd' for done.");
            break;
            
          default:
            System.out.println(condiment + " is not a valid condiment.  Please try again.");
            break;
        }
        if(condimentLimiter++ == 5) 
    	{
        	condiment = "d";
    		System.out.println("Condiment limit has been reached.");
    		System.out.println("Select another menu item or enter 'd' for done.");
    	}
      }
      if(!hasCondiment) System.out.println("Select another menu item or enter 'd' for done.");
      
      if(menuID == 0) mcList.add(item);
      if(menuID == 1) snList.add(item);
      if(menuID == 2) drList.add(item);
      
      item = null;
      condiment = "";
      hasCondiment = false;
      menuID = 0;
      condimentLimiter = 0;
    }
    in.close();
    
    //Prints out all the items in the cart
    System.out.println("-----Main Course Items-----\n");
    
    for(int i = 0; i < mcList.size(); i++) 
    {
	  item = mcList.get(i);
	  System.out.println(i+1 + ": " + item.getDescription() + "     cost: $" + df.format(item.getCost()) + "\n");
      cost += item.getCost();
  	}
    
    System.out.println("--------Snack Items--------\n");
    
    for(int i = 0; i < snList.size(); i++) 
    {

      item = snList.get(i);
      System.out.println(i+1 + ": " + item.getDescription() + "     cost: $" + df.format(item.getCost()) + "\n");
      cost += item.getCost();
    }
    
    System.out.println("--------Drink Items--------\n");
    
    for(int i = 0; i < drList.size(); i++) 
    {
      item = drList.get(i);
      System.out.println(i+1 + ": " + item.getDescription() + "     cost: $" + df.format(item.getCost()) + "\n");
      cost += item.getCost();
    }
    
    System.out.println("---------------------------\n");
    
    System.out.println("Total Cost: $" + df.format(cost));
  }
}
