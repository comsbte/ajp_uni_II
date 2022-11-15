package main_unit_II;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;    
public class SwingProgressBar2 implements FocusListener{
	JProgressBar jpb = new JProgressBar(0,100);
	int counter = 0;
	
	public static void main(String[] args) {
		JFrame jf = new JFrame("Progress bar");
		jf.setLayout(new FlowLayout());
		SwingProgressBar2 sjpb = new SwingProgressBar2();
		
		sjpb.jpb.setValue(0);
		sjpb.jpb.setStringPainted(true);
		
		jf.add(sjpb.jpb);
		
		JLabel lq1 = new JLabel("What is your name?");
		JTextField txtq1 = new JTextField(20);
		txtq1.addFocusListener(sjpb);
		
		jf.add(lq1);
		jf.add(txtq1);
		
		
		JLabel lq2 = new JLabel("What is your hobby?");
		JTextField txtq2 = new JTextField(20);
		txtq2.addFocusListener(sjpb);
		
		jf.add(lq2);
		jf.add(txtq2);
		
		JLabel lq3 = new JLabel("What is your college name?");
		JTextField txtq3 = new JTextField(20);
		txtq3.addFocusListener(sjpb);
		
		
		jf.add(lq3);
		jf.add(txtq3);
		
		JLabel lq4 = new JLabel("What is your favorite colour?");
		JTextField txtq4 = new JTextField(20);
		txtq4.addFocusListener(sjpb);
		
		jf.add(lq4);
		jf.add(txtq4);
		
		JButton jb = new JButton("Submit");
		jf.add(jb);
		
		jf.setVisible(true);
		jf.setSize(250, 400);
		jf.setLocation(200, 200);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void focusGained(FocusEvent e) {
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		counter = counter + 25;
		jpb.setValue(counter);
	}
	    
}