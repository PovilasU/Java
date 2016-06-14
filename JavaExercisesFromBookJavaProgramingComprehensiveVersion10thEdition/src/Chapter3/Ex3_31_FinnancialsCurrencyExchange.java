package Chapter3;
import java.util.*;

public class Ex3_31_FinnancialsCurrencyExchange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double rate, dollars, yuan;
		int choose;
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
		choose = input.nextInt();
		if(choose < 0 || choose > 1){
			System.out.println("incorect input");
		}
		else if (choose == 0){
			System.out.print("Enter the exchange rate from dollars to RMB: ");
			rate = input.nextDouble();
			System.out.print("enter the dollars amount: ");
			dollars = input.nextDouble();
			System.out.print(dollars + "$ is ");			 
			System.out.printf("%4.2f",(dollars * rate));
			System.out.print(" yuans.");		
		}
		else if (choose == 1){
			System.out.print("Enter the exchange rate from dollars to RMB: ");
			rate = input.nextDouble();
			System.out.print("enter the yuan amount: ");
			yuan = input.nextDouble();
			System.out.print (yuan + " yuans is " ); 
			System.out.printf("%4.2f",(yuan / rate));
			System.out.print(" dollars.");
		}
	
		


		input.close();
	}
}
