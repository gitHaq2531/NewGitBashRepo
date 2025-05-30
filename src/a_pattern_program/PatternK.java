package a_pattern_program;

public class PatternK 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=3;j++)
		{
			if(j==1)
				System.out.print("K ");
			else if(i+j==4 || i==4&&j==2 || i+j==8)
				System.out.print("K ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
