package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwissArmyKnife extends IHM implements UI{
	private JFrame frame;
	private JLabel label;
	private JLabel label2;
	private JButton button;
	private int x;
	private int currentMax;
	private int overallMax;
	private boolean accessed[];
	private String word = new String("Gang.Of.Four!");
	private ActionListener actionListener;

	private void generateNewCurrentMax() {
		this.currentMax = ((int) (Math.random() * this.overallMax) + 1);
	}

	public SwissArmyKnife(int overallMax) {
		this.overallMax = overallMax;
		this.accessed = new boolean[overallMax];
		this.x = 0;
		generateNewCurrentMax();
		drawInterface();
		frame.setVisible(true);
	}

	/* La méthode initialise tout l'interface dans son ordre */
	public void drawInterface()
	{
		setFrame();
		setLabel2();
		setLabel();
		setButton();
	
		setText(getStringRepresentation());
		setText2(getResultRepresentation());
		setActionListener();
		button.addActionListener(actionListener);
	}
	/*Méthode permet de initialiser le contenu du label avec le texte qui est passé en paramètre*/
	public void setText(String text) {
		label.setText(text);
	}

	/*Méthode permet de initialiser le contenu du label2 avec le texte qui est passé en paramètre */
	public void setText2(String text) {
		label2.setText(text);
	}

	/*Fonction permet de contrôler si la table accessed contient que des éléments vrai */
	private boolean allDone() {
		for (boolean b : accessed) {
			if (!b)
				return false;
		}
		return true;
	}

	private void process() {
		if (x < currentMax)
			x++;
		else {
			accessed[currentMax - 1] = true;
			if (allDone()) {
				accessed = new boolean[overallMax];
			}
			generateNewCurrentMax();
			x = 0;
		}
	}

	/* Méthode rends la représentaiton de la ligne en bas à chaque étape */
	private String getStringRepresentation() {
		String txt = ">";
		for (int i = 0; i < x; i++) {
			txt += word.charAt(i % (word.length()));
		}
		for (int i = x; i < currentMax; i++) {
			txt += " ";
		}
		txt += "|";
		for (int i = currentMax + 1; i <= overallMax; i++) {
			txt += " ";
		}
		txt += "<";
		return txt;
	}

	/* Méthode renvoie la représentation de la ligne en haut à chaque étape */
	private String getResultRepresentation() {
		String txt = ">";
		int i = 0;
		for (boolean b : accessed) {
			if (b)
				txt += word.charAt(i % (word.length()));
			else
				txt += " ";
			i++;
		}
		txt += "<";
		return txt;
	}

	/* Méthode permet d'initialiser le frame*/
	public void setFrame()
	{
		this.frame = new JFrame("View");
		this.frame.getContentPane().setLayout(new BorderLayout());
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(200, 100);
	}
	
	/*Méthode permet d'initialiser le label2*/
	public void setLabel2()
	{
		this.label2 = new JLabel();
		this.label2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		frame.getContentPane().add(label2, BorderLayout.NORTH);
	}
	
	/*Méthode permet d'initialiser le bouton*/
	public void setButton()
	{
		button = new JButton("Button");
		frame.getContentPane().add(button, BorderLayout.SOUTH);
	}
	/*Méthode permet de initialiser la variable label*/
	public void setLabel()
	{
		this.label = new JLabel();
		this.label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}
	
	
	/* Méthode permet d'initialiser l'action listener */
	private void setActionListener()
	{
		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				process();
				setText(getStringRepresentation());
				setText2(getResultRepresentation());
			}
		};
	}

	
	public static void main(String[] args) {
		new SwissArmyKnife(10);
	}
	
}