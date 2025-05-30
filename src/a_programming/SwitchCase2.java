// swapping numbers from a to b,,, from b to a...


package a_programming;
import java.util.Scanner;

public class SwitchCase2 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=10;
		
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println();
		
		int c=10;
		int d=20;
		c=c*d;
		d=c/d;
		c=c/d;
		System.out.println("d is "+d);
		System.out.println("c is "+c);
		System.out.println();
		int x=10;
		int y=20;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
		
		
		check();
	}
	public static void check()
	{
		boolean b;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("enter any value");
		int a=s.nextInt();
		switch(a%2)
		{
		case 0: System.out.println("even");
		break;
		default: System.out.println("odd");
		}
		System.out.println("do u want it again??");
		b=s.nextBoolean();
		}
		while(b);
		System.out.println("thank u");
		s.close();
	}
}
