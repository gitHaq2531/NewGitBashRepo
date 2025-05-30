package a_practice_string_problems;

public class LeapYear 
{
public static void main(String[] args) 
{
	int a=1700;
	int b=2020;
	int c=2000;
	int d=2023;
	int n=d;
	if(n%4==0 && n%100!=0)
		System.out.println(n+" is leap year.");
	else if(n%400==0)
		System.out.println(n+" is leap year.");
	else
		System.out.println(n+" is not leap year.");
}
}
