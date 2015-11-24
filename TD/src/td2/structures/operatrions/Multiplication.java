package td2.structures.operatrions;

import td2.structure.operateurs.OperateurBinaire;

public class Multiplication extends OperateurBinaire {

	public Multiplication(double el, double er, String content) {
		super(el, er, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		return super.element_left*super.element_right;
	}

}
