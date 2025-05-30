//both string should contains all same letters,, positions might differ

package a_practice_string_problems;
public class Anagram 
{
public static void main(String[] args) 
{
	int a=0;
	String s1="silent";
	String s2="listen";
	for(int i=0;i<s1.length();i++)
	{
		for(int j=0;j<s2.length();j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
				a++;
		}
	}
	if(a==s1.length())
		System.out.println("Anagram");
	else
		System.out.println("not Anagram");
}
}
