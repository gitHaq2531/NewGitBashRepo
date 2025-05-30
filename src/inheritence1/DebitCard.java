package inheritence1;

public class DebitCard extends Card
{
	int bal;
	public DebitCard(long cardnum,int cvv,int pin,int bal)
	{
		super(cardnum,cvv,pin);
		System.out.println("child loading here...");
		this.bal=bal;
	}
	public void view()
	{
		System.out.println("your balance is: "+bal);
	}
}
