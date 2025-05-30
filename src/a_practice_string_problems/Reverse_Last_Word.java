package a_practice_string_problems;

public class Reverse_Last_Word 
{
	public static void main(String[] args) 
	{
		String s="HELLO,BROTHER.GOOD MORNING/EVENING";
		String a[]=s.split("[,. /]");
		for(int i=0;i<a.length;i++)
		{
			String str=a[i];
			if(i==a.length-2)
			{
				for(int j=str.length()-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
			}
			else
				System.out.print(str+" ");
		}
	}	
}
