package Chapter3;
import java.util.Scanner;
public class Ex3_19_ComputePerimeterOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter triangle edges a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double per = a + b + c;
		
		if (a + b > c || b + c > a || c + a > b) {
			System.out.println( "input is valid and triangle perimeter is: " + per);
			
		}
		else {
			System.out.println("triangle edges are not valid");
		}
		
		
		input.close();

	}

}
