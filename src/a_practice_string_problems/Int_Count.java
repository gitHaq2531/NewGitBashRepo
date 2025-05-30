package a_practice_string_problems;

public class Int_Count 
{
public static void main(String[] args) 
{
	int res=0;
	int a=1234540;
	while(a!=0)
	{
		int rem=a%10;
		if(rem>=0)
			res++;
		a=a/10;
	}
	System.out.println(res);
}
}
