package a_pattern_program;

public class PatternM 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if((j==1 || j==5) || (i==2 && j%2==0) || (i==3 && j==3))
			{
				System.out.print("M ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
