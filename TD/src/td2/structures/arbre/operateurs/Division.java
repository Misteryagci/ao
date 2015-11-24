package td2.structures.arbre.operateurs;

import td2.structures.arbre.Noeud;
import td2.structures.arbre.NoeudBinaire;

public class Division extends NoeudBinaire{

	public Division(Noeud el,Noeud er) {
		super("/",el,er);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		return super.getFg().calcul()/super.getFd().calcul();
	}

}
