package a_practice_string_problems;

public class Compare_two_string 
{
public static void main(String[] args) 
{
	int n=0;
	String s1="hello";
	String s2="hello";
	if(s1.length()!=s2.length())
		System.out.println("not equals");
	else
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				System.out.println("not equals");
			else
				n++;
		}
	}
	if(n==s1.length())
		System.out.println("yes both are equal");
}
}
