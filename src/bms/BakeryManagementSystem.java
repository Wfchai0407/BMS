package bms;

import java.util.ArrayList;
import java.util.Scanner;

public class BakeryManagementSystem {
	private ArrayList<BakeryItem> inventory = new ArrayList<>(); //List of the items
	private Scanner sc = new Scanner(System.in);
	
	public void startSystem() {
		int choice;
		
		do {
			System.out.println("\n-----Bakery Management System-----");
			System.out.println("1. Add Item");
			System.out.println("2. Update Item");
			System.out.println("3. Remove Item");
			System.out.println("4. Display Inventory");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine(); //Use to clear the newline character after the input
			
			switch(choice) {
				case 1 :addItem();
						break;
				case 2 : updateItem();
						break;
				case 3 : removeItem();
						break;
				case 4 : displayInventory();
						break;
				case 0 : System.out.println("Exiting...");
						break;
				default: System.out.println("Invalid choice.");
			}
		}while(choice != 0); //Keep looping until the user choose 0
	}	
	
	String name;
	double p;
	int qty;
	
	private void addItem() {
		System.out.print("Enter item name: ");
		name = sc.nextLine();
		System.out.print("Enter price: ");
		p = sc.nextDouble();
		System.out.println("Enter quantity: ");
		qty = sc.nextInt();
			
		inventory.add(new BakeryItem(name, p, qty));//Add the item into the array item list
		System.out.println("Item added.");
	}
	
	private void updateItem() {
        System.out.print("Enter item name to update: ");
        name = sc.nextLine();
        for (BakeryItem item : inventory) {//Search from the array list to find the entered item
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.print("Enter new price: ");
                item.setPrice(sc.nextDouble());//change the price
                System.out.print("Enter new quantity: ");
                item.setQuantity(sc.nextInt());//change the quantity
                System.out.println("Item updated.");
                return; //stop after update done
            }
        }
        System.out.println("Item not found. Please try again");
    }

    private void removeItem() {
        System.out.print("Enter item name to remove: ");
        name = sc.nextLine();
        inventory.removeIf(item -> item.getItemName().equalsIgnoreCase(name));
        //remove the item entered if existed in the array list
        System.out.println("Item removed. ");
    }

    //display the array list of all the items
    private void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        if (inventory.isEmpty()) {
            System.out.println("No items available.");
        } else {
        	int index = 1; //setting the value start from Item 1 then increase every time
        	for (BakeryItem item : inventory) {
        		System.out.println("Item " +index + ":");
                item.displayItem();
                System.out.println();//spacing 1 line to make it tidy
                index++;//index increase 1 
        	}
        }
    }
}
