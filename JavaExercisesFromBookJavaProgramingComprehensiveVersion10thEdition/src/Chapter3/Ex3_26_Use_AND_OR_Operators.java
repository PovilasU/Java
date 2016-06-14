package Chapter3;
import java.util.*;
public class Ex3_26_Use_AND_OR_Operators {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("enter an integer: ");
		int integer = input.nextInt();		
		if(integer % 5 == 0 && integer % 6 == 0){
			System.out.println("Is" + integer + " " + "divisible by 5 and 6? true");
		}
		else {
			System.out.println("Is" + integer + " " + "divisible by 5 and 6?  false");
		}
		if(integer % 5 == 0 || integer % 6 == 0){
			System.out.println("Is" + integer + " " + "divisible by 5 or 6? true");
		}
		else {
			System.out.println("Is" + integer + " " + "divisible by 5 or 6? false");
		}
		if(integer % 5 == 0 ^ integer % 6 == 0){
			System.out.println("Is" + integer + " " + "divisible by 5 or 6 but not both? true");
		}
		else {
			System.out.println("Is" + integer + " " + "divisible by 5 or 6? false");
		}
			
		input.close();		
	}
}
