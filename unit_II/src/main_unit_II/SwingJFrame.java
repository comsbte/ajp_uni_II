package main_unit_II;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJFrame
{
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("Calculator");
		
		jf.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon("images/logo_msbte.png");
		jf.setIconImage(img.getImage());
		
		//OR
		
		 /*Image icon = Toolkit.getDefaultToolkit().getImage("images/logo_msbte.png");
		 jf.setIconImage(icon);*/
		 
		JButton add = new JButton("Sample Button");
		jf.add(add);
		
		jf.setSize(700, 700);
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//OR
		
		/*jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				jf.dispose();
			}
		});*/
	}
}