import java.awt.BorderLayout;

import javax.swing.*;



/**
 * @author Danny
 * 
 * Grade Calculator so to find out what mark you need on your next assignment.
 *
 */
public class Calc {
	
	private JTextArea displayMessage;
	
	
	private void jButtionActionPerformed(java.awt.event.ActionEvent evt) {
		
	}
	
	/**
	 * Creates the frame and sets up the calculator
	 * @param args
	 */
	public static void main(String args[]) {
		Calc c = new Calc();
		c.create();
	}
	
	/**
	 * 
	 */
	public void create() {
		JFrame frame = new JFrame("Main Pannel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.pack();
		frame.setVisible(true);
	}
	public void doMaths() {
		
	}
}

