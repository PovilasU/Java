package Ex31_EnhancedForLoop;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int something[]={3,4,5,6,7};
		int total=0;
		
		for(int x: something){
			total+=x;
		}
		System.out.println(total);

	}

}
