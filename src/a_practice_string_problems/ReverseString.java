package a_practice_string_problems;

public class ReverseString 
{
public static void main(String[] args) 
{
	String s="SAGAR SHRIDHAR MURTHY";
	String a=s.substring(0, 5);
	for(int i=a.length()-1;i>=0 ;i--)
	{
		System.out.print(a.charAt(i));
	}
	System.out.print(" ");
	String b=s.substring(6, 14);
	for(int i=b.length()-1;i>=0 ;i--)
	{
		System.out.print(b.charAt(i));
	}
	System.out.print(" ");
	String c=s.substring(15);
	for(int i=c.length()-1;i>=0 ;i--)
	{
		System.out.print(c.charAt(i));
	}
}
}
