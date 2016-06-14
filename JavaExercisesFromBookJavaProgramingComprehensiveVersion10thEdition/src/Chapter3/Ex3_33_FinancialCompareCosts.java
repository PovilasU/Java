package Chapter3;
import java.util.*;

public class Ex3_33_FinancialCompareCosts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double w1, w2, p1, p2;
		System.out.print("Enter weight and price for package 1: ");
		w1 = input.nextDouble();
		p1 = input.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		w2 = input.nextDouble();
		p2 = input.nextDouble();
		
		if((p1 / w1) < (p2 / w2)){
			System.out.print("Package 1 has a better price.");
		}
		else if ((p2 / w2) < (p1 / w1)) {
			System.out.print("Package 2 has a better price.");
		}
		else if ((p2 / w2) == (p1 / w1)){
			System.out.print("Two packages have the same price.");
		}
					
		input.close();
	
	}
}
