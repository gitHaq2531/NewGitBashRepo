package collection;

import java.util.ArrayList;

public class Circle2 
{
	double radius;
	double diam;
	public Circle2(double radius,double diam)
	{
		this.radius=radius;
		this.diam=diam;
	}
	public void display()
	{
		System.out.println("circle ddddd=======");

		System.out.println("radius is : "+radius);
		System.out.println("dia is : "+diam);
	}
	public String toString()
	{
		return "radius is: "+radius+" ,,,,and dia is : "+diam; 
	}
	public static void main(String[] args) 
	{
		ArrayList<Circle2> a=new ArrayList();
		Circle2 c1=new Circle2(5.5,6.6);
		a.add(c1);
		Circle2 c2=new Circle2(4.3,2.1);
		a.add(c2);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}
