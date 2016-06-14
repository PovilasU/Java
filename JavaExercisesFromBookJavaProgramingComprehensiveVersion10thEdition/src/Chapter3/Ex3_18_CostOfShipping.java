package Chapter3;
import java.util.Scanner;

public class Ex3_18_CostOfShipping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight: ");
		double weight = input.nextDouble();
		
		
		if (weight <= 1){
			System.out.println("Cost of shipping is 3.5 dollars");
		}
		else if (weight <= 3){
			System.out.println("Cost of shipping is: " + weight * 5.5);
		}
		else if (weight <= 10){
			System.out.println("Cost of shipping is: " + weight * 8.5);
		}
		else if (weight <= 20){
			System.out.println("Cost of shipping is: " + weight * 10.5);
		}
		else if (weight < 50){
			System.out.println("Cost of shipping is: " + weight * 11.5);
		}
		else{
			System.out.println("This package can not be shipped");
		}
			
		
		
		input.close();
		

	}

}
