package Tu03_Recursion;

public class Recursion {
// main
	public static void main(String[] args) {
		// recursion method that calls it self
		System.out.println(fact(5));

	}
	
	//fact
	public static long fact (long n){
		if(n <= 1)
			return 1;
		else
			return n * fact(n-1);
	}

}
