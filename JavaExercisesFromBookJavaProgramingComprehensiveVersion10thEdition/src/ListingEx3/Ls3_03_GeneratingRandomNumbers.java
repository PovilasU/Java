package ListingEx3;
import java.util.Scanner;

public class Ls3_03_GeneratingRandomNumbers {

	public static void main(String[] args) {
		// 1. Generate two random single-digi integers
		int number1 = (int)(Math.random ()* 10);
		int number2 = (int)(Math.random() * 10);
		
		// 2. If number1< number2, swap number1 with numbe2
		if (number1 < number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// 3. Promt the student to answer "What is number1 - number2"
		System.out.print
		("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// 4. Grade the answer and display the result
		if (number1 - number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("You answer is wrong.");
			System.out.println(number1 + " - " + number2 
					+ " should be " + (number1 - number2));
		}
		

	}

}
