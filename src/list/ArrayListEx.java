package list;
import java.util.LinkedHashSet;
public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> a=new LinkedHashSet<>();
		a.add('a');
		a.add('b');
		a.add("ahbvdgh");
		a.add(88);
		a.add('A');
		a.add('D');
		a.add('B');
		
		System.out.println(a.remove('a'));
		System.out.println(a);
//		System.out.println(a);
//		Collections.sort(a);
//		System.out.println(a);
//		Collections.sort(a,Collections.reverseOrder());
//		System.out.println(a);
//		System.out.println(a.remove());
		//System.out.println(a);
	}
}
