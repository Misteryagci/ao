public class Noeud {
	private String content;
	private boolean feuille;
	private Noeud fils_gauche, fils_droit;
	private Memoire m;
	public Noeud ()
	{
		m=new Memoire();
		content ="";
		feuille = false;
		fils_gauche = null;
		fils_droit = null;
	}
	public void setContent(String c)
	{
		content = c;
	}
	public void setFeuille()
	{
		feuille = true;
		fils_gauche = null;
		fils_droit = null;
	}
	public void setFG()
	{
		fils_gauche = new Noeud();
	}
	public void setFD()
	{
		fils_droit = new Noeud();
	}
	public void setFG(Noeud n)
	{
		fils_gauche = n;
	}
	public void setFD(Noeud n)
	{
		fils_droit = n;
	}
	public Noeud getFG ()
	{
		return fils_gauche;
	}
	public Noeud getFD()
	{
		return fils_droit;
	}
	public String toString ()
	{
		String s ="";
		if (feuille)
		{
			s += content+" ";
		}
		else
		{
			if (this.fils_gauche != null)
				s+=this.fils_gauche.toString();
			s+=content+" ";
			if (this.fils_droit != null)
				s+=this.fils_droit.toString();
		}
		return s;
	}
	public String memory ()
	{
		return m.toString();
	}
	public double getRightest()
	{
		if (feuille)
			return Double.parseDouble(content);
		else
			if (this.fils_droit != null)
				return this.fils_droit.getRightest();
		return -9999;
	}
	public double calcul ()
	{
		if (feuille)
		{
			return Double.parseDouble(content);
		}
		else
		{
			switch (content) {
				case "+":
					return getFG().calcul()+getFD().calcul();
				case "-":	
					return getFG().calcul()-getFD().calcul();
				case "*":
					return getFG().calcul()*getFD().calcul();
				case "/":
					return getFG().calcul()/getFD().calcul();
				case "MR":
					return m.getMemoire();
				case "MC":
					m.clean();
					if (getFD() == null)
						return getFG().calcul();
					else
						return getFD().calcul();
				case "M+":
					if (getFD() == null)
					{
						m.addMemoire(getFG().getRightest());
						System.out.println("Ajout à la mémoire");
						return getFG().calcul();
					}
					else {
						m.addMemoire(getFD().getRightest());
						return getFD().calcul();
					}
				case "M-":
					if (getFD() == null)
					{
						m.subsMemoire(getFG().getRightest());
						return getFG().calcul();
					}
					else {
						m.subsMemoire(getFD().getRightest());
						return getFD().calcul();
					}
				case "MS":
					if (getFD() == null)
					{
						m.replaceMemoire(getFG().getRightest());
						return getFG().calcul();
					}
					else {
						m.replaceMemoire(getFD().getRightest());
						return getFD().calcul();
					}
				default :
			}
		}
		return 0;
	}
}