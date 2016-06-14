package Chapter1;

public class Exercise11 {
	public static void main (String[] args){
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
		
		System.out.println("Population after 1 year " + populationAfterOneYear);
		System.out.println("Population after 2 years " + populationAfterTwoYears);
		System.out.println("Population after 3 years " + populationAfterThreeYears);
		System.out.println("Population after 4 years " + populationAfterFourYears);
		System.out.println("Population after 5 years " + populationAfterFiveYears);
		
	}

}
