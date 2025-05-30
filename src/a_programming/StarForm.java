package a_programming;

import java.util.Scanner;

public class StarForm 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int row=s.nextInt();
		System.out.println("enter nm of column ");
		int col=s.nextInt();
		print(row,col);
	}
	public static void print(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				//if(j==1 || i==row)
				//if(i==1 || j==col)
				//if(j==1 || j==col  || i==row) 
				//if(j==1 || j==col || i==1 || i==row) 
				
				//if(i==j )
				//if(i+j==row+1)
				//if(j<=i)
				//if(i<=j)
				if(i+j>=row+1)
				{
					System.out.print("* ");
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
