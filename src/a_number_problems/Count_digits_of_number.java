package a_number_problems;

public class Count_digits_of_number 
{
public static void main(String[] args) 
{
	int n=123456782;
	int res=0;
	while(n!=0)
	{
		res++;
		n=n/10;
	}
	System.out.println(res);
}
}
