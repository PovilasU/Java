package Chapter2;
import java.util.Scanner;

public class Ex2_04ConvertPoundsIntoKilograms {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double onePound = 0.454;
		System.out.println("Enter a number in pounds ");
		double pounds = input.nextDouble();
		System.out.println(pounds + " pounds is " + pounds * onePound + " kilograms");
				
	}

}
