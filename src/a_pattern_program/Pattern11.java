package a_pattern_program;

public class Pattern11 
{
public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i>=j)
				System.out.print((char)(i+64)+" ");
			else
				System.out.print("   ");
		}
		System.out.println();
	}
}
}
