import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JList;


public class eCommerce {
	private JFrame fenetre;
	public JButton button,button1;
	private JPanel panel,panel1,panel01,panel02,panel03,panel2,panel3;
	public JTextField i1,i2,i3;
	private JLabel l1,l2,l3,l4,l5,l6;
	private JTabbedPane tabbedpane;
	private JList catalogue;

	public eCommerce() {
		tabbedpane = new JTabbedPane();
		this.fenetre = new JFrame();
    	//Définit un titre pour notre fenêtre
    	fenetre.setTitle("eCommerce");
    	//Définit sa taille : 400 pixels de large et 100 pixels de haut
   	 	fenetre.setSize(800, 600);
    	//Nous demandons maintenant à notre objet de se positionner au centre
   		fenetre.setLocationRelativeTo(null);
   		 //Termine le processus lorsqu'on clique sur la croix rouge
    	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//Création de panel qui contient les bouttons et les inputs ainsi que le label
    	panel = new JPanel();
    	panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    	panel1 = new JPanel();
    	panel01 = new JPanel();
    	panel02 = new JPanel();
    	panel03 = new JPanel();
    	panel2 = new JPanel();
    	panel3 = new JPanel();
    	panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));

    	l1 = new JLabel("The Livre");
    	l3 = new JLabel("The CD");
    	l5 = new JLabel("The DVD");
    	l2 = new JLabel("60.0€");
    	l4 = new JLabel("45.0€");
    	l6 = new JLabel("45.0€");

    	i1 = new JTextField(5);
    	i2 = new JTextField(5);
    	i3 = new JTextField(5);

    	button = new JButton("Commander le panier");
    	button1 = new JButton("Mettre dans le panier");

    	String[] data = {"one", "two", "three", "four"};
 		catalogue = new JList<String>(data);

    	panel01.add(l1);
    	panel01.add(i1);
    	panel01.add(l2);
    	panel02.add(l3);
    	panel02.add(i2);
    	panel02.add(l4);
    	panel03.add(l5);
    	panel03.add(i3);
    	panel03.add(l6);
    	panel.add(panel01);
    	panel.add(panel02);
    	panel.add(panel03);
    	panel.add(button);
    	panel2.add(catalogue);	
    	panel2.add(button1);	
    	//Ajout de panel à fenetre

    	tabbedpane.addTab("Panier",panel);
    	tabbedpane.addTab("Panier1",panel1);

    	panel3.setLayout(new BorderLayout());
    	panel3.add(tabbedpane, BorderLayout.WEST);
    	panel3.add(panel2,BorderLayout.EAST);
    	fenetre.add(panel3);
    	//Et enfin, la rendre visible        
    	fenetre.setVisible(true);

	}

}