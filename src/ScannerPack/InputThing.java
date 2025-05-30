package ScannerPack;
import java.util.Scanner;
public class InputThing 
{
	int pin;
	long contact;
	public InputThing(int pin,long contact)
	{
		this.pin=pin;
		this.contact=contact;
	}
	public void display()
	{
		System.out.println("your pin is: "+pin);
		System.out.println("your contact is: "+contact);
	}
	public void resetPin()
	{
		System.out.println("enter existing pin:");
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		if(p==pin)
		{
			System.out.println("enter new pin: ");
			int pin=s.nextInt();
			System.out.println("your pin updated..");
		}
	}
	public static void main(String[] args) {
		
	}
}
