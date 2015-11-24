package td2.structures.memoire;

import java.util.ArrayList;

public class Memoire<T> {

	private ArrayList<T> content;
	public Memoire() {
		this.content=new ArrayList<T>();
	}
	
	public void add(T element)
	{
		this.content.add(element);
	}
	
	public T get(int index)
	{
		return content.get(index);
	}
	
	public T getLast()
	{
		return content.get(content.size()-1);
	}

	public void remove(T element)
	{
		content.remove(element);
	}
	
	public void changeLast(int index,T element)
	{
		ArrayList<T> aux = new ArrayList<T>();
		for (int i=0;i<content.size();i++)
		{
			if (i != index)
				aux.add(content.get(i));
			else
				aux.add(element);
		}
	}
	
	public void changeLast(T element)
	{
		this.remove(this.getLast());
		content.add(element);
	}
}
