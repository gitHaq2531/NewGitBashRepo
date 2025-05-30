package arraylist;

import java.util.ArrayList;

public class ExArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		a.add(8);
		//a.add(6);
	//	a.addElement(7);
		//System.out.println(a.firstElement());
		//System.out.println(a.lastElement());
		//System.out.println(a);
		a.set(1, 14);
		a.add(1,99);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.indexOf(8));
		a.add(1,10);
		System.out.println(a);
		System.out.println();
		System.out.println(a.size());
	}
}
