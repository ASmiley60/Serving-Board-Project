import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
	ArrayList<MenuItem> menu;
	
	public Menu(ArrayList<MenuItem> menu) {
		
		this.menu = createMenu();
		
	}
	
	public Iterator<MenuItem> createIterator() {
		
		return menu.iterator();
		
	}
	
	private ArrayList<MenuItem> createMenu() {
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		MenuItem sw = new MenuItem("Sandwiches", 3.00, "Hamburger","Chicken Sandwich","Turkey Sandwich");
		MenuItem hd = new MenuItem("Hotdogs", 2.00, "Beef Hotdog","Pork Hotdog","Turkey Hotdog");
		MenuItem sd = new MenuItem("Salads", 3.00, "Caesar Salad","Balsamic Vinegar Salad","House Saland");
		MenuItem chips = new MenuItem("Chips", 1.00, "Lays","Doritos","Cheetos");
		MenuItem sides = new MenuItem("Sides", 1.00, "Fries","Celery","Apple Slices");
		MenuItem soda = new MenuItem("Sodas", 1.00, "Dr. Pepper","Pepsi","Coca-Cola");
		MenuItem drinks = new MenuItem("Other Drinks", 1.00, "Sweet Tea","Unsweetened Tea","Water");
		
		menu.add(sw);
		menu.add(hd);
		menu.add(sd);
		menu.add(chips);
		menu.add(sides);
		menu.add(soda);
		menu.add(drinks);
		
		return menu;
	}
	
		
}
