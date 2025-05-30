package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortEx 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList();
		a.add("123btm");
		a.add("btm123");
		a.add("123");
		a.add("BTM");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}
}
