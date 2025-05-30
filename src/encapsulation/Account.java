package encapsulation;

public class Account 
{
	private int bal;
	private long contact;
	public Account(int bal,long contact)
	{
		this.bal=bal;
		this.contact=contact;
		
	}
	public int getBal()
	{
		return bal;
	}
	public void setContact(long c)
	{
		contact=c;
		System.out.println("contact updated....");
		//System.out.println("new contact is: "+contact);
	}
	public long getContact()
	{
		return contact;
	}
}
