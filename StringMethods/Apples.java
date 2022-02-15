package StringMethods;



public class Apples {
	public static void main(String[] args) {
		
		String[] words = {"funk", "chunk","furry","baconator"};
		
		for(String w : words) {
			if(w.startsWith("fu"))
				System.out.println(w+ " starts with fu");
		}
		
		for(String w : words) {
			if(w.endsWith("nk"))
				System.out.println(w+ " ends with nk");
	}
	}
}
