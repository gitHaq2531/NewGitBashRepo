package a_programming;

import java.util.Scanner;

public class Factorial1 
{
	public static void main(String[] args) 
	{
		int a=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number==>");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println("factorial of "+n+" is "+a);
	}
}
