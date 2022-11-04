package main_unit_II;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import my_component.MyJLabel;

public class SwingJTabbedPane {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JComboBox");
		
		JTabbedPane jtp = new JTabbedPane();
		
		JPanel pajp = new JPanel();
		JPanel pcss = new JPanel();
		JPanel posy = new JPanel();
		
		jtp.addTab("AJP Material", pajp);
		jtp.addTab("CSS Material", pcss);
		jtp.addTab("OSY Material", posy);
		
		int fsize = 30;
		
		pajp.add(new MyJLabel("Unit-I AWT,",fsize));
		pajp.add(new MyJLabel("Unit-II swing,",fsize));
		pajp.add(new MyJLabel("Unit-III event handling,",fsize));
		
		pcss.add(new MyJLabel("Unit-I Basics of JS,",fsize));
		pcss.add(new MyJLabel("Unit-II Array function and string,",fsize));
		pcss.add(new MyJLabel("Unit-III form and event handling",fsize));
		
		posy.add(new MyJLabel("Unit-I",fsize));
		posy.add(new MyJLabel("Unit-II",fsize));
		posy.add(new MyJLabel("Unit-III",fsize));
		
		jf.add(jtp);
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
