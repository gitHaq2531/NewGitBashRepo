package programmingA;

import java.util.Scanner;
public class TestNormal 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("kitne ka table cahiye beta???");
		int a=s.nextInt();
		
		for(int b=1;b<=10;b++)
		{
			System.out.println(a+"*"+b+"="+(a*b));
		}
	}
}
