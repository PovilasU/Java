package Chapter2;
import java.util.Scanner;

public class Ex2_11_PopulationProjectionInt {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int numberOfYears = input.nextInt();
		
		int year = 365;
		int currentPopulation =  312032486;
		int birthsPerYear = (60 * 60 * 24 * 365) / 7;
		int deathsPerYear = (60 * 60 * 24 * 365) / 13;
		int immigrantsPerYear = (60 * 60 * 24 * 365) / 45;
		int populationAfterOneYear = currentPopulation + birthsPerYear - deathsPerYear + immigrantsPerYear;
		int populationAfterTwoYears = populationAfterOneYear + birthsPerYear - deathsPerYear + immigrantsPerYear;
		int populationAfterThreeYears = populationAfterTwoYears + birthsPerYear - deathsPerYear + immigrantsPerYear;
		int populationAfterFourYears = populationAfterThreeYears + birthsPerYear - deathsPerYear + immigrantsPerYear;
		int populationAfterFiveYears = populationAfterFourYears + birthsPerYear - deathsPerYear + immigrantsPerYear;
		int populationAfterXYears = currentPopulation + (birthsPerYear - deathsPerYear + immigrantsPerYear) * numberOfYears;
		
		System.out.println("The population in 5 years is: " + populationAfterXYears  );
		
		//System.out.println("Population after 1 year " + populationAfterOneYear);
		//System.out.println("Population after 2 years " + populationAfterTwoYears);
		//System.out.println("Population after 3 years " + populationAfterThreeYears);
		//System.out.println("Population after 4 years " + populationAfterFourYears);
		//System.out.println("Population after 5 years " + populationAfterFiveYears);
		
	}

}


