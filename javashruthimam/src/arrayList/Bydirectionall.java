package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Bydirectionall {
	int id;
	String name;
public Bydirectionall(int id,String name)
{
this.id=id;
this.name=name;
}
public String toString()
{
	return id+" "+name;
}
	public static void main(String[] args) 
{
		Collection object;
		ArrayList<Object> d=new ArrayList<Object>();
		d.add(10);
		d.add(200);
		d.add("deepan");
		d.add('A');
		d.add(10.3f);
		System.out.println(d);
		Iterator<object> i=d.iterator();
		while(i.hasNext())
		{
			System.out.println(i.Next());
		}
	}

}
