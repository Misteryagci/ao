package td5_6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SommeFrame {

	private JFrame frame;
	private JPanel container;
	private JTextField op1,op2,somme;
	private JLabel label;
	private JButton button;
	private JOptionPane optionpane;
	private static int max_char_length = 5;
	public SommeFrame() {
		// TODO Auto-generated constructor stub
		this.frame = new JFrame("Somme frame");
		frame.setSize(640, 480);
		this.container = new JPanel();
		this.op1 = new JTextField(max_char_length);
		this.op2 = new JTextField(max_char_length);
		this.somme = new JTextField(max_char_length);
		this.label = new JLabel("+");
		this.button = new JButton ("=");
		this.optionpane = new JOptionPane();
		button.addActionListener(new ActionListener() 
		{ 
			  public void actionPerformed(ActionEvent e) 
			  { 				  	
				    if ((((op1.getText().length() == 0) || (op2.getText().length() == 0))) && (somme.getText().length() != 0))
				    {
				    	if ((op1.getText().length() == 0) && (op2.getText().length() == 0))
						{
							//Si seulement la case résultat est rempli
						    op1.setText(""+(Double.parseDouble(somme.getText())/2));
						    op2.setText(op1.getText());
						}
				    	else
				    		//Si un des cases operateurs sont vide et le case résultat n'est pas vide on rempli le nombre manquant
				    		if (op1.getText().length() == 0)
				    		{
				    			//Si c'est le case plus à gauche qui est vide
				    			op1.setText(""+(Double.parseDouble(somme.getText()) - Double.parseDouble(op2.getText())));
				    		}
				    		else
				    		{
				    			//Si c'est le case à droit de label qui est vide
				    			op2.setText(""+(Double.parseDouble(somme.getText()) - Double.parseDouble(op1.getText())));
				    		}
				    	return;
				    	}
				    //Si les deux cases d'operants sont remplis et le case pour la somme est vide
				    if ((op1.getText().length() != 0) && (op2.getText().length() != 0) && (somme.getText().length() == 0))
				    {
				    	somme.setText(""+(Double.parseDouble(op1.getText())+Double.parseDouble(op2.getText())));
				    	return;
				    }

			    	if ((op1.getText().length() != 0) && (op2.getText().length() != 0) && (somme.getText().length() != 0))
			    	{
			    		//Si tous les cases sont bien remplis
			    		if (
			    				(
			    						(Double.parseDouble(op1.getText())) +
			    						(Double.parseDouble(op2.getText()))
			    				)  ==
			    				(Double.parseDouble(somme.getText())))
			    				{
			    					optionpane.showMessageDialog(frame, "Correct!");
			    				}
			    				else
			    				{
	    							optionpane.showMessageDialog(frame, "Incorrect!");
			    				}
			    		return;
			    	}
					optionpane.showMessageDialog(frame, "Impossible de résoudre!");
			  }
			  
		} );

		container.add(this.op1);
		container.add(this.label);
		container.add(this.op2);
		container.add(this.button);
		container.add(this.somme);
		frame.add(container);
		this.container.setLayout(new FlowLayout());
		this.frame.setVisible(true);
	}
	
}
