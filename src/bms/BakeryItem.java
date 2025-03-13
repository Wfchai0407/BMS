package bms;

public class BakeryItem {
    private String itemName;
    private double price;
    private int quantity;
    
    public BakeryItem()
    {}
    public BakeryItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
    	this.price = price;
    	this.quantity = quantity;
    }
    
    public void setItemName(String itemName) {
    	this.itemName = itemName;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public void setQuantity(int quantity) {
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
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: RM" + price);
        System.out.println("Quantity: " + quantity);
    }
}
