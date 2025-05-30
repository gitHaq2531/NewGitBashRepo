package inheritPack;

public class User 
{
	String name;
	long contact;
	int age;
	String country;
	public User(String name,long contact,int age,String country)
	{
		this(name,contact,age);
		this.country=country;
	}
	public User(String name,long contact,int age)
	{
		this(name,contact);
		this.age=age;
	}
	public User(String name,long contact)
	{
		this(contact);
		this.name=name;
	}
	public User(long contact)
	{
		this.contact=contact;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(contact);
		System.out.println(age);
		System.out.println(country);
	}

}
