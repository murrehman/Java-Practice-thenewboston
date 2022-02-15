package JColorChooser85;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
	
	private JButton b;
	private Color color;
	private JPanel panel;
	
	public Gui() {
		super("title");
		panel = new JPanel();
		//panel.setBackground(color);
		
		b = new JButton("Choose a color");
		b.addActionListener( 
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						color = JColorChooser.showDialog(null, "pick a color", color);
						if(color==null)
							color=(Color.WHITE);
						
						panel.setBackground(color);
					}
				}
				);
		
	add(panel, BorderLayout.CENTER);
	add(b, BorderLayout.SOUTH);
	setSize(200,100);
	setVisible(true);
		
		
		
	}
}
	
	