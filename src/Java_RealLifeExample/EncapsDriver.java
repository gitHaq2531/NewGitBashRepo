package Java_RealLifeExample;

public class EncapsDriver
{
public static void main(String[] args) 
{
	EncapsParent e=new EncapsParent("AFZAUL", 45000, 150000);
	System.out.println(e.name);
	System.out.println(e.getSalary());
	e.setBankBal(250000);
}
}