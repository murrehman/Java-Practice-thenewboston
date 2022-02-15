package FileCreate;

import java.util.*;

public class Apples {
	public static void main(String[] args) {
		
		final Formatter x;
		
		try {
			x=new Formatter("C:/test/fred.txt");
			System.out.println("File Created");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	    
		
	}
}
