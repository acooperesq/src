
import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		
		int[] floor = new int[3];
		floor[0] = 0; // basement
		floor[1] = 1; // first floor
		floor[2] = 2; // second floor
		
		
		int floor_now;  // floor at a given point in the program
		floor_now = 0;  // initializes at basement
		
		boolean door_status; // false if door is closed - true if door is open
		door_status = false; // initializes as closed
		
		String selection;
		
		do  {System.out.println("Elevator is on Floor " + floor_now);
		
		System.out.print("Elevator door status is ");
		
		if (door_status == false)
			System.out.println("Closed ");
		else 
			{ System.out.println("Open ");
			System.out.println("Now Closing Elevator Door; please watch your hands and feet. ");
			door_status = false;
		
			}
		
			
		}
				
		while (floor_now != 4);  // this is the exit condition
		

	}

}
