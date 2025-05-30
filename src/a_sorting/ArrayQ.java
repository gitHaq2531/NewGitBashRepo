package a_sorting;

public class ArrayQ 
{
public static void main(String[] args) 
{
	int a[]= {1,3,2,6,4,7,5};
	for(int i=1;i<a.length-1;i++)
	{
		if(a[i]>a[i-1] && a[i]>a[i+1])
			System.out.println(a[i]+" == index: "+i);
	}
}
}
