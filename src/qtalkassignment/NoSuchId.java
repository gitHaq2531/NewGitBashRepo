package qtalkassignment;

public class NoSuchId 
{
	static String x;
	public static void register()
	{
		String a[]= {"delhi","mumbai","kolkata","Ranchi"};
		
		for(String i:a)
		{
			if(i=="bengaluru")
			{
				x=i;
			}
			System.out.println(i);
		}
			if(x!="bengaluru")
				throw new NoSuchIdException(" bengaluru is not found");
	}
	public static void main(String[] args) {
		register();
	}
}
