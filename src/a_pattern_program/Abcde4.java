package a_pattern_program;

public class Abcde4 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i+j>=6)
				System.out.print((char)(64+i)+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
