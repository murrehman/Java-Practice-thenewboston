package FileClass;

import java.io.File;

public class Apples {
	public static void main(String[] args) {
	    
		File x=new File("C:\\test\\asdasd.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " exist!");
		else
			System.out.println("does not exist");
		
	}
}
