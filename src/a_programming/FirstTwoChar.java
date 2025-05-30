package a_programming;
// print 3 times of first 2 chars
public class FirstTwoChar 
{
public static void main(String[] args) 
{
	String s="HELLO";
	if(s.length()>=2)
	{
		String res=s.substring(0,2);
		System.out.println(res+res+res);
	}
}
}
