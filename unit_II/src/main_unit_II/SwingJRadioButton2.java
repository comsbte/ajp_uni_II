package main_unit_II;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class SwingJRadioButton2 implements ActionListener{

	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JRadioButton2");
		jf.setLayout(new FlowLayout());
		
		JRadioButton jrb1 = new JRadioButton("Milk");
		JRadioButton jrb2 = new JRadioButton("Tea");
		JRadioButton jrb3 = new JRadioButton("Coffee");
		
		jrb1.addActionListener(new SwingJRadioButton2());
		jrb2.addActionListener(new SwingJRadioButton2());
		jrb3.addActionListener(new SwingJRadioButton2());
		
		ButtonGroup bgDrink = new ButtonGroup();
		bgDrink.add(jrb3);
		bgDrink.add(jrb2);
		bgDrink.add(jrb1);
		
		jf.add(jrb3);
		jf.add(jrb2);
		jf.add(jrb1);
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
		String drink = e.getActionCommand();
		if(drink.contains("Milk"))
			System.out.println("Milk will take 1 Minutes ");
		else if(drink.contains("Coffee"))
			System.out.println("Coffee will take 2 Minutes ");
		else
			System.out.println("Tea will take 5 Minutes ");
	}

}
