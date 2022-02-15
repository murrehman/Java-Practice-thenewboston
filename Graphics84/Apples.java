package Graphics84;

import javax.swing.*;

public class Apples { 
	public static void main(String[] args) {
	    
		
		JFrame f= new JFrame("title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gui go = new Gui();
		f.add(go);
		f.setSize(400,250);
		f.setVisible(true);
		
	}
}
