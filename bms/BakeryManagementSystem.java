package bms;

import java.util.ArrayList;
import java.util.Scanner;

public class BakeryManagementSystem {
	private ArrayList<BakeryItem> inventory = new ArrayList<>();
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
			sc.nextLine();
			
			switch(choice) {
				case 1 -> addItem();
				case 2 -> updateItem();
				case 3 -> removeItem();
				case 4 -> displayInventory();
				case 0 -> System.out.println("Exiting...");
				default -> System.out.println("Invalid choice.");
			}
		}while(choice != 0);
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
			
		inventory.add(new BakeryItem(name, p, qty));
		System.out.println("Item added.");
	}
	
	private void updateItem() {
        System.out.print("Enter item name to update: ");
        name = sc.nextLine();
        for (BakeryItem item : inventory) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.print("Enter new price: ");
                item.setPrice(sc.nextDouble());
                System.out.print("Enter new quantity: ");
                item.setQuantity(sc.nextInt());
                System.out.println("Item updated.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private void removeItem() {
        System.out.print("Enter item name to remove: ");
        name = sc.nextLine();
        inventory.removeIf(item -> item.getItemName().equalsIgnoreCase(name));
        System.out.println("Item removed. ");
    }

    private void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        if (inventory.isEmpty()) {
            System.out.println("No items available.");
        } else {
            for (BakeryItem item : inventory) {
                System.out.println(item);
            }
        }
    }
}
