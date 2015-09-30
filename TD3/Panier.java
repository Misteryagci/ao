import java.util.ArrayList;

public class Panier {
	ArrayList<Produit> content;

	//Les constructeurs

	//Constructeur par défaut
	public Panier ()
	{
		content =  new ArrayList<Produit>();
	}
	//Constructeur par une autre liste des produits
	public Panier (ArrayList<Produit> al)
	{
		this.content = al;
	}

	//Fin des constructeurs

	//Méthode permet d'ajouter un produit à panier, on ne vérifie pas l'existance de ce produit parce qu'il peut contenir plusieurs fois de même produit
	public void add(Produit p)
	{
		content.add(p);
	}
	//Méthode permet d'ajouter  un élément au panier un nombre de fois
	public void add(Produit p,int fois)
	{
		for (int i=0;i<fois;i++)
		{
			content.add(p);
		}
	}

	//Fonction retourne le prix total du panier
	public double prixTotal()
	{
		double res = 0;
		for (int i=0;i<content.size();i++)
		{
			res+=content.get(i).getPrix();
		}
		return res;
	}

	//Méthode renvoie le nombre d'apparation d'un produit dans le panier
	public int quantite(Produit p)
	{
		int res = 0;
		for (int i=0;i<content.size();i++)
		{
			if (content.get(i).equals(p) == 1)
				res++;
		}
		return res;
	}

	//Méthode permet d'afficher les produits dans le panier
	public void afficher()
	{
		System.out.println("Nombre d'éléments dans votre panier est "+content.size());
		for (int i=0;i<content.size();i++)
		{
			System.out.println("Produit numéro "+(i+1)); //Pour séparer les produits
			System.out.print(content.get(i).toString());
		}
	}
}