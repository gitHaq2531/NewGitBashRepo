package exceptionHandling;

public class UseOf_Throw 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
		if(b<=2)
		{
			throw new ArithmeticException("b cannot be 2 or less");
		}
		else
		{
			System.out.println(a/b);
		}
	}
}
