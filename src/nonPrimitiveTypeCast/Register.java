package nonPrimitiveTypeCast;

import java.util.Scanner;

public class Register 
{
	static int bi,cr,tr;
	public static void main(String[] args) 
	{
		boolean b;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("enter 1 for bike:, enter 2 for car:, enter 3 for truck:");
			int a=s.nextInt();
			switch(a)
			{
			case 1:Bike bk=new Bike();
			Register.choose(bk);
			break;
			case 2:Car c=new Car();
			Register.choose(c);
			break;
			case 3:Truck t=new Truck();
			Register.choose(t);
			break;
			default:
				System.out.println("invalid input...");
			}
			System.out.println("do you want to repeat,, enter true for repeat,,enter false for exit.");
			b=s.nextBoolean();
			s.close();
		}
		while(b);
		System.out.println("addings for bike is..."+bi);
		System.out.println("addings for car is..."+cr);
		System.out.println("addings for truck is..."+tr);
		System.out.println("total addings is..."+(bi+cr+tr));
		if(bi>cr && bi>tr)
		{
			System.out.println("number of bike is max... ");
		}
		else if(cr>bi && cr>tr)
		{
			System.out.println("number of car is max...");
		}
		else if(tr>bi && tr>cr)
		{
			System.out.println("number of truck is max...");
		}
		else
		{
			System.out.println("i dnt know the value...");
		}
			
		
	}
	public static void choose(Vehicle v)
	{
		v.display();
		if(v instanceof Bike)
		{
			bi++;
		}
		else if(v instanceof Car)
		{
			cr++;
		}
		else
		{
			tr++;
		}
	}
}
