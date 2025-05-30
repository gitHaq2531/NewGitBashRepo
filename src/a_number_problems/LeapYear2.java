package a_number_problems;

public class LeapYear2 
{
public static void main(String[] args) 
{
	int a=1596;
	int b=2000;
	System.out.println("==========LEAP YEARS IN A RANGE===============");
	for(int i=a;i<=b;i++)
	{
		if(i%4==0 && i%100!=0)
			System.out.print(i+",");
		else if(i%400==0)
			System.out.print(i+",");
	}
}
}
