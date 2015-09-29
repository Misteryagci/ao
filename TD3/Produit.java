public class Produit {

	private String nom;
	private String description;
	private String type_produit;
	private double prix; //Prix en euro

	//Constructeur
	public Produit (String name,String desc,String type,double prix)
	{
		this.nom=name;
		this.description = desc;
		this.type_produit = type;
		this.prix = prix;
	}


	//Les getters
	public String getNom()
	{
		return this.nom;
	}
	public String getDescription()
	{
		return this.description;
	}
	public String getType()
	{
		return this.type_produit;
	}
	public double getPrix()
	{
		return this.prix;
	}

	//Les setters
	public void setNom(String n)
	{
		this.nom = n;
	}
	public void setDescription(String d)
	{
		this.description = d;
	}
	public void setType (String t)
	{
		this.type_produit = t;
	}
	public void setPrix(double p)
	{
		this.prix = p;
	}

	/*
		Comparateur de deux objets produits
			Return 1 si les objets sont identiques
			Return 0 si les objets ne sont pas identiques
	*/
	@Override
	public int equals (Produit p)
	{
		if ( (this.nom.equals(p.getNom())) &&
			 (this.description.equals(p.getDescription())) &&
			 (this.type_produit.equals(p.getType())) &&
			 (this.prix == p.getPrix())
			)
			return 1;
		else
			return 0;
	}

	@Override
	public String toString ()
	{
		return "Nom : "+this.nom+"\n"+
			   "Description : "+this.description+"\n"+
			   "Type : "+this.type_produit+"\n"+
			   "Prix : "+this.prix+"\n";
	}

}