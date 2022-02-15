    package Polymorphism;



public class Apples {
	public static void main(String[] args) {
		food bcky[]=new food[2];
		bcky[0]=new potpie();
		bcky[1]=new tuna();
		
		for(int x=0;x<2;x++) {
			bcky[x].eat();
		}
	}
}
