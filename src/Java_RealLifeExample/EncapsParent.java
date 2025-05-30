package Java_RealLifeExample;

public class EncapsParent 
{
String name;
private int salary;
private int bankBal;
public EncapsParent(String n,int sal,int bb)
{
	name=n;
	salary=sal;
	bankBal=bb;
}
public void print()
{
	System.out.println(name);
	System.out.println(salary);
	System.out.println(bankBal);
}
public int getSalary()
{
	return salary;
}
public void setBankBal(int b)
{
	bankBal=b;
	System.out.println(bankBal);
}
}