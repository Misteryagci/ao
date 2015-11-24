package td2.structure.operateurs;

public abstract class OperateurBinaire extends Operateur {
	
	public double element_left, element_right;
	
	public OperateurBinaire (double el,double er,String content)
	{
		super(content);
		this.element_left = el;
		this.element_right = er;
	}
}
