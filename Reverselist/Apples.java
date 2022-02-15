package Reverselist;

import java.util.*;

public class Apples {
	public static void main(String[] args) {
		
	//create array and convert to list
	Character[] stuff = {'p','w','n'};
	List<Character> l = Arrays.asList(stuff);
	System.out.println("List is : ");
	output(l);
	
	
	//reverse and printout list
	Collections.reverse(l);
	System.out.println("After reverse ; ");
	output(l);
	
	
	//create new array and new list
	Character[] newray= new Character[3];
	List<Character> listCopy = Arrays.asList(newray);
	
	
	
	//copy content of one list to other
	Collections.copy(listCopy, l);
	System.out.println("Copy of list : ");
	output(listCopy);
	
	
	//fill collection with new data
	Collections.fill(l, 'X');
	System.out.println("After filling list : ");
	output(l);
	
	}
	
	//output method
	private static void output(List<Character> thelist) {
		
		for(Character thing: thelist)
			System.out.printf("%s ",thing );
		System.out.println();
	}
}

