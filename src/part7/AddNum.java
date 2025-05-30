package part7;

import java.util.Scanner;

public class AddNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first value: ");
		int a=s.nextInt();
		System.out.println("enter second value: ");
		int b=s.nextInt();
		System.out.println("your answer is: "+(a+b));
	}
}
