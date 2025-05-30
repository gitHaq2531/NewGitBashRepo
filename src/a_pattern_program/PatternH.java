package a_pattern_program;

public class PatternH 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(j==1||j==4||i==3)
				System.out.print("H ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
