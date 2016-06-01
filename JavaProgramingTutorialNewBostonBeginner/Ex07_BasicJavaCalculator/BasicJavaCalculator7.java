package Ex07_BasicJavaCalculator;
import java.util.Scanner;

class BasicJavaCalculator7 {
	public static void main (String[] args){
		Scanner povilas = new Scanner(System.in);
		double firstnum, secondnum, answer;
		System.out.println("Enter first num; ");
		// since we inputing number we need use povilas.nextDouble() ,
		// if that would be a string we would use povilas.nextLine()
		firstnum = povilas.nextDouble();
		System.out.println("Enter second num; ");
		secondnum = povilas.nextDouble();
		answer = firstnum + secondnum;
		System.out.println(answer);
		
		
	}

}
