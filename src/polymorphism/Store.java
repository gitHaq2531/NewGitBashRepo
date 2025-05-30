package polymorphism;

import java.util.Scanner;

public class Store 
{
	static int pn,nn;
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		boolean b;
		do
		{
		System.out.println("enter 1 for Puma and 2 for Nike");
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			Puma p=new Puma();
			
			add(p);
		break;
		case 2:
			Nike n=new Nike();
			
			add(n);
		break;
		default:
			System.out.println("wrong input.. sorry");
		}
		System.out.println("do you want again??");
		b=s.nextBoolean();
		}
		while(b);
		System.out.println("PUMA ADDED '"+pn+"' times");
		System.out.println("NIKE ADDED '"+nn+"' times");
		System.out.println("TOTAL : "+(pn+nn));
		s.close();
	}
	public static void add(Brand ob)
	{
		if(ob instanceof Puma)
		{
			pn++;
		}
		else
			nn++;
	}
}
