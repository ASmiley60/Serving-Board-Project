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
    Queue<Food> foods = new LinkedList<>();
    Food food;
    double price = 0;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Select your foods: \nEnter 'H' for a hamburger or 'F' for fries. Enter 'D' for done.");
    String ID = in.next();
    
    while(!ID.equals("D"))
    {
      //Take expected single character from user input and set which type of Food class will be created 
      switch(ID) 
      {
        case "H":
          foods.add(factory.createFood("Hamburger"));
          break;
          
        case "F":
          foods.add(factory.createFood("Fries"));
          break;
          
        case "D":
          break;
          
        default:
          System.out.println(ID + " is not a valid Food ID");
          break;
      }
      ID = in.next();
    }
    in.close();
    
    while(!foods.isEmpty()) 
    {
      food = foods.poll();
      System.out.println(food.getDescription());
      price += food.getPrice();
    }
    
    System.out.println("Total Cost: $" + price + "0");
  }
}
