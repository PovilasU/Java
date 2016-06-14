package Chapter2;
import java.util.Scanner;

public class Ex2_13_FinancialApplicationCompoundValue {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the monthly saving amount: ");
		double monthlygAmount = input.nextDouble();
		double monthlyInteresrRate = 0.05 / 12;
		double AfterFirstMonth = monthlygAmount * (1 + monthlyInteresrRate); 
		double AfterSecondMonth = (monthlygAmount + AfterFirstMonth) * (1 + monthlyInteresrRate); 
		double AfterThirddMonth = (monthlygAmount + AfterSecondMonth) * (1 + monthlyInteresrRate); 
		double AfterFourthMonth = (monthlygAmount + AfterThirddMonth) * (1 + monthlyInteresrRate); 
		double AfterFifthMonth = (monthlygAmount + AfterFourthMonth) * (1 + monthlyInteresrRate); 
		double AfterSixthMonth = (monthlygAmount + AfterFifthMonth) * (1 + monthlyInteresrRate); 
	
			 System.out.print("After the sixth month, the account value is $ " + AfterSixthMonth);
			
		}
		
		
		
	}


