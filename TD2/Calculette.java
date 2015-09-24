public class Calculette {
	private Memoire m;
	private double current;
	private String history;
	private double res;
	public Calculette()
	{
		m = new Memoire();
		current=0;
		history="";
		res=0;

	}
	public double addition (double a,double b)
	{
		if (current != a)
		{
			history+=a;
		}
		history+=" + "+b+" ";
		current = b;
		res = a+b;
		return a+b;
	}
	public double soustraction (double a,double b)
	{
			if (current != a)
		{
			history+=a;
		}
		history+=" - "+b+" ";
		current = b;
		res = a-b;
		return a-b;
	}
	public double multiplication (double a,double b)
	{	
		if (current != a)
		{
			history+=a;
		}
		history+=" * "+b+" ";
		current = b;
		res = a*b;
		return a * b;
	}
	public double division (double a,double b)
	{	
		if (current != a)
		{
			history+=a;
		}
		history+=" / "+b+" ";
		current = b;
		res=a/b;
		return a/b;
	}
	public void replaceMemory (double a)
	{
		if (current != a)
		{
			history+=a;
		}
		history += " MS ";
		m.replaceMemoire(a);
	}
	public void addToMemory (double a)
	{
		if (current != a)
		{
			history+=a;
		}
		history += " M+ ";
		m.addMemoire(a);
	}
	public void soustToMemory(double a)
	{
		if (current != a)
		{
			history+=a;
		}
		history += " M- ";
		m.subsMemoire(a);
	}
	public double getMemory()
	{
		history += " MR ";
		return m.getMemoire();
	}
	public void cleanMemory()
	{
		history += " MC ";
		m.clean();
	}
	public String toString()
	{
		return ""+history+"\n"+res+"\n"+m.toString();
	}
	public void clean_up ()
	{
		history = "";
		current = 0;
		res= 0;
	}
}