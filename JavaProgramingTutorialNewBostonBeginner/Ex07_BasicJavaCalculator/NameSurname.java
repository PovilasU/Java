package Ex07_BasicJavaCalculator;
import java.util.Scanner;

class NameSurname {
	public static void main (String [] args){
		Scanner povilas = new Scanner(System.in);
		String name;
		String surname;
		String answer;
		System.out.println("Enter your name: ");
		name = povilas.nextLine();
		System.out.println("Enter your surname: ");
		surname = povilas.nextLine();
		answer = ("your name and surname is " + name + " " + surname );
		System.out.println(answer);
		
	}

}
