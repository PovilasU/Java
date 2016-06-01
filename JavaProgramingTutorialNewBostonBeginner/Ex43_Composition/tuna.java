package Ex43_Composition;

public class tuna {
	private String name;
	private Potpie birthday;
	
	public tuna(String theName, Potpie theDate){
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}

}
