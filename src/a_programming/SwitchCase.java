package a_programming;
import java.util.Scanner;
public class SwitchCase 
{
	
	public static void main(String[] args) 
	{
		check();
	}
	public static void check()
	{
		boolean b;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("enter value...");
		char ch=s.next().charAt(0);
		switch(ch)
		{
		case 'a': System.out.println("a selected");
		break;
		case 'b': System.out.println("b selected");
		break;
		case 'c': System.out.println("c selected");
		break;
		case 'd': System.out.println("d selected");
		break;
		default: System.out.println("invalid");
		}
		System.out.println("you want again??");
		b=s.nextBoolean();
		}
		while(b);
		s.close();
		System.out.println("thank you");
	}
}
