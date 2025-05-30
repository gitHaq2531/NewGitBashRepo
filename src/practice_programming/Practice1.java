//Take input of age of three people by user and determine oldest and youngest among them .

package practice_programming;
import java.util.Scanner;

public class Practice1 
{
	public static void check()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter age: ");
		int a=s.nextInt();
		System.out.println("age of 1st person is: "+a);
		System.out.println("enter age: ");
		int b=s.nextInt();
		System.out.println("age of 2nd person is: "+b);
		System.out.println("enter age: ");
		int c=s.nextInt();
		System.out.println("age of 3rd person is: "+c);
		if(a>b && a>c)
		{
			System.out.println("1st person is oldest");
		}
		else if(b>c)
		{
			System.out.println("2nd is older");
		}
		else 
		{
			System.out.println("3rd is older");
		}
	}
	public static void main(String[] args) 
	{
		check();
	}
}
