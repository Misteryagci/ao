package td2.structures.arbre.operants;

import td2.structures.arbre.Feuille;

public class Nombre extends Feuille<Double> {

	public Nombre(Double content) {
		super(content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		return super.getContent();
	}

}
