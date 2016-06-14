package Chapter3;
import java.util.Scanner;

public class Ex3_08_SortThreeIntegers
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a < b && a < c ){
			System.out.println(a);
		
		if (b < c){
			System.out.println(b);
			System.out.println(c);
		}
		else {
			System.out.println(c);
			System.out.println(b);
			}
	}
		
		
		
		else if (b < a && b < c){
			System.out.println(b);		
		
		if (a < c){
			System.out.println(a);
			System.out.println(c);
		}
		else{
			System.out.println(c);
			System.out.println(a);
		}
	
	}
		
		
		else {
			System.out.print(c);
			if (a < b){
				System.out.println(a);
				System.out.println(b);
			}
			else {
				System.out.println(b);
				System.out.println(a);
			}
		}
		input.close();
	}
}


