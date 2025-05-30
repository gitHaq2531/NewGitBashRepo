package a_practice_string_problems;

public class Character_class 
{
public static void main(String[] args) {
	int a=0;
	String s="my NAMe iS AFzaUL";
	for(int i=0;i<s.length();i++)
	{
		int n=s.charAt(i);
		if(n>=97 && n<=122)
			a++;
	}
	char ch=(char)65;
	System.out.println(ch);
	System.out.println("lower case chars: "+a);
}
}
