package a_programming;
import java.util.Scanner;

public class CallM 
{
	public static void check(int n)
	{
		if(n>=13 && n<=19)
		{
			System.out.println(" you are a teenager....");
		}
		else 
		{
			System.out.println("you are not a teenager...");
		}
	}
	 public static void main(String[] args) 
	{ 
		 Scanner s=new Scanner(System.in);
		 boolean b;
		 do 
		 {
		 System.out.println("enter your age: ");
		 int a=s.nextInt();
		 check(a);
		 System.out.println("do you want it again...");
		 b=s.nextBoolean();
		 }
		 while(b);
		 s.close();
		 System.out.println("thank you");
	}	
}