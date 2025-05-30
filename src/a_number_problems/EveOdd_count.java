package a_number_problems;

public class EveOdd_count 
{
public static void main(String[] args) 
{
	int num=1234567846;
	int odd=0;
	int even=0;
	int zero=0;
	while(num!=0)
	{
		int rem=num%10;
		if(rem==0)
			zero++;
		else if(rem%2==0)
			even++;
		else
			odd++;
		num=num/10;
	}
	System.out.println("total odd digits: "+odd);
	System.out.println("total even digits: "+even);
}
}
