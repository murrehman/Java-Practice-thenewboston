package Linkedlist;

import java.util.*;

public class Apples {
	public static void main(String[] args) {
	String[] things = {"eggs","lasers","hats","pie","apples","bacon","goats"};
	List<String> list1 = new LinkedList<String>();
	
	//add aray items to list
	for(String x: things)
		list1.add(x);
	
	String[] things2 = {"potter","harry","and", "the","deadly","stone"};
	List<String> list2 = new LinkedList<String>();
	
	//add aray items to list
		for(String y: things2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2,5);
		printMe(list1);
		reverseMe(list1);
		
		
	}
	
	private static void printMe(List<String> l) {
		for(String b : l)
			System.out.printf("%s ", b);
		System.out.println();
		
		
	}
	
	private static void removeStuff(List<String> l,int from,int to) {
		l.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String> l) {
		ListIterator<String> bobby = l.listIterator(l.size());
		while(bobby.hasPrevious())
		System.out.printf("%s ", bobby.previous() );
	}
	
}

