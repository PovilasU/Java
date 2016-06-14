package Chapter3;
import java.util.Scanner;

public class Ex3_24_GamePickCard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("pick up one the card between 1 - 52 ");
		int number = input.nextInt() +  (int)(Math.random()* 100);
		int rank = number % 13 + 1;
		int suit = number % 4 + 1;

	
	if(rank == 1)
	{
		System.out.print("Ace");
	}
	if(rank == 2)
	{
		System.out.print("2");
	}
	if(rank == 3)
	{
		System.out.print("3");
	}
	if(rank == 4)
	{
		System.out.print("4");
	}
	if(rank == 5)
	{
		System.out.print("5");
	}
	if(rank == 6)
	{
		System.out.print("6");
	}
	if(rank == 7)
	{
		System.out.print("7");
	}
	if(rank == 8)
	{
		System.out.print("8");
	}
	if(rank == 9)
	{
		System.out.print("9");
	}
	if(rank == 10)
	{
		System.out.print("10");
	}
	if(rank == 11)
	{
		System.out.print("jack");
	}
	if(rank == 12)
	{
		System.out.print("queen");
	}
	if(rank == 13)
	{
		System.out.print("king");
	}

	if(suit == 1)
	{
		System.out.print(" of clubs");
	}
	if(suit ==2)
	{
		System.out.print(" of diamond");
	}
	if(suit == 3)
	{
		System.out.print(" of heart");
	}
	if(suit == 4)
	{
		System.out.print(" of spaces");
	}
		

	input.close();
		  
		

	}
}
