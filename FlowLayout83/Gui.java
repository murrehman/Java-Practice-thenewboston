package FlowLayout83;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
	
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	public Gui() {
		super("title");
		layout= new FlowLayout();
		container= getContentPane();
		setLayout(layout);
		
		
		//left layout in here
		lb=new JButton("left");
		add(lb);
		lb.addActionListener( 
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				);
		
		//center layout in here
				cb=new JButton("center");
				add(cb);
				cb.addActionListener( 
						new ActionListener() {
							public void actionPerformed(ActionEvent event) {
								layout.setAlignment(FlowLayout.CENTER);
								layout.layoutContainer(container);
							}
						}
						);
				
				//right layout in here
				rb=new JButton("Right");
				add(rb);
				rb.addActionListener( 
						new ActionListener() {
							public void actionPerformed(ActionEvent event) {
								layout.setAlignment(FlowLayout.RIGHT);
								layout.layoutContainer(container);
							}
						}
						);
		
		
		
		
	}
}
	
	