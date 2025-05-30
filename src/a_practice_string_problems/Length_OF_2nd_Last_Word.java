package a_practice_string_problems;

public class Length_OF_2nd_Last_Word 
{
public static void main(String[] args) 
{
	String s="HELLO,BROTHER.GOOD MORNING/EVENING";
	String a[]=s.split("[,. /]");
	System.out.println(a[a.length-2].length());
}
}
