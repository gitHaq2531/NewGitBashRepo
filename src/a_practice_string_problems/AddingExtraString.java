package a_practice_string_problems;

public class AddingExtraString 
{
	public static void main(String[] args) 
	{
		String s="geeksgeeks";
		//String x="FOR";
		for(int i=0;i<5;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.print("FOR");
		for(int i=5;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
	}
}
