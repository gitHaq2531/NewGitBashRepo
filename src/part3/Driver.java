package part3;

import java.util.Scanner;
public class Driver 
{
public static void main(String[] args)
{
	Product p=new Product(102,15000);
	System.out.println("----choose your option----");
	System.out.println("1. know the price...");
	System.out.println("2. update the price...");
	System.out.println("3. know the product id..");
	Scanner a=new Scanner(System.in);
	System.out.println("enter input:");
	int x=a.nextInt();
	a.close();
	if(x==1)
	{
		System.out.println(p.getPrice());
	}
	else if(x==2)
	{
		System.out.println("enter new price: ");
		int pr=a.nextInt();
		p.setPrice(pr);	
	}
	else if(x==3)
	{
		System.out.println(p.getId());
	}
	else
	{
		System.out.println("wrong input...");
	}
}
}
