package oodproject;

public class Fries implements Food
{
  @Override
  public String getDescription() 
  {
    return "A side of fries.";
  }
  
  @Override
  public double getPrice() 
  {
    return 1.00;
  }
}
