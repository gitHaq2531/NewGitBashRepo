package a_practice_string_problems;

public class Count_Upper_Lower_Case 
{
public static void main(String[] args) 
{
	String s="HeLLO@123";
	int a=0;
	int b=0;
	int c=0;
	for(int i=0;i<s.length();i++)
	{
		if(Character.isUpperCase(s.charAt(i)))
			a++;
	}
	System.out.println("total upper case letters in "+s+ " is "+a);
	for(int i=0;i<s.length();i++)
	{
		int n=s.charAt(i);
		if(n>=97 && n<=122)
			b++;
	}
	System.out.println("total lower case letters in "+s+ " is "+b);
	for(int i=0;i<s.length();i++)
	{
		int n=s.charAt(i);
		if(n>=48 && n<=57)
			c++;
	}
	System.out.println("total digits in "+s+ " is "+c);
}
}