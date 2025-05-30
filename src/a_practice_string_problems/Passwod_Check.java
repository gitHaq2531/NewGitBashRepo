// minimum 8 characters,,,cannot start with numbers,,,only one special char,,,minimum one upper case.

package a_practice_string_problems;

public class Passwod_Check 
{
public static void main(String[] args) 
{
	String s="abcw@123M";
	int res=check(s);
	if(res==1)
		System.out.println("valid password");
	else
		System.out.println("invalid");
}
public static int check(String s)
{
	int a=0;
	int b=0;
	int c=0;
	if(s.length()<8)
		return 0;
	else if(s.charAt(0)>=48 && s.charAt(0)<=57)
		return 0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch) )
			a++;
		else if((ch<=122 && ch>=97) || (ch>=48 && ch<=57))
			b++;
		else 
			c++;
	}
	if(a>=1 && c>=1)
		return 1;
	else 
		return 0;
}
}