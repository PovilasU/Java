package Chapter4_MathematicalFunctionsCharactersAndStrings;
import java.util.Scanner;

public class Ex4_09_UnicodeOfCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		int mychar = input.next().charAt(0);
		int unicode = mychar;
		System.out.println("The unicoed of " + mychar + " is " + unicode );				
		input.close();
	}
}
