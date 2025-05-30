package a_pattern_program;

public class PatternG 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1 || j==1 || i==5)
				System.out.print("G ");
			else if((i==3 && j>2) || (i==4 && j==5))
				System.out.print("G ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
