package part1;

public class Equals 
{
	final static int N=8;
	String name;
	public Equals(String n)
	{
		name=n;
	}
public static void main(String[] args) 
{
	String a=new String("haque");
	String b=new String("haque");
	
	String c=b;
	String x="hye";
	String z="hye";
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	System.out.println(x.hashCode());
	System.out.println(z.hashCode());


	System.out.println(x.equals(z));
	System.out.println(a.equals(b));
	if(a==b)
		System.out.println("yes");
}
}
