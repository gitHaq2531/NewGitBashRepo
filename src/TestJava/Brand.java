package TestJava;


public class Brand 
{
	String brand;
	int price;
	public Brand(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public void display()
	{
		System.out.println(brand);
		System.out.println(price);
	}
}
