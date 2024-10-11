package javaexam;

import java.util.ArrayList;

public class Restaurant {
     private ArrayList<MenuItem>items=new ArrayList<>();
     private ArrayList<CustomerOrder>orders=new ArrayList<>();
     
      public void addmenuItem(MenuItem menuitem) {
    	  MenuItem.add(menuitem);
      }
      public void updatemenuItem(MenuItem menuitem) {
    	  MenuItem.update(menuitem);
      }
   
      public void removemenuItem(String itemId) {
          items.remove(itemId);
          System.out.println("item removed successfully: " + itemId);
      }
      public void addorder(CustomerOrder orderId) {
    	  orders.add(orderId);
    	  System.out.println("order added sucessfully"+orderId);
      }
      public void displaymenu(MenuItem menuItem) {
    	  System.out.println("avilable menu are");
    	  for(MenuItem menuitem : items) {
    		  System.out.println(menuitem);
    	  }
      }
}    
