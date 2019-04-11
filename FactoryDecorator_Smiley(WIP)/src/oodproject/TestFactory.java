package oodproject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestFactory
{
  public static void main (String args[]) throws InstantiationException, 
  IllegalAccessException, ClassNotFoundException 
  {
    Factory factory = Factory.getFactory();
    Queue<MainCourse> mcList = new LinkedList<>();
    Queue<MainCourse> snList = new LinkedList<>();
    Queue<MainCourse> drList = new LinkedList<>();
    MainCourse mainCourse;
    MainCourse snack;
    MainCourse drink;
    
    double cost = 0;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Select your foods: \nEnter 'H' for a hamburger or 'F' for fries. Enter 'D' for done.");
    String ID = in.next();
    String condiment;
    
    while(!ID.equals("D"))
    {
      //Take expected single character from user input and set which type of Food class will be created
      //This will be replaced with button actions
      switch(ID) 
      {
        case "MCSand":
          mcList.add(factory.create("MCSandwich"));
          break;
          
        case "SnChips":
          snList.add(factory.create("SnChips"));
          break;
          
        case "DrSoda":
          drList.add(factory.create("DrSoda"));
          break;
          
        case "D":
          break;
          
        default:
          System.out.println(ID + " is not a valid Food ID");
          break;
      }
      
      condiment = in.next();
      
      while(!condiment.equals("D"))
      {
        switch(condiment)
        {
          case "Lettuce":
            
        }
        ID = in.next();
      }
      
    }
    in.close();
    
    System.out.println("-----Main Course Items-----\n");
    
    while(!mcList.isEmpty()) 
    {
      mainCourse = mcList.poll();
      System.out.println(mainCourse.getDescription() + "     cost: $" + mainCourse.getCost() + "0\n");
      cost += mainCourse.getCost();
    }
    
    System.out.println("--------Snack Items--------\n");
    
    while(!snList.isEmpty()) 
    {
      snack = snList.poll();
      System.out.println(snack.getDescription() + "     cost: $" + snack.getCost() + "0\n");
      cost += snack.getCost();
    }
    
    System.out.println("--------Drink Items--------\n");
    
    while(!drList.isEmpty()) 
    {
      drink = drList.poll();
      System.out.println(drink.getDescription() + "     cost: $" + drink.getCost() + "0\n");
      cost += drink.getCost();
    }
    
    System.out.println("Total Cost: $" + cost + "0");
  }
}
