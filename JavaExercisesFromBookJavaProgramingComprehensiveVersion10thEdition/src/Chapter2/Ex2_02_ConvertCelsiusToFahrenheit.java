package Chapter2;
import java.util.Scanner;

public class Ex2_02_ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double area, length, volume, radius, PI;
		PI = 3.14;
		System.out.println("Please enter cylinter radius ");
		radius = input.nextDouble();
		System.out.println("Please enter cylinter length ");
		length = input.nextDouble();
		area = radius * radius * PI;
		volume = area * length;
		System.out.println("Cylinder area is " + area +
				  " Cylinder volume is " + volume  );
		
		

	}

}
