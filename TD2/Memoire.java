public class Memoire {
	private double content;
	public Memoire () {
		content = 0;
	}
	public  void replaceMemoire (double s)
	{
		content = s;
	}
	public double getMemoire ()
	{
		return content;
	}
	public void clean ()
	{
		content = 0;
	}
	public void addMemoire (double s)
	{
		content+=s;
	}
	public void subsMemoire (double s)
	{
		content -= s;
	}
	public String toString ()
	{
		return "Mémoire : "+content;
	}
}	