package a_practice_string_problems;

public class Change_Letter_case 
{
public static void main(String[] args) 
{
	String s="abC@123Mk";
	System.out.println(s.toLowerCase());
	System.out.println(toUpper(s));
	System.out.println(toLower(s));
}
public static String toUpper(String s)
{
	String result="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>=97 && ch<=122)
		{
			char res=(char)(ch-32);
			result=result+res;
		}
		else
			result=result+s.charAt(i);
	}
	return result;
}
public static String toLower(String s)
{
	String result2="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90)
		{
			char res=(char)(ch+32);
			result2=result2+res;
		}
		else
			result2=result2+s.charAt(i);
	}
	return result2;
}
}