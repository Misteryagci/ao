package td2.structures.operateurs;

public abstract class OperateurUnaire extends Operateur {
	public double element;
	
	public OperateurUnaire(String content,double e)
	{
		super(content);
		this.element = e;
	}
}
