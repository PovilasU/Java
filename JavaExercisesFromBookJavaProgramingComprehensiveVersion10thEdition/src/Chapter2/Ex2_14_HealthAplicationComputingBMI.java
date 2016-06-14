package Chapter2;
import java.util.Scanner;

public class Ex2_14_HealthAplicationComputingBMI {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		double BMI = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
		System.out.println("BMI is " + BMI);
		
			
	}

}
