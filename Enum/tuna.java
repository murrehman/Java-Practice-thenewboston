package Enum;

public enum tuna {
	bucky("nice","22"),
	kelsy("cutie","10"),
	julia("mistake","12");
	
	private final String desc;
	private final String year;
	
	tuna(String des, String bdy){
		desc=des;
		year=bdy;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}

}
