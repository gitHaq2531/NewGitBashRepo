package TestJava;

import java.util.LinkedList;

public class Driver 
{
	public static void main(String[] args) 
	{
		LinkedList<Mobile> a=new LinkedList<>();
		Mobile m1=new Mobile("onePlus",20000);
		a.add(m1);
		Mobile m2=new Mobile("Nothing",28000);
		a.add(m2);
		Mobile m3=new Mobile("oppo",55000);
		a.add(m3);
		Mobile m4=new Mobile("iphone",75000);
		a.add(m4);
		System.out.println("===mobile with price greater than 50000==");

		for(Mobile i:a)
		{
			if(i.price>50000)
			{
				i.display();
			}
		}
	}
}
