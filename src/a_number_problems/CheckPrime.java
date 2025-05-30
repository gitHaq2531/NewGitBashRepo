package a_number_problems;

import java.util.Scanner;

public class CheckPrime 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number: ");
	int n=s.nextInt();
	int res=checkPrime(n);
	if(res==1)
		System.out.println(n+" is prime");
	else
		System.out.println(n+" is not prime");
	s.close();
}
public static int checkPrime(int n)
{
	int a=0;
	if(n==0 || n==1)
		return 0;
	else if(n==2)
		return 1;
	else if(n%2==0)
		return 0;
	for(int i=3;i<=n/2;i=i+2)
	{
		if(n%i==0)
			a++;
	}
	if(a==0)
		return 1;
	else
		return 0;
	
}
}
