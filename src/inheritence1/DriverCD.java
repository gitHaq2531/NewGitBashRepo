package inheritence1;
import java.util.Scanner;
public class DriverCD 
{
	public static void main(String[] args) 
	{
		
		DebitCard a=new DebitCard(1234234534564567l,243,1200,22000);
		a.details();
		System.out.println("enter your pin: ");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		s.close();
		if(x==a.pin) 
		{
		a.view();
		}
		else
		{
			System.out.println("wrong pin");
		}
		System.out.println("==================================");
		Card b=new Card(9876876576545432l,432,3214);
		b.details();
	}
}
