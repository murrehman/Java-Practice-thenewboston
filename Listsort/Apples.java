package Listsort;

import java.util.*;

public class Apples {
	public static void main(String[] args) {
	String[] stuff = {"eggs","lasers","hats","pie","apples","bacon","goats"};
	List<String> l1 = Arrays.asList(stuff);
	
	
	Collections.sort(l1);
	System.out.printf("%s\n", l1);
	
	Collections.sort(l1, Collections.reverseOrder());
	System.out.printf("%s", l1);
	
	}
}

