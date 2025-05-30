package encapsulation;

public class Person 
{
	String name;
	int age;
	long contact;
	public Person(String n,int a,long c)
	{
		this(n,a);
		contact=c;
		System.out.println("parent loading...");
	}
	public Person(String n,int a)
	{
		name=n;
		age=a;
	}
	public void display()
	{
		//System.out.println(name);
		//System.out.println(age);
		//System.out.println(contact);
	}
}
