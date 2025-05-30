package a_programming;

public class Prime 
{
public static void main(String[] args) 
{
	int a=37;
	
	if(a<=1)
		System.out.println(a+" is not a prime");
	else if(a==2)
		System.out.println(a+" is prime");
	else if(a%2==0)
		System.out.println(a+" is not prime");
	for(int i=3;i<=a/2;i=i+2)
	{
		if(a%i==0)
			System.out.println(a+" is a prime");
	}
}
}
