package Chapter3;
import java.util.*;

public class Ex3_27_GeometryPointsInTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 // The equation for the line is : y=-x/2 +100
		 // The range for x is: 0 ≤ x ≤ 100
		 // The range for y is: 0 ≤ y ≤ 200
		
		System.out.print("Enter a point's x- and y-coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double y2 = -x / 2 + 100;
		String s = "";
		
		// check if y and x is in range and under the line
		
		if (y < 0 || y > 200 || x < 0 || x < 100 || y > y2){
			s = " not ";
		}
		System.out.print("The point is " + s + "in the triangle");
		input.close();
	}
}
