package a_practice_string_problems;

public class Palindrom_2 
{
public static void main(String[] args) 
{
	String str="Malayalam";
	if(isPalindrome(str)>0)
		System.out.println(str+" is palindrome.");
	else
		System.out.println(str+" is not palindrome.");
}
public static int isPalindrome(String str)
{
	for(int i=str.length()-1;i>=(str.length()-1)/2;i--)
	{
		if(str.charAt(i)!=str.charAt(str.length()-1-i))
			return 0;
	}
	return 1;
}
}
