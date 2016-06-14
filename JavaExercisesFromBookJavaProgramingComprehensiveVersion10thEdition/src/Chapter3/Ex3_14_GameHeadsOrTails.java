package Chapter3;
import java.util.Scanner;

public class Ex3_14_GameHeadsOrTails {

	public static void main(String[] args) {
		
		int number = (int)(System.currentTimeMillis() % 2);
		System.out.print("Enter a guess heads or tails 0 or 1 ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		if (guess ==0 && number == 0){
			System.out.println("it is heads you win :(");				
			}
		else if (guess ==0 && number == 1){
			System.out.println("it is tails you lost!!");				
			}
		else if (guess ==1 && number == 1){
			System.out.println("it is tails you win :(");				
			}
		else if (guess ==1 && number == 0){
			System.out.println("it is heads you lost !!:)");				
			}
		input.close();
		}
	
		
	}


