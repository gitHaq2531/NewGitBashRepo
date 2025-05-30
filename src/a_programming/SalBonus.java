package a_programming;
import java.util.Scanner;
public class SalBonus 
{
	public static void check()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter your salary: ");
	int b=s.nextInt();
	System.out.println("your salary is : "+b+" rupees");
	System.out.println("enter your year of service: " );
	int a=s.nextInt();
	System.out.println("you are working for : "+a+" years");
	if(a>5)
	{
		System.out.println("you are eligible for 20% bonus.");
		System.out.println("your current salary is "+(b+(b*20f/100)));
	}
	else
	{
		System.out.println("not eligible for bonus");
	}
	s.close();
	}
	public static void main(String[] args) 
	{
		check();
	}
}
