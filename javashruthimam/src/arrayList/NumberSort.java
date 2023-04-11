package arrayList;
import java.util.*;
public class NumberSort
{

	public static void main(String[] args)
{	
ArrayList<Integer> ab=new ArrayList<Integer>();
ab.add(400);
ab.add(300);
ab.add(200);
ab.add(100);
ab.add(600);
ab.add(500);
System.out.println("before sorting");
for(Integer d:ab)
{
	System.out.println(d);
}
Collections.sort(ab);
System.out.println("AFTER SORTING");
for(Integer e:ab)
{
	System.out.println(e);
}
}
}
