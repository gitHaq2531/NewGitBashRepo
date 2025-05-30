package a_pattern_program;

public class PatternR 
{
public static void main(String[] args) 
{
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==1 || (i==1 || i==3)&&j<=5 || i==j+2 || i==2&&j==5)
				System.out.print("R ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
