package main_unit_II;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingJTable {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JComboBox");
		String data[][]= {{"1","2022001","krishna arutwar","9404668883"},
				{"2","2022002","Dinesh","9404668885"},
				{"3","2022003","suresh","9404668884"},
				{"4","2022004","ramesh","9404668886"}};
		
		String col[] = {"Roll","Enrollment","name","Mobile"};
		
		JTable jt = new JTable(data,col);
		 jt.setCellSelectionEnabled(true);  
		
		JScrollPane jsp = new JScrollPane(jt);
		
		jf.add(jsp);
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
