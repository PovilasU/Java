package Ex28_CreatingArrayTable;

public class CreatingArrayTable {
	// "\t"  gives  a bunch of spaces in between

	public static void main(String[] args) {
		System.out.println("index\tValue");
		int marathoner[]={32,12,18,54,2};
		
		
		for(int counter=0;counter<marathoner.length;counter++){
			System.out.println(counter + "\t" + marathoner[counter]);
		}

	}

}
