package a_number_problems;

public class Reverse_number 
{
public static void main(String[] args) 
{
	int a=12345;
	while(a!=0)
	{
		int rem=a%10;
		System.out.print(rem);
		a=a/10;
	}
}
}
