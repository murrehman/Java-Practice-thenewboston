package Threads;



public class Apples {
	public static void main(String[] args) {
		Thread t1 = new Thread(new bucky("ione"));
		Thread t2 = new Thread(new bucky("two"));
		Thread t3 = new Thread(new bucky("three"));
		Thread t4 = new Thread(new bucky("four"));
		 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
		

	}

