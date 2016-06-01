package Ex15_UseMethodsWithParameters;
import java.util.Scanner; //thats how java allows us input stuff into computer

public class UseMethodsWithParameters15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // this just allows use the scanner
		tuna tunaObject = new tuna (); //inportet object , without an object we can not se anything in tuna class
		
		System.out.println("Enter your name here: ");
		// any time you want input string use input.nextLine(); method
		// anything that user enters will be stored in the variable name 
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
		
	}

}
