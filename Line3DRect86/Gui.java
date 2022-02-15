package Line3DRect86;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		
		g.setColor(new Color(190,81,215));
		g.drawRect(15, 55, 100, 30);
		
		g.setColor(Color.RED);
		g.fillOval(10, 95, 100 ,30 );
		
		g.setColor(Color.GREEN);
		g.fill3DRect(10, 160, 100 ,50, true );
	}
	
}