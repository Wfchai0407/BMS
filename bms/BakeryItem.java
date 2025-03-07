package bms;

public class BakeryItem {
    private String itemName;
    private double price;
    private int quantity;
 
    public BakeryItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
    	this.price = price;
    	this.quantity = quantity;
    }
    
    public void updateItemName(String itemName) {
    	this.itemName = itemName;
    }
    
    public void updatePrice(double price) {
    	this.price = price;
    }
    
    public void updateQuantity(int quantity) {
    	this.quantity = quantity;
    }
    
    public String getItemName() {
    	return itemName;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public int getQuantity() {
    	return quantity;
    }
    
    public void displayItem() {
		System.out.println("Item Name: " +itemName + "\nPrice: " +price + "\nQuantity: " +quantity);
	}
    
    public String toString() {
        return "Item Name: " + itemName + ", Price: RM" + price + ", Quantity: " + quantity;
    }
}
