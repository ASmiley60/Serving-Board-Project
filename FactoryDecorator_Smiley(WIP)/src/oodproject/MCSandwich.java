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

    @Override
    public String getDescription(){
        return "Sandwich";
    }
    
    @Override
    public double getCost(){
        return 1.0;
    }
    
}
