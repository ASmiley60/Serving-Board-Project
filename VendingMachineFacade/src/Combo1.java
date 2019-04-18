public class Combo1 implements VendingMachine
{
  public void ItemNum() {
      System.out.println("You've picked combo number 1.");
      System.out.println("You get the following items: ");
      System.out.println("Main course: Hotdog ($2.00) ");
      System.out.println("Topping(s): Ketchup ($.25) & Relish ($.25) ");
      System.out.println("Snack : Fries ($1.00) ");
      System.out.println("Drink : Soda ($1.00)");  
      
    }
    
   public void price(){
       System.out.println("The combo will cost $4.50 \n");
       System.out.println("===========================================================");
    }
}
