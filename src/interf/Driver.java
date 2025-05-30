package interf;
import java.util.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		ArrayList <String> a=new ArrayList();
		a.add("hi");
		a.add("by");
		a.add("oo");
		a.add("pp");
		a.add("qq");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.remove("hi");
		System.out.println(a);
	}
}
