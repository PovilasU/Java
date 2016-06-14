package Chapter4_MathematicalFunctionsCharactersAndStrings;
import java.util.*;

public class Ex4_15_PhoneKeyPads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		if (letter == 'a' || letter == 'A' || letter == 'b' || letter == 'B' || letter == 'c' || letter == 'C'){
			System.out.print("the cirresponding number is 2");
		}
		else if (letter == 'd' || letter == 'D' || letter == 'e' || letter == 'E' || letter == 'f' || letter == 'F'){
			System.out.print("the cirresponding number is 3");
		}
		else if (letter == 'g' || letter == 'G' || letter == 'h' || letter == 'H' || letter == 'i' || letter == 'I'){
			System.out.print("the cirresponding number is 4");
		}
		else if (letter == 'j' || letter == 'J' || letter == 'k' || letter == 'K' || letter == 'l' || letter == 'L'){
			System.out.print("the cirresponding number is 5");
		}
		else if (letter == 'm' || letter == 'M' || letter == 'n' || letter == 'N' || letter == 'o' || letter == 'O'){
			System.out.print("the cirresponding number is 6");
		}
		else if (letter == 'p' || letter == 'P' || letter == 'q' || letter == 'Q' || letter == 'r' || letter == 'R' || letter == 's' || letter == 'S'){
			System.out.print("the cirresponding number is 7");
		}
		else if (letter == 't' || letter == 'T' || letter == 'u' || letter == 'U' || letter == 'v' || letter == 'V'){
			System.out.print("the cirresponding number is 8");
		}
		else if (letter == 'w' || letter == 'W' || letter == 'x' || letter == 'X' || letter == 'y' || letter == 'Y' || letter == 'z' || letter == 'Z'){
			System.out.print("the cirresponding number is 9");
		}
		else if (letter == ' '  ){
			System.out.print("the cirresponding number is  space ");
		}
		else {
			System.out.print(letter + " is invalid input");
		}
		
		
		
		input.close();
		

	}
}
