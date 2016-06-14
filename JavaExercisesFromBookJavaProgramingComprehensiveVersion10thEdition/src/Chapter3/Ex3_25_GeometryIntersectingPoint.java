package Chapter3;
import java.util.*;

public class Ex3_25_GeometryIntersectingPoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, x2 , x3, x4 , y1, y2 , y3, y4 ;
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4 , y4: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		
		  double a = y1 - y2;
		  double b = -(x1 - x2);
		  double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		  double c = (y3 - y4);
		  double d = -(x3 - x4);
		  double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		  if (a * d - b * c == 0) {
			   System.out.println("The two lines are parallel.");
			   System.exit(0);
			  }
			 
			  double x = (e * d - b * f) / (a * d - b * c);
			  double y = (a * f - e * c) / (a * d - b * c);
			 
			  System.out.print("The intersecting point is at (" + x + ", " + y + ")");
			  input.close();

	}
}
