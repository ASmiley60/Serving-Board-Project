/**
 * This is the type of entree that the user will pick. 
 * Ex. Beef burger, Turkey burger, etc. 
 * It is also a concrete class that will extend the Entree2 interface and act
 * as a default
 *@author (Wendell Jenkins)
 * @version1 (3/7/19)
 */
public class EntreeTypeB3 implements Entree2
{
    
    @Override
    public String getDescription(){
        return "Entree Type 1";
    }
    
    @Override
    public double getCost(){
        return 1.0;
    }
    
}
