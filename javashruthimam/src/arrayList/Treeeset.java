package arrayList;
import java.util.TreeSet;

public class Treeeset {

	public static void main(String[] args) 
	{
		TreeSet<String>t=new TreeSet<String>();
		t.add("black");
		t.add("blue");
		t.add("red");
		t.add("1");
		t.add("yellow");
		System.out.println(t);
		System.out.println(t.descendingSet());
		
	}

}
