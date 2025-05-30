package a_pattern_program;

public class PatternC 
{
public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if((i==1 || i==5) && j>1)
				System.out.print("C ");
			else if(j==1 && (i>1 && i<n))
				System.out.print("C ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
