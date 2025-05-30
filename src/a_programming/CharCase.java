/* checking even void number
 * without using % operator 
 */

package a_programming;
import java.util.Scanner;

public class CharCase 
{
	public static void main(String[] args) 
	{
		boolean b;
		Scanner s=new Scanner(System.in);
		do {
		
			System.out.println("enter character: ");
		char ch=s.next().trim().charAt(0);
		//System.out.println(check(ch));
		check(ch);
		
		System.out.println("do you want it again??");
		b=s.nextBoolean();
		}
		while(b);
		s.close();
	}
	public static void check(char n)
	{
		if(n>='A' && n<='Z')
		{
			System.out.println("you have entered upper case...");
		}
		else if(n>='a' && n<='z')
		{
			System.out.println("you have entered lower case values..");
		}
		else
		{
			System.out.println("invalid input...");
		}
	}
}
