package arrayList;

class First 
{

	public void print()
	{
		System.out.println("deepan");
	}
	public void extra()
	{
		System.out.println("chakravarty");
	}

}

class Second extends First
{
	public void print()
	{
		System.out.println("sel");
	}
	public void dee()
	{
		System.out.println("man");
	}

}

class Third extends First
{
	public void print()
	{
		System.out.println("ram");
	}
	public void pan()
	{
		System.out.println("esh");
	}
}

class Store
{
	public static void main(String[] args)
	{
	First f=new Second();
	f.print();
	f.extra();
	Second s=(Second)f;
	s.dee();
	s.print();
	First f1=new Third();
	f1.print();
Third f2=(Third)f1;
f2.pan();

			
	       
	}
}