package ArrayTest;

import java.util.Scanner;

public class StarPoint 
{
	public static void print(int row,int col)
	{
		for(int r=1;r<=row;r++)
		//for(int r=row;r>=1;r--)
		{
			for(int c=1;c<=col;c++)
			{
				if(r>=c)
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
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int row=s.nextInt();
		System.out.println("enter nm of column ");
		int col=s.nextInt();
		print(row,col);
	}
}
