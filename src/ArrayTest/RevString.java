package ArrayTest;

public class RevString 
{
public static void main(String[] args)
	{
		String s="MATH IS GOOD BOOK";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
