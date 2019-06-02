
import java.util.Scanner;
import java.io.*;



public class junk1 {

	public static void main (String[] args) {
		
		final int REST_ZIP = 75104;   	// zip code of restaurant
		int custzip;					// zip code of customer
		int zipdist;					// distance of zip codes
		int absdist;					// absolute distance of zip codes
		int delselect;					// selection of pickup or delivery by customer
		int delstat;					// delivery status - delivery, extra, too far
		int nuitems;					// number of items to be ordered by customer
		delstat = 0;					//default delivery status is NO -- too far
		
		double subtotal = 0.00;			// subtotal of order
		
		int menu;						// menu items to be ordered according to menu
		double taxes = 0.00;			// taxes of order
		double total = 0.00;			// total of order with subtotal, delivery, and taxes
		
		
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Pick-Up -1- or Delivery- 2");
		 
		 delselect = scanner.nextInt();
		 
		 
		 System.out.println(delselect);	// this is a safety in program
		 
		if (delselect == 2)
			 
			 {
				 System.out.println("so far so good - Delivery Options");
			 
			 
			 System.out.println("Please Enter Your (The Customer's) Zip Code");
			 custzip = scanner.nextInt();
			 System.out.println(custzip);
			 zipdist = custzip - REST_ZIP;
			 absdist = Math.abs(zipdist);	// checking absolute value of distance of zip codes
			 System.out.println(absdist);
			 
			 if (absdist <= 4)
			 { System.out.println("Delivery Available");
			 delstat = 1;
			 }
			 else if (absdist == 5)
			 	{ System.out.println("Delivery with Extra Cost");
			 delstat = 2;
			 	} 
			 else 
			 	{ System.out.println("Delivery Not Available");
			 
			 	}
			 
			 }
			 
if (delselect == 2)
			 
			 {System.out.println("Pick Up In Restaurant");
			 
			 	}
			 
			 
		 // Ordering in Restaurant
				 	
			 
			 System.out.println("Please May We Take Your Order?");
			 
			 System.out.println("Prices to Follow:");
			 
			 System.out.println("(1) Flyers' Burger: $4.50 per an order ");
			 
			 System.out.println("(2) Flyers' Drink: $1.50 per a container ");
			 
			 System.out.println("(3) Flyers' Fries: $2.50 per an order ");
			 
			 System.out.println("(4) Flyers' Dessert: $3.00 per an order ");
			 
			 System.out.println("Tax 5%;  = $5 for Delivery Available; $7 for Delivery With Extra Cost  ");
			 
			 
			 
			 System.out.println("How many items?");
			 nuitems = scanner.nextInt();
			 
			 while (nuitems > 0)
				 
				 //	Customer Ordering Items
				 
			 { System.out.println("Please Enter (1), (2), (3) or (4) ");
			 menu = scanner.nextInt();
				 
			if (menu == 1) 
				subtotal = subtotal + 4.50;
			if (menu == 2) 
				subtotal = subtotal + 1.50;
			if (menu == 3) 
				subtotal = subtotal + 2.50;
			if (menu == 4) 
				subtotal = subtotal + 3.00;
			nuitems --;
			
			 }
			 
			 //	Determining Prices1
			 
			 System.out.println("Subtotal is: " + subtotal); 
			 
			 taxes = subtotal * .05;
			 
			 System.out.println("Taxes: " + taxes);
			 
			 subtotal = subtotal + taxes;
			 
			 System.out.println("Amount After Taxes " + subtotal);
			 
			 System.out.println("Delivery Cost: " + subtotal);
			 
			 if (delstat == 0) 
				 System.out.println("No Delivery");
			 
			 if (delstat == 1) 
			 {
				 total = subtotal + 5.00;
				 System.out.println("With Delivery: " + total);}
			 
			 if (delstat == 2) 
			 {
				 total = subtotal + 7.00;
				 System.out.println("With Extra Cost Delivery: " + total);}
					 
			 
	}
			 
			 
	}





