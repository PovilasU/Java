package Ex26_RandomNumberGenerator;
import java.util.Random;

public class apples {

	public static void main(String[] args) {
		// random number generator
		Random dice = new Random();
		int number;
		
		for(int counter=1; counter<=10;counter++){
			number = 1 + dice.nextInt(6);
			System.out.println(number + " ");
		}
		

	}

}
