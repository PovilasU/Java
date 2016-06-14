package Chapter3;
import java.util.Scanner;

public class Ex3_05_FindFutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day, daysAfter, futureDay ;		
		System.out.print("Enter today's day "
				+ "(Sunday is 0, Monday is 1, …, and Saturday is 6): ");
		day = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");	
				
		daysAfter = input.nextInt();	
		futureDay = (int) ((day + daysAfter) % 7) ;
		
		
		if(futureDay == 0){
			System.out.println("Sunday");
			
		}
		else if (futureDay == 1){
			System.out.println("Monday");
			
		}
		else if (futureDay == 2){
			System.out.println("Tuesday");
			
		}
		else if (futureDay == 3){
			System.out.println("Wednesday");
			
		}
		else if (futureDay == 4){
			System.out.println("Thursday");
			
		}
		else if (futureDay == 5){
			System.out.println("Friday");
			
		}
		else  {
			System.out.println("Saturday");
		}
		input.close();

	}

}
