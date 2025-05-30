package a_pattern_program;

public class PatternQ 
{
public static void main(String[] args) 
{
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if((i==1||i==6)&&(j>=2 && j<=4) || (j==1||j==5)&&(i>1&&i<6))
				System.out.print("Q ");
			else if(i>=4 && i==j+1)
				System.out.print("Q ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}