package Listing02;
import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAverage02_03 {
	public static void main(String[] args){
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Promt the user to enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute average
		double average = (number1 + number2 + number3) / 3;
		
		//Dsplay results
		System.out.println("The average of " + number1 + " " + number2
				+ " " + number3 + " is " + average);
		input.close();
	}

}
