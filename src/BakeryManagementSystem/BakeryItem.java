package BakeryManagementSystem;

public class BakeryItem 
{
    private String itemName;
    private double price;
    private int quantity;

    public BakeryItem(String itemName, double price, int quantity) 
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void updateQuantity(int quantity)
    {
    	this.quantity = quantity;
    }
    
    public void updatePrice(double price)
    {
    	this.price = price;
    }
    
    public String getItemName()
    {
    	return itemName;
    }
    
    public double getPrice()
    {
    	return price;
    }
    
    public int getQuantity()
    {
    	return quantity;
    }

}
