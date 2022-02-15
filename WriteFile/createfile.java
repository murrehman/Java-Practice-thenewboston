package WriteFile;

import java.util.*;
import java.lang.*;
import java.io.*;

public class createfile {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x=new Formatter("C:/test/chinese.txt");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	public void addRecords() {
		x.format("%s%s%s", "20 ", "bucky ", "roberts");
	}
	public void closeFile() {
		x.close();
	}

}
