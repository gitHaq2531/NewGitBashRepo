package a_programming;

public class Separate_Strings_FOR_Multiple_Separater 
{
public static void main(String[] args) 
{
	String s="HELLO,BROTHER.GOOD MORNING/EVENING";
	String a[]=s.split("[,. /]");
	
	for(String i:a)
	{
	System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("length of array is "+a.length);
}
}
