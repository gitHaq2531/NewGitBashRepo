package map;

import java.util.HashMap;

public class HashEx2 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Student> h=new HashMap<>();
		Student s1=new Student("sam",66.7f);
		Student s2=new Student("alex",77.2f);
		h.put(101,s1);
		h.put(102,s2);
		h.put(103,new Student("smith",55.8f));
		System.out.println(h.entrySet());
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println("using for each loop====");
		for(Integer i:h.keySet())
		{
			System.out.println(" "+i+":  "+h.get(i));
		}
	}
}
