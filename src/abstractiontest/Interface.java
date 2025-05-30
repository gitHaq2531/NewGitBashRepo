package abstractiontest;

public interface Interface 
{
	static int Age=44;
	//abstract void check();
	public static void main(String[] args) 
	{
		int a=5;
		a=6;
		System.out.println(a);
		System.out.println(Interface.Age);
	details();	
	}
	 static void details()
	{
		
		System.out.println(Age);
		System.out.println("hii");
	}
}
