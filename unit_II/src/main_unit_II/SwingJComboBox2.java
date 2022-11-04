package main_unit_II;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingJComboBox2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JComboBox");
		
		JLabel lbloutput = new JLabel();
		
		String s1[] = { "Pune", "Mumbai", "Noida", "Kolkata", "New Delhi" };
		
		JComboBox jcb = new JComboBox(s1);
		
		jf.add(jcb,BorderLayout.NORTH);//Default layout is BorderLayout
		jf.add(lbloutput);
		
		jcb.addItem("Nagpur");
		jcb.addItem("Dhule");
		
		jcb.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lbloutput.setText("You selected "+e.getItem());
			}
		});
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
