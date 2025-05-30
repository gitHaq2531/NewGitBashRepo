package exception;

public class TryCatch 
{
	public static void main(String[] args) {
		print();
		System.out.println("hi main.....");
	}
	public static void print()
	{
		System.out.println(10/5);
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException ob)
		{
			
		}
		System.out.println("by print...");
	}
}
