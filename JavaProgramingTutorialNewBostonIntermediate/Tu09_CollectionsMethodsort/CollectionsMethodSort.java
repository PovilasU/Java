package Tu09_CollectionsMethodsort;
import java.util.*;

public class CollectionsMethodSort {

	public static void main(String[] args) {
		
		String[] something = {"apples", "lemons", "geese", "bacon", "youtube"};
		List<String> l1 = Arrays.asList(something);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.printf("%s\n", l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s\n", l1);

	}

}
