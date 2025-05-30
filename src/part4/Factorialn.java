package part4;
import java.util.Scanner;
public class Factorialn 
{
	public static void main(String[] args) 
	{
		boolean b;
		do {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to find factorial:..");
		int a=s.nextInt();
		System.out.println(Factorialn.fact(a));
		System.out.println("do u want again...");
		b=s.nextBoolean();
		s.close();
		}
		while(b);
	}
	public static int fact(int n)
	{
		if(n>1)
		return n*Factorialn.fact(n-1);
		else
			return 1;
	}
}
