package a_practice_string_problems;

public class Convert_Upper_Lower_vice_versa 
{
public static void main(String[] args) 
{
	String s="aBcD@123";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90)
		{
			char res=(char)(ch+32);
			System.out.print(res);
		}
		else if(ch>=97 && ch<=122)
		{
			char res=(char)(ch-32);
			System.out.print(res);
		}
		else
			System.out.print(s.charAt(i));
	}
}
}