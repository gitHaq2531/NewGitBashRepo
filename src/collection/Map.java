package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Map 
{
public static void main(String[] args) 
{
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(0, null);
	hm.put(1, "haque ");
	hm.put(2, "hey");
	HashMap<Integer, String> hm2=new HashMap<Integer, String>();
	hm.put(0, null);
	hm.put(13, "haque ");
	hm.put(21, "hey");
	hm2.putAll(hm);;
	System.out.println(hm2);
	System.out.println(hm2.remove(2));
	System.out.println(hm2);
	
	System.out.println(hm2.entrySet());
}
}
