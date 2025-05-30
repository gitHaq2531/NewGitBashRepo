//Write a java program to create float array of six elements and ask the user to enter the values.


package ArrayTest;
import java.util.Scanner;

public class FloatArray 
{
	public static void check()
	{
		float fl[]=new float[6];
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter float value===");
		for(int i=0;i<fl.length;i++)
		{
			fl[i]=s.nextFloat();
		}
		System.out.println("==========you have entered=======");
		for(int i=0;i<fl.length;i++)
		{
		System.out.println(fl[i]);
		s.close();
		}
	}
	public static void main(String[] args) 
	{
		check();
	}

}
