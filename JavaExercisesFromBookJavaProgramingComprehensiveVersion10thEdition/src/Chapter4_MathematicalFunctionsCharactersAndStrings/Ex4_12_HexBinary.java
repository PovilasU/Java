package Chapter4_MathematicalFunctionsCharactersAndStrings;
import java.util.Scanner;

public class Ex4_12_HexBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			
		System.out.print("Enter a hex digit: ");
		//Hexidecimal -> 0 - 9, A - F
		String hex = input.nextLine();
		
		// B -> 66
		// B in Hexidecimal is 11 --> 8 + 0 + 2 + 1 --> 1011
		//String -- > First Char --> Convert into an integer --> Binary
		//w(0)o(1)r(2)d(3)
		
		
		char chex = hex.charAt(0);
		int ihex = (int) chex;
		if(chex == 'A'){
			ihex = 10;
		}
		if(chex == 'B'){
			ihex =11;
		}
		if(chex == 'C'){
			ihex = 12;
		}
		if(chex == 'D'){
			ihex =13;
		}
		if(chex == 'E'){
			ihex = 14;
		}
		if(chex == 'F'){
			ihex =16;
		}
		
		String shex = Integer.toBinaryString(ihex);
		
		System.out.print("The binary of " + hex + " is " + shex );
			
		input.close();
		
	}

}
