package oodproject;

public class Hamburger implements Food
{
  @Override
  public String getDescription() 
  {
    return "A hamburger.";
  }
  
  @Override
  public double getPrice() 
  {
    return 2.50;
  }
}
