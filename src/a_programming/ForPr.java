package a_programming;
import java.util.Scanner;

public class ForPr 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter start value...");
		int n=s.nextInt();
		System.out.println("enter end value...");
		int m=s.nextInt();

		//print1();
		//print2(n);
		//print3(n,m);
		//print4();
		print5(n);
		print6(n,m);
		s.close();
	}
	public static void print1() 
	{
		System.out.println("=============1 to 100 print===================");
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+",");
		}
		System.out.println();
		
	}
	public static void print2(int n)
	{
		System.out.println("===========print 1 to n===========");
		//Scanner s=new Scanner(System.in);
		//System.out.println("========till where you want??========");
		//int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	public static void print3(int n,int m)
	{
		System.out.println("from start to end========");
		//Scanner s=new Scanner(System.in);
		//System.out.println("from where you want to print???");
		//int n=s.nextInt();
		//System.out.println("till where you want??");
		//int m=s.nextInt();
		for(int i=n;i<=m;i++)
		{
			System.out.println(i);
		}
	}
	public static void print4()
	{
		for(int i=2;i<=100;i=i+2)
		{
			System.out.println(i);		
		}
	}
	public static void print5(int m)
	{
		System.out.println("printing even numbers till a point");
		//Scanner s=new Scanner(System.in);
		//System.out.println("till where you want???");
		//int n=s.nextInt();
		for(int i=2;i<=m;i=i+2)
		{
			System.out.println(i);
		}
	}
	public static void print6(int n,int m)
	{
		System.out.println("printing even numbers within a range");
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter start value...");
		int n=s.nextInt();
		System.out.println("enter end value...");*/
		//int m=s.nextInt();
		for(int i=n;i<=m;i=i+2)
		{
			System.out.println(i);
		}
	}
}
