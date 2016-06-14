package Chapter3;
import java.util.Scanner;

public class Ex3_09_BusinessCheckIsbn {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer (no spaces): ");
		int num = input.nextInt();
		int d1 = num / 100000000;
		//System.out.println("d1: " + d1);
		int d2 = num / 10000000;
		//System.out.println("d2: " + d2);
		int d3 = num / 1000000 % 10;
		//System.out.println("d3: " + d3);
		int d4 = num / 100000 % 10;
		//System.out.println("d4: " + d4);

		int d5 = num / 10000 % 10;
		int d6 = num / 1000 % 10;
		int d7 = num / 100 % 10;
		int d8 = num / 10 % 10;
		int d9 = num % 10;
		
		String isbn = "" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9;
		int checksum = ( (d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + 
		(d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9) ) % 11;

if (checksum == 10){
	System.out.println("The ISBN-10 number is " + isbn + "X");
}
else{
	System.out.println("The ISBN-10 number is " + isbn + checksum);
}
		
		
		
		
		input.close();
		
		
	}


}
