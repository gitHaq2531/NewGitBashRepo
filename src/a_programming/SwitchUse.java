package a_programming;
import java.util.Scanner;

public class SwitchUse 
{
	public static void check(int n) 
	{
		switch(n)
		{
		case 1:System.out.println("bad boy");
		break;
		case 2:System.out.println("good boy");
		break;
		case 3:System.out.println("not a bad boy hahahah");
		break;
		default: System.out.println("invalid...");
		}
	}
	public static void main(String[] args) 
	{
		boolean b;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("enter any value: ");
		int a=s.nextInt();
		check(a);
		System.out.println("do you want to see again??");
		b=s.nextBoolean();
		}
		while(b);
		s.close();
	}
}
