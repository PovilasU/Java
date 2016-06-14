package Chapter2;
import java.util.Scanner;
public class Ex2_05_CalculateTips {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double total = subtotal + (subtotal * gratuityRate) / 100;
		System.out.println("The graduity is $" + (subtotal * gratuityRate) / 100 + " and total is $" + total );
		
	}

}
