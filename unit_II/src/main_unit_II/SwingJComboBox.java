package main_unit_II;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingJComboBox {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JComboBox");
		jf.setLayout(new FlowLayout());
		
		JLabel lbloutput = new JLabel();
		
		Vector<String> v = new Vector<>();
		v.add("male");
		v.add("female");
		
		JComboBox jcb = new JComboBox(v);
		
		jf.add(jcb);
		jf.add(lbloutput);
		
		jcb.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lbloutput.setText("You are "+e.getItem());
			}
		});
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
