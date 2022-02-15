package StringStartswith;



public class Apples {
	public static void main(String[] args) {
		
		String a = "baconbacon ";
		String b = " monster";
		
		//to get location of alphabet
		System.out.println(a.indexOf('c'));
		
		//to search alphabet location of some index
		System.out.println(a.indexOf('c',5));
		
		//to search index of word
		System.out.println(a.indexOf("on", 5));
		
		//to combine 2 strings
		System.out.println(a+b);
		
		//to combine 2 strings
		System.out.println(a.concat(b));
		
		//to replace any string character
		System.out.println(a.replace("b","f"));
		
		//to convert string to uppercase
		System.out.println(b.toUpperCase());
		
		//to remove spaces in word
		System.out.println(b.trim());
	
	}
	
}
