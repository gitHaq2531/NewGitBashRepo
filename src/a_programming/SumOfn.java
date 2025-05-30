package a_programming;
import java.util.Scanner;
public class SumOfn 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ente the nth number");
		int a=s.nextInt();
		System.out.println("sum of numbers till "+a+" is "+check(a));
		s.close();
	}
	public static long check(int a)
	{
		long b=a;
		long sum=b*(b+1)/2;
		return sum;
	}
}
