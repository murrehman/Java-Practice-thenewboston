package JList;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Gui extends JFrame {
	
	private JList list;
	private static String[] colornames= {"black","blue","red","white"};
	private static Color[] colors= {Color.BLACK,Color.blue,Color.RED,Color.WHITE};
	
	public Gui() {
		super("title");
		setLayout(new FlowLayout());
		
		list =new JList(colornames);
		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
				);
	}
}