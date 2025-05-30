package nonPrimitiveTypeCast;
import java.util.Scanner;
public class ShowRoom 
{
	static int bik,crr,trr;
	public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter 1 for bike, enter 2 for car, enter 3 for truck...");
	int a=s.nextInt();
	switch(a)
	{
	case 1: Bike b=new Bike();
	ShowRoom.show(b);
	case 2: Car c=new Car();
	ShowRoom.show(c);
	case 3: Truck t=new Truck();
	ShowRoom.show(t);
	default: System.out.println("invalid input...");
	s.close();
	}
}
	public static void show(Vehicle v)
	{
		v.display();
		if(v instanceof Bike)
		{
			bik++;
		}
		else if(v instanceof Car)
		{
			crr++;
		}
		else if(v instanceof Truck)
		{
			trr++;
		}
	}
}
