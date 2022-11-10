package main_unit_II;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingJScrollPane {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JComboBox");
		
		JTextArea jta = new JTextArea();
		//We cannot add more than one component in Jscrollpane
		//So we can create JPanel and add multiple elements in it
		//and then add that JPanel inside JScrollPane 
		JScrollPane jsp = 
				new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jf.add(jsp);
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
