package AdapterClass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Gui extends JFrame {
	
	private String details;
	private JLabel statusbar;
	
	
	public Gui() {
		super("title");
		//setLayout(new FlowLayout());
		
		statusbar=new JLabel("Default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new mouseclass());

	}
	
	private class mouseclass extends MouseAdapter{
		
		public void mouseClicked(MouseEvent event) {
			details=String.format("Clicked at %d ", event.getClickCount());
			
			if(event.isMetaDown())
				details+="with right mouse button";
			else if(event.isAltDown())
				details+="with center mouse button";
			else
				details+="with left mouse button";
			
			statusbar.setText(details);
			}
	}
}