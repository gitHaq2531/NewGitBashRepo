package method;

public class Account 
{
	public static void checkBal(int a)
	{
		System.out.println("user can check balance..."+a);
	}
	public static void withdrawMoney(int b,int c) 
	{
		System.out.println("user can withdraw money...");
		Account.checkBal(2);
		System.out.println("kon ho tum...."+(b+c));
	}
	public static void main(String[] args)
	{
		int b=5;
		int c=8;
		System.out.println("hiii...");
		Account.withdrawMoney(b,c);
		System.out.println("hello");
	}
}
