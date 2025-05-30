package qtalkassignment;

import java.util.ArrayList;

public class Employee 
{
	int id;
	float sal;
	public Employee(int id,float sal)
	{
		this.id=id;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("ID ===> "+id);
		System.out.println("SALARY ===> "+sal);
	}
	public static void main(String[] args) 
	{
		ArrayList<Employee> a=new ArrayList<>();
		Employee e1=new Employee(101,35000);
		Employee e2=new Employee(102,65000);
		Employee e3=new Employee(103,45000);
		Employee e4=new Employee(104,85000);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		for(Employee i:a)
		{
			if(i.id==102 && i.sal==65000)
			{
				i.display();
			}
		}
	}
	
}
