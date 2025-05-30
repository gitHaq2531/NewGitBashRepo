//Write a job program to count number of vowels in the string given.   String s="ABCDEF".

package assignmentMrch;

public class VowelsCount 
{
	public static void main(String[] args) 
	{
		int b=0;
	String s="ABCDEF";
	int a=0;

	//char ch[]=new char[s.length()];
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		switch(ch)
		{
		case 'A','E','I','O','U','a','e','i','o','u':
			a++;
		break;
		}
	}
		System.out.println("number of vowels is: "+a);
	
	}
}
