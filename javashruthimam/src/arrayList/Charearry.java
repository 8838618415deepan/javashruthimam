package arrayList;
import java.util.*;
public class Charearry 
{

public static void main(String[] args) 
{
	ArrayList<Character> ob=new ArrayList<Character>();
	ob.add('E');
	ob.add('O');
	ob.add('A');
	ob.add('U');
	ob.add('I');
	System.out.println("before sorting");
	for(Character d:ob)
	{
  System.out.println(d);
	}
	Collections.sort(ob);
	System.out.println("after sorting");
	for(Character d:ob)
	{
	System.out.println(d);
}
}
}