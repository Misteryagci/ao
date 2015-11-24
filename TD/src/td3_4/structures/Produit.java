package td3_4.structures;

import tools.Functions;

public abstract class Produit implements Comparable<Produit> {

	private String name;
	private String description;
	private double prix; //Prix en euros
	private String seller;
	private final String identifiant;
	private String category;
	
	public Produit(String name,String description,double prix,String seller,String category) {
		this.name = name;
		this.description = description;
		this.prix = prix;
		this.seller = seller;
		identifiant = Functions.generateString();
		this.category = category;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the seller
	 */
	public String getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(String seller) {
		this.seller = seller;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produit [name=" + name + ", description=" + description + ", prix=" + prix + ", seller=" + seller
				+ ", identifiant=" + identifiant + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Produit o) {
		if (this.getPrix()>o.getPrix())
			return 1;
		return 0;
	}
	
	
	

}
