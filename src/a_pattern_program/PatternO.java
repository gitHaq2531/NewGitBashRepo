package a_pattern_program;

public class PatternO 
{
public static void main(String[] args) 
{
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if((i==1||i==6)&&(j>=2 && j<=4) || (j==1||j==5)&&(i>1&&i<6))
				System.out.print("O ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
