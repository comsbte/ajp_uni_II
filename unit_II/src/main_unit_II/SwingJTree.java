package main_unit_II;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingJTree implements TreeExpansionListener{
	public static void main(String[] args) {
		JFrame jf = new JFrame("Swing JComboBox");
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("College");
		JTree jt = new JTree(root);
		
		JScrollPane jp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);	
		
		jf.add(jp);
		
		DefaultMutableTreeNode branch = new DefaultMutableTreeNode("Branch");
		DefaultMutableTreeNode comp = new DefaultMutableTreeNode("Comp");
		DefaultMutableTreeNode fyco = new DefaultMutableTreeNode("First");
		DefaultMutableTreeNode syco = new DefaultMutableTreeNode("Second");
		DefaultMutableTreeNode tyco = new DefaultMutableTreeNode("Third");
		comp.add(tyco);
		comp.add(syco);
		comp.add(fyco);
		
		DefaultMutableTreeNode elec = new DefaultMutableTreeNode("elec");
		DefaultMutableTreeNode mech = new DefaultMutableTreeNode("mech");
		DefaultMutableTreeNode auto = new DefaultMutableTreeNode("auto");
		DefaultMutableTreeNode civil = new DefaultMutableTreeNode("Civil");
		
		root.add(branch);
		branch.add(civil);
		branch.add(comp);
		branch.add(mech);
		branch.add(auto);
		branch.add(elec);
		
		jt.addTreeExpansionListener(new SwingJTree());
		
		jt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Event="+jt.getPathForLocation(e.getX(), e.getY()));
			}
		});
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void treeExpanded(TreeExpansionEvent event) {
		System.out.println("Tree Expanded "+event.getPath());
		
	}

	@Override
	public void treeCollapsed(TreeExpansionEvent event) {
		System.out.println("Tree Collapsed "+event.getPath());
	}
}
