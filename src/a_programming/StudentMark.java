package a_programming;
import java.util.Scanner;
public class StudentMark 
{
	public static void check()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter percentage: ");
		int n=s.nextInt();
		if(n<25)
		{
			System.out.println("F");
		}
		else if(n>=25 && n<45)
		{
			System.out.println("E");
		}
		else if(n>=45 && n<50)
		{
			System.out.println("D");
		}
		else if(n>=50 && n<60)
		{
			System.out.println("C");
		}
		else if(n>=60 && n<75)
		{
			System.out.println("B");
		}
		else if(n>=75 && n<100)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("invalid");
		}
		s.close();
	}
	public static void main(String[] args) 
	{
		check();
	}
}
