import java.util.ArrayList;
import java.util.Iterator;

public class MenuItem {
	String type;
	double price;
	ArrayList<String> tops = new ArrayList<String>();
	
	
	public MenuItem(String type, double price, String top1, String top2, String top3) {
		this.type = type;
		this.price = price;
		tops.add(top1);
		tops.add(top2);
		tops.add(top3);
	}
	
	public MenuItem(String type, String top1, String top2) {
		this.type = type;
		tops.add(top1);
		tops.add(top2);
	}
	
	public Iterator<String> createIterator() {
		return tops.iterator();
	}
	
	public void addTop(String top) {
		tops.add(top);
	}
	
	public String getType() {
		return type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void listTops() {
		Iterator<String> it = createIterator();
		
		while (it.hasNext()) {
			String s = it.next();
			if(it.hasNext())
				System.out.print(s + ", ");
			else System.out.print(s);
		}
	}
	
}
