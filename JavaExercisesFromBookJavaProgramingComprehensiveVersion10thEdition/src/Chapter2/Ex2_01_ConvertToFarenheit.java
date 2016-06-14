package Chapter2;
import java.util.Scanner; // thats allows us input stuff into computer

public class Ex2_01_ConvertToFarenheit {
	public static void main (String[] args){
		// covert Celsius to Fahrenheit
		Scanner povilas = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		System.out.println("Enter degrees in Celsius ");
		celsius = povilas.nextDouble();		
		fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + "  Celsius  is " + fahrenheit + " Fahrenheit.");
	}
}
