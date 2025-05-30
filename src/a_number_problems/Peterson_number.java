package a_number_problems;

public class Peterson_number 
{
public static void main(String[] args) 
{
	int n=145;
	int m=n;
	int a=0;
	//System.out.println(m);
	while(m!=0)
	{
		int b=1;
		int rem=m%10;
		for(int i=1;i<=rem;i++)
		{
			b=b*i;
		}
		a=a+b;
		m=m/10;
	}
	System.out.println("summation of factorial of each digit in "+n+" is "+a+", so:-");
	if(n==a)
	{
		System.out.println(n+" is peterson");
	}
	else
		System.out.println(n+" is not peterson");
}
}
