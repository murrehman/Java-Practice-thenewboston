package tut;

// Multiple METHODS AND CLASSES


import java.util.Scanner;
public class Apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject= new tuna();
		System.out.println("Enter name:");
		String nam = input.nextLine();
		tunaObject.setName(nam);
		tunaObject.saying();
		input.close();
	}

}
