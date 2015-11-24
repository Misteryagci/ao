package td3_4.structures;

import td3_4.structures.interfaces.UserBusinessItf;
import tools.Functions;

public class UserBusiness implements UserBusinessItf{

	private Panier p;
	private String username;
	private final String identifiant;
	public UserBusiness(String username) {
		// TODO Auto-generated constructor stub
		this.username = username;
		identifiant = Functions.generateString();
	}

	@Override
	public Panier createPanier() {
		// TODO Auto-generated method stub
		this.p = new Panier();
		return this.p;
	}

	@Override
	public void AddProduct(Produit p) {
		// TODO Auto-generated method stub
		this.p.add(p);
	}

	@Override
	public void removeProduct(Produit p) {
		// TODO Auto-generated method stub
		this.p.remove(p);
	}

	@Override
	public int nbProducts() {
		// TODO Auto-generated method stub
		return this.p.size();
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return this.p.total();
	}

}
