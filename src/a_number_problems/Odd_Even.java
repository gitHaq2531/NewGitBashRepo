package a_number_problems;

public class Odd_Even 
{
public static void main(String[] args) 
{
	int a=40;
	System.out.println("============using %================");
	String res=a%2==0?"even":"odd";
	if(a%2==0)
		System.out.println(a+" is even");
	else
		System.out.println(a+" is odd");
	
	System.out.println(a+" is "+res);
	System.out.println("==========WITHOUT %=================");
	String res2=(a/2)*2==a?"even":"odd";
	System.out.println(a+" is "+res2);
	
	
}
}
