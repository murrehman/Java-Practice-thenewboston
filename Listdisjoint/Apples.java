package Listdisjoint;

import java.util.*;

public class Apples {
	public static void main(String[] args) {
		
	//create array and convert to list
	String[] stuff = {"apples","beef","corn","ham"};
	List<String> list1 = Arrays.asList(stuff);
	//System.out.println("List is : ");
	//output(l);
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("youtube");
	list2.add("google");
	list2.add("digg");
	
	for(String x: list2)
		System.out.printf("%s ",x );
	System.out.println();
	
	Collections.addAll(list2, stuff);
	
	for(String x: list2)
		System.out.printf("%s ",x );
	System.out.println();
	
	
	//Frequency of list elements
	System.out.println(Collections.frequency(list2, "digg"));
	
	
	//disjoint checks if any element is common
	boolean tof = Collections.disjoint(list1, list2);
	System.out.println(tof);
	
	
	if(tof) 
		System.out.println("these lists donot have anything in common");
	else
		System.out.println("these lists must have something in commmon");
	
	
	}
}

