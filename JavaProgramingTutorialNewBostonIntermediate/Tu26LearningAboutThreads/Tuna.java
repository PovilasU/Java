package Tu26LearningAboutThreads;
import java.util.*;

//Runnable interface contains run() method
//Multiple Threads allows computer do multiple thins at once
public class Tuna implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public Tuna(String x){
		name = x;
		time = r.nextInt(999);
	}
	
	public void run(){
		try{
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is woke up\n", name);
		}catch(Exception e){}
	}
}
