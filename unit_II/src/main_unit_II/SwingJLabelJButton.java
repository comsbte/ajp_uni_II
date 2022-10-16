package main_unit_II;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingJLabelJButton {

	public static void main(String[] args) {
		JFrame jf = new JFrame("Label and Button");
		jf.setLayout(new FlowLayout());
		
		JLabel limg = new JLabel("This is LOGO of MSBTE(Label)");
		ImageIcon img = new ImageIcon("images/logo_msbte.png");
		limg.setIcon(img);
		
		jf.add(limg);
		
		ImageIcon img2 = new ImageIcon("images/dte.jpg");		
		JLabel limg2 = new JLabel("This is LOGO of DTE(Label)",img2,JLabel.RIGHT);
		
		jf.add(limg2);
		
		ImageIcon btnimg1 = new ImageIcon("images/plus.jpg");
		
		JButton jb = new JButton("ADD Button with ICON",btnimg1);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Perform Addition");
			}
		});
		
		jf.add(jb);
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
