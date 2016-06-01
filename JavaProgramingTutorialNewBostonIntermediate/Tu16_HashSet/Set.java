package Tu16_HashSet;

import java.util.*;


public class Set {

	public static void main(String[] args) {
		// It takes collection as a list  and it finds duplicate elements it removes them.
		
        String[] things = { "appple", "bob", "ham", "bob", "bacon" };
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        java.util.Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
	}

}
