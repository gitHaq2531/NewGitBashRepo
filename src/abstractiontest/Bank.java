package abstractiontest;

public class Bank 
{
	public static void main(String[] args) 
	{
		Axis a=new Axis();
		select(a);
	}
	public static void select(Axis ob)
	{
		ob.details();
		ob.printInterest();
		//if(ob instanceof Axis)
		{
		Axis a=(Axis)ob;	
		a.display();
		}
	}
}
