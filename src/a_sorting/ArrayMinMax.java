package a_sorting;

public class ArrayMinMax 
{
public static void main(String[] args) 
{
	int a[]= {1,3,7,2,33,55,34,844,25,74};
	int min=a[0];
	int max=a[0];
	for(int i=0;i<a.length-1;i++)
	{
		
		if(a[i]<min)
		{
			min=a[i];
		}
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(min);
	System.out.println(max);
}
}
