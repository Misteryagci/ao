import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calculatrice {
	private JFrame fenetre;
	public JButton button;
	private JPanel panel;
	public JTextField op1,op2,res;
	private JLabel label;

	public Calculatrice () {

    	this.fenetre = new JFrame();
    	//Définit un titre pour notre fenêtre
    	fenetre.setTitle("WeakCalc");
    	//Définit sa taille : 400 pixels de large et 100 pixels de haut
   	 	fenetre.setSize(400, 100);
    	//Nous demandons maintenant à notre objet de se positionner au centre
   		 fenetre.setLocationRelativeTo(null);
   		 //Termine le processus lorsqu'on clique sur la croix rouge
    	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//Création de panel qui contient les bouttons et les inputs ainsi que le label
    	panel = new JPanel();	
    	//Création d'un boutton =
    	op1 = new JTextField(5);
    	label = new JLabel("+");
    	op2 = new JTextField(5);
    	button = new JButton ("=");
    	res = new JTextField(10);
    	//Ajout de boutton à panel
    	panel.add(op1);
    	panel.add(label);
    	panel.add(op2);
    	panel.add(button);
    	panel.add(res);
    	//Ajout de panel à fenetre
    	fenetre.add(panel);
    	//Et enfin, la rendre visible        
    	fenetre.setVisible(true);
	}
}