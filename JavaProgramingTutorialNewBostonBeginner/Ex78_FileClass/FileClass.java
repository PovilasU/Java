package Ex78_FileClass;
import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		
		File x = new File("C:\\test\\povilas.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " exist!");
		else
			System.out.println("This thing doesnt exist");
		
	}

}
