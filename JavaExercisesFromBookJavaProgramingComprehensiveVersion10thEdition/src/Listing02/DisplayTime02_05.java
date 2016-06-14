package Listing02;
import java.util.Scanner;

public class DisplayTime02_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user for input
		System.out.print("Enter an enteger for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60; // Find minutes in seconds
		int remainigSeconds = seconds % 60; // seconds remainig
		System.out.println(seconds + " Seconds is " + minutes + 
				" mintes and " + remainigSeconds + " seconds");
		
		input.close();
	}

}
