package td2.structures.arbre.operateurs;

import td2.structures.arbre.Noeud;
import td2.structures.arbre.NoeudBinaire;

public class Multiplication extends NoeudBinaire<String> {

	public Multiplication( Noeud fg, Noeud fd) {
		super("*", fg, fd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		return super.getFg().calcul()*super.getFd().calcul();
	}

}
