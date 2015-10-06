public class Main {
	public static void main (String [] argv)
	{
		System.out.println("Création d'une catalogue vide");
		Catalogue c = new Catalogue();
		System.out.println("Affichage de la liste des produits : ");
		c.afficherListeProduits();
		System.out.println("Création de deux produits");
		Produit p1 = new Produit("Produit1","Ceci est le description de produit 1","Informatique",500);
		Produit p2 = new Produit("Produit2","Ceci est le description de produit 2","Livre",1000);
		System.out.println("ajout des produits à la catalogue");
		c.ajouter_produit(p1);
		c.ajouter_produit(p2);
		System.out.println("Affichage de la liste des produits : ");
		c.afficherListeProduits();
		System.out.println("Recherche de produit nom='Produit1'");
		c.searchByName("Produit1");
		System.out.println("Classer les produits par l'ordre croissant de leurs prix");
		c.classerCroissantPrix();
		System.out.println("Affichage de la liste des produits : ");
		c.afficherListeProduits();
		System.out.println("Suppression de l'objet p1 de catalogue");
		c.supprimer(p1);
		System.out.println("Affichage de la liste des produits : ");
		c.afficherListeProduits();
		System.out.println("\n\n\nCréation d'un panier");
		Panier panier = new Panier();
		System.out.println("Ajout des produits dans le panier");
		panier.add(p1,6);
		
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);
		panier.add(p2);

		System.out.println("Affichage de panier : ");
		panier.afficher();

		System.out.println("Le prix total de votre panier est  "+panier.prixTotal());
		System.out.println("La quantité de p1 dans votre panier est "+panier.quantite(p1));
	}
}