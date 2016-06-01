package Ex79_CreatingFiles;
import java.util.*;

public class CreatingFiles {
	public static void main(String[] args){
		
		final Formatter x;
		
		try{
			x = new Formatter("fred.txt");
			System.out.println("you created a file");
		}
		catch(Exception e){
			System.out.println("you go an error");
		}
		
	}

}
