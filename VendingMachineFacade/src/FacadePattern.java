import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePattern
{
    private static int pick;
    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            System.out.print("Welcome to the future of vending machines.\n");
            System.out.print("Please choose a combo number to see price and combo details \n");
            System.out.print("Combo 1 (type the number 1) \n");
            System.out.print("Combo 2 (type the number 2) \n");
            System.out.print("Combo 3 (type the number 3) \n");
            System.out.print("Exit (type the number 4) \n");
            System.out.println("===========================================================");
            System.out.print("Please enter a number\n");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            pick = Integer.parseInt(br.readLine());
            ComboChoice cc = new ComboChoice();
            
            switch (pick) {
                case 1: {
                    cc.combo1pick();
                }
                
                break;
                
                case 2: {
                    cc.combo2pick();
                }
                
                break;
                
                case 3: {
                    cc.combo3pick();
                }
                
                break;
                
                default: {
                    System.out.println("No combo picked");
                }
                
                return;
            }
        }
            while(pick!=4);
             
    }
    }
