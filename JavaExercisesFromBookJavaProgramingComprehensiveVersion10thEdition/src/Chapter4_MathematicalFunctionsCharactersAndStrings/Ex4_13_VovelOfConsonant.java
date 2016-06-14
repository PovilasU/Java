package Chapter4_MathematicalFunctionsCharactersAndStrings;
import java.util.Scanner;



public class Ex4_13_VovelOfConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Vowel -> a e i o u
		//Consonant - > Everything else but vowels
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		
		//Checking every single letter
		if (letter == 'a' || letter == 'A' ||
				letter == 'e' || letter == 'E' ||	
				letter == 'i' || letter == 'I' ||	
				letter == 'o' || letter == 'O' ||
				letter == 'u' || letter == 'U' )
		{
			System.out.print(letter + " is a vowel!");
		}
		else if (Character.isLetter(letter)) {
			System.out.print(letter + " is consonant!");
		}
		else {
			System.out.print(letter + " is not a letter");
		}
		
		input.close();
	}

}
