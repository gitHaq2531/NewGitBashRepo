//Design a program that prints details of person whose age within the range of 20 to 30.  


package ArrayTest;

public class Person 
{
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("name is : "+name);
		System.out.println("age is : "+age);
	}
	public static void main(String[] args) 
	{
		Person p[]=new Person[4];
		Person p1=new Person("alex",20);
		Person p2=new Person("sam",25);
		Person p3=new Person("smith",34);
		Person p4=new Person("harry",19);
		p[0]=p1;
		p[1]=p2;
		p[2]=p3;
		p[3]=p4;
		for(int i=0;i<p.length;i++)
		{
			if(p[i].age>=20 && p[i].age<=30)
			{
			System.out.println("============details===========");
			p[i].display();
			}
		}
	}
}
