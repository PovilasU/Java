package Chapter2;
import java.util.Scanner;

public class Ex2_11_PopulationProjection {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		double numberOfYears = input.nextDouble();
		
		double year = 365;
		double currentPopulation =  312032486;
		double birthsPerYear = (60.0 * 60.0 * 24.0 * 365.0) / 7;
		double deathsPerYear = (60.0 * 60.0 * 24.0 * 365.0) / 13;
		double immigrantsPerYear = (60.0 * 60.0 * 24.0 * 365.0) / 45;
		double populationAfterOneYear = currentPopulation + birthsPerYear - deathsPerYear + immigrantsPerYear;
		double populationAfterTwoYears = populationAfterOneYear + birthsPerYear - deathsPerYear + immigrantsPerYear;
		double populationAfterThreeYears = populationAfterTwoYears + birthsPerYear - deathsPerYear + immigrantsPerYear;
		double populationAfterFourYears = populationAfterThreeYears + birthsPerYear - deathsPerYear + immigrantsPerYear;
		double populationAfterFiveYears = populationAfterFourYears + birthsPerYear - deathsPerYear + immigrantsPerYear;
		double populationAfterXYears = currentPopulation + (birthsPerYear - deathsPerYear + immigrantsPerYear) * numberOfYears;
		
		System.out.println("The population in "  + numberOfYears +
				" years is: " + populationAfterXYears  );
		
		//System.out.println("Population after 1 year " + populationAfterOneYear);
		//System.out.println("Population after 2 years " + populationAfterTwoYears);
		//System.out.println("Population after 3 years " + populationAfterThreeYears);
		//System.out.println("Population after 4 years " + populationAfterFourYears);
		//System.out.println("Population after 5 years " + populationAfterFiveYears);
		
	}

}


