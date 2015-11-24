package td2.structures.operateurs;

public abstract class Operateur {

	protected String value;
	
	public Operateur(String v)
	{
		this.value = v;
	}
	
	public String getValue()
	{
		return this.value;
	}
	
	public void setValue (String v)
	{
		this.value = v;
	}
	
	public abstract double calcul();
}
