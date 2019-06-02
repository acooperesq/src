
import java.util.Scanner;
import java.io.*;

class Box {
	double width;
	double height;
	double depth;
	
		void volume()  {
			System.out.print("Volume is " + width * height * depth);
		}
	
}


public class junk {

	public static void main(String args[]) {
		
	String qu[];
			      		 
	Box box1 = new Box();
	
	box1.width = 10;
	box1.height = 10;
	box1.depth = 25;
	
	System.out.println("Width is " + box1.width);
	
	foo(box1.width);
	
	
	String gg = "Alan";
	
	String gga = new String(gg);
	
	
	qu[] = boo(box1.width, gga);
	
	System.out.println("Modified Width is " + qu);
	
	
	
	System.out.println("Modified String is " + gga);
	
	box1.volume();
	
	int h = gga.length();
	System.out.println("Length is " + h);
	
	}

	public static String[] boo(double zztop, String jj) {

		zztop = zztop + 1;
		System.out.println("Modified String is " + jj);
		
		String galan = "GRAPE";
		
		String galan1;
		
		galan1 = Double.toString(zztop);
		return (galan1 + galan);
	}

	public static void foo(double j) {
		
		System.out.println("Foo Width is " + j);
		
	}
	
	
	 
}	
			 
	
			 
			 
	





