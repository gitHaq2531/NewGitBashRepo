package OlaTypCast;
import java.util.Scanner;
public class App 
{
	static int ato,mni,sdn;
	public static void main(String[] args) 
	{
	boolean b;
	Scanner s=new Scanner(System.in);
	do 
	{	
	System.out.println("enter 1 for auto,, enter 2 for mini,, enter 3 for Sedan");
	int a=s.nextInt();
	switch(a)
	{
	case 1: Auto at=new Auto();
	App.book(at);
	break;
	case 2: Mini m=new Mini();
	App.book(m);
	break;
	case 3: Sedan sd=new Sedan();
	App.book(sd);
	break;
	default:
		System.out.println("invalid input...");
	}
		System.out.println("do you want it again");
		b=s.nextBoolean();
		s.close();
	}
	while(b);
	System.out.println("auto adding.."+ato);
	System.out.println("mini adding.."+mni);
	System.out.println("sedan adding.."+sdn);
	System.out.println("total adding is.."+(ato+mni+sdn));
	}
	public static void book(Ola ol)
	{
		ol.ride();
		if(ol instanceof Auto)
		{
			ato++;
		}
		else if(ol instanceof Mini)
		{
			mni++;
		}
		else if(ol instanceof Sedan)
		{
			sdn++;
		}
	}
}
