package Ex32_ArraysInMethods;

public class ArraysInMethods {

	public static void main(String[] args) {
		int something[]={3,4,5,6,7};
		change(something);
		
		for(int y:something)
			System.out.println(y);
	}
	
	public static void change (int x[]){
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
	}

}
