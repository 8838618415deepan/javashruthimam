package arrayList;

import java.util.*;

public class Hashsett {

	public static void main(String[] args) 
	{
		HashSet<Character> ab=new HashSet<Character>();
		ab.add('d');
		ab.add('p');
		ab.add('e');
		ab.add('a');
		ab.add('n');
		ab.add('e');
		System.out.println("USING FOR EACH LOOP");
		for(Character i:ab)
		{
			System.out.println(i);
		}
		System.out.println("USING IERATOR");
		Iterator<Character> ob=ab.iterator();
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
	}
}