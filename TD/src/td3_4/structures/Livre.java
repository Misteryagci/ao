package td3_4.structures;

public class Livre extends Produit {

	private String auteur;
	public Livre(String name, String description, double prix, String seller, String category,String auteur) {
		super(name, description, prix, seller, category);
		// TODO Auto-generated constructor stub
		this.auteur =auteur;
	}
	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}
	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
