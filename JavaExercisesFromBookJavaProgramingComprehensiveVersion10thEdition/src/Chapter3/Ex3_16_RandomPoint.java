package Chapter3;

public class Ex3_16_RandomPoint {

	public static void main(String[] args) {
		int x = (int) (System.currentTimeMillis() % 101) ;		
		int y = (int)(Math.random() * 201);
		System.out.println("x: " + x + ", y: " + y );

	}

}
