package Composition;



public class Apples {
	public static void main(String[] args) {
		potpie potObject=new potpie(4,5,6);
		tuna tunaObject=new tuna("bucky",potObject);
		
		System.out.println(tunaObject);
	}
}
