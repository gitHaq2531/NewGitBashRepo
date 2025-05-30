/*A shop will be discounted in percent if the
cost of purchased quantity is more than 1000.
Ask user for entity proposal. 100 will cost 150 cost for user .*/

package a_programming;

import java.util.Scanner;
public class ShopDiscount 
{
	public static void check()
	{
		int cost=100;
		System.out.println("cost of 1 quantity is "+cost);
		Scanner s=new Scanner(System.in);
		System.out.println("enter quantity:");
		int n=s.nextInt();
		float d=((n*cost)*(10f/100));
		if((n*cost)<1000)
		{
			System.out.println("=====no discount========");
			System.out.println("pay : "+(n*cost));
		}
		else
		{
			System.out.println("you got 10% discount...");
			System.out.println("you got discount of RS."+d);
			System.out.println("pay : "+(n*cost-d)+" only");
		}
		s.close();
	}
	public static void main(String[] args) 
	{
		boolean b;
		Scanner s=new Scanner(System.in);
		do
		{
		check();
		System.out.println("do you want to print bill again??");
		b=s.nextBoolean();
		}
		while(b);
		s.close();
		System.out.println("thank you.. visit again");
	}
}
