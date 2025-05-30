package part5;
import java.util.Scanner;
public class CitizenDriver 
{
public static void main(String[] args) 
{
	boolean b=false;
	CitizenNew a=new CitizenNew(822115,654323457867l);
	Scanner s=new Scanner(System.in);
	do
	{
		System.out.println("----choose the option----");
		System.out.println("1. know your adharid");
		System.out.println("2. know your pincode");
		System.out.println("3. update your pincode");
		System.out.println("enter option:");
		int z=s.nextInt();
		if(z==1)
		{
			System.out.println("your adharid is: "+a.getAdharid());
		}
		else if(z==2)
		{
			System.out.println("your pincode is: "+a.getPincode());
		}
		else if(z==3)
		{
			System.out.println("enter new pincode: ");
			int pin=s.nextInt();
			a.setPincode(pin);
		}
		else
		{
			System.out.println("wrong input..");
		}
		System.out.println("do you want to repeat menu???");
		b=s.nextBoolean();	
	}
	while(b);
	s.close();
}
}