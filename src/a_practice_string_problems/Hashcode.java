package a_practice_string_problems;

public class Hashcode 
{
public static void main(String[] args) 
{
	String a="hello";
	String b="hello";
	String c=new String("hi");
	String d=new String("hi");
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
}
}