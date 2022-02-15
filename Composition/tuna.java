package Composition;

public class tuna {
	private String name;
	private potpie bdy;
	
	public tuna(String theName, potpie theDate) {
		name=theName;
		bdy=theDate;
	}
	
	public String toString() {
		return String.format("my name is %s, my bday is %s", name, bdy);  
	}

}
