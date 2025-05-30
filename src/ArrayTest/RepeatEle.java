package ArrayTest;

public class RepeatEle 
{
public static void main(String[] args) 
{
	int a[]= {2,3,4,4,5,5,5};
	for(int i=0;i<a.length-1;i++)
	{
		int count=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		if(count>0)
			System.out.println(a[i]);
	}
}
}
