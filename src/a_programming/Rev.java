package a_programming;

import java.util.ArrayList;

public class Rev 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList();
		a.add(4);
		a.add(6);
		a.add(98);
		for(Integer i:a)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
