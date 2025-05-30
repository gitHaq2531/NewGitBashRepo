package a_pattern_program;

public class PatternY 
{
public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=10;j++)
		{
			if((i==1 && (j==1 || j==n)) || (i==2 && (j==2 || j==4)) )
				System.out.print("Y");
			else if(j==3 && i>=3)
				System.out.print("Y");
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
}
}
