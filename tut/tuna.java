package tut;

public class tuna {
	private String girlName;
	public void setName(String name) {
		girlName=name;
		//System.out.println("Hello "+ name);
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("gf name was %s", getName());
	}

}
