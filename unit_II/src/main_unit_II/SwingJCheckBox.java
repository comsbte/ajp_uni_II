package main_unit_II;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class SwingJCheckBox {

	public static void main(String[] args) {
		JFrame jf = new JFrame("Label and Button");
		jf.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon("images/logo_msbte.png");
		JCheckBox jcb = new JCheckBox("Image as Checkbox",img,true);
		jf.add(jcb);
		
		jcb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.DESELECTED)
					System.out.println("You DESELECTED Image");
				else
					System.out.println("You SELECTED Image");
			}
		});
		
		JCheckBox jcb2 = new JCheckBox("ONLY TEXT AS Checkbox",true);
		jf.add(jcb2);
		
		jcb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.DESELECTED)
					System.out.println("You DESELECTED CHECKBOX");
				else
					System.out.println("You SELECTED CHECKBOX");
			}
		});
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
