package Ex45_EnumSetRange;

public enum tuna {
	hrenka("chalenging", "32"),
	natasha("easy", "30"),
	britney("goodstart", "31"),
	laluna("spanish", "20"),
	tania("ruska", "25"),
	moldavanka("smuglenka", "1944");
	
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
