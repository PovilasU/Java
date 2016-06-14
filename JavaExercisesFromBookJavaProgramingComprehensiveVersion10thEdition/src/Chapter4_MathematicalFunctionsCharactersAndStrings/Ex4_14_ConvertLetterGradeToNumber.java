package Chapter4_MathematicalFunctionsCharactersAndStrings;
import java.util.*;

public class Ex4_14_ConvertLetterGradeToNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade A, B, C, D or F : ");
		char grade = input.nextLine().charAt(0);
		
		if(grade == 'A' || grade == 'a')
		{
			System.out.print("The numeric value for " + grade + " is 4 ");
		}
		else if(grade == 'B')  // else if stops otherwise it will check all cases
		{
			System.out.print("The numeric value for " + grade + " is 3");
		}
		else if(grade == 'C')
		{
			System.out.print("The numeric value for " + grade + " is 2");
		}
		else if(grade == 'D')
		{
			System.out.print("The numeric value for " + grade + " is 1");
		}
		else if(grade == 'F')
		{
			System.out.print("The numeric value for " + grade + " is 0");
		}
		else
		{
			System.out.print(grade + " is not a valid grade!");
		}
		
		
		input.close();
	}

}
