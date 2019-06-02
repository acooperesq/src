 

public class AC_HW1_formatted {

	public static void main(String[] args) {
		
		// test score
		
		double t1, t2, t3, t4, t5, t6;
		String greet = "hello";
		String ggg;
		// assignment score
		double a1, a2, a3, a4, a5, a6;
		double avg_test, avg_assignment;
		
		// TEST SCORES RESPECTIVE WEIGHTS
		// 		assigning the respective weights to the various test scores in order of presentation
		// 		HW did not ask us to use the 'raw' test scores, so I did not employ them
		
		t1 = 0.10;
		t2 = 0.20;
		t3 = 0.25;
		t4 = 0.25;
		t5 = 0.20;
		t6 = 0.10;
		
				
		//ASSIGNMENT SCORES RESPECTIVE WEIGHTS
				// 		assigning the respective weights to the various assignment scores in order of presentation
				// 		HW did not ask us to use the 'raw' assignment scores, so I did not employ them
		
		
		a1 = 0.05;
		a2 = 0.10;
		a3 = 0.15;
		a4 = 0.25;
		a5 = 0.25;
		a6 = 0.20;
		
		
		// CALCULATE AVERAGE OF SIX TEST SCORES
			avg_test = (t1 +t2 +t3 +t4 + t5 + t6) / 6.0;
			
		
		//	CALCULATE AVERAGE OF SIX ASSIGNMENT SCORES			
			avg_assignment = (a1 +a2 +a3 +a4 + a5 + a6) / 6.0;
			
	
		//	PRESENTATION OF RESULTS
					
			System.out.println("Average test score:  " + avg_test);
			System.out.println("Average assignment score:  " + avg_assignment);
			
		//	FORMATTING RESULT
			
			//	Is there a better way of doing this? I tried multiple attempts at formatting but this is what I found
			//  What does one do about Most Significant Digits that vary on a string - i.e. how do we print significant digits?
			
			
			String formavg_test = String.format("%.3f", avg_test);
			String formavg_assignment = String.format("%.3f", avg_assignment);
			
			System.out.println("Formatted Average test score:  " + formavg_test); 
			System.out.println("Formatted Average assignment score:  " + formavg_assignment);
			
			
	}

}
