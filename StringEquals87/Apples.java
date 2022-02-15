package StringEquals87;



public class Apples {
	public static void main(String[] args) {
		
		String a = "apples";
		String b = "bucky";
		String c = "BUCKY";
		System.out.println(a.length());
		
		if(a.equals("apples")) {
			System.out.println("it equals");
		}
		
		if(b.equalsIgnoreCase(c)) {
			System.out.println("bucky matches");
		}
		
		//System.out.println();
		
		}
}
