package Tu18_ImplementingGenericMethod;

public class implementingGenericMethod {

	public static void main(String[] args) {
		// how to create first generic method
		
		Integer[] iray = {1,2,3,4,5,6,7};
		Character[] cray = {'p', 'o', 'v', 'i', 'l', 'a', 's'};
		
		printMe(iray);
		printMe(cray);

	}
	//generic method
	public static <T> void printMe(T[] x){
		for(T b : x)
			System.out.printf("%s ", b);
		System.out.println();
	}

}
