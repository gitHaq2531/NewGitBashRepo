package a_String;

public class Palindrome 
{
public static void main(String[] args) {
	String s="Malayalam";
	String p=s.replaceAll("a", "u");
	char x[]=s.toCharArray();
	System.out.println(p);
	for(int i=s.length()-1;i>=0;i--)
	{
		p=p+s.charAt(i);
	}
	if(p.equalsIgnoreCase(s))
		System.out.println("yes");
}
}
