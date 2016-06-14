package Chapter4_MathematicalFunctionsCharactersAndStrings;
import java.util.*;

public class Ex4_08_FindCharackterASCIICode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter and integer betwen 0 and 127: ");
		int number = input.nextInt();
		char ascii  = (char) number;		
		System.out.println("The ASCII of " + number + " is " + ascii );				
		input.close();

	}

}
