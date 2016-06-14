package Listing02;
import java.util.Scanner; // Scanner is in java.util package


public class ComputeAreaWIthConsoleInput02_02 {
	public static void main (String[]args){
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Promt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Compute area
		double area = radius * radius * 3.14159;
		
		// Display results
		
		System.out.println(" The area or the circle of radius " +
		radius + " is " + area); 
		input.close();
		
		
		
		
	}

}
