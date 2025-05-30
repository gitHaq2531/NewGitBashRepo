package a_programming;

public class Length_OF_Last_Word 
{
public static void main(String[] args) 
{
	String s="HELLO WORLD GOOD MORNING";
	String a[]=s.split(" ");
	for(int i=0;i<a.length;i++)
	{
		if(i==a.length-1)
		System.out.println(a[i].length());
	}
}
}
