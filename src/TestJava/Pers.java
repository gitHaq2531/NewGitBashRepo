package TestJava;

public class Pers 
{
	private int age;
	String name;
	int roll;
	double per;
	public Pers(int age,String name,int roll,double per)
	{
		this(age,roll,per);

		System.out.println("prnt load");
	//this.age=age;
	this.name=name;
	}
	public Pers(int age,int roll,double per)
	{
		this(age,roll);
		this.per=per;
	}
	public Pers(int age,int roll)
	{
		this.age=age;
		this.roll=roll;
	}
	public void display1()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(roll);
		System.out.println(per);
	}
}
