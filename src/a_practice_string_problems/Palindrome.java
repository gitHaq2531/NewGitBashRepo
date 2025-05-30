package a_practice_string_problems;

public class Palindrome 
{
public static void main(String[] args) {
	String s="MAlayaLam";
	String p="";
	for(int i=s.length()-1;i>=0;i--)
	{
		p=p+s.charAt(i);
	}
	System.out.println(s);
	System.out.println(p);
	if(s.equalsIgnoreCase(p))
	{
		System.out.println(s+" is palindrome");
	}
}
}
