package td5_6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import td3_4.structures.Panier;

public class ECommerceFrame extends JFrame{
		
		private JTabbedPane tabbedPane;
		private JPanel panier1,panier2;
		private static Panier pan1,pan2;
	public ECommerceFrame ()
	{
		setTitle("eCommerce");
		setSize(640,480);
		JPanel left_panel = new JPanel();
		left_panel.setLayout(new BorderLayout());
		getContentPane().add(left_panel);
		
		//Create the tab pages
		createPanier1();
		createPanier2();
		
		//Create tabbed pane
		this.tabbedPane = new JTabbedPane();
		this.tabbedPane.addTab("Panier 1", this.panier1);
		this.tabbedPane.addTab("Panier 2", this.panier2);
		left_panel.add(tabbedPane,BorderLayout.WEST);
		setVisible(true);
	}
		
	public void createPanier1()
	{
		this.panier1 = new JPanel();
		this.pan1 = new Panier();		
	}
	
	public void createPanier2()
	{
		this.panier2 = new JPanel();
		this.pan2 = new Panier();
	}
	
	public static void main (String[] args)
	{
		ECommerceFrame ef = new ECommerceFrame();
	}

}
