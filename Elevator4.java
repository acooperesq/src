
import java.util.Scanner;

public class Elevator4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int change_levels; // how many levels and in which direction is the elevator changing
		
		
		int floor_now;  // floor at a given point in the program
		
		floor_now = 0;  // initializes at basement
		
		boolean door_status; // false if door is closed - true if door is open
		
		door_status = false; // initializes as closed
		
		
		
		int valfor = 0; // throw-away value to make a timing loop
		
		int while_status = 1;  // to be implemented exit loop
		
		String U = "U";   // use of strings for string comparisons of state of elevator command  - up one floor
		String U2 = "2U"; // up two floors, etc.
		String D = "D";
		String D2 = "2D";
		String Exit = "Exit";
		
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
			
			valfor = 0;   //  a way to get a timing loop
			}
			
			door_status = false;    // this is done for reasons of timing - I realize that I am setting door status to false 10,000 times
			}
		
			if (door_status == false)  // checking to ensure if door is closed
				
			{  System.out.println(" (-Exit-)-- to exit"); // to be implemented
			
			
			 System.out.println("Up -U-(one level) 2U (two levels) or Down - D (one level) or Down -2D (two levels)");
			 
			String selection = scanner.nextLine();
			
			
			
			switch(floor_now)  // I am indexing off of floor now to avoid error conditions
			{ case 0:
				if (selection.equals(D) || selection.equals(D2))  // in basement
				{ System.out.println("Already in Basement - can not go lower!");}
				
				else if (selection.equals(U))
					
					
				
				{ 
					change_levels = 1;
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
				
				
				else if (selection.equals(U2))
					
					
					
				{ 
					change_levels = 2;
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
				
				
				
				else if (selection.equals(Exit))
				{while_status = 0;}
				
				
				else System.out.println("Input Not Recognized as Valid Movement Instruction to Elevator");
				
				break;
				
			case 1:
				if (selection.equals(U))
				 
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
				
				else if (selection.equals(D))
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
					System.out.println("Elevator is on Basement");
						
					System.out.println("Door Open - Please Exit");
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					System.out.println("Door Closed \n \n");}
					
				}
				
				else if (selection.equals(D2) || selection.equals(U2))  // 
				{ System.out.println("Cannot Go Two Floors In Either Direction From Main Floor");}
				
				else if (selection.equals(Exit))
				{while_status = 0;}
				
				else System.out.println("Input Not Recognized as Valid Movement Instruction to Elevator");
				
				break;
				
				case 2:
					
					if (selection.equals(U) || selection.equals(U2)) 
					{ System.out.println("Already in 2nd Floor - can not Go Higher");}
					
					else if (selection.equals(D))
					
					
					{ 
					
				 
							
						
						
						System.out.println("Door Open - Please come in"); // I did not check for opening and closing - this would be done by sensors
					
						for (int j=1; j<=100000; j++)
						{
						
						valfor = 0;   // just a way to get a timing loop
						}
						
						System.out.println("Door Closed");
						
						
					System.out.println("Going Down to Level One");
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					floor_now = 1;
					
				
					System.out.println("Elevator is on First Floor");
					}
				
					else if (selection.equals(D2))
						
						
					{ 
					
				 
							
						
						
						System.out.println("Door Open - Please come in"); // I did not check for opening and closing - this would be done by sensors
					
						for (int j=1; j<=100000; j++)
						{
						
						valfor = 0;   // just a way to get a timing loop
						}
						
						System.out.println("Door Closed");
						
						
					System.out.println("Going Down to Level One");
					
					for (int j=1; j<=100000; j++)
					{
					
					valfor = 0;   // just a way to get a timing loop
					}
					floor_now = 0;
					
				
					System.out.println("Elevator is in Basement");
					}	
					
					else if (selection.equals(Exit))
					{while_status = 0;}
					
					else System.out.println("Input Not Recognized as Valid Movement Instruction to Elevator");
				
					break;
					
					
				}
				
				}
			
			
		
		}
				
		while (while_status == 1);  // this is the exit condition
		
		
		floor_now = 0; //  return of elevator to basement -- 'normal' 
		System.out.println("Elevator is in Basement");
		System.out.println("Exit Program");

	}

}
