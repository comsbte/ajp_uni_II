package my_component;

import java.awt.Font;

import javax.swing.JLabel;

public class MyJLabel extends JLabel{

	public MyJLabel(String title, int fontSize)
	{
		Font f = new Font(title, Font.BOLD, fontSize);
		
		setFont(f);
		setText(title);
	}
}
