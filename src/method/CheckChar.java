package method;
import java.util.Scanner;

public class CheckChar 
{
	public static void check(int ascii)
	{
		if(ascii%2==0)
		{
			System.out.println(ascii+" is even..");
		}
		else
		{
		System.out.println(ascii+" is odd..");
		}
	}
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter character::");
		char ch =s.next().charAt(0);
		int ascii=ch;
		CheckChar.check(ascii);
		s.close();
	}
}
