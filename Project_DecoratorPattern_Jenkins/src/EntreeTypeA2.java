/**
 * This is the type of entree that the user will pick. 
 * Ex. Beef Hotdog, Pork Hotdog, etc. 
 *@author (Wendell Jenkins)
 * @version1 (3/7/19)
 */
public class EntreeTypeA2 implements Entree1
{
   
    @Override
    public String getDescription(){
        return "Entree Type 2";
    }
    
    @Override
    public double getCost(){
        return 2.0;
    }
    
}
