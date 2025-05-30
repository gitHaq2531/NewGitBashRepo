//153=1cube+5cube+3cube...because 153 is 3-digits number...so power will 3.

package a_programming;

public class ArmStrong 
{
	public static boolean check(int n)
	{
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+(rem*rem*rem);
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
		int n=153;
		System.out.println(check(n));
	}
}
