//145=1!+4!+5!....

package a_programming;

public class PetersonNum 
{
	public static int fact(int n)
	{
		int rem=1;
		for(int i=n;i>=1;i--)
		{
			rem=rem*i;
		}
		return rem;
	}
	public static boolean check(int n)
	{
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+fact(rem);
			temp=temp/10;
		}
		if(sum==n)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int n=151;
		System.out.println(check(n));
	}
}
