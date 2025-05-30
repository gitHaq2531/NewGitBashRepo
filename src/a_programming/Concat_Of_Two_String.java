package a_programming;

public class Concat_Of_Two_String 
{
public static void main(String[] args) 
{
	String a="Hello";
	String b="hi";
	if(a.length()<b.length())
		System.out.println(a+b+a);
	else
		System.out.println(b+a+b);
}
}
