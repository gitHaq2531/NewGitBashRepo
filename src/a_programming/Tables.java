package a_programming;

import java.util.Scanner;
public class Tables 
{
	public static void main(String[] args) 
	{
		
		{
		Scanner s=new Scanner(System.in);
		System.out.println("kitne ka table chahiye??....");
		int a=s.nextInt();
		for(int b=1;b<=10;b++)
		{
			System.out.println(a+"*"+b+"="+(a*b));
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("do you want it again??");
		
		}
	}
}
