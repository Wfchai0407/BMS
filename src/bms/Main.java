package bms;
import java.util.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        BakeryManagementSystem system = new BakeryManagementSystem();
        int choice;
        
        do {
			System.out.println("\n-----Bakery Management System-----");
			System.out.println("1. Menu");
			System.out.println("2. Place Order");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine(); //Use to clear the newline character after the input
			
			switch(choice) {
				case 1 :system.startSystem();
						break;// Start running the menu ;
				case 2 :System.out.println("Haven't implement") ;
						break;
				case 3:System.out.println("Haven't implement") ;
						break;
				case 4 :System.out.println("Haven't implement") ;
						break;
				case 0 :System.out.println("Exiting...");
						break;	
				default:System.out.println("Invalid choice.");
			}
		}while(choice != 0); //Keep looping until the user choose 0
	}	
	
	}

