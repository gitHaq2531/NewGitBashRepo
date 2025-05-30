package a_pattern_program;

public class PatternSdf 
{
public static void main(String[] args) 
{
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=40;j++)
		{
			if(i==1)
			{
				switch(j)
				{
				case 1,2,3,8,13,14,15,16,21,26,27,28,29:
					System.out.print("S");
				break;
				default: System.out.print(" ");
				}
			}
			else if(i==2)
			{
				switch(j)
				{
				case 1,7,9,13,17,20,22,26:
					System.out.print("S");
				break;
				default: System.out.print(" ");
				}
			}
			else if(i==3)
			{
				switch(j)
				{
				case 1,2,3,6,7,8,9,10,13,17,19,20,21,22,23,26,27,28,29:
					System.out.print("S");
				break;
				default: System.out.print(" ");
				}
			}
			else if(i==4)
			{
				switch(j)
				{
				case 3,6,10,13,17,19,23,26:
					System.out.print("S");
				break;
				default: System.out.print(" ");
				}
			}
			else if(i==5)
			{
				switch(j)
				{
				case 1,2,3,6,10,13,14,15,16,19,23,26:
					System.out.print("S");
				break;
				default: System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
}
}  