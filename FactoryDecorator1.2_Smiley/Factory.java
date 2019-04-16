package oodproject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Queue;

public class Factory
{
  
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
  
  
  //Uses the system property foodID to create a new instance of the type of MainCourse class specified in the property and returns it
  //Creates main course items
  public MainCourse create(String ID) throws InstantiationException, 
    IllegalAccessException, ClassNotFoundException 
  {
    return (MainCourse) Class.forName("oodproject." + ID).newInstance();
  }
  
  
  //Works as above except it creates the class with the constructor argument: type
  public MainCourse create(String ID, String type) throws InstantiationException, 
  IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 
  {
    Class<?> c = Class.forName("oodproject." + ID);
    Constructor<?> ctr = c.getConstructor(String.class);
    return (MainCourse) ctr.newInstance(type);
  }
}