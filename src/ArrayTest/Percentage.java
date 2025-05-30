//Design, a programme that prints details of student with percentage grater than 75...


package ArrayTest;

public class Percentage 
{
	int roll;
	String name;
	int per;
	public Percentage(int roll,String name,int per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	public static void main(String[] args) 
	{
	Percentage e[]=new Percentage[4];
		Percentage p1=new Percentage(1,"sam",70);
		Percentage p2=new Percentage(2,"alex",60);
		Percentage p3=new Percentage(3,"harry",78);
		Percentage p4=new Percentage(4,"smith",85);
		e[0]=p1;
		e[1]=p2;
		e[2]=p3;
		e[3]=p4;
		System.out.println("===========details is===================");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].per>75)
			{
			e[i].display();
			System.out.println("===============================");
			}
			}
	}
	public void display()
	{
		System.out.println("roll is : "+roll);
		System.out.println("name is : "+name);
		System.out.println("per is : "+per);
	}
}
