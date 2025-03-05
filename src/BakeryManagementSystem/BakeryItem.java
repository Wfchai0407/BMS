package BakeryManagementSystem;

public class BakeryItem 
{
    private String itemName;
    private double price;
    private int quantityAvailable;

    public BakeryItem(String itemName, double price, int quantityAvailable) 
    {
        this.itemName = itemName;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    // Getters, Setters, display method, etc.
}