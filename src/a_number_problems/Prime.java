package a_number_problems;

public class Prime 
{
public static void main(String[] args) 
{
	int a[]= {2,4,3,6,1};
	int b[]= {1,9,2,7,8};
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
				count++;
		}
		if(count>0)
			System.out.println(a[i]);
	}
}
}
