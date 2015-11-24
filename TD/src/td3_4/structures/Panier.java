package td3_4.structures;

import java.util.ArrayList;

public class Panier {

	ArrayList<Produit> content;
	
	public Panier() {
		content = new ArrayList<Produit>();
	}
	
	public void add(Produit p)
	{
		content.add(p);
	}
	
	public void remove(Produit p)
	{
		content.remove(p);
	}
	
	public int size()
	{
		return this.content.size();
	}
	
	public double total()
	{
		double res = 0;
		for (int i=0;i<this.content.size();i++)
		{
			res+=content.get(i).getPrix();
		}
		return res;
	}
}
