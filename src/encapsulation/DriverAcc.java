package encapsulation;

import java.util.Scanner;

public class DriverAcc 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Account a=new Account(23000,9876545678l);
		boolean b;
		do

		{
		System.out.println("enter 1 to see balance: ");
		System.out.println("enter 2 to update contact: ");
		System.out.println("enter 3 to see contact: ");
		int n=s.nextInt();
		if(n==1)
		System.out.println(a.getBal());
		else if(n==2)
		{
		System.out.println("enter new contact: ");
		long c=s.nextLong();
		a.setContact(c);
		}
		else if(n==3)
		System.out.println(a.getContact());
		System.out.println();
		System.out.println("do you want again??");
		b=s.nextBoolean();
		}
		while(b);
		System.out.println("thank uuu");
	}
}
