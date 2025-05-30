package TestJava;

import java.util.ArrayList;

public class Even 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> a=new ArrayList();
		a.add(9);
		a.add(6);
		a.add(8);
		a.add(2);
		for(Integer i:a)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
