package inheritpack2;
import java.util.Scanner;
public class Amazon extends Brand
{
	int totalcustomer;
	public Amazon(int id,int totalcustomer)
	{
		super(id);
		this.totalcustomer=totalcustomer;
	}
	public static void main(String[] args) 
	{
		Amazon a=new Amazon(123,4553);
		a.display();
		System.out.println(a.getId());
		System.out.println("enter new id:: ");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();	
		a.setId(id);
		System.out.println("new id is:: "+a.getId());
		s.close();
	}
	public void display()
	{
		System.out.println(totalcustomer);
	}

}
