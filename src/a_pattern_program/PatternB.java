package a_pattern_program;

public class PatternB 
{
public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1 || (i%2==1 && j<n) || (j==n && i%2==0))
				System.out.print("* ");
			else
				System.out.print("  ");
		}
	System.out.println();
	}
}
}
