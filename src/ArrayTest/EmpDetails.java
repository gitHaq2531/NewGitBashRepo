package ArrayTest;

public class EmpDetails 
{
	static String job="clerk";
	String name;
	String id;
	double sal;
	public EmpDetails(String name,String id,double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("============="+job+"===============");
		System.out.println("NAME   : "+name);
		System.out.println("id     :"+id);
		System.out.println("salary :"+sal);
	}
	public static void main(String[] args) 
	{
		EmpDetails emp[]=new EmpDetails[4];
		EmpDetails e1=new EmpDetails("sam","sam123",35000);
		EmpDetails e2=new EmpDetails("alex","alex122",38000);
		EmpDetails e3=new EmpDetails("smith","smith121",45000);
		EmpDetails e4=new EmpDetails("allen","allen120",50000);
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		System.out.println("=====details loding=======");
		for(int i=0;i<emp.length;i++)
		{
			emp[i].display();
		}
		System.out.println("========employees with salary more than 40000=======");
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].sal>40000)
			{
				emp[i].display();
			}
		}

	}
}
