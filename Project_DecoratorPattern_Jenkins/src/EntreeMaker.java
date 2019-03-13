
/**
 * Creating a Test Class 
 *
 * @author (Wendell Jenkins)
 * @version (3/7/19)
 */
public class EntreeMaker
{
   public static void main(String [] args){
     Entree1 first = new CondimentA1(new CondimentA2(new EntreeTypeA2())); 
     System.out.println("Creating Entree 1");
     System.out.println("Ingredients: " + first.getDescription());
     System.out.println("Cost: " + first.getCost() + "\n");
     
   
     Entree2 second = new CondimentB3(new CondimentB2(new EntreeTypeB1())); 
     System.out.println("Creating Entree 2");
     System.out.println("Ingredients: " + second.getDescription());
     System.out.println("Cost: " + second.getCost() + "\n");
     
   
        
     Entree3 third = new CondimentC1(new CondimentC2(new EntreeTypeC3())); 
     System.out.println("Creating Entree 3");
     System.out.println("Ingredients: " + third.getDescription());
     System.out.println("Cost: " + third.getCost() + "\n");
     
     
     
    }
}
