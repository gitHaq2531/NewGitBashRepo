package a_practice_string_problems;

public class LastTwoChar 
{
	public static void main(String[] args) 
	{
		String s="Hello";
		if(s.length()>=2)
		{
		String res=s.substring(s.length()-2);
		System.out.println('"'+res+res+res+'"');
		}
	}
}
