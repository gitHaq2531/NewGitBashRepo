package a_pattern_program;

import java.util.Scanner;

public class Pattern2 
{
public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i+j>n)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
