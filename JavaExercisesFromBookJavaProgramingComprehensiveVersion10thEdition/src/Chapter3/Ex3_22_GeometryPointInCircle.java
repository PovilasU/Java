package Chapter3;
import java.util.Scanner;

public class Ex3_22_GeometryPointInCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2,  distance;		
		System.out.print("Enter a point with two coordinates: ");		
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		x1 = 0;
		y1 = 0;
		distance = Math.pow(((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))), 0.5);
		if (distance <= 10){
			System.out.println("Point " + "(" + x2 + ", " + y2 + ") " + "is in the circle" );
		}
		else{
			System.out.println("Point " + "(" + x2 + ", " + y2 + ") " + "is not in the circle");
		}
		
		
		input.close();

	}

}
