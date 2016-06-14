package Chapter2;
import java.util.Scanner;

public class Ex2_03_ConvertFeetIntoMeters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double feet, meter, foot;
		foot = 0.305; // meter
		System.out.println("Enter a value for feel: ");
		feet = input.nextDouble();
		System.out.println(feet + " feet is " + feet * foot + " meters");
		

	}

}
