package encapsulation;

import java.util.Scanner;

public class DriverProduct 
{
	public static void main(String[] args) {
		Product p=new Product(101,2100);
		boolean b;
		Scanner s=new Scanner(System.in);
		do{
		System.out.println("press 1 to know the price: ");
		System.out.println("press 2 to update the price.");
		System.out.println("press 3 to know the id.");
		int n=s.nextInt();
		if(n==1)
			System.out.println(p.getPrice());
		else if(n==2)
		{
			System.out.println("enter new price: ");
			int a=s.nextInt();
			p.setPrice(a);
		}
		else if(n==3)
		{
			System.out.println(p.getId());
		}
		System.out.println("do you want it again??");
		b=s.nextBoolean();
		}
		while(b);
	}
}
