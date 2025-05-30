package list;

public class Student 
{
	String name;
	float per;
	public Student(String name,float per)
	{
		this.name=name;
		this.per=per;
	}
	public void display()
	{
		System.out.println("========student details=====");
		System.out.println("NAME: "+name);
		System.out.println(", PERCC: "+per);
	}
}
