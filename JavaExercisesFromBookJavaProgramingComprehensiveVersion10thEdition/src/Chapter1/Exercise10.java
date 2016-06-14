package Chapter1;

public class Exercise10 {
	public static void main (String[] args){
		double distanceInKm = 14.0;
		double totalTime = 45.5 / 60; // hours		
		double distanceInMiles = distanceInKm / 1.6;
		double averageSpeed = (distanceInMiles / totalTime) ;
			System.out.println("Runner who ran 14 km in 45 min and 30 seconds,"
					+ "  average speed  is "
					+ averageSpeed + " miles per hour.");
	}

}
