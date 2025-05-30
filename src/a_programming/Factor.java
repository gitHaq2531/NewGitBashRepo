package a_programming;

public class Factor 
{
	public static void main(String[] args) 
	{
		int f=5;
		System.out.println(fact(f));
		int b=3;
		int p=5;
		System.out.println(pow(b,p));
	}
	public static int pow(int b,int p)
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*b;
		}
		return res;
	}
	public static long fact(int f)
	{
		long res=1;
		for(int i=f;i>=1;i--)
		{
			res=res*i;
		}
		return res;
	}
	
}
