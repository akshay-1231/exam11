package javaexam;

public class CustomerOrder {
	private String customerId;
    private String orderId;
    private String itemList;
    private int qantity;
    private double totalPrice;
	
	public CustomerOrder(String customerId, String orderId, String itemList, int qantity, double totalPrice) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.itemList = itemList;
		this.qantity = qantity;
		this.totalPrice = totalPrice;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getItemList() {
		return itemList;
	}

	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public int getQantity() {
		return qantity;
	}

	public void setQantity(int qantity) {
		this.qantity = qantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	@Override
	public String toString() {
		return "CustomerOrder [customerId=" + customerId + ", orderId=" + orderId + ", itemList=" + itemList
				+ ", qantity=" + qantity + ", totalPrice=" + totalPrice + "]";
	}

	public static void add(CustomerOrder customeroeder) {
			
	}
	
    
}
