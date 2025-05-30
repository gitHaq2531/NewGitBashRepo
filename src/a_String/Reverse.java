package a_String;

public class Reverse 
{
public static void main(String[] args) 
{
	String s="GEEKS GEEZER GEENI";
	String a[]=s.split(" ");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(a[i].charAt(j));
		}
		System.out.print(" ");
	}
}
}
