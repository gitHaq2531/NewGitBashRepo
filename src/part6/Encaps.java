package part6;
class Encaps 
{
	String brand;
	public Encaps(String brand)
	{
		this.brand=brand;
	}
	
}
class bcd
{
 public static void main(String[] args) 
	{
		Encaps a=new Encaps("cello");
		System.out.println(a.brand);
	}
}