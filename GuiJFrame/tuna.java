package GuiJFrame;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tuna extends JFrame {
	// add variable of type JLabel
	private JLabel item1;
	
	//const
	public tuna() {
		super("the title bar");
		setLayout(new FlowLayout());
		
		item1= new JLabel("This is sentence");
		item1.setToolTipText("This is gona show on hover");
		add(item1);
	
	}

}
