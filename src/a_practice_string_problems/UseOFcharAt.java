package a_practice_string_problems;

public class UseOFcharAt 
{
public static void main(String[] args) 
{
	String s="karnataka";
	System.out.println(s.substring(3,7));
	String a[]=s.split("a");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
