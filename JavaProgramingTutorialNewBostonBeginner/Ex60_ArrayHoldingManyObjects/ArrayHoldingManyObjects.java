package Ex60_ArrayHoldingManyObjects;

public class ArrayHoldingManyObjects {

	public static void main(String[] args) {
		
		AnimalList ALO = new AnimalList();
		Dog d = new Dog();
		Fish f = new Fish();
		ALO.add(d);
		ALO.add(f);
	}

}
