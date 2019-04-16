package oodproject;


/**
 * This is the type of entree that the user will pick. 
 * Ex. Beef Hotdog, Pork Hotdog, etc. 
 *@author (Wendell Jenkins)
 * @version1 (3/7/19)
 */
public class MCSalad implements MainCourse
{
    String type;
    
    public MCSalad(String type) 
    {
      this.type = type;
    }
  
    @Override
    public String getDescription(){
        if (type.equals("Ranch")) return "Salad w/ Ranch";
        return type + " Salad";
    }
    
    @Override
    public double getCost(){
        return 3.0;
    }
    
}
