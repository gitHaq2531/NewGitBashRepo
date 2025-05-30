package a_String;

public class RemoveSpace 
{
public static void main(String[] args) 
{
	int [] a= {2,6,4,8,3,5};
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]>a[i+1])
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}
}
