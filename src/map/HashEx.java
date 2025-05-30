/*Create a hash map ,,,TreeMap,,,LinkedHashMap
 * add elements,,,,add complete map into another map,,,
 * check key is present,,,, check value is present...
 * delete an entry,,, delete complete map(clear the map)...
 * fetch a particular value ....
 * display all keys,,,,, display all values,,, display all entry
 * check size...check if empty,,, check 2 entries are equal,,, check hasCode
 * */ 


package map;
//import java.util.HashMap;
import java.util.TreeMap;

public class HashEx 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t=new TreeMap<Integer, String>();
		t.put(1,"oye");
		t.put(2,"hello");
		t.put(3,"hii");
		t.put(4, "bro");
		TreeMap<Integer,String> t2=new TreeMap<>();
		t2.put(11, "oye");
		t2.put(12,"suno");
		t2.put(13,"you");
		t.putAll(t2);
		System.out.println();
		//t.clear();
		//System.out.println(t.isEmpty());
		
		

	}
}
