package qtalkassignment;

import java.util.HashMap;
import java.util.TreeMap;

public class HashmapTreemap 
{
	public static void main(String[] args) 
	{
		HashMap<Long, String> h=new HashMap<Long, String>();
		h.put(6206861440l, "haque");
		h.put(9102861214l, "sam");
		h.put(7462801230l, "alex");
		TreeMap<Long,String> t=new TreeMap<Long,String>(h);
		System.out.println(t);
	}
}
