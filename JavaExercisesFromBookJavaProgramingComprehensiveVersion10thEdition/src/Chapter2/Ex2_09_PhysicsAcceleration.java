package Chapter2;
import java.util.Scanner;

public class Ex2_09_PhysicsAcceleration {
public static void main (String[] args){
	Scanner input  = new Scanner (System.in);
	System.out.println("Enter v0 in meters/second" +
	" , v1 in meters/second , and t  in secods: ");
	double v0 = input.nextDouble();	
	double v1 = input.nextDouble();
	double t = input.nextDouble();
	double a = (v1 - v0) / t;
	System.out.println("The average acceleraton is  " +
	a );	
	
	}
}
