package bms;
import java.util.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        BakeryManagementSystem system = new BakeryManagementSystem();
        ArrayList<Order> orderList = new ArrayList<>();
        int ch;
        
        do {
			System.out.println("\n-----Bakery Management System-----");
			System.out.println("1. Menu");
			System.out.println("2. Place Order");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			ch = sc.nextInt();
			sc.nextLine(); //Use to clear the newline character after the input
			
			switch(ch) {
				case 1 :system.startSystem();
						break;// Start running the menu ;
				case 2 : Order order=new Order(system);
						order.PlaceOrder();
						break;
				case 3:System.out.println("Haven't implement") ;
						break;
				case 4 :System.out.println("Haven't implement") ;
						break;
				case 0 :System.out.println("Exiting...");
						break;	
				default:System.out.println("Invalid choice.");
			}
		}while(ch != 0); //Keep looping until the user choose 0
	}	
	
	}

