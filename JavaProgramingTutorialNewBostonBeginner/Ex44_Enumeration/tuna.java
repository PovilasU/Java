package Ex44_Enumeration;

public enum tuna {
	puzy("chalenging", "32"),
	natasha("easy", "30"),
	britney("goodstart", "31");
	
	private final String desc;
	private final String year;
	
	tuna(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}

}
