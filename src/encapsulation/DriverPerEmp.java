package encapsulation;

public class DriverPerEmp 
{
	public static void main(String[] args) 
	{
		
		Employee e=new Employee("sam",22,9876545678l,101,25000);
		e.display();
		e.view();

		Person p=new Person("alex",33);
		System.out.println();
		p.display();
		//p.view();
	}
}
