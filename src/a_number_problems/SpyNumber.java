package a_number_problems;

public class SpyNumber 
{
public static void main(String[] args) 
{
	int number=123;
	int num=number;
	
	int sum=0;
	int prd=1;
	while(num!=0)
	{
		int rem=num%10;
		sum=sum+rem;
		prd=prd*rem;
		num=num/10;
	}
	System.out.println("sum of digits present in "+number+" is "+sum);
	System.out.println("product of digits present in "+number+" is "+prd);
	if(sum==prd)
		System.out.println(number+" is spy number");
	else
		System.out.println(number+" is not spy");

}
}