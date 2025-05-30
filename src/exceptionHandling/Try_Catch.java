package exceptionHandling;

public class Try_Catch 
{
	public static void main(String[] args)
	{
		System.out.println(10/2);
		System.out.println(10/5);
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException ob)
		{
			System.out.println("===printing exception and reason=====");
			System.out.println(ob);
			System.out.println("====printing message==========");
			System.out.println(ob.getMessage());
			System.out.println("=====printing exception details==========");
			ob.printStackTrace();
			
			
		}
		System.out.println(12/2);
	}
}
