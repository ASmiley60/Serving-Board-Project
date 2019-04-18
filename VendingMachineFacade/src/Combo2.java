public class Combo2 implements VendingMachine
{
  
  public void ItemNum() {
      System.out.println("You've picked combo number 2.");
      System.out.println("You get the following items: ");
      System.out.println("Main course: Salad ($3.00)");
      System.out.println("Topping(s): Tomato ($.50), Onion ($.50), Pickle ($.50)");
      System.out.println("Snack : Apple Slices ($1.00)");
      System.out.println("Drink : Water ($1.00)"); 
     
    }
    
   public void price(){
       System.out.println("The combo will cost $6.50 \n");
        System.out.println("===========================================================");
    }
}

