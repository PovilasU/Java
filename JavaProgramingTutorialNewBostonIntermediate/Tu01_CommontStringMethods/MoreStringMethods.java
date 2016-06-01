package Tu01_CommontStringMethods;

public class MoreStringMethods {

	public static void main(String[] args) {
		String s = "buckyrobertsbuckyroberts";
		
		System.out.println(s.indexOf('k',5));
		
		String a = "Bacon ";
		String b = "monster";
		String c = "  apple  ";
		
		System.out.println(a + b);
		System.out.println(a.concat(b));
		System.out.println(a.replace('B','F'));
		System.out.println(b.toUpperCase());
		System.out.println(c.trim());

	}

}
