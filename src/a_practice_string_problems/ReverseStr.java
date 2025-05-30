package a_practice_string_problems;

public class ReverseStr 
{
public static void main(String[] args) 
{
	String s="MY COUNTRY NAME IS INDIA";
	String str[]=s.split(" ");
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(str[i]+" ");
	}
}
}
