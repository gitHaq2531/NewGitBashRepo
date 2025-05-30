package collection;

import java.util.ArrayList;

public class Pen 
{
	String brand;
	int price;
	public Pen(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public void details()
	{
		System.out.println("========pen details=========");
		System.out.println("BRAND IS :: "+brand);
		System.out.println("PRICE IS :: " +price);
	}
	public static void main(String[] args) 
	{
		ArrayList <Pen> p=new ArrayList <Pen>();
		Pen p1=new Pen("cello",25);
		p.add(p1);
		Pen p2=new Pen("reynold",40);
		p.add(p2);
		Pen p3=new Pen("elkose",55);
		p.add(p3);
		p1.details();
		p2.details();
		p3.details();
		for(Pen i:p)
		{
			if(i.price<50)
			{
				System.out.println("=========price<50=======");
				i.details();
			}
		}
	}
}
