
import java.util.Scanner;

public class Elevator2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int change_levels; // how many levels and in which direction is the elevator changing
		
		
		int floor_now;  // floor at a given point in the program
		
		floor_now = 0;  // initializes at basement
		
		boolean door_status; // false if door is closed - true if door is open
		
		door_status = false; // initializes as closed
		
		int selection = 0;  // initialization used for while loop 
		
		int valfor = 0; // throw-away value to make a timing loop
		
		
		do  {System.out.println("Elevator is on Floor " + floor_now); // shows where elevator is for each loop
		
		if (floor_now == 0)
			System.out.println("Elevator is in Basement");
		
		System.out.print("Elevator door status is ");
		
		if (door_status == false) // keeping the loop turned on until an exit value is created
			System.out.println("Closed ");
		else 
			{ System.out.println("Open ");
			System.out.println("Now Closing Elevator Door; please watch your hands and feet. ");
			
			for (int j=1; j<=100000; j++)
			{
			
			valfor = 0;   // just a way to get a timing loop
			}
			
			door_status = false;    // this is done for reasons of timing - I realize that I am setting door status to false 10,000 times
			}
		
			if (door_status == false)  // checking to ensure if door is closed
				
			{  System.out.println("Going Up or Down? (3)-- to exit");
			
			
			 System.out.println("Up -1- or Down - 2");
			 
			selection = scanner.nextInt();
			
			switch(floor_now)  // I am indexing off of floor now to avoid extreme conditions
			{ case 0:
				if (selection == 2)  // in basement
				{ System.out.println("Already in Basement - can not go lower!");}
				
				else if (selection == 1)
					
					
				
				{ System.out.println("First Floor or Second?");
					System.out.println("First Floor -1- or Second - 2");
					
					change_levels = scanner.nextInt();
					System.out.println("Change level is " + change_levels);  // left this is for debugging purposes 
					
					System.out.println("Door Open - Please come in"); // I did not check for opening and closing - this would be done by sensors
				
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					
					System.out.println("Door Closed ");
				System.out.println("Going Up");
				floor_now = floor_now + change_levels; 
				
				for (int j=1; j<=100000; j++)
				{
				
				valfor = 0;   // just a way to get a timing loop
				}
				System.out.println("Elevator is on Floor " + floor_now);
				System.out.println("Door Open - Please Exit");
				
				for (int j=1; j<=100000; j++)
				{
				
				valfor = 0;   // just a way to get a timing loop
				}
				System.out.println("Door Close \n   \n");}
				
				else System.out.println("Input Not Recognized as Valid Movement Instruction to Elevator");
				
				break;
				
			case 1:
				if (selection == 1)
				 
				{System.out.println("Door Open - Please come in"); // I did not check for opening and closing - this would be done by sensors
				
				System.out.println("Door Closed");
				System.out.println("Going Up");
				
				for (int j=1; j<=10000; j++)
				{
				
				valfor = 0;   // just a way to get a timing loop
				}
				floor_now = 2; 
				
			
				System.out.println("Elevator is on Floor " + floor_now);
				System.out.println("Door Open - Please Exit");
				
				for (int j=1; j<=100000; j++)
				{
				
				valfor = 0;   // just a way to get a timing loop
				}
				System.out.println("Door Closed \n \n");}
				
				else if (selection == 0)
				{
					{System.out.println("Door Open - Please come in"); // I did not check for opening and closing - this would be done by sensors
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					
					System.out.println("Door Closed");
					
					System.out.println("Going Down");
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					floor_now = 0; 
					
				
					System.out.println("Elevator is on Floor " + floor_now);
					System.out.println("Door Open - Please Exit");
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					System.out.println("Door Closed \n \n");}
					
				}
				
				else System.out.println("Input Not Recognized as Valid Movement Instruction to Elevator");
				
				break;
				
				case 2:
					
					if (selection == 1)
					{ System.out.println("Already in 2nd Floor - can not Go Higher");}
					
					else if (selection == 2)
					
					
					{System.out.println("First Floor -1- or Basement - 2");
					
					change_levels = scanner.nextInt();
						
					System.out.println("change_levels is " + change_levels); 
						
						
						
						System.out.println("Door Open - Please come in"); // I did not check for opening and closing - this would be done by sensors
					
						for (int j=1; j<=100000; j++)
						{
						
						valfor = 0;   // just a way to get a timing loop
						}
						
						System.out.println("Door Closed");
						
						
					System.out.println("Going Down");
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					floor_now = floor_now - change_levels; 
					
				if (floor_now == 1)
					System.out.println("Elevator is on First Floor");
				
				else if (floor_now == 0)
					System.out.println("Elevator is in Basement");
				
					System.out.println("Door Open - Please Exit the Elevator");
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					System.out.println("Door Closed \n \n");}	
					
					 
				
					break;
				}
				
				}
			
			
		
		}
				
		while (selection != 3);  // this is the exit condition
		
		
		floor_now = 0; //  return of elevator to basement -- 'normal' 
		System.out.println("Elevator is in Basement");
		System.out.println("Exit Program");

	}

}
