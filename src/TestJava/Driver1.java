package TestJava;

import java.util.ArrayList;

public class Driver1 
{
	public static void main(String[] args) 
	{
		int bikecount=0;
		int carcount=0;
		ArrayList <Object>  a=new ArrayList();
		Bike b1=new Bike();
		a.add(b1);
		Car c1=new Car();
		a.add(c1);
		Car c2=new Car();
		a.add(c2);
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) instanceof Bike)
			{
				bikecount++;
			}
			else
			{
				carcount++;
			}
		}
		System.out.println("bike loaded==="+bikecount);
		System.out.println("car loaded=="+carcount);
	}
	public static void count(Vehicle v)
	{
		
	}
}
