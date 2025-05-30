package a_practice_string_problems;

public class AddStringToString 
{
public static void main(String[] args) 
{
	String s="indiaismycountry";
	String b="";
	for(int i=0;i<s.length();i++)
	{
		b=b+s.charAt(i);
		if(b.equals("india"))
		{
			b=b+" ";
		}
		else if(b.equals("india is"))
		{
			b=b+" ";
		}
		else if(b.equals("india is my"))
		{
			b=b+" ";
		}
	}
	System.out.println(b);
}
}
