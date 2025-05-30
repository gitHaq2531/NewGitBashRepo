package a_practice_string_problems;

public class OperationOnString 
{
	public static void main(String[] args) 
	{
		String s="INDIA IS MY COUNTRY WHERE I LIVE";
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
  