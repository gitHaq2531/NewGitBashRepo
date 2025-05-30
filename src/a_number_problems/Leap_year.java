package a_number_problems;

public class Leap_year 
{
public static void main(String[] args) 
{
	int year=1604;
	if(year%400==0)
		System.out.println(year+" is leap");
	else if(year%4==0 && year%100!=0)
		System.out.println(year+" is leap");
	else
		System.out.println(year+" is not leap");
}
}
