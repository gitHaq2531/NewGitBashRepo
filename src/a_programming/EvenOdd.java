package a_programming;
import java.util.Scanner;
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		boolean b;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("enter any integer:");
		int n=s.nextInt();
		check(n);
		System.out.println(check2(n));
		check2(n);
		System.out.println("do you want it again??");
		b=s.nextBoolean();
		s.close();
		}
		while(b);
	}
	public static void check(int a)
	{
		if(a%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number...");
		}
	}
	public static int check2(int b)
	{
		System.out.println("from without using % operator...");
		if((b/2)*2==b)
		{
        return 1;
		}
		else
		{
		return 2;
		}
	}
}
