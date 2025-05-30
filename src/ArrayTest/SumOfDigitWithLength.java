package ArrayTest;

public class SumOfDigitWithLength 
{
public static void main(String[] args) 
{
	int a[]= {1,3,0,6,7,4};
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==a.length)
			{
				System.out.print(a[i]+","+a[j]);
			}
		}
	}
}
}
