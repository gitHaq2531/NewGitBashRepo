package part4;
import java.util.Scanner;
public class Driver
{
public static void main(String[] args)
{
	boolean b=false;
	Citizen c=new Citizen(822115,123423453456l);
	Scanner s=new Scanner(System.in);
	do
	{
	System.out.println("----choose your option---");
	System.out.println("1. know your adharid..");
	System.out.println("2. know your pincode..");
	System.out.println("3. update your pincode..");
	System.out.println("enter option: ");
	int x=s.nextInt();
	if(x==1)
	{
		System.out.println(c.getAdhard());
	}
	else if(x==2)
	{
		System.out.println(c.getPincode());
	}
	else if(x==3)
	{
		System.out.println("enter new pincode..");
		int pin=s.nextInt();
		c.setPincode(pin);
	}
	else
	{
		System.out.println("wrong input");
	}
	System.out.println("do you want to repeat the menu???");
	b=s.nextBoolean();
}
	while(b);
s.close();
}
}
