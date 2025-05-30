//Write a Java program to create an integer array of three elements and find sum of array.  


package ArrayTest;

public class IntArray 
{
	public static void check()
	{
		int sum=0;
		int ar[]=new int[3];
		ar[0]=5;
		ar[1]=7;
		ar[2]=9;
		for(int i=0;i<ar.length;i++)
		{
			int a=ar[i];
			sum=sum+ar[i];
		System.out.println("number is: "+a);
		}
		System.out.println("sum of all number is: "+sum);
	}
	public static void main(String[] args) 
	{
		check();
	}
}
