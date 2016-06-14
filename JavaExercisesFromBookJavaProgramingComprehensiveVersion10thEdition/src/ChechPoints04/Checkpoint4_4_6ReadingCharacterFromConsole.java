package ChechPoints04;
import java.util.*;
public class Checkpoint4_4_6ReadingCharacterFromConsole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		
		String s4 ="000";
		String s5 ="100";
		System.out.println(s4.equals(s5)); //
		

	}

}
