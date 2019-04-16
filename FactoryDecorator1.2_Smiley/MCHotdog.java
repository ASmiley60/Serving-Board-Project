package oodproject;

/**
 * This is the type of entree that the user will pick. 
 * Ex. Beef Hotdog, Pork Hotdog, etc. 
 *@author (Wendell Jenkins)
 * @version1 (3/7/19)
 */
public class MCHotdog implements MainCourse
{
    String type;
    
    public MCHotdog(String type) 
    {
      this.type = type;
    }
    
    @Override
    public String getDescription(){
        return type + " Hotdog";
    }
    
    @Override
    public double getCost(){
        return 2.0;
    }
      
}
