//fibonacci.... 0 1 1 2 3 5 8 13 21..... n-number of fibonacci.....
//every next number will be sum of previous two numbers ...

package series1;
import java.util.Scanner;
public class Fibonacci 
{
	public static void print(int n) 
	{
		
		int a=0;
		int b=1;
		//System.out.print(a+" ");
		//System.out.print(b);
		for(int i=1;i<=n-2;i++)
		{
			int c=a+b;
			//System.out.print(" "+c);
			a=b;
			b=c;
			{
				System.out.println(c);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("how many numbers you want??");
		int n=s.nextInt();
		s.close();
		print(n);
	}
}
