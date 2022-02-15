package MouseEvents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Gui extends JFrame {
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	
	public Gui() {
		super("title");
		//setLayout(new FlowLayout());
		
		mousepanel =new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar=new JLabel("Default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler=new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);

	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener {
		
		public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d, %d", event.getX(),event.getY()));
			}
		public void mousePressed(MouseEvent event) {
			statusbar.setText("you pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("you released the button");
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("you entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusbar.setText("mouse has left the window");
			mousepanel.setBackground(Color.WHITE);
		}
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("you are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("you moved the mouse");
		}
	}
}