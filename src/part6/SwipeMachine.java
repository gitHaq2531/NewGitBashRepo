package part6;

public class SwipeMachine 
{
	public static void main(String[] args) 
	{
		DebitCard d=new DebitCard();
		//Card ob=new Card();
		Card ob=d;
		CreditCard c=new CreditCard();
		Card ab=c;
		SwipeMachine.swipe(c);
	}
	public static void swipe(Card ab)
	{
		ab.payment();
	}
}
