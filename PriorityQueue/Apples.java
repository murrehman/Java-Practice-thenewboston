package PriorityQueue;

import java.util.*;

public class Apples {
	public static void main(String[] args) {
		
	PriorityQueue<String> q= new PriorityQueue<String>();
	
	q.offer("firsst");
	q.offer("second");
	q.offer("third");
	
	System.out.printf("%s ", q);
	System.out.println();
	
	System.out.printf("%s ", q.peek());
	System.out.println();
	
	q.poll();
	System.out.printf("%s ", q);
	System.out.println();
	
	q.poll();
	System.out.printf("%s ", q);
	
	
	}
	
	
}

