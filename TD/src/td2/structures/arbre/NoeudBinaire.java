package td2.structures.arbre;

public abstract class NoeudBinaire<T> extends Noeud<T> {

	private Noeud fils_droit,fils_gauche;
	public NoeudBinaire (T content,Noeud fg,Noeud fd)
	{
		super(content);
		this.fils_gauche = fg;
		this.fils_droit = fd;
	}
	
	public void setFg(Noeud fg)
	{
		this.fils_gauche = fg;
	}
	
	public void setfd(Noeud fd)
	{
		this.fils_droit = fd;
	}
	
	public Noeud getFg()
	{
		return this.fils_gauche;
	}
	
	public Noeud getFd()
	{
		return this.fils_droit;
	}
	
	public abstract double calcul();
}
