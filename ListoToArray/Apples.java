package ListoToArray;

import java.util.*;

public class Apples {
	public static void main(String[] args) {
	String[] stuff = {"eggs","lasers","hats","pie","apples","bacon","goats"};
	List<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
	
	
	thelist.add("punplin");
	((LinkedList<String>) thelist).addFirst("firsthing"); 
	
	
	stuff= thelist.toArray(new String[thelist.size()]);
	
	
	//convet back to array
	for(String x: stuff)
		System.out.printf("%s ", x);
	}
}

