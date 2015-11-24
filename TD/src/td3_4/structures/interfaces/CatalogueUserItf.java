package td3_4.structures.interfaces;

import java.util.ArrayList;

import td3_4.structures.Produit;

public interface CatalogueUserItf {
	
	public ArrayList<Produit> getElementsByCategpry(String type);
	public ArrayList<Produit> getElementsBySeller(String seller);
	public ArrayList<Produit> getElementsByName(String name);
	public ArrayList<Produit> getElementsByDescription(String desc);
	public ArrayList<Produit> sortByPrixCroissant();
	public ArrayList<Produit> sortByPrixDecroissant();
	public ArrayList<Produit> getProducts();

}
