package oodproject;

/**
 * This is the type of entree that the user will pick. 
 * Ex. Beef Hotdog, Pork Hotdog, etc. 
 * It is also a concrete class that will extend the Entree1 interface and act
 * as a default
 *@author (Wendell Jenkins)
 * @version1 (3/7/19)
 */
public class MCSandwich implements MainCourse
{
    String type;
    
    public MCSandwich(String type) 
    {
      this.type = type;
    }
  
    @Override
    public String getDescription(){
        if(type.equals("Ham")) return "Hamburger";
        return type + " Sandwich";
    }
    
    @Override
    public double getCost(){
        return 3.0;
    }
    
}
