package a_programming;

public class First_Half_String 
{
public static void main(String[] args) 
{
	String s="woowoo";
	String t="helloHaque";
	String u="byeBro";
	String n=t;
	if(n.length()>=2)
	{
		String res=n.substring(0, (n.length()-1)/2+1);
				System.out.println(res);
	}
}
}
