package a_programming;

public class SqrtCheckPrime 
{
	public static void main(String[] args) 
	{
		int n=8;
		if(check(n))
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not prime");
	}
	public static boolean check(int n)
	{
		if(n==1 || n==0)
			return false;
		else if(n==2)
			return true;
		else if(n%2==0)
			return false;
		for(int i=3;i<n/2;i=i+2)
		{
			if(n%i==0)
				return false;
		}
			return true;
	}
}
