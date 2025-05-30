package assignment26march;
import java.util.ArrayList;
public class Q2 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> a=new ArrayList();
		a.add(4);
		a.add(8);
		a.add(3);
		a.add(9);
		a.add(6);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}
