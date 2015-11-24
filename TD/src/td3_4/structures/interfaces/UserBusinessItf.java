package td3_4.structures.interfaces;

import td3_4.structures.Panier;
import td3_4.structures.Produit;

public interface UserBusinessItf {

	public Panier createPanier();
	public void AddProduct(Produit p);
	public void removeProduct(Produit p);
	public int nbProducts();
	public double total();
}
