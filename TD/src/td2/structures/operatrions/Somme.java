package td2.structures.operatrions;

import td2.structure.operateurs.OperateurBinaire;

public class Somme extends OperateurBinaire{


	public Somme(double el, double er, String content) {
		super(el, er, content);
	}

	@Override
	public double calcul() {
		return super.element_left+super.element_right;
	}
	
	
}
