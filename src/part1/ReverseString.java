package part1;

public class ReverseString 
{
	public static void main(String[] args) {
		String s="geeks quiz practice code";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
