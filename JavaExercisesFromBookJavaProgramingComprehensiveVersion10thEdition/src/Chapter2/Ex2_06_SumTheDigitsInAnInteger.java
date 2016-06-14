package Chapter2;
import java.util.Scanner;

public class Ex2_06_SumTheDigitsInAnInteger {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number betwen 0 and 1000 ");
	int number = input.nextInt();	
	int hundreds = number / 100;
	int remainingnumber1 = number % 100;
	int tenths = remainingnumber1 / 10;
	int ones = remainingnumber1 % 10;
	int sum = hundreds + tenths + ones;
	if (number > 0 && number < 1000){
	System.out.println("The sum if thedigits is " + sum );
	
	}else{
		System.out.println("You enter incorect number " );
		}
	
	}
}
