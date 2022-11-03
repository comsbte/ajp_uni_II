package main_unit_II;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class SwingJRadioButton { 
 
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JRadioButton");
		jf.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon("images/logo_msbte.png");
		JRadioButton jrb = new JRadioButton("Image as Radiobutton",img,true);
		jf.add(jrb);
		
		jrb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.DESELECTED)
					System.out.println("You DESELECTED Image");
				else
					System.out.println("You SELECTED Image");
			}
		});
		
		JRadioButton jrb2 = new JRadioButton("ONLY TEXT AS Radiobutton",true);
		jf.add(jrb2);
		
		jrb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.DESELECTED)
					System.out.println("You DESELECTED Radiobutton");
				else
					System.out.println("You SELECTED Radiobutton");
			}
		});
		
		
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
