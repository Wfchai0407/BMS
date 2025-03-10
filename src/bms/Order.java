package bms;
import java.util.*;
public class Order 
{	
	private static int orderId=0;
	private ArrayList<BakeryItem> items;// item lists
	private BakeryManagementSystem bms;//refer to bms 
	Scanner sc=new Scanner(System.in);
	public Order (BakeryManagementSystem bms)
	{	
		this.bms = bms; 
        this.items = new ArrayList<>();//initialize an empty array list of item
    }
	public void PlaceOrder()
	{
		System.out.println("Item Id: ");
		orderId++;
		
		
		System.out.println("Order Id: Order"+orderId);
	}
	

	
	
}
