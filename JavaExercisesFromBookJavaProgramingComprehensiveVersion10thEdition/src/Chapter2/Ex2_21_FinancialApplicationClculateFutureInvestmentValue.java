package Chapter2;
import java.util.Scanner;

public class Ex2_21_FinancialApplicationClculateFutureInvestmentValue {
public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	System.out.print("Enter investment amount: ");
	double investmentAmount = input.nextDouble();
	System.out.print("Enter annual interest rate in percentage: ");	
	double monthlyInterestRate = input.nextDouble();
	 monthlyInterestRate = monthlyInterestRate / 12;
	System.out.print("Enter number of years: ");
	double numberOfYears = input.nextDouble();
	
	double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate / 100),
			(12 * numberOfYears)); 
	
	System.out.print("Accumulated value is " + futureInvestmentValue);
 	}
}
