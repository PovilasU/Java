package Ex44_Enumeration;

public class Enumeration {

	public static void main(String[] args) {
		// enumerations kind like a classes we will use like constants
		for(tuna people: tuna.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

	}

}
