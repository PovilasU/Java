package Chapter2;
import java.util.Scanner;
public class Ex2_23_CostOfDriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double distance, miles, price, cost;
		System.out.print("Enter distance to drive,"
				+ " fuel efficiency of the car in miles per gallon,"
				+ " and he price per gallon: ");
		distance = input.nextDouble();
		miles = input.nextDouble();
		price = input.nextDouble();
		
		cost = (distance/miles) * price;
		
		System.out.println("The cost to drive " + distance + " miles is " + cost + ".");
		System.out.printf("The cost to drive $%.2f" , cost);
		
		input.close();

	}

}
