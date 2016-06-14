package Chapter2;
import java.util.Scanner;

public class Ex2_07_FindTheNumberOfYears {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int minutes;
	int days;
	int day = 60 * 24;
	int year = day * 365; // how many minutes in one year
	System.out.println("Enter the number of minutes: ");
	minutes  = input.nextInt();	
	days  = minutes / day;
	int years = minutes / year;	
	int remainingDays = days % 365;
	
	System.out.println( minutes + " minutes is approximately " 
	+ years + " years and " + remainingDays + " days");
	}

}
