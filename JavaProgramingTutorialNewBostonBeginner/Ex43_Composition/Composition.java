package Ex43_Composition;

public class Composition {

	public static void main(String[] args) {
		/*
		 *  composition means that class instead of just variables and methods
		 it can also have references to  other objects to other classes
		 */
		Potpie potObject = new Potpie(4,5,6);
		tuna tunaObject = new tuna("Povilas", potObject);
		
		System.out.println(tunaObject);

	}

}
