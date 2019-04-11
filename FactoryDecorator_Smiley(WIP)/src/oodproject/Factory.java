package oodproject;

import java.util.Queue;

public class Factory
{
  Food food;
  
  //Private constructor is called by InitFactory when factory does not exist
  private Factory() 
  {
    System.setProperty("foodID", "NoSelection");
  }
  
  
  //Set system property foodID; this will be a class name
  public void setFoodType(String ID) 
  {
    System.setProperty("foodID", ID);
  }
  
  
  //Creates static instance factory when getFactory() is called if factory doesn't already exist
  private static class InitFactory 
  {
    private static final Factory factory = new Factory();
  }
  
  
  //If factory exists, this will return factory. Otherwise this will create a new factory through lazy initialization
  public static Factory getFactory() 
  {
    return InitFactory.factory;
  }
  
  
  //Uses the system property foodID to create a new instance of the type of Food class specified in the property and returns it
  //Creates main course items
  public MainCourse create(String ID) throws InstantiationException, 
    IllegalAccessException, ClassNotFoundException 
  {
    return (MainCourse) Class.forName("oodproject." + ID).newInstance();
  }
  
  
  //Creates snack items
  public Snack createSn(String ID) throws InstantiationException, 
  IllegalAccessException, ClassNotFoundException 
  {
    return (Snack) Class.forName("oodproject." + ID).newInstance();
  }
  
  
  //Creates drink items
  public Drink createDr(String ID) throws InstantiationException, 
  IllegalAccessException, ClassNotFoundException 
  {
    return (Drink) Class.forName("oodproject." + ID).newInstance();
  }
  
  
  
}