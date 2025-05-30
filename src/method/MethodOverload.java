package method;
import java.util.Scanner;
public class MethodOverload 
{
	public static void add(int a,int b)
	{
		System.out.println("sum of a,b is: ");
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("sum of a,b,c is: ");
		System.out.println(a+b+c);
		
	}
	public static void add(int a,int b,int c,int d)
	{
		System.out.println("sum of a,b,c,d is: ");
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter frst number: ");
		int a=s.nextInt();
		System.out.println("enter 2nd number: ");
		int b=s.nextInt();
		System.out.println("enter 3rd number: ");
		int c=s.nextInt();
		MethodOverload.add(a,b,c);
		s.close();
		//int a=4;
		//int b=7;
		//int c=8;
		//int d=1;
		//MethodOverload.add(a, b,c);
		//MethodOverload.add(a, b, c, d);
	}
}
