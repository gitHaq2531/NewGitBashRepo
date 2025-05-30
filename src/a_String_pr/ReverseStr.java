package a_String_pr;

public class ReverseStr 
{
public static void main(String[] args) 
{
	String s="MAHENDRA SINGH DHONI";
	String str[]=s.split(" ");
	for(int i=0;i<str.length;i++)
	{
		if(i==str.length-2)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
		else
			System.out.print(str[i]+" ");
		
	}
}
}