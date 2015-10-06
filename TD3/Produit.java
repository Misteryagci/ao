public class Produit {

	private String nom;
	private String description;
	private String type_produit;
	private double prix; //Prix en euro
	private int hash;  

	//Constructeur
	public Produit (String name,String desc,String type,double prix)
	{
		this.nom=name;
		this.description = desc;
		this.type_produit = type;
		this.prix = prix;
		hash = this.nom.hashCode()+this.description.hashCode()+
				this.type_produit.hashCode()+(""+this.prix).hashCode();
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
	public boolean equals (Object p)
	{
		if (!(p instanceof Produit))
			return false;
		if ((this.nom.equals(((Produit)p).getNom())) &&
			 (this.description.equals(((Produit)p).getDescription())) &&
			 (this.type_produit.equals(((Produit)p).getType())) &&
			 (this.prix == ((Produit)p).getPrix())
			)
			return true;
		return false;
	}

	@Override
	public int hashCode(){
		return hash;
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