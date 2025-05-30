package encapsulation;

public class Employee extends Person
{
	int id;
	double sal;
	 public Employee(String n,int a,long c,int i,double s)
	{
		super(n,a,c);
		System.out.println("child loading...");
		id=i;
		sal=s;
	}
	public void view()
	{
		System.out.println(id);
		System.out.println(sal);
	}
}
