package main_unit_II;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingWithoutJScrollPane2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JComboBox");
		
		JButton repeat = new JButton("Repeat");
		JLabel jltxt1 = new JLabel("Enter Text");
		JTextField txt1 = new JTextField(10);
		JLabel jlRepeat = new JLabel("Enter Number for repeatation");
		JTextField txtRepeat = new JTextField(10);
		JLabel jloutput = new JLabel();
		
		//We cannot add more than one component in Jscrollpane
		//So we can create JPanel and add multiple elements in it
		//and then add that JPanel inside JScrollPane
		
		JPanel jp = new JPanel();
		jp.add(jltxt1);
		jp.add(txt1);
		jp.add(jlRepeat);
		jp.add(txtRepeat);
		jp.add(repeat);
		jp.add(jloutput);
		
		repeat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = Integer.parseInt(txtRepeat.getText());
				String str = txt1.getText();
				String strOut="";
				for(int i=0;i<r;i++) {
					strOut = strOut + str;
				}
				jloutput.setText(strOut);
				System.out.println(strOut);
			}
		});
		
		jf.add(jp);
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
