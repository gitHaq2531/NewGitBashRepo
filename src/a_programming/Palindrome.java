package a_programming;

public class Palindrome 
{
	public static boolean checkPalindrome(int n)
	{
		long rev=0l;
		long x=n;
		while(n>0)
		{
			long rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(x==rev)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(checkPalindrome(1221));
	}
}
