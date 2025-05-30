package Code_Bat;

public class Str_Problem 
{
	public static String firstTwo(String str) 
	{
	  if(str.length()>=2)
	   return str.substring(0,2);
	  else 
		  return str;
	  
	}
	public static void main(String[] args) 
	{
		String str="Hello";
		System.out.println(firstTwo(str));
	}
}
