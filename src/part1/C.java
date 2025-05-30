package part1;

public class C extends Brand
{
	String name;
	public   C(String name) 
	{
		this.name=name;
	}
	public static void main(String[] args) 
	{
		C c=new C("abc");
		//Brand b=c;
		c.display();
	}
	public void display()
	{
		System.out.println(name);
	}
}
