package a_pattern_program;

public class Pattern6 
{
public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if((i+j)==(n+1))
				System.out.print("*"+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
