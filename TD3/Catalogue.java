public class Catalogue {

	private ArrayList<Produit> product_list;

	//Constucteurs

	//Constructer par défaut
	public Catalogue ()
	{
		this.product_list = new ArrayList<Produit>();
	}
	//Constructeur avec un paramètre 
	public Catalogue (ArrayList<Produit> lp)
	{
		this.product_list = lp;
	}

	/*
		Méthode pour ajouter un produit
			retourne 1 si le produit est ajouté avec succès
			retourne 0 si le produit existe déjà dans le catalogue
	*/
	public int ajouter_produit(Produit p)
	{
		if (!(this.existe(p))) //Si le produit n'existe pas dans la liste
		{
			product_list.add(p);
			return 1;
		}
		return 0;
	}

	public void afficherListeProduits()
	{
		for (int i=0;i<product_list.size();i++)
		{
			System.out.println("Produit numéro "+(i+1)); //Pour séparer les produits
			System.out.print(product_list.get(i).toString());
		}
	}

	//Méthodes recherche d'un produit

	/*
		Méthode qui cherche les produits par leur nom
			Elle retourne la nombre de produits trouvé et elle affiche les détails de chqaue produit trouvé
	*/
	public int searchByName(String name)
	{
		Produit p = null;
		int res = 0;
		Strins s = "";
		for (int i=0;i<product_list.size();i++)
		{
			if (product_list.get(i).getNom().equals(name))
			{
				p = product_list.get(i);
				s+=p.toString()+"\n";
				res ++;
			}
		}
		if (res == 0)
			System.out.println("Aucun produit n'a trouvé");
		else if (res == 1)
			System.out.println("1 produit a trouvé");
		else
			System.out.println(res+" produits a trouvé");
		System.out.println(s);
		return res;
	}

	/*
		Méthode qui cherche les produits par leur description
			Elle retourne la nombre de produits trouvé et elle affiche les détails de chqaue produit trouvé
	*/
	public int searchByDescription(String desc)
	{
		Produit p = null;
		int res = 0;
		Strins s = "";
		for (int i=0;i<product_list.size();i++)
		{
			if (product_list.get(i).getDescription().equals(desc))
			{
				p = product_list.get(i);
				s+=p.toString()+"\n";
				res ++;
			}
		}
		if (res == 0)
			System.out.println("Aucun produit n'a trouvé");
		else if (res == 1)
			System.out.println("1 produit a trouvé");
		else
			System.out.println(res+" produits a trouvé");
		System.out.println(s);
		return res;
	}

	/*
		Méthode qui cherche les produits par leur type
			Elle retourne la nombre de produits trouvé et elle affiche les détails de chqaue produit trouvé
	*/
	public int searchByType(String type)
	{
		Produit p = null;
		int res = 0;
		Strins s = "";
		for (int i=0;i<product_list.size();i++)
		{
			if (product_list.get(i).getType().equals(type))
			{
				p = product_list.get(i);
				s+=p.toString()+"\n";
				res ++;
			}
		}
		if (res == 0)
			System.out.println("Aucun produit n'a trouvé");
		else if (res == 1)
			System.out.println("1 produit a trouvé");
		else
			System.out.println(res+" produits a trouvé");
		System.out.println(s);
		return res;
	}

	/*
		Méthode qui cherche les produits par leur prix
			Elle retourne la nombre de produits trouvé et elle affiche les détails de chqaue produit trouvé
	*/
	public int searchByDescription(double min,double max)
	{
		Produit p = null;
		int res = 0;
		Strins s = "";
		for (int i=0;i<product_list.size();i++)
		{
			if ((product_list.get(i).getPrix()>=min) &&
				(product_list.get(i).getPrix()<=max)) 
			{
				p = product_list.get(i);
				s+=p.toString()+"\n";
				res ++;
			}
		}
		if (res == 0)
			System.out.println("Aucun produit n'a trouvé");
		else if (res == 1)
			System.out.println("1 produit a trouvé");
		else
			System.out.println(res+" produits a trouvé");
		System.out.println(s);
		return res;
	}

	//Fin des méthodes d'affichage

	//Méthodes de classement


	//Fin des méthodes de classement

	//Méthodes privées à l'objet
	private boolean existe(Produit p)
	{
		for (int i=0;i<product_list.size();i++)
		{
			if (product_list.get(i).equals(p))
				return true;
		}
		return false;
	}
}