package javaexam;

public class TestResturant {

	public static void main(String[] args) {
	
		  Restaurant restaurant = new Restaurant();             //String itemId, String itemName, double price
		  
		  MenuItem menuitem1 = new MenuItem("I1234","VadaPav",45.5);
		  MenuItem menuitem2 = new MenuItem("I420","panier",300.98);
		  
		  Restaurant.addmenuItem(menuitem1);
		  Restaurant.addmenuItem(menuitem2);
		  
		  
		  Restaurant.updatemenuItem(menuitem1);
		  Restaurant.updatemenuItem(menuitem2);
		  
		  
		  CustomerOrder.add
	}

}
