package CardTry;
import java.util.Scanner;
public class SwipeMachine 
{
	public static void main(String[] args) 
	{
		boolean b;
		Scanner s=new Scanner(System.in);
	do{
		System.out.println("enter 1 for creditcard,,enter 2 for debitcad..");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
		CreditCard cc=new CreditCard();
		SwipeMachine.swipe(cc);
		break;
		case 2:
		DebitCard dc=new DebitCard();
		SwipeMachine.swipe(dc);
		break;
		default:
			System.out.println("invalid");
		}
			System.out.println("do u want it again??");
			b=s.nextBoolean();
			s.close();
	}
		while(b);
	}
	public static void swipe(Card c)
	{
		c.payment();
		if(c instanceof CreditCard)
		{
			((CreditCard) c).reduceLimit();
		}
	}
}
