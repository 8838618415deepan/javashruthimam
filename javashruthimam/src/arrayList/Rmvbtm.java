package arrayList;
import java.util.*;
public class Rmvbtm {

	public static void main(String[] args) 
	{
HashSet<Object> dp=new HashSet<Object>();
dp.add("btm");
dp.add("deepan");
dp.add("bangalore");
dp.add("kerala");
dp.add("silkboard");
System.out.println("using for each loop");
for(Object i:dp)
{
	System.out.println(i);
}

System.out.println(remove("btm"));
	}

}
