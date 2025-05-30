package a_number_problems;

public class Sum_Of_Digits 
{
public static void main(String[] args) 
{
	int num=1234567;
	int res=0;
	while(num!=0)
	{
		int rem=num%10;
		res=res+rem;
		num=num/10;
	}
	System.out.println("sum of digits ==>"+res);
}
}
