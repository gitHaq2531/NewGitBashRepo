//convert string digits into numbers ===>> without using parse function....

package a_practice_string_problems;

public class ParseInt 
{
	public static void main(String[] args) 
	{
		String s="1234567898765432";
		long res=0;
		for(int i=0;i<s.length();i++)
		{
			res=res*10+(s.charAt(i)-48);
		}
		System.out.println(res);
	}
}
