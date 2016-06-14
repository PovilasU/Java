package Chapter3;


import java.util.Scanner;

public class Ex3_23_GeometrypointInRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double  x2, y2; 		
		System.out.print("Enter a point with two coordinates: ");		
		x2 = input.nextDouble();
		y2 = input.nextDouble();
				
		if (Math.abs(y2) <= 10 / 2 && Math.abs(x2) <= 5.0 / 2){
			System.out.println("Point " + "(" + x2 + ", " + y2 + ") " + "is in the rectangle" );
		}
		else{
			System.out.println("Point " + "(" + x2 + ", " + y2 + ") " + "is not in the rectangle");
		}
		
		
		input.close();

	}

}
