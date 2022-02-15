package tut1;

public class tuna {
	private String girlName;
	//public void setName(String name) {
	public tuna(String name) {
		girlName=name;
	}
		
		//System.out.println("Hello "+ name);
	//}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("gf name was %s\n", getName());
	}

}
