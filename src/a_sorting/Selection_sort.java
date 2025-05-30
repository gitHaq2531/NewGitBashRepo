package a_sorting;

public class Selection_sort 
{
public static void main(String[] args) 
{
	int a[]= {4,2,7,10,22,9,3};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
}
}
