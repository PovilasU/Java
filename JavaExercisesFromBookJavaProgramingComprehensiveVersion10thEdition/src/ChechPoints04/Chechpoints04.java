package ChechPoints04;

public class Chechpoints04 {

	public static void main(String[] args) {
		char letter = 'A';
		char numChar = '4';
		System.out.println(letter);
		System.out.println(numChar);
		char ch = 'a';
		System.out.println(++ch);
		System.out.println("He said \"Java is fun\"");
		
		
		int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
		System.out.println("i is " + i); // i is 101
		int j = 2 + 'a'; // (int)'a' is 97
		System.out.println("j is " + j); // j is 99
		System.out.println(j + " is the Unicode for character "
		+ (char)j); // 99 is the Unicode for character c
		System.out.println("Chapter " + '2');
		int o = '1';
		System.out.println(o);
		
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is an uppercase letter");
			else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is a lowercase letter");
			else if (ch >= '0' && ch <= '9')
			System.out.println(ch + " is a numeric character");
		
		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		System.out.println("isLowerCase('a') is "
		+ Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is "
		+ Character.isUpperCase('a'));
		System.out.println("toLowerCase('T') is "
		+ Character.toLowerCase('T'));
		System.out.println("toUpperCase('q') is "
		+ Character.toUpperCase('q'));
	
	}

}
