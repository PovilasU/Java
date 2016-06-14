package Chapter3;

import java.util.Scanner;

public class Ex3_20_ScienceWindChillTemperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		
		double temperature = input.nextDouble();
		
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		double chillIndex = 35.74 + 0.6215 * temperature 
				- 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		
		if(temperature >= -58 && temperature <= 41 && windSpeed >= 2){
			System.out.println("The in puts are valid and " + "The wind chill index is  " + (chillIndex * 100.0)/100);
			System.out.printf("%4.2f",chillIndex );
		}
		
		
		else
		System.out.println("invalid output");
		input.close();

	}

}
