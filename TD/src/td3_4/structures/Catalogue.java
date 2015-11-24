package td3_4.structures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Catalogue {

	private ArrayList<Produit> product_list;
	public Catalogue() {
		// TODO Auto-generated constructor stub
		this.product_list = new ArrayList<Produit>();
	}
	
	public void add(Produit p)
	{
		this.product_list.add(p);
	}

	public void remove(Produit p)
	{
		this.product_list.remove(p);
	}
	
	public ArrayList<Produit> getProducts()
	{
		return this.product_list;
	}
	
	public ArrayList<Produit> getElementsByCategpry(String type)
	{
		ArrayList<Produit> aux = new ArrayList<Produit>();
		for (int i=0;i<this.product_list.size();i++)
		{
			if (this.product_list.get(i).getCategory().equals(type))
				aux.add(this.product_list.get(i));
		}
		return aux;
	}
	
	public ArrayList<Produit> getElementsBySeller(String seller)
	{
		ArrayList<Produit> aux = new ArrayList<Produit>();
		for (int i=0;i<this.product_list.size();i++)
		{
			if (this.product_list.get(i).getSeller().equals(seller))
				aux.add(this.product_list.get(i));
		}
		return aux;
	}
	
	public ArrayList<Produit> getElementsByName(String name)
	{
		ArrayList<Produit> aux = new ArrayList<Produit>();
		for (int i=0;i<this.product_list.size();i++)
		{
			if (this.product_list.get(i).getName().equals(name))
				aux.add(this.product_list.get(i));
		}
		return aux;
	}
	
	public ArrayList<Produit> getElementsByDescription(String desc)
	{
		ArrayList<Produit> aux = new ArrayList<Produit>();
		for (int i=0;i<this.product_list.size();i++)
		{
			if (this.product_list.get(i).getDescription().equals(desc))
				aux.add(this.product_list.get(i));
		}
		return aux;
	}
	
	public String toString()
	{
		String s="";
		for (int i=0;i<this.product_list.size();i++)
		{
			s+=this.product_list.get(i).toString()+"\n";
		}
		return s;
	}
	
	public ArrayList<Produit> sortByPrixCroissant()
	{
		Collections.sort(this.product_list);
		return this.product_list;
	}
	
	public ArrayList<Produit> sortByPrixDecroissant()
	{
		Collections.sort(this.product_list,Collections.reverseOrder());
		return this.product_list;
	}
	
}
