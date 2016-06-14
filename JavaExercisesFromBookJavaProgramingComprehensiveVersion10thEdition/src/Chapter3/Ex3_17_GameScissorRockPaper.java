package Chapter3;
import java.util.Scanner;
import java.util.Random;

public class Ex3_17_GameScissorRockPaper {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int randomnumber = rand.nextInt(3);
		System.out.print("scissor (0), rock (1), paper (2):");
		int guess = input.nextInt();
		
		// 0 - Scissor
		// 1 - Rock
		// 2 - paper
		// 0 - > 2 (0 + 2 == 2)
		// 1 - > 0 (0 + 1 == 1)
		// 2 -> 1  (1 + 1 == 2)
		
		if((randomnumber + 2) == guess || (randomnumber == (guess + 1) )){
			System.out.print(randomnumber + " beats " + guess + "\nYou Lose!");
		}
		// 0 < 1 ( 0 + 1 == 1)
		// 1 < 2 (1 + 1 == 2)
		//2 <- 0 (2 == 0 + 2)
		//You win
		else if ((randomnumber + 1) == guess || (randomnumber == (guess + 2) )){
			System.out.print(randomnumber + " loses to " + guess + "\nyou Win!");
		}
		else{
			System.out.print(randomnumber + " ties with " + guess + "\nIt's a draw!");
		}
		
			

		
		input.close();

	}

}
