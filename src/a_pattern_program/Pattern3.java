package a_pattern_program;

import java.util.Scanner;

public class Pattern3 
{
public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j>=i)
				System.out.print("*"+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
