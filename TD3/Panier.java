import java.util.HashMap;

public class Panier {
	//ArrayList<Produit> content;
	HashMap<Produit,Integer> content;
	//Les constructeurs

	//Constructeur par défaut
	public Panier ()
	{
		content =  new HashMap<Produit,Integer>();
	}
	//Constructeur par une autre liste des produits
	public Panier (HashMap<Produit,Integer> al)
	{
		this.content = al;
	}

	//Fin des constructeurs

	//Méthode permet d'ajouter un produit à panier
	public void add(Produit p)
	{
		if (content.get(p) == null)
			content.put(p,1);
		else
			content.put(p,content.get(p)+1);
	}
	//Méthode permet d'ajouter  un élément au panier un nombre de fois
	public void add(Produit p,int fois)
	{
		content.put(p,fois);
	}

	//Fonction retourne le prix total du panier
	public double prixTotal()
	{
		double res = 0;
		for (Produit p : content.keySet())
		{
			res+=(p.getPrix() * content.get(p));
		}
		return res;
	}

	//Méthode renvoie le nombre d'apparation d'un produit dans le panier
	public int quantite(Produit p)
	{
		if (content.get(p) == null)
			return 0;
		return content.get(p);
	}

	//Méthode permet d'afficher les produits dans le panier
	public void afficher()
	{
		for (Produit p : content.keySet())
		{
			System.out.println(p.toString());
			System.out.println("Existe "+content.get(p)+" "+p.getType());
		}
	}

}