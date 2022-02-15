package JApplet;

import java.awt.*;
import javax.swing.*;


public class bucky extends JApplet{
	
	private double sum;
	
	public void init() {
		String fn = JOptionPane.showInputDialog("Enter num; ");
		String sn = JOptionPane.showInputDialog("Enter second num; ");
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		sum = n1+n2;
	}
	
     public void paint(Graphics g) {
    	 super.paint(g);
    	 g.drawString("sum = "+sum, 25, 30);
     }
}
