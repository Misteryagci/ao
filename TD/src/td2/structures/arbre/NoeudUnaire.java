package td2.structures.arbre;

public abstract class NoeudUnaire<T> extends Noeud<T>{

	private Noeud fils;
	
	public NoeudUnaire(T content,Noeud fils) {
		super(content);
		this.fils = fils;
		// TODO Auto-generated constructor stub
	}
	
	public Noeud getFils()
	{
		return this.fils;
	}
	
	public void setFils(Noeud n)
	{
		this.fils = fils;
	}
}
