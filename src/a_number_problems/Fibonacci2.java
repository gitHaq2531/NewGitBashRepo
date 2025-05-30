package a_number_problems;

import java.util.Scanner;

public class Fibonacci2 
{
public static void main(String[] args) 
{
	int a=0;
	int b=1;
	int c=0;
	int d=0;
	Scanner s=new Scanner(System.in);
	System.out.println("total number of fibonacci numbers: ");
	int n=s.nextInt();
	for(int i=3;i<=n;i++)
	{
		c=a+b;
		if(c%2==0)
		{
			d++;
			if(d==3)
				System.out.print(c);
		}
		a=b;
		b=c;
	}
}
}
