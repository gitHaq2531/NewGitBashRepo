package a_number_problems;

import java.util.Scanner;

public class MiddleNum 
{
public static void main(String[] args) 
{
	int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number: ");
	int num=s.nextInt();
	int res=num;
	while(num>0)
	{
		count++;
		num=num/10;
	}
	int n=(count+1)/2;
	for(int i=1;i<=n;i++)
	{
		int rem=res%10;
		if(i==n)
		{
			System.out.println(rem);
		}
		res=res/10;
	}
}
}
