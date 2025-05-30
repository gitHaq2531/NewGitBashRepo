package a_pattern_program;

public class Triangle2 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		int j=1;
		while(j<=5)
		{
			if(i+j==6)
				System.out.print("1 ");
			else if(i+j==7 && i>=2)
				System.out.print("2 ");
			else if(i>=3 && i+j==8)
				System.out.print("3 ");
			else if(i>=4 && i+j==9)
				System.out.print("4 ");
			else if(i>=5 && i+j==10)
				System.out.print("5 ");
			else
				System.out.print(" ");
			j++;
		}
		System.out.println();
	}
}
}