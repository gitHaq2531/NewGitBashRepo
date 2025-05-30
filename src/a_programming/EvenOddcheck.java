/* checking even odd 
 * by using bitwise operators
 * &,,|..^...
 */

package a_programming;

public class EvenOddcheck 
{
	public static void main(String[] args) 
	{
		int a=6;
		//System.out.println(a&1);
		//System.out.println(a|1);
		System.out.println(a^1);
		
		check(a);
		check1(a);
		check2(a);
	}
	public static void check(int b)
	{
		System.out.println("using & operator...");
		if((b&1)==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd.");
		}
	}
	public static void check1(int b)
	{ System.out.println("using | operator");
		if((b|1)==b)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
	}
	public static void check2(int b)
	{
		System.out.println("using ^ operator...");
		if((b^1)>b)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd.");
		}
	}
}
