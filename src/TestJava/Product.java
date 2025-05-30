package TestJava;

public class Product 
{
	private int id;
	private int price;
	public Product(int id,int price)
	{
		this.id=id;
		this.price=price;
	}
	public int getId()
	{
		return id;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
		System.out.println("updated.....");
	}
}
