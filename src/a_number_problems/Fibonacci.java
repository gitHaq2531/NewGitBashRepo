//fibonacci series value less than 100.

package a_number_problems;

import java.util.Scanner;

public class Fibonacci 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("length of series: ");
	int n=s.nextInt();
	int a=0;
	int b=1;
	System.out.print(a+" "+b+" ");
	for(int i=1;i<=n-2;i++)
	{
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		
	}
}
}
