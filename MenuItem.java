package javaexam;

public class MenuItem {
   private String itemId;
   private String itemName;
   private double price;
public MenuItem(String itemId, String itemName, double price) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.price = price;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public String toString() {
	return "MenuItem [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
}
public static void add(MenuItem menuitem) {
	
}
public static void update(MenuItem menuitem) {
	
	
}


 
   
   
}
