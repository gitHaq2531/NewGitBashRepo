package practice_programming;

import java.util.Scanner;
public class Sum 
{
	public static int check(int a,int b)
	{
		if((a+b)>=10 && (a+b)<=19)
		{
			return 20;
		}
		else
		{
			return a+b;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st value: ");
		int a=s.nextInt();
		System.out.println("enter 2nd value: ");
		int b=s.nextInt();
		System.out.println("sum of both value is "+check(a,b));
		s.close();
	}
}
