package Collection2;

import java.util.ArrayList;

public class Driver 
{
	public static void main(String []args)
	{
		ArrayList a=new ArrayList();
		Student s1=new Student("sam",101);
		a.add(s1);
		Pencil p1=new Pencil(20,"red");
		a.add(p1);
		Student s2=new Student("alex",102);
		a.add(s2);
		Pencil p2=new Pencil(30,"blue");
		a.add(p2);
		Student s3=new Student("peter",103);
		a.add(s3);
		Pencil p3=new Pencil(40,"yellow");
		a.add(p3);
		for(Object i:a)
		{
			System.out.println(i);
		}
	}
}
