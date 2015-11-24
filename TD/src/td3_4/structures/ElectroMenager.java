package td3_4.structures;

public class ElectroMenager extends Produit {
	private String caracteristiques;

	public ElectroMenager(String name, String description, double prix, String seller, String category,String caracteristiques) {
		super(name, description, prix, seller, category);
		// TODO Auto-generated constructor stub
		this.caracteristiques = caracteristiques;
	}

}
