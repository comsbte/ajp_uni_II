package main_unit_II;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;    
public class SwingProgressBar extends JFrame{    
	JProgressBar jpb;    
	int initial=20,num=0;     
	SwingProgressBar(){    
		jpb=new JProgressBar(0,100);          	   
		jpb.setValue(initial);    
		jpb.setStringPainted(true);    
		add(jpb);    
		setSize(400,400);    
		setLayout(new FlowLayout());    
	}    
	public void iterate(){    
		while(initial<=100){    
			jpb.setValue(initial);    
			initial=initial+10;    
			try{Thread.sleep(1000);}catch(Exception e){}    
		}    
	}    
	public static void main(String[] args) {    
		SwingProgressBar m=new SwingProgressBar();
		m.setVisible(true);    
		m.iterate();    
	}    
}