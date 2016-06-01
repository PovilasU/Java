package Ex21_SimpleAveragingProgram;
import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < 5){
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/5;
		System.out.println("Your average is " + average);
	}

}
