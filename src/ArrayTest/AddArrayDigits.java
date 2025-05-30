package ArrayTest;

public class AddArrayDigits 
{
public static void main(String[] args) 
{
	int a[]= {12,23,32,43,35,27};
	for(int i=0;i<a.length;i++)
	{
		int sum=0;
		while(a[i]!=0)
		{
			int rem=a[i]%10;
			sum=sum+rem;
			a[i]=a[i]/10;
		}
		a[i]=sum;
		System.out.print(a[i]+" ");
	}
}
}
