package td2.structures.arbre.operateurs;

import td2.structures.arbre.Noeud;
import td2.structures.arbre.NoeudBinaire;

public class Somme extends NoeudBinaire<String>{

	public Somme(Noeud el,Noeud er) 
		{	
			super("+",el,er);
		}

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		return super.getFg().calcul()+super.getFd().calcul();
	}
}
