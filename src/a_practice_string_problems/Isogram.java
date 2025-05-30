// Isogram==> abc,,true,,false,,  no repeated char.
// not isogram==> aba,,abcb,,hello... no repeated char.

package a_practice_string_problems;

public class Isogram 
{
public static void main(String[] args) 
{
	String s="abcdef";
	if(check(s)==true)
		System.out.println(s+" is unique");
	else
		System.out.println(s+" is not unique");
}
public static boolean check(String s)
{
	for(int i=0;i<s.length()-1;i++)
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				return false;
			}
		}
	return true;
}
}
