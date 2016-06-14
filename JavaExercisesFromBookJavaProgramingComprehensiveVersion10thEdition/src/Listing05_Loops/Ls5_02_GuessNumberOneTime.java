package Listing05_Loops;
import java.util.Scanner;
public class Ls5_02_GuessNumberOneTime {

	public static void main(String[] args) {
		//Generate a random number to be guessed
		int number = (int)(Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Gues a Magic number between 0 and 100");
		
		// Promt the user to guess the number
		System.out.print("\nEnter your guess: ");
		int guess = input.nextInt();
		
		if (guess == number)
			System.out.println("yes, the number is " + number);
		else if (guess > number)
			System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");
		// end loop
		
		
		input.close();
	}

}
