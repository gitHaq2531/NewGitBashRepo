package a_number_problems;

import java.util.Scanner;

public class Print_n_evenNumber 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("how many even number you want? ");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
			System.out.print(i*2+" ");
	}
}
}
