public class Main {
	public static void main (String [] args)
	{
		Calculette exercice1 = new Calculette();
		exercice1.addition(6,5);
		exercice1.replaceMemory(5);
		System.out.println(exercice1.toString());
		exercice1.clean_up();
		System.out.println("Cleaning up...\n"+exercice1.toString());
		exercice1.division(7,2);
		exercice1.addToMemory(2);
		System.out.println(exercice1.toString());

		Noeud exercice2 = new Noeud();
		exercice2.setContent("/");
		exercice2.setFG();
		exercice2.getFG().setContent("+");
		exercice2.getFG().setFG();
		exercice2.getFG().getFG().setContent("+");
		exercice2.getFG().getFG().setFG();
		exercice2.getFG().getFG().getFG().setFeuille();
		exercice2.getFG().getFG().getFG().setContent("6");
		exercice2.getFG().getFG().setFD();
		exercice2.getFG().getFG().getFD().setFeuille();
		exercice2.getFG().getFG().getFD().setContent("5");
		exercice2.getFG().setFD();
		exercice2.getFG().getFD().setFeuille();
		exercice2.getFG().getFD().setContent("7");
		exercice2.setFD();
		exercice2.getFD().setFeuille();
		exercice2.getFD().setContent("2");
		System.out.println(exercice2.toString()+"\n"+exercice2.memory());

		Noeud ex2_op = new Noeud();
		ex2_op.setContent("M+");
		ex2_op.setFG();
		ex2_op.setFG(exercice2);
		System.out.println(ex2_op.toString()+"\n"+ex2_op.calcul()+"\n"+ex2_op.memory());
	}
}
