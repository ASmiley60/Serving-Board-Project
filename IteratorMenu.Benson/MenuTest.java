import java.util.ArrayList;
import java.util.Iterator;


public class MenuTest {

	public static void main(String[] args) {
		
		ArrayList<MenuItem> k = new ArrayList<MenuItem>();
		
		Menu menu = new Menu(k);
		Iterator<MenuItem> it = menu.createIterator();
		
		while (it.hasNext()) {
			MenuItem m = it.next();
			System.out.print("----- " + m.getType() + " -----\n");
			m.listTops();
			System.out.println("\n");
		}
		
	}
}
