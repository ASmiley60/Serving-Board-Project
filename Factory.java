package oodproject;

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
  public Food createFood(String ID) throws InstantiationException, 
    IllegalAccessException, ClassNotFoundException 
  {
    return (Food) Class.forName("oodproject." + ID).newInstance();
  }
}