package assignment26march;

import java.util.ArrayList;

import interf.I;

public class Driver 
{
	static int b=0;
	static int c=0;
	public String toString(int b,int c)
	{
		return "bike loaded: "+b+" and car loaded : "+c;
	}
	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		Bike b1=new Bike();
		a.add(b1);
		Bike b2=new Bike();
		a.add(b2);
		Car c1=new Car();
		a.add(c1);
		Car c2=new Car();
		a.add(c2);
		for(Object i:a)
		{
			if(i instanceof Bike)
			{
				b++;
			}
			else
				c++;
		}
		System.out.println();
	}
}
