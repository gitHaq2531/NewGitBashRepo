package a_pattern_program;

public class PatternA 
{
public static void main(String[] args) 
{
	int n=9;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 && j==5)
				System.out.print("A");
			else if(i==2 && (j==4 || j==6))
				System.out.print("A");
			else if(i==3 && (j>=3 && j<=7))
				System.out.print("A");
			else if(i==4 && (j==2 || j==8))
				System.out.print("A");
			else if(i==5 && (j==1 || j==9))
				System.out.print("A");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
