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
		MenuItem sw = new MenuItem("Sandwiches","Hamburger","Chicken Sandwich","Turkey Sandwich");
		MenuItem hd = new MenuItem("Hotdogs","Beef Hotdog","Pork Hotdog","Turkey Hotdog");
		MenuItem sd = new MenuItem("Salads","Caesar Salad","Balsamic Vinegar Salad","House Salad");
		MenuItem chips = new MenuItem("Chips","Lays","Doritos","Cheetos");
		MenuItem sides = new MenuItem("Sides","Fries","Celery","Apple Slices");
		MenuItem soda = new MenuItem("Sodas","Dr. Pepper","Pepsi","Coca-Cola");
		MenuItem drinks = new MenuItem("Other Drinks","Sweet Tea","Unsweetened Tea","Water");
		
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
