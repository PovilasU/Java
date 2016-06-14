package ChechPoints04;
public class CheckPointFrom4_8 {
	public static void main(String[] args) {

		System.out.println((int)'1');
		System.out.println((int)'A');
		System.out.println((int)'B');
		System.out.println((int)'a');
		System.out.println((int)'b');
		
		System.out.println((char)40);
		System.out.println((char)59);
		System.out.println((char)79);
		System.out.println((char)85);
		System.out.println((char)90);
		
		System.out.println((char)0X40);
		System.out.println((char)0X5A);
		System.out.println((char)0X71);
		System.out.println((char)0X72);
		System.out.println((char)0X7A);
		
		System.out.println("'\\' and '\"'");
		
		int i = '1';
		int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
		int k = 'a';
		char c = 90;
		
		System.out.println( i + " " + j + "  " + k + "  " + c+ " ----------");
		
		char x = 'a';
		char y = 'c';
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(x - y);
		
		System.out.println('a' < 'b');
		System.out.println('a' <= 'A');
		System.out.println('a' > 'b');
		System.out.println('a' >= 'A');
		System.out.println('a' == 'a');
		System.out.println('a' != 'b');

		
		

	}
}
