public class ComboChoice
{
   private VendingMachine combo1;
   private VendingMachine combo2;
   private VendingMachine combo3;
   
   public ComboChoice(){
       combo1 = new Combo1();
       combo2 = new Combo2();
       combo3 = new Combo3();
    }
    
    public void combo1pick(){
        combo1.ItemNum();
        combo1.price();
    }
    
     public void combo2pick(){
        combo2.ItemNum();
        combo2.price();
    }
    
     public void combo3pick(){
        combo3.ItemNum();
        combo3.price();
    }
}
