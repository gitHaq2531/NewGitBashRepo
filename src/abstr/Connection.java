package abstr;

public class Connection 
{
	public static void main(String[] args) 
	{
	IronBox i=new IronBox();
	connect(i);
	
	}
	public static void connect(ESwitch ob)
	{
		ob.switchOff();
		ob.switchOn();
		if(ob instanceof IronBox)
		{
			IronBox i=(IronBox)ob;
			i.irn();
		}
	}
}
