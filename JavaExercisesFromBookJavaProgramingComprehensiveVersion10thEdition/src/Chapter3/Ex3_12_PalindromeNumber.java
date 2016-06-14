package Chapter3;
import java.util.Scanner;

public class Ex3_12_PalindromeNumber {

	public static void main(String[] args) {
		int a, b, c, num;
		System.out.print("Enter a three-digit integer: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		//b = input.nextInt();
		//c = input.nextInt();
		
		 a = num / 100;
		 b = num / 10 % 10;
		 c = num % 10;
		 if(a == c){
			 System.out.println(a + "" + b + "" + c + " is a palindrome");
		 }
		 else {
			 System.out.println(a + "" + b + "" + c + " is not palindrome");
		 }		
		
		 input.close();
	}

}
