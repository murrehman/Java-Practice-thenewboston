package GenericData;


//Generic method removes methods overloading for different data types
import java.util.*;

public class Apples {
	public static void main(String[] args) {
		System.out.println(max(23,102,1));
		
		//COMPARING STRING ONLY COMPARE FIRST LETTER
		System.out.println(max("azzzz","za","as"));
	}
	
	//generic method
	public static <T extends Comparable<T>> T max (T a, T b, T c) {
		T m=a;
		
		if(b.compareTo(a) > 0)
			m=b;
		if(c.compareTo(m)>0)
			m=c;
		
		return m;
	
	}
	
	
}

