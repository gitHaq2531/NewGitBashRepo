package inheritence1;

public class Card 
{
	long cardnum;
	int cvv;
	int pin;
	public Card(long cardnum,int cvv,int pin)
	{
		this.cardnum=cardnum;
		this.cvv=cvv;
		this.pin=pin;
		System.out.println("parent loading.....");
	}
	public void details()
	{
		System.out.println("CARD NUMBER IS: "+cardnum);
		System.out.println("CVV IS: "+cvv);
		System.out.println("YOUR PIN IS; "+pin);
	}
}
