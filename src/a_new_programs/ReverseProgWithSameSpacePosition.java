package a_new_programs;

// input "i love india",,,,   output== "a idni evoli" 

public class ReverseProgWithSameSpacePosition 
{
	public static void main(String[] args) 
	{
		String s="i love india";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(" ");
			}
			if(s.charAt(s.length()-1-i)!=' ')
			{
				System.out.print(s.charAt(s.length()-1-i));
			}
		}
	}
}
