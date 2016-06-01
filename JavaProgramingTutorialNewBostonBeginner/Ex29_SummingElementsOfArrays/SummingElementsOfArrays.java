package Ex29_SummingElementsOfArrays;

public class SummingElementsOfArrays {

	public static void main(String[] args) {
		// summing an elements in any array
		int something[]={21,16,21,84,4};
		int sum=0;
		
		for(int counter=0;counter<something.length;counter++){
			sum+=something[counter];
		}
		System.out.println("The some of these numbers is" + "\t"  + sum);
		

	}

}
