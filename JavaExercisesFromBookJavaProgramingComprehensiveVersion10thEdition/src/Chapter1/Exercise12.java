package Chapter1;

public class Exercise12 {
	public static void main (String[] args){
		double distance1 = 24.0; //miles
		double distance2 = distance1 * 1.6; // distance in km
		double totalTime = (60.0 + (40.0 + (35.0 /60))) / 60; // how many hours
		double averageSpeedInKm = distance2 / totalTime;
		System.out.println("Runner who ran 24 miles in 1 hour 40 min and 35 seconds,"
				+ "  average speed  is "
				+ averageSpeedInKm + " km per hour.");
	}

}
