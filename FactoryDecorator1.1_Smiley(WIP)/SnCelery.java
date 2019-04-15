package oodproject;

/**
 * This is the type of entree that the user will pick. 
 * Ex. Beef burger, Turkey burger, etc. 
 * It is also a concrete class that will extend the Entree2 interface and act
 * as a default
 *@author (Wendell Jenkins)
 * @version1 (3/7/19)
 */
public class SnCelery implements MainCourse
{
    
    @Override
    public String getDescription(){
        return "Celery";
    }
    
    @Override
    public double getCost(){
        return 1.0;
    }
    
}
