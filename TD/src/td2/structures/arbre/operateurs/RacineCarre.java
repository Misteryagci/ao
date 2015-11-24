package td2.structures.arbre.operateurs;

import td2.structures.arbre.Noeud;
import td2.structures.arbre.NoeudUnaire;

public class RacineCarre extends NoeudUnaire<String> {

	public RacineCarre( Noeud fils) {
		super("sqrt", fils);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		return Math.sqrt(super.getFils().calcul());
	}

}
