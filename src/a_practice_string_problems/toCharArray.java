package a_practice_string_problems;

public class toCharArray 
{
public static void main(String[] args) {
	String s="hello";
	System.out.println(toCharArray1(s));
}
public static char[] toCharArray1(String str)
{
	char a[] = new char[str.length()];
	for(int i=0;i<str.length();i++)
	{
		a[i]=str.charAt(i);
	}
	return a;
}
}
