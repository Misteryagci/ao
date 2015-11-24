package td2.structures.arbre;

public abstract class Noeud<T> {
	
	protected T content;
	
	public Noeud (T content)
	{
		this.content = content;
	}
	
	public T getContent()
	{
		return this.content;
	}
	
	public void setContent(T c)
	{
		this.content = c;
	}
	
	public abstract double calcul();
}
