package TestJava;

public class Mobile 
{
	String brand;
	int price;
	public Mobile(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public void display()
	{
		System.out.println("====mobile details loading=====");
		System.out.println("BRAND IS : "+brand);
		System.out.println("PRICE IS : "+price);
		System.out.println();
	}
}
