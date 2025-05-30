package a_number_problems;

import java.util.Scanner;

public class EvenNum_btwRange 
{
public static void main(String[] args) 
{
	do
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the last digit: " );
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
			System.out.println(i);
	}
	}
	while(true);

}
}
