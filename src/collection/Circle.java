package collection;

import java.util.ArrayList;

public class Circle 
{
	String radius;
	String diameter;
	public Circle(String radius,String diameter)
	{
		this.radius=radius;
		this.diameter=diameter;
	}
	public void display()
	{
		System.out.println(radius);
	}
	
	public String toString()//.. we can use this also for return.
	{
		return "radius is: "+radius+" and diameter is: "+diameter;

	}
	public static void main(String[] args) 
	{
		ArrayList <Circle> a=new ArrayList();
		Circle c1=new Circle("10 cm","40 cm");
		a.add(c1);
		Circle c2=new Circle("15 cm","50 cm");
		a.add(c2);
		Circle c3=new Circle("30 cm","60 cm");
		a.add(c3);
		System.out.println(a.get(0));
		System.out.println("====using for each loop..=====");
		for(Circle i:a)
		{
			//System.out.println(i);
			i.display();
		}
		System.out.println("using for loop====");
		for(int i=0;i<a.size();i++)
		{
			//System.out.println(a.get(i));
			a.get(i).display();
		}
	}
}
