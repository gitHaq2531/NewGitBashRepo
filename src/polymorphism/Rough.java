package polymorphism;

public class Rough 
{
public static void main(String[] args) 
	{
	Nike n=new Nike();
	Puma p=new Puma();
	//Brand b=new Brand();
	add(p);
	}
	public static void add(Brand ob)
	{
		ob.details();
	}
}
