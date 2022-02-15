package GUIsum;
import javax.swing.JOptionPane;

public class Apples {
	public static void main(String[] args) {
		
		String fn=JOptionPane.showInputDialog("Enter first numer");
		String sn=JOptionPane.showInputDialog("Enter second numer");
		
		int num1= Integer.parseInt(fn);
		int num2= Integer.parseInt(sn);
		int sum= num1+num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " +sum, "title", JOptionPane.PLAIN_MESSAGE);
			
		}
	     
		
	
}
