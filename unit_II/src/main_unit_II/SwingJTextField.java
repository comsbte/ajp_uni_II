package main_unit_II;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingJTextField {
	public static void main(String[] args) {
		JFrame jf = new JFrame("JTextFiled");
		jf.setLayout(new FlowLayout());
		
		JTextField jtf = new JTextField();
		jf.add(jtf);
		
		JTextField jtf2 = new JTextField(10);
		jf.add(jtf2);
		
		JTextField jtf3 = new JTextField("9404",10);
		jf.add(jtf3);
		
		JTextField jtf4 = new JTextField("940466");
		jf.add(jtf4);
		
		jtf3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You Entered ="+jtf3.getText());
			}
		});
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
